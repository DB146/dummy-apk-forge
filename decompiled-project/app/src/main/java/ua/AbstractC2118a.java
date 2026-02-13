package ua;

import ab.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import c2.p;
import l2.a0;

/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2118a extends p implements cb.b {

    /* renamed from: X0, reason: collision with root package name */
    public j f24901X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f24902Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public volatile ab.f f24903Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final Object f24904a1 = new Object();

    /* renamed from: b1, reason: collision with root package name */
    public boolean f24905b1 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f24902Y0) {
            return null;
        }
        p0();
        return this.f24901X0;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        this.f10275S = true;
        j jVar = this.f24901X0;
        com.bumptech.glide.c.h(jVar == null || ab.f.b(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p0();
        if (this.f24905b1) {
            return;
        }
        this.f24905b1 = true;
        ((f) e()).getClass();
    }

    @Override // W1.C
    public void R(Context context) {
        super.R(context);
        p0();
        if (this.f24905b1) {
            return;
        }
        this.f24905b1 = true;
        ((f) e()).getClass();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f24903Z0 == null) {
            synchronized (this.f24904a1) {
                try {
                    if (this.f24903Z0 == null) {
                        this.f24903Z0 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f24903Z0.e();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }

    public final void p0() {
        if (this.f24901X0 == null) {
            this.f24901X0 = new j(super.C(), this);
            this.f24902Y0 = com.bumptech.glide.d.r(super.C());
        }
    }
}
