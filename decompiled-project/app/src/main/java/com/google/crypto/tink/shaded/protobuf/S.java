package com.google.crypto.tink.shaded.protobuf;

import H2.C0305t;

/* loaded from: classes.dex */
public final class S implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1007a f15740a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f15741b;

    /* renamed from: c, reason: collision with root package name */
    public final C1022p f15742c;

    public S(d0 d0Var, C1022p c1022p, AbstractC1007a abstractC1007a) {
        this.f15741b = d0Var;
        c1022p.getClass();
        this.f15742c = c1022p;
        this.f15740a = abstractC1007a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void a(Object obj) {
        this.f15741b.getClass();
        ((AbstractC1028w) obj).unknownFields.f15767e = false;
        this.f15742c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean b(Object obj) {
        this.f15742c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final Object c() {
        return ((AbstractC1026u) ((AbstractC1028w) this.f15740a).f(5)).b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int d(AbstractC1007a abstractC1007a) {
        this.f15741b.getClass();
        c0 c0Var = ((AbstractC1028w) abstractC1007a).unknownFields;
        int i7 = c0Var.f15766d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < c0Var.f15763a; i11++) {
            int i12 = c0Var.f15764b[i11] >>> 3;
            i10 += C1016j.Y(3, (AbstractC1014h) c0Var.f15765c[i11]) + C1016j.q0(2, i12) + (C1016j.p0(1) * 2);
        }
        c0Var.f15766d = i10;
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void e(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2) {
        b0.B(this.f15741b, abstractC1028w, abstractC1028w2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean f(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2) {
        this.f15741b.getClass();
        return abstractC1028w.unknownFields.equals(abstractC1028w2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void g(Object obj, C0305t c0305t, C1021o c1021o) {
        this.f15741b.getClass();
        AbstractC1028w abstractC1028w = (AbstractC1028w) obj;
        if (abstractC1028w.unknownFields == c0.f15762f) {
            abstractC1028w.unknownFields = c0.b();
        }
        this.f15742c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void h(Object obj, C1018l c1018l) {
        this.f15742c.getClass();
        A3.c.p(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int i(AbstractC1028w abstractC1028w) {
        this.f15741b.getClass();
        return abstractC1028w.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void j(Object obj, byte[] bArr, int i7, int i10, P4.Z z8) {
        AbstractC1028w abstractC1028w = (AbstractC1028w) obj;
        if (abstractC1028w.unknownFields == c0.f15762f) {
            abstractC1028w.unknownFields = c0.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
