package z4;

import s4.r;
import s4.s;
import s4.t;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2588a implements InterfaceC2593f, s {

    /* renamed from: a, reason: collision with root package name */
    public final long f28240a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28242c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28244e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28245f;
    public final boolean g;

    public C2588a(long j, long j10, int i7, int i10, boolean z8) {
        this.f28240a = j;
        this.f28241b = j10;
        this.f28242c = i10 == -1 ? 1 : i10;
        this.f28244e = i7;
        this.g = z8;
        if (j == -1) {
            this.f28243d = -1L;
            this.f28245f = -9223372036854775807L;
        } else {
            long j11 = j - j10;
            this.f28243d = j11;
            this.f28245f = (Math.max(0L, j11) * 8000000) / i7;
        }
    }

    @Override // z4.InterfaceC2593f
    public final long b(long j) {
        return (Math.max(0L, j - this.f28241b) * 8000000) / this.f28244e;
    }

    @Override // z4.InterfaceC2593f
    public final long d() {
        return -1L;
    }

    @Override // s4.s
    public final boolean g() {
        return this.f28243d != -1 || this.g;
    }

    @Override // s4.s
    public final r h(long j) {
        long j10 = this.f28243d;
        long j11 = this.f28241b;
        if (j10 == -1 && !this.g) {
            t tVar = new t(0L, j11);
            return new r(tVar, tVar);
        }
        int i7 = this.f28244e;
        long j12 = this.f28242c;
        long j13 = (((i7 * j) / 8000000) / j12) * j12;
        if (j10 != -1) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i7;
        t tVar2 = new t(max2, max);
        if (j10 != -1 && max2 < j) {
            long j14 = max + j12;
            if (j14 < this.f28240a) {
                return new r(tVar2, new t((Math.max(0L, j14 - j11) * 8000000) / i7, j14));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override // s4.s
    public final long i() {
        return this.f28245f;
    }
}
