package Q;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8310a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f8311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8312c;

    /* renamed from: d, reason: collision with root package name */
    public int f8313d;

    /* renamed from: e, reason: collision with root package name */
    public int f8314e;

    public J(z0 z0Var, int i7, int i10) {
        this.f8311b = z0Var;
        this.f8312c = i10;
        this.f8313d = i7;
        this.f8314e = z0Var.f8593v;
        if (z0Var.f8592u) {
            B0.f();
        }
    }

    public J(z0 z0Var, int i7, K k, C0480b c0480b) {
        this.f8311b = z0Var;
        this.f8312c = i7;
        this.f8313d = z0Var.f8593v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8310a) {
            case 0:
                return this.f8313d < this.f8312c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8310a) {
            case 0:
                z0 z0Var = this.f8311b;
                int i7 = z0Var.f8593v;
                int i10 = this.f8314e;
                if (i7 != i10) {
                    B0.f();
                }
                int i11 = this.f8313d;
                this.f8313d = B0.a(z0Var.f8586a, i11) + i11;
                return new A0(z0Var, i11, i10);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8310a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
