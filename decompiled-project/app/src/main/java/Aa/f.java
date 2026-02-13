package Aa;

import J1.k;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import y9.AbstractC2464g;

/* loaded from: classes2.dex */
public abstract class f<T extends J1.k> extends AbstractC2464g<T> implements cb.b {

    /* renamed from: p0, reason: collision with root package name */
    public ab.j f1506p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f1507q0;

    /* renamed from: r0, reason: collision with root package name */
    public volatile ab.f f1508r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Object f1509s0 = new Object();

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1510t0 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f1507q0) {
            return null;
        }
        t0();
        return this.f1506p0;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        this.f10275S = true;
        ab.j jVar = this.f1506p0;
        com.bumptech.glide.c.h(jVar == null || ab.f.b(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t0();
        if (this.f1510t0) {
            return;
        }
        this.f1510t0 = true;
        ((e) e()).getClass();
    }

    @Override // y9.AbstractC2464g, W1.C
    public final void R(Context context) {
        super.R(context);
        t0();
        if (this.f1510t0) {
            return;
        }
        this.f1510t0 = true;
        ((e) e()).getClass();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f1508r0 == null) {
            synchronized (this.f1509s0) {
                try {
                    if (this.f1508r0 == null) {
                        this.f1508r0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f1508r0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }

    public final void t0() {
        if (this.f1506p0 == null) {
            this.f1506p0 = new ab.j(super.C(), this);
            this.f1507q0 = com.bumptech.glide.d.r(super.C());
        }
    }
}
