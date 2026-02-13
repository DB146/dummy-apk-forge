package u4;

import n5.AbstractC1705a;
import n5.D;
import s4.r;
import s4.t;
import s4.v;

/* renamed from: u4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2105e {

    /* renamed from: a, reason: collision with root package name */
    public final v f24856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24858c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24860e;

    /* renamed from: f, reason: collision with root package name */
    public int f24861f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f24862h;

    /* renamed from: i, reason: collision with root package name */
    public int f24863i;
    public int j;
    public long[] k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f24864l;

    public C2105e(int i7, int i10, long j, int i11, v vVar) {
        boolean z8 = true;
        if (i10 != 1 && i10 != 2) {
            z8 = false;
        }
        AbstractC1705a.h(z8);
        this.f24859d = j;
        this.f24860e = i11;
        this.f24856a = vVar;
        int i12 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f24857b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.f24858c = i10 == 2 ? i12 | 1650720768 : -1;
        this.k = new long[512];
        this.f24864l = new int[512];
    }

    public final t a(int i7) {
        return new t(((this.f24859d * 1) / this.f24860e) * this.f24864l[i7], this.k[i7]);
    }

    public final r b(long j) {
        int i7 = (int) (j / ((this.f24859d * 1) / this.f24860e));
        int d10 = D.d(this.f24864l, i7, true, true);
        if (this.f24864l[d10] == i7) {
            t a9 = a(d10);
            return new r(a9, a9);
        }
        t a10 = a(d10);
        int i10 = d10 + 1;
        return i10 < this.k.length ? new r(a10, a(i10)) : new r(a10, a10);
    }
}
