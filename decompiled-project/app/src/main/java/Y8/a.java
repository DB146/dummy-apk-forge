package Y8;

import P8.b;
import P8.d;
import P8.j;
import P8.l;
import P8.n;
import P8.o;
import P8.p;
import V8.e;
import V8.h;
import c2.q;
import java.util.ArrayList;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f12063b = new p[0];

    /* renamed from: a, reason: collision with root package name */
    public final R7.a f12064a = new R7.a(17);

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0193, code lost:
    
        if ((r1.M(r12, r9) + r1.M(r13, r9)) > (r1.M(r12, r3) + r1.M(r13, r3))) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02dd  */
    @Override // P8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(b bVar, EnumMap enumMap) {
        char c10;
        char c11;
        e n6;
        p[] pVarArr;
        R7.a aVar = this.f12064a;
        if (enumMap == null || !enumMap.containsKey(d.f8196b)) {
            V8.b a9 = bVar.a();
            q3.l lVar = new q3.l(a9);
            p[] b2 = ((W8.a) lVar.f23392c).b();
            p pVar = b2[0];
            p pVar2 = b2[1];
            p pVar3 = b2[3];
            p pVar4 = b2[2];
            int M3 = lVar.M(pVar, pVar2);
            int M10 = lVar.M(pVar2, pVar3);
            int M11 = lVar.M(pVar3, pVar4);
            int M12 = lVar.M(pVar4, pVar);
            p[] pVarArr2 = {pVar4, pVar, pVar2, pVar3};
            if (M3 > M10) {
                pVarArr2[0] = pVar;
                pVarArr2[1] = pVar2;
                pVarArr2[2] = pVar3;
                pVarArr2[3] = pVar4;
                M3 = M10;
            }
            if (M3 > M11) {
                pVarArr2[0] = pVar2;
                pVarArr2[1] = pVar3;
                pVarArr2[2] = pVar4;
                pVarArr2[3] = pVar;
            } else {
                M11 = M3;
            }
            if (M11 > M12) {
                pVarArr2[0] = pVar3;
                pVarArr2[1] = pVar4;
                pVarArr2[2] = pVar;
                pVarArr2[3] = pVar2;
            }
            p pVar5 = pVarArr2[0];
            p pVar6 = pVarArr2[1];
            p pVar7 = pVarArr2[2];
            p pVar8 = pVarArr2[3];
            int M13 = (lVar.M(pVar5, pVar8) + 1) * 4;
            if (lVar.M(q3.l.K(pVar6, pVar7, M13), pVar5) < lVar.M(q3.l.K(pVar7, pVar6, M13), pVar8)) {
                pVarArr2[0] = pVar5;
                pVarArr2[1] = pVar6;
                c10 = 2;
                pVarArr2[2] = pVar7;
                c11 = 3;
                pVarArr2[3] = pVar8;
            } else {
                c10 = 2;
                c11 = 3;
                pVarArr2[0] = pVar6;
                pVarArr2[1] = pVar7;
                pVarArr2[2] = pVar8;
                pVarArr2[3] = pVar5;
            }
            p pVar9 = pVarArr2[0];
            p pVar10 = pVarArr2[1];
            p pVar11 = pVarArr2[c10];
            p pVar12 = pVarArr2[c11];
            int M14 = lVar.M(pVar9, pVar12);
            p K10 = q3.l.K(pVar9, pVar10, (lVar.M(pVar10, pVar12) + 1) * 4);
            p K11 = q3.l.K(pVar11, pVar10, (M14 + 1) * 4);
            int M15 = lVar.M(K10, pVar12);
            int M16 = lVar.M(K11, pVar12);
            float f4 = pVar11.f8249a;
            float f10 = pVar10.f8249a;
            float f11 = M15 + 1;
            float f12 = pVar12.f8249a;
            float f13 = pVar11.f8250b;
            float f14 = pVar10.f8250b;
            float f15 = pVar12.f8250b;
            p pVar13 = new p(((f4 - f10) / f11) + f12, ((f13 - f14) / f11) + f15);
            float f16 = pVar9.f8249a - f10;
            float f17 = M16 + 1;
            p pVar14 = new p((f16 / f17) + f12, ((pVar9.f8250b - f14) / f17) + f15);
            if (lVar.C(pVar13)) {
                if (lVar.C(pVar14)) {
                }
                pVarArr2[3] = pVar13;
                if (pVar13 == null) {
                }
            } else {
                if (!lVar.C(pVar14)) {
                    pVar13 = null;
                    pVarArr2[3] = pVar13;
                    if (pVar13 == null) {
                        throw j.a();
                    }
                    p pVar15 = pVarArr2[0];
                    p pVar16 = pVarArr2[1];
                    p pVar17 = pVarArr2[2];
                    int M17 = lVar.M(pVar15, pVar13) + 1;
                    p K12 = q3.l.K(pVar15, pVar16, (lVar.M(pVar17, pVar13) + 1) * 4);
                    p K13 = q3.l.K(pVar17, pVar16, M17 * 4);
                    int M18 = lVar.M(K12, pVar13);
                    int i7 = M18 + 1;
                    int M19 = lVar.M(K13, pVar13);
                    int i10 = M19 + 1;
                    if ((i7 & 1) == 1) {
                        i7 = M18 + 2;
                    }
                    if ((i10 & 1) == 1) {
                        i10 = M19 + 2;
                    }
                    float f18 = (((pVar15.f8249a + pVar16.f8249a) + pVar17.f8249a) + pVar13.f8249a) / 4.0f;
                    float f19 = (((pVar15.f8250b + pVar16.f8250b) + pVar17.f8250b) + pVar13.f8250b) / 4.0f;
                    p D10 = q3.l.D(pVar15, f18, f19);
                    p D11 = q3.l.D(pVar16, f18, f19);
                    p D12 = q3.l.D(pVar17, f18, f19);
                    p D13 = q3.l.D(pVar13, f18, f19);
                    int i11 = i10 * 4;
                    int i12 = i7 * 4;
                    p[] pVarArr3 = {q3.l.K(q3.l.K(D10, D11, i11), D13, i12), q3.l.K(q3.l.K(D11, D10, i11), D12, i12), q3.l.K(q3.l.K(D12, D13, i11), D11, i12), q3.l.K(q3.l.K(D13, D12, i11), D10, i12)};
                    p pVar18 = pVarArr3[0];
                    p pVar19 = pVarArr3[1];
                    p pVar20 = pVarArr3[2];
                    p pVar21 = pVarArr3[3];
                    int M20 = lVar.M(pVar18, pVar21);
                    int i13 = M20 + 1;
                    int M21 = lVar.M(pVar20, pVar21);
                    int i14 = M21 + 1;
                    if ((i13 & 1) == 1) {
                        i13 = M20 + 2;
                    }
                    if ((i14 & 1) == 1) {
                        i14 = M21 + 2;
                    }
                    if (i13 * 4 < i14 * 6 && i14 * 4 < i13 * 6) {
                        i13 = Math.max(i13, i14);
                        i14 = i13;
                    }
                    float f20 = i13 - 0.5f;
                    float f21 = i14 - 0.5f;
                    n6 = aVar.n(q.y(a9, i13, i14, h.a(0.5f, 0.5f, f20, 0.5f, f20, f21, 0.5f, f21, pVar18.f8249a, pVar18.f8250b, pVar21.f8249a, pVar21.f8250b, pVar20.f8249a, pVar20.f8250b, pVar19.f8249a, pVar19.f8250b)));
                    pVarArr = new p[]{pVar18, pVar19, pVar20, pVar21};
                }
                pVar13 = pVar14;
                pVarArr2[3] = pVar13;
                if (pVar13 == null) {
                }
            }
        } else {
            V8.b a10 = bVar.a();
            int[] e2 = a10.e();
            int[] c12 = a10.c();
            if (e2 == null || c12 == null) {
                throw j.a();
            }
            int i15 = a10.f10194a;
            int i16 = e2[0];
            int i17 = e2[1];
            while (i16 < i15 && a10.b(i16, i17)) {
                i16++;
            }
            if (i16 == i15) {
                throw j.a();
            }
            int i18 = e2[0];
            int i19 = i16 - i18;
            if (i19 == 0) {
                throw j.a();
            }
            int i20 = e2[1];
            int i21 = c12[1];
            int i22 = ((c12[0] - i18) + 1) / i19;
            int i23 = ((i21 - i20) + 1) / i19;
            if (i22 <= 0 || i23 <= 0) {
                throw j.a();
            }
            int i24 = i19 / 2;
            int i25 = i20 + i24;
            int i26 = i18 + i24;
            V8.b bVar2 = new V8.b(i22, i23);
            for (int i27 = 0; i27 < i23; i27++) {
                int i28 = (i27 * i19) + i25;
                for (int i29 = 0; i29 < i22; i29++) {
                    if (a10.b((i29 * i19) + i26, i28)) {
                        bVar2.h(i29, i27);
                    }
                }
            }
            n6 = aVar.n(bVar2);
            pVarArr = f12063b;
        }
        n nVar = new n(n6.f10207b, n6.f10206a, pVarArr, P8.a.f8185f);
        ArrayList arrayList = n6.f10208c;
        if (arrayList != null) {
            nVar.b(o.f8238b, arrayList);
        }
        String str = n6.f10209d;
        if (str != null) {
            nVar.b(o.f8239c, str);
        }
        nVar.b(o.f8240d, n6.f10210e);
        nVar.b(o.f8235A, "]d" + n6.j);
        return nVar;
    }

    @Override // P8.l
    public final void reset() {
    }
}
