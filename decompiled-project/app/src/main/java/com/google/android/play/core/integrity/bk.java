package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f15645c;

    /* renamed from: d, reason: collision with root package name */
    private final J6.y f15646d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.f15645c = bnVar;
        this.f15646d = new J6.y("OnRequestIntegrityTokenCallback");
        this.f15647e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, J6.q
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f15646d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f15645c.f15656f;
        com.google.android.gms.common.api.j a9 = kVar.a(bundle);
        if (a9 != null) {
            this.f15642a.trySetException(a9);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f15645c.f15653c;
        bj bjVar = new bj(this, str, j);
        TaskCompletionSource taskCompletionSource = this.f15642a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
