package K0;

import j0.AbstractC1362A;
import l0.AbstractC1444c;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5999a = android.support.v4.media.session.b.v(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f6000b = android.support.v4.media.session.b.v(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f6001c = j0.n.f18552f;

    /* renamed from: d, reason: collision with root package name */
    public static final U0.p f6002d;

    static {
        long j = j0.n.f18548b;
        f6002d = j != 16 ? new U0.c(j) : U0.n.f9436a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x a(x xVar, long j, AbstractC1362A abstractC1362A, float f4, long j10, N0.k kVar, N0.i iVar, N0.j jVar, N0.q qVar, String str, long j11, U0.a aVar, U0.q qVar2, Q0.b bVar, long j12, U0.l lVar, j0.C c10, AbstractC1444c abstractC1444c) {
        j0.C c11;
        AbstractC1444c abstractC1444c2;
        U0.n nVar;
        U0.p cVar;
        U0.p pVar;
        boolean z8;
        U0.q qVar3;
        Q0.b bVar2;
        long j13;
        N0.q qVar4 = qVar;
        String str2 = str;
        long j14 = j11;
        V0.o[] oVarArr = V0.n.f9986b;
        long j15 = j10 & 1095216660480L;
        if (((j15 == 0) || V0.n.a(j10, xVar.f5987b)) && ((abstractC1362A != null || j == 16 || j0.n.c(j, xVar.f5986a.b())) && ((iVar == null || iVar.equals(xVar.f5989d)) && ((kVar == null || kVar.equals(xVar.f5988c)) && ((qVar4 == null || qVar4 == xVar.f5991f) && (((j14 & 1095216660480L) == 0 || V0.n.a(j14, xVar.f5992h)) && ((lVar == null || lVar.equals(xVar.f5995m)) && kotlin.jvm.internal.l.a(abstractC1362A, xVar.f5986a.c()) && ((abstractC1362A == null || f4 == xVar.f5986a.a()) && ((jVar == null || jVar.equals(xVar.f5990e)) && ((str2 == null || str2.equals(xVar.g)) && ((aVar == null || aVar.equals(xVar.f5993i)) && ((qVar2 == null || qVar2.equals(xVar.j)) && ((bVar == null || bVar.equals(xVar.k)) && (j12 == 16 || j0.n.c(j12, xVar.f5994l))))))))))))))) {
            c11 = c10;
            if (c11 == null || c11.equals(xVar.f5996n)) {
                abstractC1444c2 = abstractC1444c;
                if (abstractC1444c2 == null || abstractC1444c2.equals(xVar.f5997o)) {
                    return xVar;
                }
                nVar = U0.n.f9436a;
                if (abstractC1362A != null) {
                    if (j != 16) {
                        cVar = new U0.c(j);
                    }
                    cVar = nVar;
                } else if (abstractC1362A instanceof j0.F) {
                    long w10 = q3.f.w(((j0.F) abstractC1362A).f18525e, f4);
                    if (w10 != 16) {
                        cVar = new U0.c(w10);
                    }
                    cVar = nVar;
                } else {
                    if (!(abstractC1362A instanceof j0.k)) {
                        throw new Db.d(1);
                    }
                    cVar = new U0.b((j0.k) abstractC1362A, f4);
                }
                pVar = xVar.f5986a;
                pVar.getClass();
                z8 = cVar instanceof U0.b;
                if (!z8 && (pVar instanceof U0.b)) {
                    U0.o oVar = new U0.o(pVar, 0);
                    float f10 = ((U0.b) cVar).f9415a;
                    if (Float.isNaN(f10)) {
                        f10 = ((Number) oVar.invoke()).floatValue();
                    }
                    cVar = new U0.b(null, f10);
                } else if (z8 || (pVar instanceof U0.b)) {
                    if (z8 && (pVar instanceof U0.b)) {
                        cVar = pVar;
                    } else {
                        U0.o oVar2 = new U0.o(pVar, 1);
                        if (cVar.equals(nVar)) {
                            cVar = (U0.p) oVar2.invoke();
                        }
                    }
                }
                if (qVar4 == null) {
                    qVar4 = xVar.f5991f;
                }
                long j16 = j15 != 0 ? xVar.f5987b : j10;
                N0.k kVar2 = kVar != null ? xVar.f5988c : kVar;
                N0.i iVar2 = iVar != null ? xVar.f5989d : iVar;
                N0.j jVar2 = jVar != null ? xVar.f5990e : jVar;
                if (str2 == null) {
                    str2 = xVar.g;
                }
                if ((j14 & 1095216660480L) == 0) {
                    j14 = xVar.f5992h;
                }
                U0.a aVar2 = aVar != null ? xVar.f5993i : aVar;
                U0.q qVar5 = qVar2 != null ? xVar.j : qVar2;
                Q0.b bVar3 = bVar != null ? xVar.k : bVar;
                if (j12 == 16) {
                    qVar3 = qVar5;
                    bVar2 = bVar3;
                    j13 = j12;
                } else {
                    qVar3 = qVar5;
                    bVar2 = bVar3;
                    j13 = xVar.f5994l;
                }
                long j17 = j13;
                U0.l lVar2 = lVar != null ? xVar.f5995m : lVar;
                if (c11 == null) {
                    c11 = xVar.f5996n;
                }
                if (abstractC1444c2 == null) {
                    abstractC1444c2 = xVar.f5997o;
                }
                return new x(cVar, j16, kVar2, iVar2, jVar2, qVar4, str2, j14, aVar2, qVar3, bVar2, j17, lVar2, c11, abstractC1444c2);
            }
        } else {
            c11 = c10;
        }
        abstractC1444c2 = abstractC1444c;
        nVar = U0.n.f9436a;
        if (abstractC1362A != null) {
        }
        pVar = xVar.f5986a;
        pVar.getClass();
        z8 = cVar instanceof U0.b;
        if (!z8) {
        }
        if (z8) {
        }
        if (z8) {
        }
        U0.o oVar22 = new U0.o(pVar, 1);
        if (cVar.equals(nVar)) {
        }
        if (qVar4 == null) {
        }
        if (j15 != 0) {
        }
        if (kVar != null) {
        }
        if (iVar != null) {
        }
        if (jVar != null) {
        }
        if (str2 == null) {
        }
        if ((j14 & 1095216660480L) == 0) {
        }
        if (aVar != null) {
        }
        if (qVar2 != null) {
        }
        if (bVar != null) {
        }
        if (j12 == 16) {
        }
        long j172 = j13;
        if (lVar != null) {
        }
        if (c11 == null) {
        }
        if (abstractC1444c2 == null) {
        }
        return new x(cVar, j16, kVar2, iVar2, jVar2, qVar4, str2, j14, aVar2, qVar3, bVar2, j172, lVar2, c11, abstractC1444c2);
    }
}
