package k5;

import N6.A0;
import N6.AbstractC0452z;
import N6.r0;
import N6.s0;
import N6.t0;
import P4.m0;
import android.text.TextUtils;
import m4.AbstractC1565e;
import m4.L;
import n5.D;

/* renamed from: k5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427f extends o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18875A;

    /* renamed from: B, reason: collision with root package name */
    public final int f18876B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18877C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f18878D;

    /* renamed from: E, reason: collision with root package name */
    public final int f18879E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18880F;

    /* renamed from: G, reason: collision with root package name */
    public final int f18881G;

    /* renamed from: H, reason: collision with root package name */
    public final int f18882H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f18883I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f18884J;

    /* renamed from: e, reason: collision with root package name */
    public final int f18885e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18886f;

    /* renamed from: u, reason: collision with root package name */
    public final String f18887u;

    /* renamed from: v, reason: collision with root package name */
    public final i f18888v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f18889w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18890x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18891y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18892z;

    public C1427f(int i7, m0 m0Var, int i10, i iVar, int i11, boolean z8, C1426e c1426e) {
        super(i7, m0Var, i10);
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.f18888v = iVar;
        this.f18887u = q.g(this.f18940d.f20087c);
        int i15 = 0;
        this.f18889w = q.e(i11, false);
        int i16 = 0;
        while (true) {
            int size = iVar.f18993B.size();
            i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i16 >= size) {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                i13 = q.c(this.f18940d, (String) iVar.f18993B.get(i16), false);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f18891y = i16;
        this.f18890x = i13;
        this.f18892z = q.a(this.f18940d.f20089e, iVar.f18994C);
        L l10 = this.f18940d;
        int i17 = l10.f20089e;
        this.f18875A = i17 == 0 || (i17 & 1) != 0;
        this.f18878D = (l10.f20088d & 1) != 0;
        int i18 = l10.f20075M;
        this.f18879E = i18;
        this.f18880F = l10.f20076N;
        int i19 = l10.f20092v;
        this.f18881G = i19;
        this.f18886f = (i19 == -1 || i19 <= iVar.f18996E) && (i18 == -1 || i18 <= iVar.f18995D) && c1426e.apply(l10);
        String[] C2 = D.C();
        int i20 = 0;
        while (true) {
            if (i20 >= C2.length) {
                i14 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                i14 = q.c(this.f18940d, C2[i20], false);
                if (i14 > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.f18876B = i20;
        this.f18877C = i14;
        int i21 = 0;
        while (true) {
            t0 t0Var = iVar.f18997F;
            if (i21 < t0Var.size()) {
                String str = this.f18940d.f20096z;
                if (str != null && str.equals(t0Var.get(i21))) {
                    i12 = i21;
                    break;
                }
                i21++;
            } else {
                break;
            }
        }
        this.f18882H = i12;
        this.f18883I = AbstractC1565e.g(i11) == 128;
        this.f18884J = AbstractC1565e.h(i11) == 64;
        i iVar2 = this.f18888v;
        if (q.e(i11, iVar2.f18921Y) && ((z10 = this.f18886f) || iVar2.f18915S)) {
            i15 = (!q.e(i11, false) || !z10 || this.f18940d.f20092v == -1 || iVar2.L || iVar2.f19002K || (!iVar2.f18923a0 && z8)) ? 1 : 2;
        }
        this.f18885e = i15;
    }

    @Override // k5.o
    public final int a() {
        return this.f18885e;
    }

    @Override // k5.o
    public final boolean b(o oVar) {
        int i7;
        String str;
        int i10;
        C1427f c1427f = (C1427f) oVar;
        i iVar = this.f18888v;
        boolean z8 = iVar.f18918V;
        L l10 = c1427f.f18940d;
        L l11 = this.f18940d;
        if ((z8 || ((i10 = l11.f20075M) != -1 && i10 == l10.f20075M)) && ((iVar.f18916T || ((str = l11.f20096z) != null && TextUtils.equals(str, l10.f20096z))) && (iVar.f18917U || ((i7 = l11.f20076N) != -1 && i7 == l10.f20076N)))) {
            if (!iVar.f18919W) {
                if (this.f18883I != c1427f.f18883I || this.f18884J != c1427f.f18884J) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1427f c1427f) {
        boolean z8 = this.f18889w;
        boolean z10 = this.f18886f;
        s0 a9 = (z10 && z8) ? q.j : q.j.a();
        AbstractC0452z c10 = AbstractC0452z.f7375a.c(z8, c1427f.f18889w);
        Integer valueOf = Integer.valueOf(this.f18891y);
        Integer valueOf2 = Integer.valueOf(c1427f.f18891y);
        r0.f7332a.getClass();
        A0 a02 = A0.f7209a;
        AbstractC0452z b2 = c10.b(valueOf, valueOf2, a02).a(this.f18890x, c1427f.f18890x).a(this.f18892z, c1427f.f18892z).c(this.f18878D, c1427f.f18878D).c(this.f18875A, c1427f.f18875A).b(Integer.valueOf(this.f18876B), Integer.valueOf(c1427f.f18876B), a02).a(this.f18877C, c1427f.f18877C).c(z10, c1427f.f18886f).b(Integer.valueOf(this.f18882H), Integer.valueOf(c1427f.f18882H), a02);
        int i7 = this.f18881G;
        Integer valueOf3 = Integer.valueOf(i7);
        int i10 = c1427f.f18881G;
        AbstractC0452z b10 = b2.b(valueOf3, Integer.valueOf(i10), this.f18888v.f19002K ? q.j.a() : q.k).c(this.f18883I, c1427f.f18883I).c(this.f18884J, c1427f.f18884J).b(Integer.valueOf(this.f18879E), Integer.valueOf(c1427f.f18879E), a9).b(Integer.valueOf(this.f18880F), Integer.valueOf(c1427f.f18880F), a9);
        Integer valueOf4 = Integer.valueOf(i7);
        Integer valueOf5 = Integer.valueOf(i10);
        if (!D.a(this.f18887u, c1427f.f18887u)) {
            a9 = q.k;
        }
        return b10.b(valueOf4, valueOf5, a9).e();
    }
}
