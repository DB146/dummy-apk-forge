package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
class bi extends J6.p {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f15642a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f15643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f15643b = bnVar;
        this.f15642a = taskCompletionSource;
    }

    @Override // J6.q
    public final void b(Bundle bundle) {
        this.f15643b.f15651a.d(this.f15642a);
    }

    @Override // J6.q
    public void c(Bundle bundle) {
        this.f15643b.f15651a.d(this.f15642a);
    }

    @Override // J6.q
    public final void d(Bundle bundle) {
        this.f15643b.f15651a.d(this.f15642a);
    }

    @Override // J6.q
    public void e(Bundle bundle) {
        this.f15643b.f15651a.d(this.f15642a);
    }
}
