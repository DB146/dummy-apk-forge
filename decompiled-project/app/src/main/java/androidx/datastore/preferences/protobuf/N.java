package androidx.datastore.preferences.protobuf;

import H2.C0305t;

/* loaded from: classes.dex */
public final class N implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0817u f13347a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f13348b;

    /* renamed from: c, reason: collision with root package name */
    public final C0811n f13349c;

    public N(e0 e0Var, C0811n c0811n, AbstractC0817u abstractC0817u) {
        this.f13348b = e0Var;
        c0811n.getClass();
        this.f13349c = c0811n;
        this.f13347a = abstractC0817u;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj) {
        this.f13348b.getClass();
        e0.b(obj);
        this.f13349c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean b(Object obj) {
        this.f13349c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0817u c() {
        AbstractC0817u abstractC0817u = this.f13347a;
        return abstractC0817u != null ? abstractC0817u.k() : ((AbstractC0815s) abstractC0817u.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, Object obj2) {
        X.A(this.f13348b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void e(Object obj, E e2) {
        this.f13349c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0817u abstractC0817u) {
        this.f13348b.getClass();
        return abstractC0817u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean g(AbstractC0817u abstractC0817u, AbstractC0817u abstractC0817u2) {
        this.f13348b.getClass();
        return abstractC0817u.unknownFields.equals(abstractC0817u2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj, C0305t c0305t, C0810m c0810m) {
        this.f13348b.getClass();
        e0.a(obj);
        this.f13349c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int i(AbstractC0817u abstractC0817u) {
        this.f13348b.getClass();
        d0 d0Var = abstractC0817u.unknownFields;
        int i7 = d0Var.f13391d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < d0Var.f13388a; i11++) {
            int i12 = d0Var.f13389b[i11] >>> 3;
            i10 += C0808k.S(3, (C0804g) d0Var.f13390c[i11]) + C0808k.i0(2, i12) + (C0808k.h0(1) * 2);
        }
        d0Var.f13391d = i10;
        return i10;
    }
}
