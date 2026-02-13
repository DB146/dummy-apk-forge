package com.kt.apps.core.update.downloadmanager;

import Db.g;
import Eb.v;
import Ob.h;
import Ob.i;
import Ob.j;
import S9.a;
import X.c;
import Zb.f;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.support.v4.media.session.b;
import androidx.core.content.FileProvider;
import cc.E;
import cc.F;
import cc.P;
import com.kt.apps.core.update.TSConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes2.dex */
public final class ApkDownloader {
    private final g _downloadScope$delegate;
    private final g _queueStatus$delegate;
    private final OkHttpClient client;
    private final Context context;

    public ApkDownloader(Context context) {
        l.e(context, "context");
        this.context = context;
        this._downloadScope$delegate = b.z(new a(25));
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit unit = TimeUnit.MINUTES;
        l.e(unit, "unit");
        builder.f22411x = _UtilJvmKt.b(2L, unit);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
        httpLoggingInterceptor.f22953d = HttpLoggingInterceptor.Level.f22954a;
        builder.f22394d.add(httpLoggingInterceptor);
        builder.f22393c.add(new Interceptor() { // from class: com.kt.apps.core.update.downloadmanager.ApkDownloader$special$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                l.e(chain, "chain");
                Request.Builder a9 = chain.b().a();
                a9.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:128.0) Gecko/20100101 Firefox/128.0");
                return chain.a(new Request(a9));
            }
        });
        this.client = new OkHttpClient(builder);
        this._queueStatus$delegate = b.z(new a(26));
    }

    public static final E _downloadScope_delegate$lambda$0() {
        return F.b(P.f14500c);
    }

    public static final HashMap _queueStatus_delegate$lambda$3() {
        return new HashMap();
    }

    public static final boolean getApkFilesFromUsb$lambda$7(File it) {
        l.e(it, "it");
        return j.J(it).equalsIgnoreCase("apk");
    }

    private final E get_downloadScope() {
        return (E) this._downloadScope$delegate.getValue();
    }

    public final HashMap<String, ApkDownloadTask> get_queueStatus() {
        return (HashMap) this._queueStatus$delegate.getValue();
    }

    public final List<File> getApkFilesFromUsb(String usbPath) {
        l.e(usbPath, "usbPath");
        File file = new File(usbPath);
        if (!file.exists() || !file.isDirectory()) {
            return v.f3891a;
        }
        i iVar = i.f7555a;
        return Zb.i.P(new f(new h(file), true, new Ba.i(9)));
    }

    public final void installApk(File apkFile) {
        l.e(apkFile, "apkFile");
        Context context = this.context;
        l1.b c10 = FileProvider.c(context, context.getApplicationContext().getPackageName() + ".provider");
        try {
            String canonicalPath = apkFile.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c10.f19149b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(c.t("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            Uri build = new Uri.Builder().scheme("content").authority(c10.f19148a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            l.d(build, "getUriForFile(...)");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(build, "application/vnd.android.package-archive");
            intent.setFlags(268435456);
            intent.addFlags(1);
            this.context.startActivity(intent);
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + apkFile);
        }
    }

    public final void installApkIfSystem(File apkFile) {
        l.e(apkFile, "apkFile");
        this.context.getPackageManager();
        Uri fromFile = Uri.fromFile(apkFile);
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.setData(fromFile);
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", this.context.getPackageName());
        intent.putExtra("android.intent.extra.ALLOW_REPLACE", true);
        this.context.startActivity(intent);
    }

    public final void installSilenceIfSystem(File apkFile) {
        l.e(apkFile, "apkFile");
        PackageInstaller packageInstaller = this.context.getPackageManager().getPackageInstaller();
        l.d(packageInstaller, "getPackageInstaller(...)");
        FileInputStream fileInputStream = new FileInputStream(apkFile);
        int createSession = packageInstaller.createSession(new PackageInstaller.SessionParams(1));
        PackageInstaller.Session openSession = packageInstaller.openSession(createSession);
        l.d(openSession, "openSession(...)");
        OutputStream openWrite = openSession.openWrite(apkFile.getName(), 0L, -1L);
        l.d(openWrite, "openWrite(...)");
        q3.f.i(fileInputStream, openWrite);
        openSession.fsync(openWrite);
        fileInputStream.close();
        openWrite.close();
        openSession.commit(PendingIntent.getBroadcast(this.context, createSession, new Intent(TSConstants.ACTION_INSTALL_COMPLETE), 201326592).getIntentSender());
        openSession.close();
    }

    public final ApkDownloadTask startDownload(String url) {
        l.e(url, "url");
        if (get_queueStatus().get(url) != null) {
            ApkDownloadTask apkDownloadTask = get_queueStatus().get(url);
            l.b(apkDownloadTask);
            return apkDownloadTask;
        }
        List<String> pathSegments = Uri.parse(url).getPathSegments();
        l.d(pathSegments, "getPathSegments(...)");
        ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
        while (listIterator.hasPrevious()) {
            String previous = listIterator.previous();
            String str = previous;
            l.b(str);
            if (str.length() > 0) {
                l.d(previous, "last(...)");
                ApkDownloadTask apkDownloadTask2 = new ApkDownloadTask(url, previous, this.client, 0, get_downloadScope());
                get_queueStatus().put(url, apkDownloadTask2);
                apkDownloadTask2.startDownload();
                F.B(get_downloadScope(), null, 0, new ApkDownloader$startDownload$1(apkDownloadTask2, this, url, null), 3);
                return apkDownloadTask2;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }
}
