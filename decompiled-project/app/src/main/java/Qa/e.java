package Qa;

import J1.k;
import ab.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import i2.C1332t;
import l2.a0;
import oa.C1830e;
import y9.AbstractC2463f;

/* loaded from: classes2.dex */
public abstract class e<DB extends k> extends AbstractC2463f<DB> implements cb.b {

    /* renamed from: F0, reason: collision with root package name */
    public j f8721F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f8722G0;

    /* renamed from: H0, reason: collision with root package name */
    public volatile ab.f f8723H0;

    /* renamed from: I0, reason: collision with root package name */
    public final Object f8724I0 = new Object();

    /* renamed from: J0, reason: collision with root package name */
    public boolean f8725J0 = false;

    /* JADX WARN: Type inference failed for: r2v1, types: [Pa.d, java.lang.Object] */
    public final void A0() {
        if (this.f8725J0) {
            return;
        }
        this.f8725J0 = true;
        g gVar = (g) this;
        oa.j jVar = ((C1830e) ((h) e())).f22151a;
        C1332t c1332t = jVar.f22174f;
        gVar.f8729K0 = new Object();
        gVar.f8730L0 = (La.g) jVar.f22161D.get();
        gVar.f8731M0 = jVar.b();
    }

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f8722G0) {
            return null;
        }
        z0();
        return this.f8721F0;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        boolean z8 = true;
        this.f10275S = true;
        j jVar = this.f8721F0;
        if (jVar != null && ab.f.b(jVar) != activity) {
            z8 = false;
        }
        com.bumptech.glide.c.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        z0();
        A0();
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public void R(Context context) {
        super.R(context);
        z0();
        A0();
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f8723H0 == null) {
            synchronized (this.f8724I0) {
                try {
                    if (this.f8723H0 == null) {
                        this.f8723H0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f8723H0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }

    public final void z0() {
        if (this.f8721F0 == null) {
            this.f8721F0 = new j(super.C(), this);
            this.f8722G0 = com.bumptech.glide.d.r(super.C());
        }
    }
}
