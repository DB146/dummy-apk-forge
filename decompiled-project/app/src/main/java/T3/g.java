package T3;

import W3.o;

/* loaded from: classes.dex */
public abstract class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9232c;

    public g(int i7, int i10) {
        this.f9231b = i7;
        this.f9232c = i10;
    }

    @Override // T3.i
    public final void d(S3.g gVar) {
    }

    @Override // T3.i
    public final void f(S3.g gVar) {
        int i7 = this.f9231b;
        int i10 = this.f9232c;
        if (!o.j(i7, i10)) {
            throw new IllegalArgumentException(A3.c.e(i7, i10, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: ", ", either provide dimensions in the constructor or call override()"));
        }
        gVar.m(i7, i10);
    }
}
