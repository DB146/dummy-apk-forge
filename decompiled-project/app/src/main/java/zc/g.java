package zc;

import java.util.ArrayList;
import java.util.List;
import yc.F;
import yc.H;

/* loaded from: classes2.dex */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f28378b = false;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28379a;

    public /* synthetic */ g(int i7) {
        this.f28379a = i7;
    }

    @Override // zc.p
    public int a() {
        switch (this.f28379a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [xc.q] */
    /* JADX WARN: Type inference failed for: r8v16, types: [xc.q] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // zc.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(xc.l lVar, xc.l lVar2) {
        ArrayList arrayList;
        switch (this.f28379a) {
            case 0:
                return true;
            case 1:
                for (xc.q H10 = lVar2.H(); H10 != null; H10 = H10.M()) {
                    if (H10 instanceof xc.x) {
                        if (!wc.l.f(((xc.x) H10).Z())) {
                            return false;
                        }
                    } else if (!(H10 instanceof xc.d) && !(H10 instanceof xc.y) && !(H10 instanceof xc.h)) {
                        return false;
                    }
                }
                return true;
            case 2:
                xc.l lVar3 = lVar2.f26368a;
                return (lVar3 == null || (lVar3 instanceof xc.g) || lVar2 != lVar3.h0()) ? false : true;
            case 3:
                xc.l lVar4 = lVar2.f26368a;
                if (lVar4 != null && !(lVar4 instanceof xc.g)) {
                    int C2 = lVar4.C();
                    xc.l lVar5 = null;
                    xc.l lVar6 = C2 == 0 ? 0 : (xc.q) ((ArrayList) lVar4.G()).get(C2 - 1);
                    while (true) {
                        if (lVar6 != 0) {
                            if (lVar6 instanceof xc.l) {
                                lVar5 = lVar6;
                            } else {
                                lVar6 = lVar6.U();
                            }
                        }
                    }
                    if (lVar2 == lVar5) {
                        return true;
                    }
                }
                return false;
            case 4:
                xc.l lVar7 = lVar2.f26368a;
                if (lVar7 == null || (lVar7 instanceof xc.g)) {
                    return false;
                }
                if (lVar7 == null) {
                    arrayList = new ArrayList(0);
                } else {
                    List<xc.l> c02 = lVar7.c0();
                    ArrayList arrayList2 = new ArrayList(c02.size() - 1);
                    for (xc.l lVar8 : c02) {
                        if (lVar8 != lVar2) {
                            arrayList2.add(lVar8);
                        }
                    }
                    arrayList = arrayList2;
                }
                return arrayList.isEmpty();
            case 5:
                xc.l lVar9 = lVar2.f26368a;
                if (lVar9 == null || (lVar9 instanceof xc.g)) {
                    return false;
                }
                int i7 = 0;
                for (xc.l h02 = lVar9.h0(); h02 != null; h02 = h02.L()) {
                    if (h02.f26349d.f27658c.equals(lVar2.f26349d.f27658c)) {
                        i7++;
                    }
                    if (i7 > 1) {
                        return i7 != 1;
                    }
                }
                if (i7 != 1) {
                }
                break;
            case 6:
                if (lVar instanceof xc.g) {
                    lVar = lVar.h0();
                }
                return lVar2 == lVar;
            case 7:
                if (lVar2 instanceof xc.t) {
                    return true;
                }
                for (xc.q qVar : lVar2.g0(xc.x.class)) {
                    F f4 = lVar2.f26349d;
                    String str = f4.f27657b;
                    xc.l lVar10 = new xc.l(new H(H.f27661c).d(str, wc.c.d(str), f4.f27656a, true), lVar2.z(), lVar2.y());
                    qVar.X(lVar10);
                    lVar10.Z(qVar);
                }
                return false;
            default:
                return lVar == lVar2;
        }
    }

    public final String toString() {
        switch (this.f28379a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return ">";
        }
    }
}
