package za;

import A9.W;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;

/* loaded from: classes2.dex */
public abstract class h extends W implements cb.b {

    /* renamed from: v1, reason: collision with root package name */
    public ab.j f28354v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f28355w1;

    /* renamed from: x1, reason: collision with root package name */
    public volatile ab.f f28356x1;

    /* renamed from: y1, reason: collision with root package name */
    public final Object f28357y1 = new Object();

    /* renamed from: z1, reason: collision with root package name */
    public boolean f28358z1 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f28355w1) {
            return null;
        }
        O0();
        return this.f28354v1;
    }

    public final void O0() {
        if (this.f28354v1 == null) {
            this.f28354v1 = new ab.j(super.C(), this);
            this.f28355w1 = com.bumptech.glide.d.r(super.C());
        }
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        this.f10275S = true;
        ab.j jVar = this.f28354v1;
        com.bumptech.glide.c.h(jVar == null || ab.f.b(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        O0();
        if (this.f28358z1) {
            return;
        }
        this.f28358z1 = true;
    }

    @Override // W1.C
    public void R(Context context) {
        super.R(context);
        O0();
        if (this.f28358z1) {
            return;
        }
        this.f28358z1 = true;
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f28356x1 == null) {
            synchronized (this.f28357y1) {
                try {
                    if (this.f28356x1 == null) {
                        this.f28356x1 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f28356x1.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }
}
