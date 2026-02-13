package m4;

import P4.C0477z;
import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: t, reason: collision with root package name */
    public static final P4.B f20481t = new C0477z(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final L0 f20482a;

    /* renamed from: b, reason: collision with root package name */
    public final P4.B f20483b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20484c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20486e;

    /* renamed from: f, reason: collision with root package name */
    public final C1581m f20487f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final P4.n0 f20488h;

    /* renamed from: i, reason: collision with root package name */
    public final k5.y f20489i;
    public final List j;
    public final P4.B k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20490l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20491m;

    /* renamed from: n, reason: collision with root package name */
    public final s0 f20492n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20493o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f20494p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f20495q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f20496r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f20497s;

    public r0(L0 l02, P4.B b2, long j, long j10, int i7, C1581m c1581m, boolean z8, P4.n0 n0Var, k5.y yVar, List list, P4.B b10, boolean z10, int i10, s0 s0Var, long j11, long j12, long j13, long j14, boolean z11) {
        this.f20482a = l02;
        this.f20483b = b2;
        this.f20484c = j;
        this.f20485d = j10;
        this.f20486e = i7;
        this.f20487f = c1581m;
        this.g = z8;
        this.f20488h = n0Var;
        this.f20489i = yVar;
        this.j = list;
        this.k = b10;
        this.f20490l = z10;
        this.f20491m = i10;
        this.f20492n = s0Var;
        this.f20494p = j11;
        this.f20495q = j12;
        this.f20496r = j13;
        this.f20497s = j14;
        this.f20493o = z11;
    }

    public static r0 i(k5.y yVar) {
        I0 i02 = L0.f20097a;
        P4.B b2 = f20481t;
        return new r0(i02, b2, -9223372036854775807L, 0L, 1, null, false, P4.n0.f8117d, yVar, N6.t0.f7341e, b2, false, 0, s0.f20500d, 0L, 0L, 0L, 0L, false);
    }

    public final r0 a() {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, this.f20486e, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, this.k, this.f20490l, this.f20491m, this.f20492n, this.f20494p, this.f20495q, j(), SystemClock.elapsedRealtime(), this.f20493o);
    }

    public final r0 b(P4.B b2) {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, this.f20486e, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, b2, this.f20490l, this.f20491m, this.f20492n, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final r0 c(P4.B b2, long j, long j10, long j11, long j12, P4.n0 n0Var, k5.y yVar, List list) {
        return new r0(this.f20482a, b2, j10, j11, this.f20486e, this.f20487f, this.g, n0Var, yVar, list, this.k, this.f20490l, this.f20491m, this.f20492n, this.f20494p, j12, j, SystemClock.elapsedRealtime(), this.f20493o);
    }

    public final r0 d(int i7, boolean z8) {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, this.f20486e, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, this.k, z8, i7, this.f20492n, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final r0 e(C1581m c1581m) {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, this.f20486e, c1581m, this.g, this.f20488h, this.f20489i, this.j, this.k, this.f20490l, this.f20491m, this.f20492n, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final r0 f(s0 s0Var) {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, this.f20486e, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, this.k, this.f20490l, this.f20491m, s0Var, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final r0 g(int i7) {
        return new r0(this.f20482a, this.f20483b, this.f20484c, this.f20485d, i7, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, this.k, this.f20490l, this.f20491m, this.f20492n, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final r0 h(L0 l02) {
        return new r0(l02, this.f20483b, this.f20484c, this.f20485d, this.f20486e, this.f20487f, this.g, this.f20488h, this.f20489i, this.j, this.k, this.f20490l, this.f20491m, this.f20492n, this.f20494p, this.f20495q, this.f20496r, this.f20497s, this.f20493o);
    }

    public final long j() {
        long j;
        long j10;
        if (!k()) {
            return this.f20496r;
        }
        do {
            j = this.f20497s;
            j10 = this.f20496r;
        } while (j != this.f20497s);
        return n5.D.M(n5.D.Z(j10) + (((float) (SystemClock.elapsedRealtime() - j)) * this.f20492n.f20501a));
    }

    public final boolean k() {
        return this.f20486e == 3 && this.f20490l && this.f20491m == 0;
    }
}
