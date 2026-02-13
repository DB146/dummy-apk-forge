package va;

import A9.C0092h1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import oa.C1830e;

/* loaded from: classes2.dex */
public abstract class F extends C0092h1 implements cb.b {

    /* renamed from: w0, reason: collision with root package name */
    public ab.j f25279w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f25280x0;

    /* renamed from: y0, reason: collision with root package name */
    public volatile ab.f f25281y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f25282z0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    public boolean f25278A0 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f25280x0) {
            return null;
        }
        u0();
        return this.f25279w0;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        boolean z8 = true;
        this.f10275S = true;
        ab.j jVar = this.f25279w0;
        if (jVar != null && ab.f.b(jVar) != activity) {
            z8 = false;
        }
        com.bumptech.glide.c.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        u0();
        v0();
    }

    @Override // W1.C
    public void R(Context context) {
        super.R(context);
        u0();
        v0();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f25281y0 == null) {
            synchronized (this.f25282z0) {
                try {
                    if (this.f25281y0 == null) {
                        this.f25281y0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f25281y0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }

    public final void u0() {
        if (this.f25279w0 == null) {
            this.f25279w0 = new ab.j(super.C(), this);
            this.f25280x0 = com.bumptech.glide.d.r(super.C());
        }
    }

    public final void v0() {
        if (this.f25278A0) {
            return;
        }
        this.f25278A0 = true;
        ((C2159c) this).f25312H0 = (M9.t) ((C1830e) ((InterfaceC2160d) e())).f22151a.f22179n.get();
    }
}
