package com.kt.apps.autoupdate.usecase;

import Db.o;
import M9.e;
import ac.g;
import android.content.Context;
import android.support.v4.media.session.b;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.bumptech.glide.c;
import gb.p;
import h3.x;
import java.io.File;
import kotlin.jvm.internal.l;
import mb.InterfaceC1655a;
import vb.n;
import w9.C2226b;

/* loaded from: classes2.dex */
public final class DownloadFileWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final o f15909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        l.e(context, "context");
        l.e(workerParams, "workerParams");
        this.f15909f = b.z(new com.kt.apps.core.utils.l(28));
    }

    @Override // androidx.work.rxjava3.RxWorker
    public final p c() {
        WorkerParameters workerParameters = this.f17719b;
        String b2 = workerParameters.f13734b.b("extra:check_sum");
        String str = null;
        if (b2 == null || g.h0(b2)) {
            b2 = null;
        }
        if (b2 == null) {
            return p.b(new Throwable(""));
        }
        File file = new File(this.f17718a.getFilesDir(), "Update/newVersion");
        if (file.exists() && c.i(file, b2)) {
            return p.c(x.a());
        }
        String b10 = workerParameters.f13734b.b("extra:download_link");
        if (b10 != null && !g.h0(b10)) {
            str = b10;
        }
        if (str == null) {
            return p.b(new Throwable(""));
        }
        Object bVar = new tb.b(new e(this, str, b2, 18), 0);
        return new tb.e(new pb.p(new pb.g(bVar instanceof InterfaceC1655a ? ((InterfaceC1655a) bVar).a() : new ob.l(bVar, 3), C2226b.f25825a, 1)), C2226b.f25826b, 1);
    }

    @Override // androidx.work.rxjava3.RxWorker
    public final gb.o d() {
        n nVar = Ab.e.f1561c;
        l.d(nVar, "io(...)");
        return nVar;
    }
}
