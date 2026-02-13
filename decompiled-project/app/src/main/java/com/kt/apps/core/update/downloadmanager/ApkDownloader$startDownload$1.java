package com.kt.apps.core.update.downloadmanager;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.e;
import Jb.i;
import cc.E;
import cc.F;
import com.bumptech.glide.c;
import com.kt.apps.core.update.downloadmanager.DownloadStatus;
import fc.InterfaceC1162i;
import fc.M;
import java.util.HashMap;

@e(c = "com.kt.apps.core.update.downloadmanager.ApkDownloader$startDownload$1", f = "ApkDownloadManagers.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ApkDownloader$startDownload$1 extends i implements Rb.e {
    final /* synthetic */ ApkDownloadTask $task;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ApkDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApkDownloader$startDownload$1(ApkDownloadTask apkDownloadTask, ApkDownloader apkDownloader, String str, d<? super ApkDownloader$startDownload$1> dVar) {
        super(2, dVar);
        this.$task = apkDownloadTask;
        this.this$0 = apkDownloader;
        this.$url = str;
    }

    @Override // Jb.a
    public final d<q> create(Object obj, d<?> dVar) {
        ApkDownloader$startDownload$1 apkDownloader$startDownload$1 = new ApkDownloader$startDownload$1(this.$task, this.this$0, this.$url, dVar);
        apkDownloader$startDownload$1.L$0 = obj;
        return apkDownloader$startDownload$1;
    }

    @Override // Rb.e
    public final Object invoke(E e2, d<? super q> dVar) {
        return ((ApkDownloader$startDownload$1) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        int i7 = this.label;
        if (i7 == 0) {
            c.c0(obj);
            final E e2 = (E) this.L$0;
            M downloadFlow = this.$task.getDownloadFlow();
            final ApkDownloader apkDownloader = this.this$0;
            final String str = this.$url;
            InterfaceC1162i interfaceC1162i = new InterfaceC1162i() { // from class: com.kt.apps.core.update.downloadmanager.ApkDownloader$startDownload$1.1
                public final Object emit(DownloadStatus downloadStatus, d<? super q> dVar) {
                    HashMap hashMap;
                    HashMap hashMap2;
                    if ((downloadStatus instanceof DownloadStatus.Failed) || (downloadStatus instanceof DownloadStatus.Downloaded)) {
                        hashMap = ApkDownloader.this.get_queueStatus();
                        ApkDownloader apkDownloader2 = ApkDownloader.this;
                        String str2 = str;
                        synchronized (hashMap) {
                            hashMap2 = apkDownloader2.get_queueStatus();
                        }
                        F.i(e2, null);
                    }
                    return q.f3365a;
                }

                @Override // fc.InterfaceC1162i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((DownloadStatus) obj2, (d<? super q>) dVar);
                }
            };
            this.label = 1;
            if (downloadFlow.a(interfaceC1162i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.c0(obj);
        }
        throw new Db.d(0);
    }
}
