package y0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.C0018g0;
import A0.D0;
import A0.E0;
import B0.C0210x;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class v implements InterfaceC2329N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f26615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26616b;

    public v(w wVar, Object obj) {
        this.f26615a = wVar;
        this.f26616b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [B0.x] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // y0.InterfaceC2329N
    public final void a(C0210x c0210x) {
        C0018g0 c0018g0;
        c0.l lVar;
        D0 d02;
        A0.L l10 = (A0.L) this.f26615a.f26629x.g(this.f26616b);
        if (l10 == null || (c0018g0 = l10.f60S) == null || (lVar = (c0.l) c0018g0.f229f) == null) {
            return;
        }
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitSubtreeIf called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar2 = lVar.f14113a;
        c0.l lVar3 = lVar2.f14118f;
        if (lVar3 == null) {
            AbstractC0017g.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i7 = eVar.f8961c;
            if (i7 == 0) {
                return;
            }
            c0.l lVar4 = (c0.l) eVar.l(i7 - 1);
            if ((lVar4.f14116d & 262144) != 0) {
                for (c0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.f14118f) {
                    if ((lVar5.f14115c & 262144) != 0) {
                        AbstractC0025n abstractC0025n = lVar5;
                        ?? r72 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof E0) {
                                E0 e02 = (E0) abstractC0025n;
                                if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(e02.j())) {
                                    c0210x.invoke(e02);
                                    d02 = D0.f17b;
                                } else {
                                    d02 = D0.f16a;
                                }
                                if (d02 == D0.f18c) {
                                    return;
                                }
                                if (d02 == D0.f17b) {
                                    break;
                                }
                            } else if ((abstractC0025n.f14115c & 262144) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar6 = abstractC0025n.f269D;
                                int i10 = 0;
                                abstractC0025n = abstractC0025n;
                                r72 = r72;
                                while (lVar6 != null) {
                                    if ((lVar6.f14115c & 262144) != 0) {
                                        i10++;
                                        r72 = r72;
                                        if (i10 == 1) {
                                            abstractC0025n = lVar6;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r72.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r72.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r72 = r72;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r72);
                        }
                    }
                }
            }
            AbstractC0017g.b(eVar, lVar4);
        }
    }

    @Override // y0.InterfaceC2329N
    public final void b() {
        w wVar = this.f26615a;
        wVar.b();
        A0.L l10 = (A0.L) wVar.f26629x.j(this.f26616b);
        if (l10 != null) {
            if (wVar.f26619C <= 0) {
                AbstractC2256a.b("No pre-composed items to dispose");
            }
            A0.L l11 = wVar.f26620a;
            int i7 = ((S.b) l11.o()).f8953a.i(l10);
            if (i7 < ((S.b) l11.o()).f8953a.f8961c - wVar.f26619C) {
                AbstractC2256a.b("Item is not in pre-composed item range");
            }
            wVar.f26618B++;
            wVar.f26619C--;
            int i10 = (((S.b) l11.o()).f8953a.f8961c - wVar.f26619C) - wVar.f26618B;
            l11.f47E = true;
            l11.J(i7, i10, 1);
            l11.f47E = false;
            wVar.a(i10);
        }
    }

    @Override // y0.InterfaceC2329N
    public final int c() {
        A0.L l10 = (A0.L) this.f26615a.f26629x.g(this.f26616b);
        if (l10 != null) {
            return ((S.b) l10.n()).f8953a.f8961c;
        }
        return 0;
    }

    @Override // y0.InterfaceC2329N
    public final void d(int i7, long j) {
        w wVar = this.f26615a;
        A0.L l10 = (A0.L) wVar.f26629x.g(this.f26616b);
        if (l10 == null || !l10.F()) {
            return;
        }
        int i10 = ((S.b) l10.n()).f8953a.f8961c;
        if (i7 < 0 || i7 >= i10) {
            AbstractC2256a.d("Index (" + i7 + ") is out of bound of [0, " + i10 + ')');
        }
        if (l10.G()) {
            AbstractC2256a.a("Pre-measure called on node that is not placed");
        }
        A0.L l11 = wVar.f26620a;
        l11.f47E = true;
        ((B0.D) A0.O.a(l10)).u((A0.L) ((S.b) l10.n()).get(i7), j);
        l11.f47E = false;
    }
}
