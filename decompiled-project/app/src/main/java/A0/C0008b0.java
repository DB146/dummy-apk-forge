package A0;

import y0.AbstractC2322G;

/* renamed from: A0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008b0 extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0010c0 f166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0008b0(C0010c0 c0010c0, int i7) {
        super(0);
        this.f165a = i7;
        this.f166b = c0010c0;
    }

    @Override // Rb.a
    public final Object invoke() {
        AbstractC2322G placementScope;
        switch (this.f165a) {
            case 0:
                C0010c0 c0010c0 = this.f166b;
                P p10 = c0010c0.f192f;
                p10.f100i = 0;
                S.e x2 = p10.f93a.x();
                Object[] objArr = x2.f8959a;
                int i7 = x2.f8961c;
                for (int i10 = 0; i10 < i7; i10++) {
                    C0010c0 c0010c02 = ((L) objArr[i10]).f61T.f105p;
                    c0010c02.f194v = c0010c02.f195w;
                    c0010c02.f195w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    c0010c02.f175G = false;
                    if (c0010c02.f198z == H.f31b) {
                        c0010c02.f198z = H.f32c;
                    }
                }
                P p11 = c0010c0.f192f;
                S.e x10 = p11.f93a.x();
                Object[] objArr2 = x10.f8959a;
                int i11 = x10.f8961c;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((L) objArr2[i12]).f61T.f105p.f179K.getClass();
                }
                c0010c0.i().c0().b();
                L l10 = p11.f93a;
                S.e x11 = l10.x();
                Object[] objArr3 = x11.f8959a;
                int i13 = x11.f8961c;
                for (int i14 = 0; i14 < i13; i14++) {
                    L l11 = (L) objArr3[i14];
                    if (l11.f61T.f105p.f194v != l11.u()) {
                        l10.L();
                        l10.A();
                        if (l11.u() == Integer.MAX_VALUE) {
                            P p12 = l11.f61T;
                            if (p12.f95c) {
                                Y y10 = p12.f106q;
                                kotlin.jvm.internal.l.b(y10);
                                y10.R(false);
                            }
                            p12.f105p.T();
                        }
                    }
                }
                S.e x12 = l10.x();
                Object[] objArr4 = x12.f8959a;
                int i15 = x12.f8961c;
                for (int i16 = 0; i16 < i15; i16++) {
                    M m10 = ((L) objArr4[i16]).f61T.f105p.f179K;
                    m10.getClass();
                    m10.f85c = false;
                }
                return Db.q.f3365a;
            case 1:
                C0010c0 c0010c03 = this.f166b;
                c0010c03.f192f.a().b(c0010c03.f182O);
                return Db.q.f3365a;
            default:
                C0010c0 c0010c04 = this.f166b;
                n0 n0Var = c0010c04.f192f.a().f275B;
                P p13 = c0010c04.f192f;
                if (n0Var == null || (placementScope = n0Var.f116w) == null) {
                    placementScope = ((B0.D) O.a(p13.f93a)).getPlacementScope();
                }
                Rb.c cVar = c0010c04.f187T;
                if (cVar == null) {
                    n0 a9 = p13.a();
                    long j = c0010c04.f188U;
                    float f4 = c0010c04.f189V;
                    placementScope.getClass();
                    AbstractC2322G.a(placementScope, a9);
                    a9.M(V0.i.c(j, a9.f26558e), f4, null);
                } else {
                    n0 a10 = p13.a();
                    long j10 = c0010c04.f188U;
                    float f10 = c0010c04.f189V;
                    placementScope.getClass();
                    AbstractC2322G.a(placementScope, a10);
                    a10.M(V0.i.c(j10, a10.f26558e), f10, cVar);
                }
                return Db.q.f3365a;
        }
    }
}
