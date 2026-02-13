package ya;

import Db.m;
import Db.q;
import android.content.Context;
import android.widget.Toast;
import cc.E;
import com.kt.apps.core.update.downloadmanager.ApkDownloader;
import com.kt.apps.core.update.downloadmanager.DownloadStatus;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import fc.InterfaceC1162i;
import java.io.File;

/* loaded from: classes2.dex */
public final class h implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f27563a;

    public h(j jVar, E e2) {
        this.f27563a = jVar;
    }

    @Override // fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        Object n6;
        Object n8;
        Object n10;
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        boolean z8 = downloadStatus instanceof DownloadStatus.Downloaded;
        q qVar = q.f3365a;
        if (z8) {
            File file = ((DownloadStatus.Downloaded) downloadStatus).getFile();
            Context C2 = this.f27563a.C();
            if (C2 != null) {
                if (ActivityUtilsKt.isSystemApps(C2)) {
                    try {
                        new ApkDownloader(C2).installSilenceIfSystem(file);
                        n8 = qVar;
                    } catch (Throwable th) {
                        n8 = com.bumptech.glide.c.n(th);
                    }
                    if (m.a(n8) != null) {
                        try {
                            new ApkDownloader(C2).installApkIfSystem(file);
                            n10 = qVar;
                        } catch (Throwable th2) {
                            n10 = com.bumptech.glide.c.n(th2);
                        }
                        if (m.a(n10) != null) {
                            Toast.makeText(C2, "Cài đặt không thành công", 1).show();
                        }
                    }
                } else {
                    try {
                        new ApkDownloader(C2).installApk(file);
                        n6 = qVar;
                    } catch (Throwable th3) {
                        n6 = com.bumptech.glide.c.n(th3);
                    }
                    if (m.a(n6) != null) {
                        file.delete();
                        Toast.makeText(C2, R.string.install_failed, 1).show();
                    }
                }
            }
        }
        return qVar;
    }
}
