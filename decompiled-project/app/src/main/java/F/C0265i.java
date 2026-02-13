package F;

import A0.G0;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3976b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f3977c;

    public C0265i(int i7, int i10, G0 g02) {
        this.f3975a = i7;
        this.f3976b = i10;
        this.f3977c = g02;
        if (i7 < 0) {
            B.a.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        B.a.a("size should be > 0");
    }
}
