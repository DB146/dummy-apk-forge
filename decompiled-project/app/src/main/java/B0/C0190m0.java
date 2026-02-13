package B0;

import android.view.ViewConfiguration;

/* renamed from: B0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190m0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f1932a;

    public C0190m0(ViewConfiguration viewConfiguration) {
        this.f1932a = viewConfiguration;
    }

    @Override // B0.e1
    public final float a() {
        return this.f1932a.getScaledMaximumFlingVelocity();
    }

    @Override // B0.e1
    public final float b() {
        return this.f1932a.getScaledTouchSlop();
    }
}
