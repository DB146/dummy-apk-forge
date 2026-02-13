package y9;

import A9.C0083f0;
import A9.C0085f2;
import A9.C0089g2;
import A9.C0098j;
import A9.C0107l0;
import A9.InterfaceC0069b2;
import A9.T;
import A9.Y1;
import A9.Z1;
import android.view.SurfaceView;

/* loaded from: classes2.dex */
public final class s implements InterfaceC0069b2 {

    /* renamed from: a, reason: collision with root package name */
    public C9.c f27530a;

    /* renamed from: b, reason: collision with root package name */
    public final C0085f2 f27531b;

    /* renamed from: c, reason: collision with root package name */
    public final T f27532c = new T(this);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2456A f27533d;

    public s(AbstractC2456A abstractC2456A) {
        this.f27531b = abstractC2456A;
        this.f27533d = abstractC2456A;
    }

    @Override // A9.InterfaceC0069b2
    public final void a(Tb.a aVar) {
        this.f27531b.f1184n0 = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [A9.Z1, java.lang.Object] */
    public final void b(C9.c cVar) {
        int i7;
        C0098j c0098j;
        C9.c cVar2 = this.f27530a;
        if (cVar2 != null) {
            C9.g gVar = (C9.g) cVar2;
            gVar.f3080z = false;
            gVar.f3067A = 0;
            gVar.f3068B = null;
            T t5 = gVar.f3077w;
            if (t5 != null) {
                ((s) t5.f964a).f27531b.getClass();
            }
            gVar.f3077w = null;
            C9.b bVar = gVar.f3072d;
            bVar.O();
            bVar.R(false);
            s sVar = gVar.f3070b;
            if (sVar != null) {
                sVar.f27531b.f1183m0 = null;
                gVar.f3070b = null;
            }
            s sVar2 = gVar.f3070b;
            if (sVar2 != null) {
                sVar2.f27531b.f1184n0 = null;
            }
        }
        this.f27530a = cVar;
        if (cVar != null) {
            C9.g gVar2 = (C9.g) cVar;
            gVar2.f3070b = this;
            D5.i iVar = new D5.i(gVar2, 6);
            C0085f2 c0085f2 = this.f27531b;
            c0085f2.f1183m0 = iVar;
            c0085f2.f1164J0 = gVar2;
            c0085f2.f1191u0 = new T(gVar2);
            Z1 z12 = gVar2.f3073e;
            C9.b bVar2 = gVar2.f3072d;
            if (z12 == null) {
                ?? obj = new Object();
                obj.f1042b = gVar2;
                gVar2.f3073e = obj;
                obj.c(-1L);
                gVar2.f3073e.d(-1L);
                Z1 z13 = gVar2.f3073e;
                if (z13.g != -1) {
                    z13.g = -1L;
                    C0089g2 c0089g2 = z13.f1047h;
                    if (c0089g2 != null) {
                        c0089g2.f1202a.f1256v.setSecondaryProgress((int) (((-1) / r0.f1258x) * 2.147483647E9d));
                    }
                }
                if (gVar2.f3073e.f1043c == null) {
                    C0098j c0098j2 = new C0098j(new C0083f0());
                    Y1 y12 = new Y1(gVar2.f3069a);
                    gVar2.f3075u = y12;
                    c0098j2.g(y12);
                    gVar2.f3073e.f1043c = c0098j2;
                }
                if (gVar2.f3073e.f1044d == null) {
                    gVar2.f3073e.f1044d = new C0098j(new C0083f0());
                }
                Z1 z14 = gVar2.f3073e;
                if (z14 != null) {
                    long b02 = bVar2.f3061c.b0();
                    z14.d(b02 != -9223372036854775807L ? b02 : -1L);
                    gVar2.f3073e.c(bVar2.K());
                    s sVar3 = gVar2.f3070b;
                    if (sVar3 != null && (c0098j = sVar3.f27531b.f1188r0) != null) {
                        c0098j.f851a.e(0, 1);
                    }
                }
                C9.g.f3090F.removeMessages(100, gVar2.f3092D);
                boolean s3 = bVar2.s();
                gVar2.f3076v = s3;
                gVar2.e(s3);
            }
            if (gVar2.f3074f == null) {
                C0107l0 c0107l0 = new C0107l0(1);
                C9.d dVar = new C9.d(gVar2);
                dVar.f3082f = c0107l0;
                gVar2.f3074f = dVar;
            }
            c0085f2.f1189s0 = gVar2.f3074f;
            c0085f2.y0();
            c0085f2.w0();
            c0085f2.f1190t0 = gVar2.f3073e;
            c0085f2.z0();
            c0085f2.y0();
            T t10 = this.f27532c;
            gVar2.f3077w = t10;
            int i10 = gVar2.f3078x;
            if (i10 != 0 && (i7 = gVar2.f3079y) != 0) {
                ((s) t10.f964a).f27531b.u0(i10, i7);
            }
            if (gVar2.f3080z) {
                gVar2.f3077w.l(gVar2.f3067A, gVar2.f3068B);
            }
            ((s) gVar2.f3077w.f964a).f27531b.getClass();
            bVar2.getClass();
            boolean z8 = this instanceof s;
            C9.a aVar = bVar2.f3063e;
            if (z8) {
                bVar2.f3064f = this;
                c(aVar);
            }
            bVar2.N();
            bVar2.f3061c.K(aVar);
            c0085f2.f1184n0 = gVar2.f3093E;
        }
    }

    public final void c(C9.a aVar) {
        AbstractC2456A abstractC2456A = this.f27533d;
        abstractC2456A.f27468l1 = aVar;
        if (aVar == null || abstractC2456A.f27469m1 != 1) {
            return;
        }
        SurfaceView surfaceView = abstractC2456A.f27467k1;
        kotlin.jvm.internal.l.b(surfaceView);
        aVar.surfaceCreated(surfaceView.getHolder());
    }
}
