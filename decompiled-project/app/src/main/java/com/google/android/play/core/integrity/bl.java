package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f15648c;

    /* renamed from: d, reason: collision with root package name */
    private final J6.y f15649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f15648c = bnVar;
        this.f15649d = new J6.y("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, J6.q
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f15649d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f15648c.f15656f;
        com.google.android.gms.common.api.j a9 = kVar.a(bundle);
        if (a9 != null) {
            this.f15642a.trySetException(a9);
        } else {
            this.f15642a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
