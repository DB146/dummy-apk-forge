package com.kt.apps.core.update.downloadmanager;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.e;
import Jb.i;
import android.os.Environment;
import android.util.Log;
import cc.E;
import com.bumptech.glide.c;
import com.kt.apps.core.update.downloadmanager.DownloadStatus;
import fc.I;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.t;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import rc.AbstractC1958b;
import rc.C1959c;
import rc.InterfaceC1965i;

@e(c = "com.kt.apps.core.update.downloadmanager.ApkDownloadTask$startDownloadTask$2", f = "ApkDownloadTask.kt", l = {49, 54, 68, 73, 77, 80}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ApkDownloadTask$startDownloadTask$2 extends i implements Rb.e {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ApkDownloadTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApkDownloadTask$startDownloadTask$2(ApkDownloadTask apkDownloadTask, d<? super ApkDownloadTask$startDownloadTask$2> dVar) {
        super(2, dVar);
        this.this$0 = apkDownloadTask;
    }

    @Override // Jb.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new ApkDownloadTask$startDownloadTask$2(this.this$0, dVar);
    }

    @Override // Rb.e
    public final Object invoke(E e2, d<? super File> dVar) {
        return ((ApkDownloadTask$startDownloadTask$2) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137 A[Catch: IOException -> 0x001e, TryCatch #0 {IOException -> 0x001e, blocks: (B:10:0x0019, B:13:0x0039, B:15:0x012e, B:17:0x0137, B:23:0x0172, B:30:0x005f, B:32:0x00c6, B:34:0x00d8, B:38:0x0199, B:39:0x01a0, B:41:0x0068, B:42:0x009b, B:47:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: IOException -> 0x001e, TryCatch #0 {IOException -> 0x001e, blocks: (B:10:0x0019, B:13:0x0039, B:15:0x012e, B:17:0x0137, B:23:0x0172, B:30:0x005f, B:32:0x00c6, B:34:0x00d8, B:38:0x0199, B:39:0x01a0, B:41:0x0068, B:42:0x009b, B:47:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199 A[Catch: IOException -> 0x001e, TryCatch #0 {IOException -> 0x001e, blocks: (B:10:0x0019, B:13:0x0039, B:15:0x012e, B:17:0x0137, B:23:0x0172, B:30:0x005f, B:32:0x00c6, B:34:0x00d8, B:38:0x0199, B:39:0x01a0, B:41:0x0068, B:42:0x009b, B:47:0x0087), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        I i7;
        File file;
        String str;
        I i10;
        String str2;
        I i11;
        DownloadStatus.Connecting connecting;
        File file2;
        Request request;
        OkHttpClient okHttpClient;
        ResponseBody responseBody;
        long l10;
        InputStream S7;
        InterfaceC1965i b2;
        byte[] bArr;
        I i12;
        t tVar;
        long j;
        int read;
        I i13;
        I i14;
        DownloadStatus.Downloading downloading;
        int i15;
        t tVar2;
        a aVar = a.f5345a;
        try {
        } catch (IOException e2) {
            i7 = this.this$0.downloadChannel;
            DownloadStatus.Failed failed = new DownloadStatus.Failed(e2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 6;
            if (i7.emit(failed, this) == aVar) {
                return aVar;
            }
        }
        switch (this.label) {
            case 0:
                c.c0(obj);
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                str = this.this$0.apkName;
                file = new File(externalStoragePublicDirectory, str);
                Log.d("TuanDV", "startDownloadTask: ");
                i10 = this.this$0.downloadChannel;
                DownloadStatus.Pending pending = DownloadStatus.Pending.INSTANCE;
                this.L$0 = file;
                this.label = 1;
                if (i10.emit(pending, this) == aVar) {
                    return aVar;
                }
                Request.Builder builder = new Request.Builder();
                str2 = this.this$0.apkUrl;
                builder.e(str2);
                Request request2 = new Request(builder);
                i11 = this.this$0.downloadChannel;
                connecting = DownloadStatus.Connecting.INSTANCE;
                this.L$0 = file;
                this.L$1 = request2;
                this.label = 2;
                if (i11.emit(connecting, this) != aVar) {
                    return aVar;
                }
                file2 = file;
                request = request2;
                okHttpClient = this.this$0.client;
                responseBody = okHttpClient.b(request).e().f22445u;
                if (responseBody != null) {
                    throw new IOException("Empty response body");
                }
                l10 = responseBody.l();
                S7 = responseBody.F().S();
                l.e(file2, "<this>");
                b2 = AbstractC1958b.b(new C1959c(1, new FileOutputStream(file2, false), new Object()));
                bArr = new byte[8192];
                Object obj2 = new Object();
                i12 = this.this$0.downloadChannel;
                DownloadStatus.Downloading downloading2 = new DownloadStatus.Downloading(0);
                this.L$0 = file2;
                this.L$1 = S7;
                this.L$2 = b2;
                this.L$3 = bArr;
                this.L$4 = obj2;
                this.J$0 = l10;
                this.J$1 = 0L;
                this.label = 3;
                if (i12.emit(downloading2, this) == aVar) {
                    return aVar;
                }
                tVar = obj2;
                j = 0;
                do {
                    read = S7.read(bArr);
                    tVar.f19132a = read;
                    if (read == -1) {
                        b2.close();
                        S7.close();
                        i13 = this.this$0.downloadChannel;
                        DownloadStatus.Downloaded downloaded = new DownloadStatus.Downloaded(file2);
                        this.L$0 = file2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                        return i13.emit(downloaded, this) == aVar ? aVar : file2;
                    }
                    b2.H(read, bArr);
                    j += tVar.f19132a;
                    this.this$0.downloadProgress = (int) ((100 * j) / l10);
                    i14 = this.this$0.downloadChannel;
                    i15 = this.this$0.downloadProgress;
                    downloading = new DownloadStatus.Downloading(i15);
                    this.L$0 = file2;
                    this.L$1 = S7;
                    this.L$2 = b2;
                    this.L$3 = bArr;
                    this.L$4 = tVar;
                    this.J$0 = l10;
                    this.J$1 = j;
                    this.label = 4;
                } while (i14.emit(downloading, this) != aVar);
                return aVar;
            case 1:
                file = (File) this.L$0;
                c.c0(obj);
                Request.Builder builder2 = new Request.Builder();
                str2 = this.this$0.apkUrl;
                builder2.e(str2);
                Request request22 = new Request(builder2);
                i11 = this.this$0.downloadChannel;
                connecting = DownloadStatus.Connecting.INSTANCE;
                this.L$0 = file;
                this.L$1 = request22;
                this.label = 2;
                if (i11.emit(connecting, this) != aVar) {
                }
                break;
            case 2:
                request = (Request) this.L$1;
                File file3 = (File) this.L$0;
                c.c0(obj);
                file2 = file3;
                okHttpClient = this.this$0.client;
                responseBody = okHttpClient.b(request).e().f22445u;
                if (responseBody != null) {
                }
                break;
            case 3:
                j = this.J$1;
                l10 = this.J$0;
                t tVar3 = (t) this.L$4;
                bArr = (byte[]) this.L$3;
                b2 = (InterfaceC1965i) this.L$2;
                S7 = (InputStream) this.L$1;
                file2 = (File) this.L$0;
                tVar2 = tVar3;
                c.c0(obj);
                tVar = tVar2;
                do {
                    read = S7.read(bArr);
                    tVar.f19132a = read;
                    if (read == -1) {
                    }
                } while (i14.emit(downloading, this) != aVar);
                return aVar;
            case 4:
                j = this.J$1;
                l10 = this.J$0;
                t tVar4 = (t) this.L$4;
                bArr = (byte[]) this.L$3;
                b2 = (InterfaceC1965i) this.L$2;
                S7 = (InputStream) this.L$1;
                file2 = (File) this.L$0;
                tVar2 = tVar4;
                c.c0(obj);
                tVar = tVar2;
                do {
                    read = S7.read(bArr);
                    tVar.f19132a = read;
                    if (read == -1) {
                    }
                } while (i14.emit(downloading, this) != aVar);
                return aVar;
            case 5:
                File file4 = (File) this.L$0;
                c.c0(obj);
                return file4;
            case 6:
                c.c0(obj);
                return null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
