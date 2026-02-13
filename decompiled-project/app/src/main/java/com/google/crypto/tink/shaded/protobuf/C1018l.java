package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018l {

    /* renamed from: b, reason: collision with root package name */
    public static final C1025t f15794b = new C1025t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f15795a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.K, java.lang.Object] */
    public C1018l() {
        O o10;
        try {
            o10 = (O) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o10 = f15794b;
        }
        O[] oArr = {C1025t.f15816b, o10};
        ?? obj = new Object();
        obj.f15722a = oArr;
        Charset charset = A.f15705a;
        this.f15795a = obj;
    }

    public C1018l(C1016j c1016j) {
        A.a(c1016j, "output");
        this.f15795a = c1016j;
        c1016j.f15789a = this;
    }

    public void a(int i7, boolean z8) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 0);
        c1016j.u0(z8 ? (byte) 1 : (byte) 0);
    }

    public void b(int i7, AbstractC1014h abstractC1014h) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 2);
        c1016j.C0(abstractC1014h.size());
        C1013g c1013g = (C1013g) abstractC1014h;
        c1016j.v0(c1013g.f15773d, c1013g.z(), c1013g.size());
    }

    public void c(int i7, double d10) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.getClass();
        c1016j.y0(i7, Double.doubleToRawLongBits(d10));
    }

    public void d(int i7, int i10) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 0);
        c1016j.A0(i10);
    }

    public void e(int i7, int i10) {
        ((C1016j) this.f15795a).w0(i7, i10);
    }

    public void f(int i7, long j) {
        ((C1016j) this.f15795a).y0(i7, j);
    }

    public void g(int i7, float f4) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.getClass();
        c1016j.w0(i7, Float.floatToRawIntBits(f4));
    }

    public void h(int i7, Object obj, a0 a0Var) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 3);
        a0Var.h((AbstractC1007a) obj, c1016j.f15789a);
        c1016j.B0(i7, 4);
    }

    public void i(int i7, int i10) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 0);
        c1016j.A0(i10);
    }

    public void j(int i7, long j) {
        ((C1016j) this.f15795a).D0(i7, j);
    }

    public void k(int i7, Object obj, a0 a0Var) {
        AbstractC1007a abstractC1007a = (AbstractC1007a) obj;
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 2);
        abstractC1007a.getClass();
        AbstractC1028w abstractC1028w = (AbstractC1028w) abstractC1007a;
        int i10 = abstractC1028w.memoizedSerializedSize;
        if (i10 == -1) {
            i10 = a0Var.d(abstractC1007a);
            abstractC1028w.memoizedSerializedSize = i10;
        }
        c1016j.C0(i10);
        a0Var.h(abstractC1007a, c1016j.f15789a);
    }

    public void l(int i7, int i10) {
        ((C1016j) this.f15795a).w0(i7, i10);
    }

    public void m(int i7, long j) {
        ((C1016j) this.f15795a).y0(i7, j);
    }

    public void n(int i7, int i10) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 0);
        c1016j.C0((i10 >> 31) ^ (i10 << 1));
    }

    public void o(int i7, long j) {
        ((C1016j) this.f15795a).D0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i10) {
        C1016j c1016j = (C1016j) this.f15795a;
        c1016j.B0(i7, 0);
        c1016j.C0(i10);
    }

    public void q(int i7, long j) {
        ((C1016j) this.f15795a).D0(i7, j);
    }
}
