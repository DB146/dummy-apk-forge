package S4;

import P4.d0;
import m4.L;
import n5.D;
import q3.s;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final L f9147a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f9149c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9150d;

    /* renamed from: e, reason: collision with root package name */
    public T4.g f9151e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9152f;

    /* renamed from: u, reason: collision with root package name */
    public int f9153u;

    /* renamed from: b, reason: collision with root package name */
    public final s f9148b = new s(8);

    /* renamed from: v, reason: collision with root package name */
    public long f9154v = -9223372036854775807L;

    public n(T4.g gVar, L l10, boolean z8) {
        this.f9147a = l10;
        this.f9151e = gVar;
        this.f9149c = gVar.f9273b;
        c(gVar, z8);
    }

    @Override // P4.d0
    public final void a() {
    }

    @Override // P4.d0
    public final boolean b() {
        return true;
    }

    public final void c(T4.g gVar, boolean z8) {
        int i7 = this.f9153u;
        long j = -9223372036854775807L;
        long j10 = i7 == 0 ? -9223372036854775807L : this.f9149c[i7 - 1];
        this.f9150d = z8;
        this.f9151e = gVar;
        long[] jArr = gVar.f9273b;
        this.f9149c = jArr;
        long j11 = this.f9154v;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.f9153u = D.b(jArr, j10, false);
            }
        } else {
            int b2 = D.b(jArr, j11, true);
            this.f9153u = b2;
            if (this.f9150d && b2 == this.f9149c.length) {
                j = j11;
            }
            this.f9154v = j;
        }
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        int i10 = this.f9153u;
        boolean z8 = i10 == this.f9149c.length;
        if (z8 && !this.f9150d) {
            gVar2.f368b = 4;
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f9152f) {
            gVar.f17916c = this.f9147a;
            this.f9152f = true;
            return -5;
        }
        if (z8) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f9153u = i10 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] q10 = this.f9148b.q(this.f9151e.f9272a[i10]);
            gVar2.I(q10.length);
            gVar2.f23458d.put(q10);
        }
        gVar2.f23460f = this.f9149c[i10];
        gVar2.f368b = 1;
        return -4;
    }

    @Override // P4.d0
    public final int h(long j) {
        int max = Math.max(this.f9153u, D.b(this.f9149c, j, true));
        int i7 = max - this.f9153u;
        this.f9153u = max;
        return i7;
    }
}
