package Mc;

import A9.C0142u0;
import ab.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import oa.C1830e;

/* loaded from: classes2.dex */
public abstract class b extends C0142u0 implements cb.b {

    /* renamed from: j1, reason: collision with root package name */
    public j f6940j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f6941k1;

    /* renamed from: l1, reason: collision with root package name */
    public volatile ab.f f6942l1;

    /* renamed from: m1, reason: collision with root package name */
    public final Object f6943m1 = new Object();

    /* renamed from: n1, reason: collision with root package name */
    public boolean f6944n1 = false;

    public final void B0() {
        if (this.f6940j1 == null) {
            this.f6940j1 = new j(super.C(), this);
            this.f6941k1 = com.bumptech.glide.d.r(super.C());
        }
    }

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f6941k1) {
            return null;
        }
        B0();
        return this.f6940j1;
    }

    public final void C0() {
        if (this.f6944n1) {
            return;
        }
        this.f6944n1 = true;
        ((f) this).f6947o1 = (Kc.d) ((C1830e) ((g) e())).f22151a.f22167J.get();
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        boolean z8 = true;
        this.f10275S = true;
        j jVar = this.f6940j1;
        if (jVar != null && ab.f.b(jVar) != activity) {
            z8 = false;
        }
        com.bumptech.glide.c.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        B0();
        C0();
    }

    @Override // W1.C
    public final void R(Context context) {
        super.R(context);
        B0();
        C0();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f6942l1 == null) {
            synchronized (this.f6943m1) {
                try {
                    if (this.f6942l1 == null) {
                        this.f6942l1 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f6942l1.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }
}
