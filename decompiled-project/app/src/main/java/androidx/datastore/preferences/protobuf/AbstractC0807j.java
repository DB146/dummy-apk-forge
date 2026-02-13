package androidx.datastore.preferences.protobuf;

import ea.C1108c;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0807j {

    /* renamed from: a, reason: collision with root package name */
    public int f13417a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13418b;

    public AbstractC0807j(int i7) {
        this.f13417a = i7;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i7);

    public void D() {
        int z8;
        do {
            z8 = z();
            if (z8 == 0) {
                return;
            }
            int i7 = this.f13417a;
            if (i7 >= 100) {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f13417a = i7 + 1;
            this.f13417a--;
        } while (C(z8));
    }

    public abstract void a(int i7);

    public abstract int b();

    public abstract boolean c();

    public void d(y1.a0 a0Var) {
    }

    public void e() {
    }

    public abstract y1.p0 f(y1.p0 p0Var, List list);

    public abstract C1108c g(C1108c c1108c);

    public abstract void h(int i7);

    public abstract int i(int i7);

    public abstract boolean j();

    public abstract C0804g k();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
