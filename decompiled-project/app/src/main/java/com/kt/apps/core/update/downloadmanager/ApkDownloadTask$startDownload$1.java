package com.kt.apps.core.update.downloadmanager;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.e;
import Jb.i;
import cc.E;
import com.bumptech.glide.c;

@e(c = "com.kt.apps.core.update.downloadmanager.ApkDownloadTask$startDownload$1", f = "ApkDownloadTask.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ApkDownloadTask$startDownload$1 extends i implements Rb.e {
    int label;
    final /* synthetic */ ApkDownloadTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApkDownloadTask$startDownload$1(ApkDownloadTask apkDownloadTask, d<? super ApkDownloadTask$startDownload$1> dVar) {
        super(2, dVar);
        this.this$0 = apkDownloadTask;
    }

    @Override // Jb.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new ApkDownloadTask$startDownload$1(this.this$0, dVar);
    }

    @Override // Rb.e
    public final Object invoke(E e2, d<? super q> dVar) {
        return ((ApkDownloadTask$startDownload$1) create(e2, dVar)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object startDownloadTask;
        a aVar = a.f5345a;
        int i7 = this.label;
        if (i7 == 0) {
            c.c0(obj);
            ApkDownloadTask apkDownloadTask = this.this$0;
            this.label = 1;
            startDownloadTask = apkDownloadTask.startDownloadTask(this);
            if (startDownloadTask == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.c0(obj);
        }
        return q.f3365a;
    }
}
