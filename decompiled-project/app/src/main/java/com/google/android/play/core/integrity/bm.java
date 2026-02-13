package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class bm extends J6.z {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f15650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f15650f = bnVar;
    }

    @Override // J6.z
    public final void a(Exception exc) {
        if (!(exc instanceof J6.e)) {
            super.a(exc);
        } else if (bn.k(this.f15650f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
