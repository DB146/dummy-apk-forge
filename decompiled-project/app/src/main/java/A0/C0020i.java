package A0;

import B0.AbstractC0207v0;
import B0.e1;
import Q.C0480b;
import Q.InterfaceC0520w;
import Q.S0;
import y0.InterfaceC2316A;

/* renamed from: A0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020i extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C0020i f234b = new C0020i(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0020i f235c = new C0020i(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0020i f236d = new C0020i(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0020i f237e = new C0020i(2, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0020i(int i7, int i10) {
        super(i7);
        this.f238a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [S.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [S.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f238a) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0022k) obj).getClass();
                return Db.q.f3365a;
            case 1:
                ((L) ((InterfaceC0022k) obj)).X((InterfaceC2316A) obj2);
                return Db.q.f3365a;
            case 2:
                ((L) ((InterfaceC0022k) obj)).Y((c0.m) obj2);
                return Db.q.f3365a;
            default:
                InterfaceC0520w interfaceC0520w = (InterfaceC0520w) obj2;
                L l10 = (L) ((InterfaceC0022k) obj);
                l10.f56O = interfaceC0520w;
                S0 s02 = AbstractC0207v0.f1993h;
                Y.j jVar = (Y.j) interfaceC0520w;
                jVar.getClass();
                l10.V((V0.c) C0480b.p(jVar, s02));
                V0.l lVar = (V0.l) C0480b.p(jVar, AbstractC0207v0.f1997n);
                V0.l lVar2 = l10.f54M;
                C0018g0 c0018g0 = l10.f60S;
                if (lVar2 != lVar) {
                    l10.f54M = lVar;
                    l10.C();
                    L t5 = l10.t();
                    if (t5 != null) {
                        t5.A();
                    }
                    l10.B();
                    for (c0.l lVar3 = (c0.l) c0018g0.f229f; lVar3 != null; lVar3 = lVar3.f14118f) {
                        lVar3.Z();
                    }
                }
                l10.Z((e1) C0480b.p(jVar, AbstractC0207v0.f2002s));
                c0.l lVar4 = (c0.l) c0018g0.f229f;
                if ((lVar4.f14116d & 32768) != 0) {
                    while (lVar4 != null) {
                        if ((lVar4.f14115c & 32768) != 0) {
                            AbstractC0025n abstractC0025n = lVar4;
                            ?? r22 = 0;
                            while (abstractC0025n != 0) {
                                if (abstractC0025n instanceof InterfaceC0023l) {
                                    c0.l lVar5 = ((c0.l) ((InterfaceC0023l) abstractC0025n)).f14113a;
                                    if (lVar5.f14112B) {
                                        o0.c(lVar5);
                                    } else {
                                        lVar5.f14122x = true;
                                    }
                                } else if ((abstractC0025n.f14115c & 32768) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                    c0.l lVar6 = abstractC0025n.f269D;
                                    int i7 = 0;
                                    abstractC0025n = abstractC0025n;
                                    r22 = r22;
                                    while (lVar6 != null) {
                                        if ((lVar6.f14115c & 32768) != 0) {
                                            i7++;
                                            r22 = r22;
                                            if (i7 == 1) {
                                                abstractC0025n = lVar6;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new S.e(new c0.l[16]);
                                                }
                                                if (abstractC0025n != 0) {
                                                    r22.b(abstractC0025n);
                                                    abstractC0025n = 0;
                                                }
                                                r22.b(lVar6);
                                            }
                                        }
                                        lVar6 = lVar6.f14118f;
                                        abstractC0025n = abstractC0025n;
                                        r22 = r22;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0025n = AbstractC0017g.e(r22);
                            }
                        }
                        if ((lVar4.f14116d & 32768) != 0) {
                            lVar4 = lVar4.f14118f;
                        }
                    }
                }
                return Db.q.f3365a;
        }
    }
}
