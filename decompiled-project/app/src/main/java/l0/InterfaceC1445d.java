package l0;

import A0.N;
import Q7.h;
import V0.l;
import j0.AbstractC1362A;
import j0.i;
import j0.z;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1445d extends V0.c {
    static void X(float f4, long j, N n6) {
        long D10 = n6.f90a.D();
        C1443b c1443b = n6.f90a;
        c1443b.f19141a.f19139c.m(f4, D10, C1443b.a(c1443b, j, C1447f.f19147b, 1.0f, null, 3));
    }

    static void Y(InterfaceC1445d interfaceC1445d, R7.b bVar, long j, long j10, float f4, i iVar, int i7, int i10) {
        interfaceC1445d.o(bVar, 0L, j, (i10 & 16) != 0 ? j : j10, (i10 & 32) != 0 ? 1.0f : f4, iVar, (i10 & 512) != 0 ? 1 : i7);
    }

    static void s(InterfaceC1445d interfaceC1445d, long j, long j10, float f4, i iVar, int i7) {
        long j11;
        if ((i7 & 4) != 0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32)) - Float.intBitsToFloat((int) (0 >> 32));
            j11 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r0 & 4294967295L)) - Float.intBitsToFloat((int) (0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        } else {
            j11 = j10;
        }
        interfaceC1445d.F(j, 0L, j11, (i7 & 8) != 0 ? 1.0f : f4, C1447f.f19147b, (i7 & 32) != 0 ? null : iVar, (i7 & 64) != 0 ? 3 : 0);
    }

    default long D() {
        return com.bumptech.glide.d.o(u().D());
    }

    void F(long j, long j10, long j11, float f4, AbstractC1444c abstractC1444c, i iVar, int i7);

    void g(z zVar, AbstractC1362A abstractC1362A, float f4, AbstractC1444c abstractC1444c, int i7);

    l getLayoutDirection();

    void o(R7.b bVar, long j, long j10, long j11, float f4, i iVar, int i7);

    h u();

    default long v() {
        return u().D();
    }
}
