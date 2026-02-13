package y1;

import q1.C1876b;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f26695a;

    /* renamed from: b, reason: collision with root package name */
    public C1876b[] f26696b;

    public f0() {
        this(new p0((p0) null));
    }

    public f0(p0 p0Var) {
        this.f26695a = p0Var;
    }

    public final void a() {
        C1876b[] c1876bArr = this.f26696b;
        if (c1876bArr != null) {
            C1876b c1876b = c1876bArr[0];
            C1876b c1876b2 = c1876bArr[1];
            p0 p0Var = this.f26695a;
            if (c1876b2 == null) {
                c1876b2 = p0Var.f26731a.g(2);
            }
            if (c1876b == null) {
                c1876b = p0Var.f26731a.g(1);
            }
            g(C1876b.a(c1876b, c1876b2));
            C1876b c1876b3 = this.f26696b[c2.i.t(16)];
            if (c1876b3 != null) {
                f(c1876b3);
            }
            C1876b c1876b4 = this.f26696b[c2.i.t(32)];
            if (c1876b4 != null) {
                d(c1876b4);
            }
            C1876b c1876b5 = this.f26696b[c2.i.t(64)];
            if (c1876b5 != null) {
                h(c1876b5);
            }
        }
    }

    public abstract p0 b();

    public void c(int i7, C1876b c1876b) {
        if (this.f26696b == null) {
            this.f26696b = new C1876b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                this.f26696b[c2.i.t(i10)] = c1876b;
            }
        }
    }

    public void d(C1876b c1876b) {
    }

    public abstract void e(C1876b c1876b);

    public void f(C1876b c1876b) {
    }

    public abstract void g(C1876b c1876b);

    public void h(C1876b c1876b) {
    }
}
