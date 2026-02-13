package Da;

import J1.k;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import y9.AbstractC2467j;

/* loaded from: classes2.dex */
public abstract class p<T extends J1.k> extends AbstractC2467j<T> implements cb.b {

    /* renamed from: w0, reason: collision with root package name */
    public ab.j f3336w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f3337x0;

    /* renamed from: y0, reason: collision with root package name */
    public volatile ab.f f3338y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f3339z0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    public boolean f3335A0 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f3337x0) {
            return null;
        }
        y0();
        return this.f3336w0;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        this.f10275S = true;
        ab.j jVar = this.f3336w0;
        com.bumptech.glide.c.h(jVar == null || ab.f.b(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        y0();
        if (this.f3335A0) {
            return;
        }
        this.f3335A0 = true;
        ((n) e()).getClass();
    }

    @Override // y9.AbstractC2467j, W1.C
    public final void R(Context context) {
        super.R(context);
        y0();
        if (this.f3335A0) {
            return;
        }
        this.f3335A0 = true;
        ((n) e()).getClass();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f3338y0 == null) {
            synchronized (this.f3339z0) {
                try {
                    if (this.f3338y0 == null) {
                        this.f3338y0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f3338y0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }

    public final void y0() {
        if (this.f3336w0 == null) {
            this.f3336w0 = new ab.j(super.C(), this);
            this.f3337x0 = com.bumptech.glide.d.r(super.C());
        }
    }
}
