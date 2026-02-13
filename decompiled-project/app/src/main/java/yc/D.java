package yc;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    public static final D f27647c = new D(false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final D f27648d = new D(true, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27649a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27650b;

    public D(boolean z8, boolean z10) {
        this.f27649a = z8;
        this.f27650b = z10;
    }

    public final void a(xc.b bVar) {
        if (bVar == null || this.f27650b) {
            return;
        }
        for (int i7 = 0; i7 < bVar.f26332a; i7++) {
            String str = bVar.f26333b[i7];
            if (!xc.b.G(str)) {
                bVar.f26333b[i7] = wc.c.c(str);
            }
        }
    }
}
