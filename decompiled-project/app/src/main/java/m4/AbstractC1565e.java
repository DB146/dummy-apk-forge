package m4;

import n5.AbstractC1705a;

/* renamed from: m4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1565e implements y0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f20350A;

    /* renamed from: B, reason: collision with root package name */
    public k5.q f20351B;

    /* renamed from: b, reason: collision with root package name */
    public final int f20353b;

    /* renamed from: d, reason: collision with root package name */
    public D0 f20355d;

    /* renamed from: e, reason: collision with root package name */
    public int f20356e;

    /* renamed from: f, reason: collision with root package name */
    public n4.l f20357f;

    /* renamed from: u, reason: collision with root package name */
    public int f20358u;

    /* renamed from: v, reason: collision with root package name */
    public P4.d0 f20359v;

    /* renamed from: w, reason: collision with root package name */
    public L[] f20360w;

    /* renamed from: x, reason: collision with root package name */
    public long f20361x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20363z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f20352a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ha.g f20354c = new ha.g(3, false);

    /* renamed from: y, reason: collision with root package name */
    public long f20362y = Long.MIN_VALUE;

    public AbstractC1565e(int i7) {
        this.f20353b = i7;
    }

    public static int e(int i7, int i10, int i11) {
        return i7 | i10 | i11 | 128;
    }

    public static int g(int i7) {
        return i7 & 384;
    }

    public static int h(int i7) {
        return i7 & 64;
    }

    public abstract int A(L l10);

    public int B() {
        return 0;
    }

    @Override // m4.y0
    public void c(int i7, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1581m f(Exception exc, L l10, boolean z8, int i7) {
        int i10;
        if (l10 != null && !this.f20350A) {
            this.f20350A = true;
            try {
                i10 = A(l10) & 7;
            } catch (C1581m unused) {
            } finally {
                this.f20350A = false;
            }
            return new C1581m(1, exc, i7, j(), this.f20356e, l10, l10 != null ? 4 : i10, z8);
        }
        i10 = 4;
        return new C1581m(1, exc, i7, j(), this.f20356e, l10, l10 != null ? 4 : i10, z8);
    }

    public n5.n i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.f20362y == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public void o(boolean z8, boolean z10) {
    }

    public abstract void p(long j, boolean z8);

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public abstract void u(L[] lArr, long j, long j10);

    public final int v(ha.g gVar, q4.g gVar2, int i7) {
        P4.d0 d0Var = this.f20359v;
        d0Var.getClass();
        int f4 = d0Var.f(gVar, gVar2, i7);
        if (f4 == -4) {
            if (gVar2.i(4)) {
                this.f20362y = Long.MIN_VALUE;
                return this.f20363z ? -4 : -3;
            }
            long j = gVar2.f23460f + this.f20361x;
            gVar2.f23460f = j;
            this.f20362y = Math.max(this.f20362y, j);
        } else if (f4 == -5) {
            L l10 = (L) gVar.f17916c;
            l10.getClass();
            long j10 = l10.f20067D;
            if (j10 != Long.MAX_VALUE) {
                K a9 = l10.a();
                a9.f19987o = j10 + this.f20361x;
                gVar.f17916c = new L(a9);
            }
        }
        return f4;
    }

    public abstract void w(long j, long j10);

    public final void x(L[] lArr, P4.d0 d0Var, long j, long j10) {
        AbstractC1705a.m(!this.f20363z);
        this.f20359v = d0Var;
        if (this.f20362y == Long.MIN_VALUE) {
            this.f20362y = j;
        }
        this.f20360w = lArr;
        this.f20361x = j10;
        u(lArr, j, j10);
    }

    public final void y() {
        AbstractC1705a.m(this.f20358u == 0);
        this.f20354c.clear();
        r();
    }

    public void z(float f4, float f10) {
    }
}
