package cc;

import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public abstract class A extends Hb.a implements Hb.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0959z f14464b = new C0959z(Hb.e.f4918a, C0958y.f14591a);

    public A() {
        super(Hb.e.f4918a);
    }

    public abstract void T(Hb.i iVar, Runnable runnable);

    public void U(Hb.i iVar, Runnable runnable) {
        T(iVar, runnable);
    }

    public boolean V(Hb.i iVar) {
        return !(this instanceof K0);
    }

    public A W(int i7) {
        AbstractC1273a.a(i7);
        return new hc.j(this, i7);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Hb.a, Hb.i
    public final Hb.g get(Hb.h key) {
        Hb.g gVar;
        kotlin.jvm.internal.l.e(key, "key");
        if (!(key instanceof C0959z)) {
            if (Hb.e.f4918a == key) {
                return this;
            }
            return null;
        }
        C0959z c0959z = (C0959z) key;
        Hb.h hVar = this.f4914a;
        if ((hVar == c0959z || c0959z.f14593b == hVar) && (gVar = (Hb.g) c0959z.f14592a.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Hb.a, Hb.i
    public final Hb.i minusKey(Hb.h key) {
        kotlin.jvm.internal.l.e(key, "key");
        boolean z8 = key instanceof C0959z;
        Hb.j jVar = Hb.j.f4919a;
        if (z8) {
            C0959z c0959z = (C0959z) key;
            Hb.h hVar = this.f4914a;
            if ((hVar == c0959z || c0959z.f14593b == hVar) && ((Hb.g) c0959z.f14592a.invoke(this)) != null) {
                return jVar;
            }
        } else if (Hb.e.f4918a == key) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + F.q(this);
    }
}
