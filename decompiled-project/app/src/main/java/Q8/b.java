package Q8;

import P8.d;
import P8.f;
import P8.j;
import P8.l;
import P8.n;
import P8.o;
import P8.p;
import P8.q;
import V8.e;
import java.util.ArrayList;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class b implements l {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[LOOP:0: B:27:0x006a->B:28:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, R8.a] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, R8.a] */
    @Override // P8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(P8.b bVar, EnumMap enumMap) {
        p[] pVarArr;
        int i7;
        int i10;
        p[] pVarArr2;
        f fVar;
        p[] pVarArr3;
        ArrayList arrayList;
        String str;
        q qVar;
        a a9;
        S8.a aVar = new S8.a(bVar.a());
        e eVar = null;
        try {
            a9 = aVar.a(false);
            pVarArr = a9.f8701b;
        } catch (f e2) {
            e = e2;
            pVarArr = null;
        } catch (j e10) {
            e = e10;
            pVarArr = null;
        }
        try {
            i7 = a9.f8705f;
            try {
                i10 = i7;
                pVarArr2 = pVarArr;
                fVar = null;
                eVar = new Object().a(a9);
                e = null;
            } catch (f e11) {
                e = e11;
                i10 = i7;
                pVarArr2 = pVarArr;
                fVar = e;
                e = null;
                if (eVar == null) {
                }
                int i11 = i10;
                pVarArr3 = pVarArr2;
                if (enumMap != null) {
                    while (r1 < r2) {
                    }
                }
                P8.a aVar2 = P8.a.f8180a;
                System.currentTimeMillis();
                n nVar = new n(eVar.f10207b, eVar.f10206a, pVarArr3, aVar2, 0);
                arrayList = eVar.f10208c;
                if (arrayList != null) {
                }
                str = eVar.f10209d;
                if (str != null) {
                }
                nVar.b(o.f8240d, Integer.valueOf(eVar.f10210e.intValue() + i11));
                nVar.b(o.f8235A, "]z" + eVar.j);
                return nVar;
            } catch (j e12) {
                e = e12;
                i10 = i7;
                pVarArr2 = pVarArr;
                fVar = null;
                if (eVar == null) {
                }
                int i112 = i10;
                pVarArr3 = pVarArr2;
                if (enumMap != null) {
                }
                P8.a aVar22 = P8.a.f8180a;
                System.currentTimeMillis();
                n nVar2 = new n(eVar.f10207b, eVar.f10206a, pVarArr3, aVar22, 0);
                arrayList = eVar.f10208c;
                if (arrayList != null) {
                }
                str = eVar.f10209d;
                if (str != null) {
                }
                nVar2.b(o.f8240d, Integer.valueOf(eVar.f10210e.intValue() + i112));
                nVar2.b(o.f8235A, "]z" + eVar.j);
                return nVar2;
            }
        } catch (f e13) {
            e = e13;
            i7 = 0;
            i10 = i7;
            pVarArr2 = pVarArr;
            fVar = e;
            e = null;
            if (eVar == null) {
            }
            int i1122 = i10;
            pVarArr3 = pVarArr2;
            if (enumMap != null) {
            }
            P8.a aVar222 = P8.a.f8180a;
            System.currentTimeMillis();
            n nVar22 = new n(eVar.f10207b, eVar.f10206a, pVarArr3, aVar222, 0);
            arrayList = eVar.f10208c;
            if (arrayList != null) {
            }
            str = eVar.f10209d;
            if (str != null) {
            }
            nVar22.b(o.f8240d, Integer.valueOf(eVar.f10210e.intValue() + i1122));
            nVar22.b(o.f8235A, "]z" + eVar.j);
            return nVar22;
        } catch (j e14) {
            e = e14;
            i7 = 0;
            i10 = i7;
            pVarArr2 = pVarArr;
            fVar = null;
            if (eVar == null) {
            }
            int i11222 = i10;
            pVarArr3 = pVarArr2;
            if (enumMap != null) {
            }
            P8.a aVar2222 = P8.a.f8180a;
            System.currentTimeMillis();
            n nVar222 = new n(eVar.f10207b, eVar.f10206a, pVarArr3, aVar2222, 0);
            arrayList = eVar.f10208c;
            if (arrayList != null) {
            }
            str = eVar.f10209d;
            if (str != null) {
            }
            nVar222.b(o.f8240d, Integer.valueOf(eVar.f10210e.intValue() + i11222));
            nVar222.b(o.f8235A, "]z" + eVar.j);
            return nVar222;
        }
        if (eVar == null) {
            try {
                a a10 = aVar.a(true);
                pVarArr2 = a10.f8701b;
                i10 = a10.f8705f;
                eVar = new Object().a(a10);
            } catch (f | j e15) {
                if (e != null) {
                    throw e;
                }
                if (fVar != null) {
                    throw fVar;
                }
                throw e15;
            }
        }
        int i112222 = i10;
        pVarArr3 = pVarArr2;
        if (enumMap != null && (qVar = (q) enumMap.get(d.f8204x)) != null) {
            for (p pVar : pVarArr3) {
                qVar.a(pVar);
            }
        }
        P8.a aVar22222 = P8.a.f8180a;
        System.currentTimeMillis();
        n nVar2222 = new n(eVar.f10207b, eVar.f10206a, pVarArr3, aVar22222, 0);
        arrayList = eVar.f10208c;
        if (arrayList != null) {
            nVar2222.b(o.f8238b, arrayList);
        }
        str = eVar.f10209d;
        if (str != null) {
            nVar2222.b(o.f8239c, str);
        }
        nVar2222.b(o.f8240d, Integer.valueOf(eVar.f10210e.intValue() + i112222));
        nVar2222.b(o.f8235A, "]z" + eVar.j);
        return nVar2222;
    }

    @Override // P8.l
    public final void reset() {
    }
}
