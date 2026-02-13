package va;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import oa.C1830e;
import y9.AbstractC2457B;

/* loaded from: classes2.dex */
public abstract class I extends AbstractC2457B implements cb.b {

    /* renamed from: L0, reason: collision with root package name */
    public ab.j f25293L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f25294M0;

    /* renamed from: N0, reason: collision with root package name */
    public volatile ab.f f25295N0;

    /* renamed from: O0, reason: collision with root package name */
    public final Object f25296O0 = new Object();

    /* renamed from: P0, reason: collision with root package name */
    public boolean f25297P0 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f25294M0) {
            return null;
        }
        E0();
        return this.f25293L0;
    }

    public final void E0() {
        if (this.f25293L0 == null) {
            this.f25293L0 = new ab.j(super.C(), this);
            this.f25294M0 = com.bumptech.glide.d.r(super.C());
        }
    }

    public final void F0() {
        if (this.f25297P0) {
            return;
        }
        this.f25297P0 = true;
        oa.j jVar = ((C1830e) ((E) e())).f22151a;
        ((u) this).f25355Q0 = (Kc.d) jVar.f22167J.get();
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        boolean z8 = true;
        this.f10275S = true;
        ab.j jVar = this.f25293L0;
        if (jVar != null && ab.f.b(jVar) != activity) {
            z8 = false;
        }
        com.bumptech.glide.c.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E0();
        F0();
    }

    @Override // y9.AbstractC2457B, W1.C
    public final void R(Context context) {
        super.R(context);
        E0();
        F0();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f25295N0 == null) {
            synchronized (this.f25296O0) {
                try {
                    if (this.f25295N0 == null) {
                        this.f25295N0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f25295N0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }
}
