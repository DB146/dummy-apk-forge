package R4;

import A4.s;
import P4.c0;
import P4.d0;

/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f8878a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f8879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8880c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8882e;

    public f(g gVar, g gVar2, c0 c0Var, int i7) {
        this.f8882e = gVar;
        this.f8878a = gVar2;
        this.f8879b = c0Var;
        this.f8880c = i7;
    }

    @Override // P4.d0
    public final void a() {
    }

    @Override // P4.d0
    public final boolean b() {
        g gVar = this.f8882e;
        return !gVar.w() && this.f8879b.t(gVar.f8893K);
    }

    public final void c() {
        if (this.f8881d) {
            return;
        }
        g gVar = this.f8882e;
        s sVar = gVar.f8900u;
        int[] iArr = gVar.f8895b;
        int i7 = this.f8880c;
        sVar.i(iArr[i7], gVar.f8896c[i7], 0, null, gVar.f8890H);
        this.f8881d = true;
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        g gVar3 = this.f8882e;
        if (gVar3.w()) {
            return -3;
        }
        a aVar = gVar3.f8892J;
        c0 c0Var = this.f8879b;
        if (aVar != null && aVar.e(this.f8880c + 1) <= c0Var.o()) {
            return -3;
        }
        c();
        return c0Var.y(gVar, gVar2, i7, gVar3.f8893K);
    }

    @Override // P4.d0
    public final int h(long j) {
        g gVar = this.f8882e;
        if (gVar.w()) {
            return 0;
        }
        boolean z8 = gVar.f8893K;
        c0 c0Var = this.f8879b;
        int q10 = c0Var.q(j, z8);
        a aVar = gVar.f8892J;
        if (aVar != null) {
            q10 = Math.min(q10, aVar.e(this.f8880c + 1) - c0Var.o());
        }
        c0Var.C(q10);
        if (q10 > 0) {
            c();
        }
        return q10;
    }
}
