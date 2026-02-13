package y;

import A0.AbstractC0017g;
import A0.InterfaceC0026o;
import A0.p0;
import j0.AbstractC1362A;
import j0.C1368f;
import l0.C1443b;
import l0.C1447f;
import l0.InterfaceC1445d;

/* renamed from: y.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2308p extends c0.l implements InterfaceC0026o, p0 {

    /* renamed from: C, reason: collision with root package name */
    public long f26499C;

    /* renamed from: D, reason: collision with root package name */
    public j0.D f26500D;

    /* renamed from: E, reason: collision with root package name */
    public long f26501E;

    /* renamed from: F, reason: collision with root package name */
    public V0.l f26502F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC1362A f26503G;

    /* renamed from: H, reason: collision with root package name */
    public j0.D f26504H;

    /* renamed from: I, reason: collision with root package name */
    public AbstractC1362A f26505I;

    @Override // A0.InterfaceC0026o
    public final void t(A0.N n6) {
        AbstractC1362A abstractC1362A;
        if (this.f26500D != AbstractC1362A.f18492a) {
            C1443b c1443b = n6.f90a;
            if (i0.e.a(c1443b.v(), this.f26501E) && n6.getLayoutDirection() == this.f26502F && kotlin.jvm.internal.l.a(this.f26504H, this.f26500D)) {
                abstractC1362A = this.f26503G;
                kotlin.jvm.internal.l.b(abstractC1362A);
            } else {
                AbstractC0017g.q(this, new A0.K(16, this, n6));
                abstractC1362A = this.f26505I;
                this.f26505I = null;
            }
            this.f26503G = abstractC1362A;
            this.f26501E = c1443b.v();
            this.f26502F = n6.getLayoutDirection();
            this.f26504H = this.f26500D;
            kotlin.jvm.internal.l.b(abstractC1362A);
            boolean c10 = j0.n.c(this.f26499C, j0.n.g);
            C1447f c1447f = C1447f.f19147b;
            if (!c10) {
                long j = this.f26499C;
                if (abstractC1362A instanceof j0.w) {
                    i0.c cVar = ((j0.w) abstractC1362A).f18560e;
                    long floatToRawIntBits = (4294967295L & Float.floatToRawIntBits(cVar.f18175b)) | (Float.floatToRawIntBits(cVar.f18174a) << 32);
                    float f4 = cVar.f18176c - cVar.f18174a;
                    float f10 = cVar.f18177d - cVar.f18175b;
                    n6.F(j, floatToRawIntBits, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), 1.0f, c1447f, null, 3);
                } else if (abstractC1362A instanceof j0.x) {
                    j0.x xVar = (j0.x) abstractC1362A;
                    C1368f c1368f = xVar.f18562f;
                    if (c1368f != null) {
                        n6.c(c1368f, j, c1447f);
                    } else {
                        i0.d dVar = xVar.f18561e;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f18184h >> 32));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(dVar.f18178a) << 32) | (Float.floatToRawIntBits(dVar.f18179b) & 4294967295L);
                        float b2 = dVar.b();
                        float a9 = dVar.a();
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(a9) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
                        long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                        int i7 = (int) (floatToRawIntBits2 >> 32);
                        int i10 = (int) (floatToRawIntBits2 & 4294967295L);
                        c1443b.f19141a.f19139c.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), C1443b.a(c1443b, j, c1447f, 1.0f, null, 3));
                    }
                } else {
                    if (!(abstractC1362A instanceof j0.v)) {
                        throw new Db.d(1);
                    }
                    n6.c(((j0.v) abstractC1362A).f18559e, j, c1447f);
                }
            }
        } else if (!j0.n.c(this.f26499C, j0.n.g)) {
            InterfaceC1445d.s(n6, this.f26499C, 0L, 0.0f, null, 126);
        }
        n6.a();
    }

    @Override // A0.p0
    public final void z() {
        this.f26501E = 9205357640488583168L;
        this.f26502F = null;
        this.f26503G = null;
        this.f26504H = null;
        AbstractC0017g.k(this);
    }
}
