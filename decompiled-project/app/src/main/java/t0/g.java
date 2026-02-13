package t0;

import A0.AbstractC0017g;
import A0.E0;
import A0.J;
import B0.C0210x;
import V0.p;
import c0.l;
import cc.E;
import i0.C1289b;

/* loaded from: classes.dex */
public final class g extends l implements E0, InterfaceC2015a {

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2015a f24431C;

    /* renamed from: D, reason: collision with root package name */
    public d f24432D;

    /* renamed from: E, reason: collision with root package name */
    public g f24433E;

    /* renamed from: F, reason: collision with root package name */
    public final String f24434F = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public g(InterfaceC2015a interfaceC2015a, d dVar) {
        this.f24431C = interfaceC2015a;
        this.f24432D = dVar;
    }

    @Override // t0.InterfaceC2015a
    public final long A(int i7, long j, long j10) {
        long A10 = this.f24431C.A(i7, j, j10);
        boolean z8 = this.f14112B;
        g gVar = null;
        if (z8 && z8) {
            gVar = (g) AbstractC0017g.i(this);
        }
        g gVar2 = gVar;
        return C1289b.e(A10, gVar2 != null ? gVar2.A(i7, C1289b.e(j, A10), C1289b.d(j10, A10)) : 0L);
    }

    @Override // t0.InterfaceC2015a
    public final long R(int i7, long j) {
        boolean z8 = this.f14112B;
        g gVar = null;
        if (z8 && z8) {
            gVar = (g) AbstractC0017g.i(this);
        }
        long R10 = gVar != null ? gVar.R(i7, j) : 0L;
        return C1289b.e(R10, this.f24431C.R(i7, C1289b.d(j, R10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // t0.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, Hb.d dVar) {
        f fVar;
        Object obj;
        Ib.a aVar;
        int i7;
        long j10;
        g gVar;
        long j11;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f24430e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f24430e = i10 - Integer.MIN_VALUE;
                obj = fVar.f24428c;
                aVar = Ib.a.f5345a;
                i7 = fVar.f24430e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    boolean z8 = this.f14112B;
                    g gVar2 = (z8 && z8) ? (g) AbstractC0017g.i(this) : null;
                    if (gVar2 == null) {
                        j10 = 0;
                        gVar = this;
                        long j12 = j;
                        j11 = j10;
                        InterfaceC2015a interfaceC2015a = gVar.f24431C;
                        long d10 = p.d(j12, j11);
                        fVar.f24426a = null;
                        fVar.f24427b = j11;
                        fVar.f24430e = 2;
                        obj = interfaceC2015a.b(d10, fVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return new p(p.e(j11, ((p) obj).f9990a));
                    }
                    fVar.f24426a = this;
                    fVar.f24427b = j;
                    fVar.f24430e = 1;
                    obj = gVar2.b(j, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    gVar = this;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j11 = fVar.f24427b;
                        com.bumptech.glide.c.c0(obj);
                        return new p(p.e(j11, ((p) obj).f9990a));
                    }
                    j = fVar.f24427b;
                    gVar = fVar.f24426a;
                    com.bumptech.glide.c.c0(obj);
                }
                j10 = ((p) obj).f9990a;
                long j122 = j;
                j11 = j10;
                InterfaceC2015a interfaceC2015a2 = gVar.f24431C;
                long d102 = p.d(j122, j11);
                fVar.f24426a = null;
                fVar.f24427b = j11;
                fVar.f24430e = 2;
                obj = interfaceC2015a2.b(d102, fVar);
                if (obj == aVar) {
                }
                return new p(p.e(j11, ((p) obj).f9990a));
            }
        }
        fVar = new f(this, (Jb.c) dVar);
        obj = fVar.f24428c;
        aVar = Ib.a.f5345a;
        i7 = fVar.f24430e;
        if (i7 != 0) {
        }
        j10 = ((p) obj).f9990a;
        long j1222 = j;
        j11 = j10;
        InterfaceC2015a interfaceC2015a22 = gVar.f24431C;
        long d1022 = p.d(j1222, j11);
        fVar.f24426a = null;
        fVar.f24427b = j11;
        fVar.f24430e = 2;
        obj = interfaceC2015a22.b(d1022, fVar);
        if (obj == aVar) {
        }
        return new p(p.e(j11, ((p) obj).f9990a));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // t0.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(long j, long j10, Hb.d dVar) {
        e eVar;
        int i7;
        long j11;
        long j12;
        g gVar;
        g gVar2;
        long j13;
        long j14;
        long j15;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f24425f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f24425f = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f24423d;
                Ib.a aVar = Ib.a.f5345a;
                i7 = eVar.f24425f;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    InterfaceC2015a interfaceC2015a = this.f24431C;
                    eVar.f24420a = this;
                    j11 = j;
                    eVar.f24421b = j11;
                    j12 = j10;
                    eVar.f24422c = j12;
                    eVar.f24425f = 1;
                    obj = interfaceC2015a.b0(j, j10, eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    gVar = this;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j15 = eVar.f24421b;
                        com.bumptech.glide.c.c0(obj);
                        j14 = ((p) obj).f9990a;
                        j13 = j15;
                        return new p(p.e(j13, j14));
                    }
                    long j16 = eVar.f24422c;
                    long j17 = eVar.f24421b;
                    gVar = eVar.f24420a;
                    com.bumptech.glide.c.c0(obj);
                    j12 = j16;
                    j11 = j17;
                }
                long j18 = ((p) obj).f9990a;
                boolean z8 = gVar.f14112B;
                gVar2 = !z8 ? (z8 && z8) ? (g) AbstractC0017g.i(gVar) : null : gVar.f24433E;
                if (gVar2 != null) {
                    j13 = j18;
                    j14 = 0;
                    return new p(p.e(j13, j14));
                }
                long e2 = p.e(j11, j18);
                long d10 = p.d(j12, j18);
                eVar.f24420a = null;
                eVar.f24421b = j18;
                eVar.f24425f = 2;
                obj = gVar2.b0(e2, d10, eVar);
                if (obj == aVar) {
                    return aVar;
                }
                j15 = j18;
                j14 = ((p) obj).f9990a;
                j13 = j15;
                return new p(p.e(j13, j14));
            }
        }
        eVar = new e(this, (Jb.c) dVar);
        Object obj2 = eVar.f24423d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = eVar.f24425f;
        if (i7 != 0) {
        }
        long j182 = ((p) obj2).f9990a;
        boolean z82 = gVar.f14112B;
        if (!z82) {
        }
        if (gVar2 != null) {
        }
    }

    @Override // c0.l
    public final void h0() {
        d dVar = this.f24432D;
        dVar.f24416a = this;
        dVar.f24417b = null;
        this.f24433E = null;
        dVar.f24418c = new J(this, 21);
        dVar.f24419d = d0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // c0.l
    public final void i0() {
        ?? obj = new Object();
        AbstractC0017g.w(this, new C0210x(obj, 2));
        g gVar = (g) ((E0) obj.f19134a);
        this.f24433E = gVar;
        d dVar = this.f24432D;
        dVar.f24417b = gVar;
        if (dVar.f24416a == this) {
            dVar.f24416a = null;
        }
    }

    @Override // A0.E0
    public final Object j() {
        return this.f24434F;
    }

    public final E p0() {
        g gVar = this.f14112B ? (g) AbstractC0017g.i(this) : null;
        if (gVar != null) {
            return gVar.p0();
        }
        E e2 = this.f24432D.f24419d;
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
