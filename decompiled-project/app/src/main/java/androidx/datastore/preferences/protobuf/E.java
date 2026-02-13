package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final r f13324b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f13325a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.D] */
    public E() {
        T t5 = T.f13352c;
        Object obj = f13324b;
        try {
            obj = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        K[] kArr = {r.f13447b, obj};
        ?? obj2 = new Object();
        obj2.f13323a = kArr;
        Charset charset = AbstractC0819w.f13467a;
        this.f13325a = obj2;
    }

    public E(C0808k c0808k) {
        AbstractC0819w.a(c0808k, "output");
        this.f13325a = c0808k;
        c0808k.f13426b = this;
    }

    public void a(int i7, boolean z8) {
        ((C0808k) this.f13325a).q0(i7, z8);
    }

    public void b(int i7, C0804g c0804g) {
        ((C0808k) this.f13325a).r0(i7, c0804g);
    }

    public void c(int i7, double d10) {
        C0808k c0808k = (C0808k) this.f13325a;
        c0808k.getClass();
        c0808k.v0(i7, Double.doubleToRawLongBits(d10));
    }

    public void d(int i7, int i10) {
        ((C0808k) this.f13325a).x0(i7, i10);
    }

    public void e(int i7, int i10) {
        ((C0808k) this.f13325a).t0(i7, i10);
    }

    public void f(int i7, long j) {
        ((C0808k) this.f13325a).v0(i7, j);
    }

    public void g(int i7, float f4) {
        C0808k c0808k = (C0808k) this.f13325a;
        c0808k.getClass();
        c0808k.t0(i7, Float.floatToRawIntBits(f4));
    }

    public void h(int i7, Object obj, W w10) {
        C0808k c0808k = (C0808k) this.f13325a;
        c0808k.B0(i7, 3);
        w10.e((AbstractC0798a) obj, c0808k.f13426b);
        c0808k.B0(i7, 4);
    }

    public void i(int i7, int i10) {
        ((C0808k) this.f13325a).x0(i7, i10);
    }

    public void j(int i7, long j) {
        ((C0808k) this.f13325a).E0(i7, j);
    }

    public void k(int i7, Object obj, W w10) {
        C0808k c0808k = (C0808k) this.f13325a;
        AbstractC0798a abstractC0798a = (AbstractC0798a) obj;
        c0808k.B0(i7, 2);
        c0808k.D0(abstractC0798a.a(w10));
        w10.e(abstractC0798a, c0808k.f13426b);
    }

    public void l(int i7, int i10) {
        ((C0808k) this.f13325a).t0(i7, i10);
    }

    public void m(int i7, long j) {
        ((C0808k) this.f13325a).v0(i7, j);
    }

    public void n(int i7, int i10) {
        ((C0808k) this.f13325a).C0(i7, (i10 >> 31) ^ (i10 << 1));
    }

    public void o(int i7, long j) {
        ((C0808k) this.f13325a).E0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i10) {
        ((C0808k) this.f13325a).C0(i7, i10);
    }

    public void q(int i7, long j) {
        ((C0808k) this.f13325a).E0(i7, j);
    }
}
