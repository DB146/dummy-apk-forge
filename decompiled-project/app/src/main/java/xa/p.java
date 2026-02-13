package xa;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import l2.a0;
import oa.C1830e;
import y9.AbstractC2456A;

/* loaded from: classes2.dex */
public abstract class p extends AbstractC2456A implements cb.b {

    /* renamed from: i2, reason: collision with root package name */
    public ab.j f26316i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f26317j2;

    /* renamed from: k2, reason: collision with root package name */
    public volatile ab.f f26318k2;

    /* renamed from: l2, reason: collision with root package name */
    public final Object f26319l2 = new Object();

    /* renamed from: m2, reason: collision with root package name */
    public boolean f26320m2 = false;

    @Override // W1.C
    public final Context C() {
        if (super.C() == null && !this.f26317j2) {
            return null;
        }
        k1();
        return this.f26316i2;
    }

    @Override // W1.C
    public final void Q(Activity activity) {
        boolean z8 = true;
        this.f10275S = true;
        ab.j jVar = this.f26316i2;
        if (jVar != null && ab.f.b(jVar) != activity) {
            z8 = false;
        }
        com.bumptech.glide.c.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k1();
        l1();
    }

    @Override // y9.AbstractC2456A, W1.C
    public final void R(Context context) {
        super.R(context);
        k1();
        l1();
    }

    @Override // W1.C
    public final LayoutInflater X(Bundle bundle) {
        LayoutInflater X10 = super.X(bundle);
        return X10.cloneInContext(new ab.j(X10, this));
    }

    @Override // cb.b
    public final Object e() {
        if (this.f26318k2 == null) {
            synchronized (this.f26319l2) {
                try {
                    if (this.f26318k2 == null) {
                        this.f26318k2 = new ab.f(this);
                    }
                } finally {
                }
            }
        }
        return this.f26318k2.e();
    }

    public final void k1() {
        if (this.f26316i2 == null) {
            this.f26316i2 = new ab.j(super.C(), this);
            this.f26317j2 = com.bumptech.glide.d.r(super.C());
        }
    }

    public final void l1() {
        if (this.f26320m2) {
            return;
        }
        this.f26320m2 = true;
        i iVar = (i) this;
        oa.j jVar = ((C1830e) ((j) e())).f22151a;
        iVar.f27458d1 = jVar.b();
        iVar.f27460e1 = (E9.g) jVar.f22166I.get();
        iVar.f27461f1 = (La.g) jVar.f22161D.get();
        iVar.f26299o2 = (Kc.d) jVar.f22167J.get();
    }

    @Override // W1.C, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.p(this, super.n());
    }
}
