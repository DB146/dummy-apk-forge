package A0;

import A9.C0096i1;
import B0.W0;
import F.C0273q;
import F.C0278w;
import Q.AbstractC0508p;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import R.C0524a;
import R.C0525b;
import R.C0532i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i0.C1289b;
import java.io.Serializable;
import m0.C1533b;
import u0.C2080j;
import y0.AbstractC2328M;
import y0.C2348p;
import y0.InterfaceC2317B;
import y0.InterfaceC2332Q;
import z.C2570q;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i7, Object obj, Object obj2) {
        super(2);
        this.f246a = i7;
        this.f247b = obj;
        this.f248c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, int i7, int i10) {
        super(2);
        this.f246a = i10;
        this.f247b = obj;
        this.f248c = obj2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Db.q qVar = Db.q.f3365a;
        Object obj3 = this.f248c;
        Object obj4 = this.f247b;
        switch (this.f246a) {
            case 0:
                j0.l lVar = (j0.l) obj;
                C1533b c1533b = (C1533b) obj2;
                n0 n0Var = (n0) obj4;
                if (n0Var.f293z.G()) {
                    n0Var.f288P = lVar;
                    n0Var.f287O = c1533b;
                    v0 snapshotObserver = ((B0.D) O.a(n0Var.f293z)).getSnapshotObserver();
                    j0.B b2 = n0.f270U;
                    snapshotObserver.a(n0Var, C0015f.f206d, (k0) obj3);
                    n0Var.f291S = false;
                } else {
                    n0Var.f291S = true;
                }
                return qVar;
            case 1:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((B0.D) obj4, (Y.e) obj3, (C0506o) obj, C0480b.u(1));
                return qVar;
            case 2:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    F.r rVar = (F.r) obj4;
                    E.j jVar = (E.j) rVar.f3997b.invoke();
                    C0273q c0273q = (C0273q) obj3;
                    int i7 = c0273q.f3993c;
                    int b10 = jVar.b();
                    Object obj5 = c0273q.f3991a;
                    if ((i7 >= b10 || !jVar.c(i7).equals(obj5)) && (i7 = jVar.f3417d.m(obj5)) != -1) {
                        c0273q.f3993c = i7;
                    }
                    int i10 = i7;
                    if (i10 != -1) {
                        c0506o.S(-660404355);
                        F.x.d(jVar, rVar.f3996a, i10, obj5, c0506o, 0);
                        c0506o.p(false);
                    } else {
                        c0506o.S(-660169871);
                        c0506o.p(false);
                    }
                    boolean i11 = c0506o.i(c0273q);
                    Object H10 = c0506o.H();
                    if (i11 || H10 == C0498k.f8409a) {
                        H10 = new C0005a(c0273q, 9);
                        c0506o.d0(H10);
                    }
                    C0480b.c(obj5, (Rb.c) H10, c0506o);
                } else {
                    c0506o.N();
                }
                return qVar;
            case 3:
                return (InterfaceC2317B) ((Rb.e) obj3).invoke(new C0278w((F.r) obj4, (InterfaceC2332Q) obj), new V0.a(((V0.a) obj2).f9967a));
            case 4:
                C0506o c0506o2 = (C0506o) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0506o2.K(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((Y.e) obj4).a((F.N) obj3, c0506o2, 0);
                } else {
                    c0506o2.N();
                }
                return qVar;
            case 5:
                C0506o c0506o3 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o3.x()) {
                    c0506o3.N();
                } else {
                    N.G.a(((N.H) obj4).j, (Y.e) obj3, c0506o3, 0);
                }
                return qVar;
            case 6:
                ((Number) obj2).intValue();
                N.G.a((K0.F) obj4, (Y.e) obj3, (C0506o) obj, C0480b.u(1));
                return qVar;
            case 7:
                int intValue3 = ((Number) obj).intValue();
                H0.n nVar = (H0.n) obj2;
                if (!((W0) obj4).f1806b.b(nVar.g)) {
                    e0.c cVar = (e0.c) obj3;
                    cVar.h(intValue3, nVar);
                    cVar.f16651v.h(qVar);
                }
                return qVar;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C0506o c0506o4 = (C0506o) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (c0506o4.K(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Boolean bool = (Boolean) ((C2348p) obj4).f26597f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0506o4.V(bool);
                    boolean h10 = c0506o4.h(booleanValue);
                    if (booleanValue) {
                        ((Rb.e) obj3).invoke(c0506o4, 0);
                    } else {
                        if (c0506o4.k != 0) {
                            AbstractC0508p.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!c0506o4.f8448O) {
                            if (h10) {
                                Q.y0 y0Var = c0506o4.f8440F;
                                int i12 = y0Var.g;
                                int i13 = y0Var.f8579h;
                                C0525b c0525b = c0506o4.L;
                                c0525b.getClass();
                                c0525b.e(false);
                                C0524a c0524a = c0525b.f8747b;
                                c0524a.getClass();
                                c0524a.f8745f.N(C0532i.f8761d);
                                AbstractC0508p.a(c0506o4.f8465r, i12, i13);
                                c0506o4.f8440F.q();
                            } else {
                                c0506o4.M();
                            }
                        }
                    }
                    if (c0506o4.f8471x && c0506o4.f8440F.f8580i == c0506o4.f8472y) {
                        c0506o4.f8472y = -1;
                        c0506o4.f8471x = false;
                    }
                    c0506o4.p(false);
                } else {
                    c0506o4.N();
                }
                return qVar;
            case 9:
                ((Number) obj2).intValue();
                AbstractC2328M.a((c0.j) obj4, (Rb.e) obj3, (C0506o) obj, C0480b.u(1));
                return qVar;
            case 10:
                ((Number) obj2).intValue();
                tc.b.e((Serializable) obj4, (c0.m) obj3, (C0506o) obj, C0480b.u(49));
                return qVar;
            default:
                long j = ((C1289b) obj2).f18172a;
                q3.f.e((C0096i1) obj4, (C2080j) obj);
                ec.d dVar = ((z.p0) obj3).f28053I;
                if (dVar != null) {
                    dVar.h(new C2570q(j));
                }
                return qVar;
        }
    }
}
