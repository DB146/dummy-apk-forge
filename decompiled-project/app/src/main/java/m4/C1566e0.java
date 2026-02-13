package m4;

import n5.AbstractC1705a;

/* renamed from: m4.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566e0 {

    /* renamed from: a, reason: collision with root package name */
    public final P4.B f20364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20365b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20366c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20367d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20368e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20369f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20370h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20371i;

    public C1566e0(P4.B b2, long j, long j10, long j11, long j12, boolean z8, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        AbstractC1705a.h(!z12 || z10);
        AbstractC1705a.h(!z11 || z10);
        if (z8 && (z10 || z11 || z12)) {
            z13 = false;
        }
        AbstractC1705a.h(z13);
        this.f20364a = b2;
        this.f20365b = j;
        this.f20366c = j10;
        this.f20367d = j11;
        this.f20368e = j12;
        this.f20369f = z8;
        this.g = z10;
        this.f20370h = z11;
        this.f20371i = z12;
    }

    public final C1566e0 a(long j) {
        if (j == this.f20366c) {
            return this;
        }
        return new C1566e0(this.f20364a, this.f20365b, j, this.f20367d, this.f20368e, this.f20369f, this.g, this.f20370h, this.f20371i);
    }

    public final C1566e0 b(long j) {
        if (j == this.f20365b) {
            return this;
        }
        return new C1566e0(this.f20364a, j, this.f20366c, this.f20367d, this.f20368e, this.f20369f, this.g, this.f20370h, this.f20371i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1566e0.class != obj.getClass()) {
            return false;
        }
        C1566e0 c1566e0 = (C1566e0) obj;
        return this.f20365b == c1566e0.f20365b && this.f20366c == c1566e0.f20366c && this.f20367d == c1566e0.f20367d && this.f20368e == c1566e0.f20368e && this.f20369f == c1566e0.f20369f && this.g == c1566e0.g && this.f20370h == c1566e0.f20370h && this.f20371i == c1566e0.f20371i && n5.D.a(this.f20364a, c1566e0.f20364a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f20364a.hashCode() + 527) * 31) + ((int) this.f20365b)) * 31) + ((int) this.f20366c)) * 31) + ((int) this.f20367d)) * 31) + ((int) this.f20368e)) * 31) + (this.f20369f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f20370h ? 1 : 0)) * 31) + (this.f20371i ? 1 : 0);
    }
}
