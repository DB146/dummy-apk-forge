package N;

import B0.AbstractC0207v0;
import C.AbstractC0230o;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.S;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.m f7058a = androidx.compose.foundation.layout.b.a(P.d.f7621a);

    public static final void a(p0.d dVar, c0.m mVar, long j, C0506o c0506o, int i7) {
        c0506o.U(-126890956);
        int i10 = i7 | (c0506o.g(dVar) ? 4 : 2) | (c0506o.g(mVar) ? 256 : 128);
        if ((i10 & 1171) == 1170 && c0506o.x()) {
            c0506o.N();
        } else {
            c0506o.P();
            if ((i7 & 1) != 0 && !c0506o.w()) {
                c0506o.N();
            }
            c0506o.q();
            V0.c cVar = (V0.c) c0506o.k(AbstractC0207v0.f1993h);
            float f4 = dVar.f22992i;
            boolean f10 = c0506o.f((Float.floatToRawIntBits(cVar.k()) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
            Object H10 = c0506o.H();
            if (f10 || H10 == C0498k.f8409a) {
                p0.b bVar = new p0.b();
                android.support.v4.media.session.b.h(bVar, dVar.f22990f);
                long floatToRawIntBits = (Float.floatToRawIntBits(cVar.p(dVar.f22986b)) << 32) | (Float.floatToRawIntBits(cVar.p(dVar.f22987c)) & 4294967295L);
                float f11 = dVar.f22988d;
                if (Float.isNaN(f11)) {
                    f11 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                }
                float f12 = dVar.f22989e;
                if (Float.isNaN(f12)) {
                    f12 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                }
                long floatToRawIntBits2 = (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
                p0.s sVar = new p0.s(bVar);
                long j10 = dVar.g;
                j0.i iVar = j10 != 16 ? new j0.i(dVar.f22991h, j10) : null;
                sVar.f23028e.setValue(new i0.e(floatToRawIntBits));
                sVar.f23029f.setValue(Boolean.FALSE);
                p0.o oVar = sVar.g;
                oVar.g.setValue(iVar);
                oVar.f23022i.setValue(new i0.e(floatToRawIntBits2));
                oVar.f23017c = dVar.f22985a;
                c0506o.d0(sVar);
                H10 = sVar;
            }
            b((p0.s) H10, mVar, j, c0506o, (i10 & 896) | 3128);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new j(dVar, mVar, j, i7);
        }
    }

    public static final void b(p0.s sVar, c0.m mVar, long j, C0506o c0506o, int i7) {
        int i10;
        c0.m mVar2;
        c0506o.U(-2142239481);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.i(sVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.g("ClosePlayer") ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0506o.g(mVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= c0506o.f(j) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && c0506o.x()) {
            c0506o.N();
        } else {
            c0506o.P();
            if ((i7 & 1) != 0 && !c0506o.w()) {
                c0506o.N();
            }
            c0506o.q();
            boolean z8 = (((i10 & 7168) ^ 3072) > 2048 && c0506o.f(j)) || (i10 & 3072) == 2048;
            Object H10 = c0506o.H();
            S s3 = C0498k.f8409a;
            if (z8 || H10 == s3) {
                H10 = j0.n.c(j, j0.n.g) ? null : new j0.i(5, j);
                c0506o.d0(H10);
            }
            j0.i iVar = (j0.i) H10;
            c0506o.S(-2144891392);
            boolean z10 = (i10 & 112) == 32;
            Object H11 = c0506o.H();
            if (z10 || H11 == s3) {
                H11 = new B(1, 1);
                c0506o.d0(H11);
            }
            AtomicInteger atomicInteger = H0.j.f4498a;
            AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((Rb.c) H11, false);
            c0506o.p(false);
            if (!i0.e.a(sVar.e(), 9205357640488583168L)) {
                long e2 = sVar.e();
                if (!Float.isInfinite(i0.e.c(e2)) || !Float.isInfinite(i0.e.b(e2))) {
                    mVar2 = c0.j.f14110a;
                    AbstractC0230o.a(androidx.compose.ui.draw.a.b(mVar.c(mVar2), sVar, iVar, 22).c(appendedSemanticsElement), c0506o, 0);
                }
            }
            mVar2 = f7058a;
            AbstractC0230o.a(androidx.compose.ui.draw.a.b(mVar.c(mVar2), sVar, iVar, 22).c(appendedSemanticsElement), c0506o, 0);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new k(sVar, mVar, j, i7);
        }
    }
}
