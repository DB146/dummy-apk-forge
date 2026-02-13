package z0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0018g0;
import A0.InterfaceC0024m;
import A0.L;
import Q5.e;
import c0.l;
import ia.C1358d;
import kotlin.jvm.internal.m;
import x0.AbstractC2256a;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2581c extends InterfaceC0024m {
    default e c() {
        return C2579a.f28152d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [A0.m, z0.c] */
    default Object w(C1358d c1358d) {
        C0018g0 c0018g0;
        l lVar = (l) this;
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.a("ModifierLocal accessed from an unattached node");
        }
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        l lVar2 = lVar.f14113a.f14117e;
        L t5 = AbstractC0017g.t(this);
        while (t5 != null) {
            if ((((l) t5.f60S.f229f).f14116d & 32) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f14115c & 32) != 0) {
                        AbstractC0025n abstractC0025n = lVar2;
                        ?? r42 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof InterfaceC2581c) {
                                InterfaceC2581c interfaceC2581c = (InterfaceC2581c) abstractC0025n;
                                if (interfaceC2581c.c().r(c1358d)) {
                                    return interfaceC2581c.c().w(c1358d);
                                }
                            } else if ((abstractC0025n.f14115c & 32) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                l lVar3 = abstractC0025n.f269D;
                                int i7 = 0;
                                abstractC0025n = abstractC0025n;
                                r42 = r42;
                                while (lVar3 != null) {
                                    if ((lVar3.f14115c & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            abstractC0025n = lVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new S.e(new l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r42.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r42.b(lVar3);
                                        }
                                    }
                                    lVar3 = lVar3.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r42);
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        return ((m) c1358d.f18487b).invoke();
    }
}
