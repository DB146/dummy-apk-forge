package yc;

import ea.C1111f;

/* loaded from: classes2.dex */
public abstract class P extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C1111f f27670d;

    /* renamed from: e, reason: collision with root package name */
    public String f27671e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27672f;
    public xc.b g;

    /* renamed from: h, reason: collision with root package name */
    public final C1111f f27673h;

    /* renamed from: i, reason: collision with root package name */
    public final C1111f f27674i;
    public boolean j;

    public P(int i7, m1 m1Var) {
        super(i7);
        this.f27670d = new C1111f(19);
        this.f27672f = false;
        this.f27673h = new C1111f(19);
        this.f27674i = new C1111f(19);
        this.j = false;
        m1Var.getClass();
    }

    public final void h(int i7, int i10, char c10) {
        this.f27674i.h(c10);
    }

    public final void i(int i7, int i10, int[] iArr) {
        for (int i11 : iArr) {
            C1111f c1111f = this.f27674i;
            StringBuilder sb2 = (StringBuilder) c1111f.f16838c;
            if (sb2 != null) {
                sb2.appendCodePoint(i11);
            } else if (((String) c1111f.f16837b) != null) {
                StringBuilder b2 = wc.l.b();
                c1111f.f16838c = b2;
                b2.append((String) c1111f.f16837b);
                c1111f.f16837b = null;
                ((StringBuilder) c1111f.f16838c).appendCodePoint(i11);
            } else {
                c1111f.f16837b = String.valueOf(Character.toChars(i11));
            }
        }
    }

    public final void j(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        C1111f c1111f = this.f27670d;
        c1111f.i(replace);
        this.f27671e = wc.c.d(c1111f.L());
    }

    public final void k(String str) {
        C1111f c1111f = this.f27670d;
        c1111f.z();
        c1111f.f16837b = str;
        this.f27671e = wc.c.d(c1111f.L());
    }

    public final void l() {
        if (this.g == null) {
            this.g = new xc.b();
        }
        C1111f c1111f = this.f27673h;
        boolean t5 = c1111f.t();
        C1111f c1111f2 = this.f27674i;
        if (t5 && this.g.f26332a < 512) {
            String trim = c1111f.L().trim();
            if (!trim.isEmpty()) {
                this.g.i(trim, c1111f2.t() ? c1111f2.L() : this.j ? "" : null);
            }
        }
        c1111f.z();
        c1111f2.z();
        this.j = false;
    }

    public final String m() {
        String str = this.f27671e;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f27671e;
    }

    @Override // yc.S
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public P g() {
        this.f27676b = -1;
        this.f27677c = -1;
        this.f27670d.z();
        this.f27671e = null;
        this.f27672f = false;
        this.g = null;
        this.f27673h.z();
        this.f27674i.z();
        this.j = false;
        return this;
    }

    public final String o() {
        String L = this.f27670d.L();
        return L.isEmpty() ? "[unset]" : L;
    }
}
