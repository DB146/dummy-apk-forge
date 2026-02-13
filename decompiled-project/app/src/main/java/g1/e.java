package g1;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f17238A;

    /* renamed from: B, reason: collision with root package name */
    public int f17239B;

    /* renamed from: C, reason: collision with root package name */
    public int f17240C;

    /* renamed from: D, reason: collision with root package name */
    public int f17241D;

    /* renamed from: E, reason: collision with root package name */
    public float f17242E;

    /* renamed from: F, reason: collision with root package name */
    public float f17243F;

    /* renamed from: G, reason: collision with root package name */
    public String f17244G;

    /* renamed from: H, reason: collision with root package name */
    public float f17245H;

    /* renamed from: I, reason: collision with root package name */
    public float f17246I;

    /* renamed from: J, reason: collision with root package name */
    public int f17247J;

    /* renamed from: K, reason: collision with root package name */
    public int f17248K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f17249M;

    /* renamed from: N, reason: collision with root package name */
    public int f17250N;

    /* renamed from: O, reason: collision with root package name */
    public int f17251O;

    /* renamed from: P, reason: collision with root package name */
    public int f17252P;

    /* renamed from: Q, reason: collision with root package name */
    public int f17253Q;

    /* renamed from: R, reason: collision with root package name */
    public float f17254R;

    /* renamed from: S, reason: collision with root package name */
    public float f17255S;

    /* renamed from: T, reason: collision with root package name */
    public int f17256T;

    /* renamed from: U, reason: collision with root package name */
    public int f17257U;

    /* renamed from: V, reason: collision with root package name */
    public int f17258V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f17259W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f17260X;

    /* renamed from: Y, reason: collision with root package name */
    public String f17261Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f17262Z;

    /* renamed from: a, reason: collision with root package name */
    public int f17263a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f17264a0;

    /* renamed from: b, reason: collision with root package name */
    public int f17265b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f17266b0;

    /* renamed from: c, reason: collision with root package name */
    public float f17267c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f17268c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17269d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f17270d0;

    /* renamed from: e, reason: collision with root package name */
    public int f17271e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f17272e0;

    /* renamed from: f, reason: collision with root package name */
    public int f17273f;

    /* renamed from: f0, reason: collision with root package name */
    public int f17274f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public int f17275g0;

    /* renamed from: h, reason: collision with root package name */
    public int f17276h;

    /* renamed from: h0, reason: collision with root package name */
    public int f17277h0;

    /* renamed from: i, reason: collision with root package name */
    public int f17278i;

    /* renamed from: i0, reason: collision with root package name */
    public int f17279i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f17280j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public int f17281k0;

    /* renamed from: l, reason: collision with root package name */
    public int f17282l;

    /* renamed from: l0, reason: collision with root package name */
    public float f17283l0;

    /* renamed from: m, reason: collision with root package name */
    public int f17284m;

    /* renamed from: m0, reason: collision with root package name */
    public int f17285m0;

    /* renamed from: n, reason: collision with root package name */
    public int f17286n;

    /* renamed from: n0, reason: collision with root package name */
    public int f17287n0;

    /* renamed from: o, reason: collision with root package name */
    public int f17288o;

    /* renamed from: o0, reason: collision with root package name */
    public float f17289o0;

    /* renamed from: p, reason: collision with root package name */
    public int f17290p;

    /* renamed from: p0, reason: collision with root package name */
    public d1.d f17291p0;

    /* renamed from: q, reason: collision with root package name */
    public int f17292q;

    /* renamed from: r, reason: collision with root package name */
    public float f17293r;

    /* renamed from: s, reason: collision with root package name */
    public int f17294s;

    /* renamed from: t, reason: collision with root package name */
    public int f17295t;

    /* renamed from: u, reason: collision with root package name */
    public int f17296u;

    /* renamed from: v, reason: collision with root package name */
    public int f17297v;

    /* renamed from: w, reason: collision with root package name */
    public int f17298w;

    /* renamed from: x, reason: collision with root package name */
    public int f17299x;

    /* renamed from: y, reason: collision with root package name */
    public int f17300y;

    /* renamed from: z, reason: collision with root package name */
    public int f17301z;

    public final void a() {
        this.f17270d0 = false;
        this.f17264a0 = true;
        this.f17266b0 = true;
        int i7 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i7 == -2 && this.f17259W) {
            this.f17264a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.f17260X) {
            this.f17266b0 = false;
            if (this.f17249M == 0) {
                this.f17249M = 1;
            }
        }
        if (i7 == 0 || i7 == -1) {
            this.f17264a0 = false;
            if (i7 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f17259W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f17266b0 = false;
            if (i10 == 0 && this.f17249M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f17260X = true;
            }
        }
        if (this.f17267c == -1.0f && this.f17263a == -1 && this.f17265b == -1) {
            return;
        }
        this.f17270d0 = true;
        this.f17264a0 = true;
        this.f17266b0 = true;
        if (!(this.f17291p0 instanceof d1.h)) {
            this.f17291p0 = new d1.h();
        }
        ((d1.h) this.f17291p0).S(this.f17258V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i7);
        boolean z8 = false;
        boolean z10 = 1 == getLayoutDirection();
        this.f17277h0 = -1;
        this.f17279i0 = -1;
        this.f17274f0 = -1;
        this.f17275g0 = -1;
        this.f17280j0 = this.f17298w;
        this.f17281k0 = this.f17300y;
        float f4 = this.f17242E;
        this.f17283l0 = f4;
        int i16 = this.f17263a;
        this.f17285m0 = i16;
        int i17 = this.f17265b;
        this.f17287n0 = i17;
        float f10 = this.f17267c;
        this.f17289o0 = f10;
        if (z10) {
            int i18 = this.f17294s;
            if (i18 != -1) {
                this.f17277h0 = i18;
            } else {
                int i19 = this.f17295t;
                if (i19 != -1) {
                    this.f17279i0 = i19;
                }
                i10 = this.f17296u;
                if (i10 != -1) {
                    this.f17275g0 = i10;
                    z8 = true;
                }
                i11 = this.f17297v;
                if (i11 != -1) {
                    this.f17274f0 = i11;
                    z8 = true;
                }
                i12 = this.f17238A;
                if (i12 != Integer.MIN_VALUE) {
                    this.f17281k0 = i12;
                }
                i13 = this.f17239B;
                if (i13 != Integer.MIN_VALUE) {
                    this.f17280j0 = i13;
                }
                if (z8) {
                    this.f17283l0 = 1.0f - f4;
                }
                if (this.f17270d0 && this.f17258V == 1 && this.f17269d) {
                    if (f10 == -1.0f) {
                        this.f17289o0 = 1.0f - f10;
                        this.f17285m0 = -1;
                        this.f17287n0 = -1;
                    } else if (i16 != -1) {
                        this.f17287n0 = i16;
                        this.f17285m0 = -1;
                        this.f17289o0 = -1.0f;
                    } else if (i17 != -1) {
                        this.f17285m0 = i17;
                        this.f17287n0 = -1;
                        this.f17289o0 = -1.0f;
                    }
                }
            }
            z8 = true;
            i10 = this.f17296u;
            if (i10 != -1) {
            }
            i11 = this.f17297v;
            if (i11 != -1) {
            }
            i12 = this.f17238A;
            if (i12 != Integer.MIN_VALUE) {
            }
            i13 = this.f17239B;
            if (i13 != Integer.MIN_VALUE) {
            }
            if (z8) {
            }
            if (this.f17270d0) {
                if (f10 == -1.0f) {
                }
            }
        } else {
            int i20 = this.f17294s;
            if (i20 != -1) {
                this.f17275g0 = i20;
            }
            int i21 = this.f17295t;
            if (i21 != -1) {
                this.f17274f0 = i21;
            }
            int i22 = this.f17296u;
            if (i22 != -1) {
                this.f17277h0 = i22;
            }
            int i23 = this.f17297v;
            if (i23 != -1) {
                this.f17279i0 = i23;
            }
            int i24 = this.f17238A;
            if (i24 != Integer.MIN_VALUE) {
                this.f17280j0 = i24;
            }
            int i25 = this.f17239B;
            if (i25 != Integer.MIN_VALUE) {
                this.f17281k0 = i25;
            }
        }
        if (this.f17296u == -1 && this.f17297v == -1 && this.f17295t == -1 && this.f17294s == -1) {
            int i26 = this.g;
            if (i26 != -1) {
                this.f17277h0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                }
            } else {
                int i27 = this.f17276h;
                if (i27 != -1) {
                    this.f17279i0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                }
            }
            int i28 = this.f17271e;
            if (i28 != -1) {
                this.f17274f0 = i28;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                return;
            }
            int i29 = this.f17273f;
            if (i29 != -1) {
                this.f17275g0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
            }
        }
    }
}
