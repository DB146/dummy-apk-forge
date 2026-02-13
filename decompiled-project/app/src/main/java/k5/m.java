package k5;

import N6.A0;
import N6.AbstractC0452z;
import N6.H;
import N6.r0;
import N6.t0;
import P4.m0;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class m extends o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18928A;

    /* renamed from: e, reason: collision with root package name */
    public final int f18929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18930f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18931u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18932v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18933w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18934x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18935y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18936z;

    public m(int i7, m0 m0Var, int i10, i iVar, int i11, String str) {
        super(i7, m0Var, i10);
        int i12;
        int i13 = 0;
        this.f18930f = q.e(i11, false);
        int i14 = this.f18940d.f20088d & (~iVar.f19000I);
        this.f18931u = (i14 & 1) != 0;
        this.f18932v = (i14 & 2) != 0;
        t0 t0Var = iVar.f18998G;
        t0 K10 = t0Var.isEmpty() ? H.K("") : t0Var;
        int i15 = 0;
        while (true) {
            if (i15 >= K10.size()) {
                i15 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                i12 = 0;
                break;
            } else {
                i12 = q.c(this.f18940d, (String) K10.get(i15), iVar.f19001J);
                if (i12 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f18933w = i15;
        this.f18934x = i12;
        int a9 = q.a(this.f18940d.f20089e, iVar.f18999H);
        this.f18935y = a9;
        this.f18928A = (this.f18940d.f20089e & 1088) != 0;
        int c10 = q.c(this.f18940d, str, q.g(str) == null);
        this.f18936z = c10;
        boolean z8 = i12 > 0 || (t0Var.isEmpty() && a9 > 0) || this.f18931u || (this.f18932v && c10 > 0);
        if (q.e(i11, iVar.f18921Y) && z8) {
            i13 = 1;
        }
        this.f18929e = i13;
    }

    @Override // k5.o
    public final int a() {
        return this.f18929e;
    }

    @Override // k5.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        AbstractC0452z c10 = AbstractC0452z.f7375a.c(this.f18930f, mVar.f18930f);
        Integer valueOf = Integer.valueOf(this.f18933w);
        Integer valueOf2 = Integer.valueOf(mVar.f18933w);
        Comparator comparator = r0.f7332a;
        comparator.getClass();
        A0 a02 = A0.f7209a;
        AbstractC0452z b2 = c10.b(valueOf, valueOf2, a02);
        int i7 = this.f18934x;
        AbstractC0452z a9 = b2.a(i7, mVar.f18934x);
        int i10 = this.f18935y;
        AbstractC0452z c11 = a9.a(i10, mVar.f18935y).c(this.f18931u, mVar.f18931u);
        Boolean valueOf3 = Boolean.valueOf(this.f18932v);
        Boolean valueOf4 = Boolean.valueOf(mVar.f18932v);
        if (i7 != 0) {
            comparator = a02;
        }
        AbstractC0452z a10 = c11.b(valueOf3, valueOf4, comparator).a(this.f18936z, mVar.f18936z);
        if (i10 == 0) {
            a10 = a10.d(this.f18928A, mVar.f18928A);
        }
        return a10.e();
    }
}
