package g0;

import A0.InterfaceC0026o;
import A0.InterfaceC0035y;
import A0.N;
import A0.T;
import C.C0225j;
import Eb.w;
import c0.e;
import c0.l;
import com.google.android.gms.common.api.f;
import ia.C1358d;
import j0.i;
import l0.C1443b;
import o0.AbstractC1775c;
import y0.AbstractC2323H;
import y0.AbstractC2328M;
import y0.C2319D;
import y0.InterfaceC2317B;
import y0.z;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180b extends l implements InterfaceC0035y, InterfaceC0026o {

    /* renamed from: C, reason: collision with root package name */
    public AbstractC1775c f17215C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17216D;

    /* renamed from: E, reason: collision with root package name */
    public e f17217E;

    /* renamed from: F, reason: collision with root package name */
    public C2319D f17218F;

    /* renamed from: G, reason: collision with root package name */
    public float f17219G;

    /* renamed from: H, reason: collision with root package name */
    public i f17220H;

    public static boolean p0(long j) {
        return !i0.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & f.API_PRIORITY_OTHER) < 2139095040;
    }

    public static boolean q0(long j) {
        return !i0.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & f.API_PRIORITY_OTHER) < 2139095040;
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, z zVar, long j) {
        long a9;
        boolean z8 = false;
        boolean z10 = V0.a.d(j) && V0.a.c(j);
        if (V0.a.f(j) && V0.a.e(j)) {
            z8 = true;
        }
        if (((!this.f17216D || this.f17215C.e() == 9205357640488583168L) && z10) || z8) {
            a9 = V0.a.a(V0.a.h(j), V0.a.g(j), j);
        } else {
            long e2 = this.f17215C.e();
            int round = q0(e2) ? Math.round(Float.intBitsToFloat((int) (e2 >> 32))) : V0.a.j(j);
            int round2 = p0(e2) ? Math.round(Float.intBitsToFloat((int) (e2 & 4294967295L))) : V0.a.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(V0.b.f(round, j)) << 32) | (Float.floatToRawIntBits(V0.b.e(round2, j)) & 4294967295L);
            if (this.f17216D && this.f17215C.e() != 9205357640488583168L) {
                float intBitsToFloat = !q0(this.f17215C.e()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f17215C.e() >> 32));
                float intBitsToFloat2 = !p0(this.f17215C.e()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f17215C.e() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC2328M.i(floatToRawIntBits2, this.f17218F.a(floatToRawIntBits2, floatToRawIntBits));
            }
            a9 = V0.a.a(V0.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), V0.b.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), j);
        }
        AbstractC2323H b2 = zVar.b(a9);
        return t5.Q(b2.f26554a, b2.f26555b, w.f3892a, new C0225j(b2, 5));
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // A0.InterfaceC0026o
    public final void t(N n6) {
        long e2 = this.f17215C.e();
        boolean q02 = q0(e2);
        C1443b c1443b = n6.f90a;
        float intBitsToFloat = q02 ? Float.intBitsToFloat((int) (e2 >> 32)) : Float.intBitsToFloat((int) (c1443b.v() >> 32));
        float intBitsToFloat2 = p0(e2) ? Float.intBitsToFloat((int) (e2 & 4294967295L)) : Float.intBitsToFloat((int) (c1443b.v() & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        long i7 = (Float.intBitsToFloat((int) (c1443b.v() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1443b.v() & 4294967295L)) == 0.0f) ? 0L : AbstractC2328M.i(floatToRawIntBits, this.f17218F.a(floatToRawIntBits, c1443b.v()));
        long a9 = this.f17217E.a((Math.round(Float.intBitsToFloat((int) (i7 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (i7 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (c1443b.v() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c1443b.v() & 4294967295L))) & 4294967295L), n6.getLayoutDirection());
        float f4 = (int) (a9 >> 32);
        float f10 = (int) (a9 & 4294967295L);
        ((C1358d) c1443b.f19142b.f8695b).u(f4, f10);
        try {
            this.f17215C.d(n6, i7, this.f17219G, this.f17220H);
            ((C1358d) c1443b.f19142b.f8695b).u(-f4, -f10);
            n6.a();
        } catch (Throwable th) {
            ((C1358d) c1443b.f19142b.f8695b).u(-f4, -f10);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f17215C + ", sizeToIntrinsics=" + this.f17216D + ", alignment=" + this.f17217E + ", alpha=" + this.f17219G + ", colorFilter=" + this.f17220H + ')';
    }
}
