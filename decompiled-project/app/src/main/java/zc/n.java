package zc;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f28389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28391c;

    public n(int i7, int i10, int i11) {
        this.f28391c = i11;
        this.f28389a = i7;
        this.f28390b = i10;
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        int f02;
        xc.l lVar3 = lVar2.f26368a;
        if (lVar3 == null || (lVar3 instanceof xc.g)) {
            return false;
        }
        switch (this.f28391c) {
            case 0:
                f02 = lVar2.f0() + 1;
                break;
            case 1:
                xc.l lVar4 = lVar2.f26368a;
                f02 = lVar4 == null ? 0 : lVar4.c0().size() - lVar2.f0();
                break;
            case 2:
                f02 = 0;
                if (lVar2.f26368a != null) {
                    for (xc.l lVar5 = lVar2; lVar5 != null; lVar5 = lVar5.L()) {
                        if (lVar5.f26349d.f27658c.equals(lVar2.f26349d.f27658c)) {
                            f02++;
                        }
                    }
                    break;
                }
                break;
            default:
                xc.l lVar6 = lVar2.f26368a;
                f02 = 0;
                if (lVar6 != null) {
                    int size = lVar6.f26350e.size();
                    int i7 = 0;
                    while (f02 < size) {
                        xc.q qVar = (xc.q) ((ArrayList) lVar6.G()).get(f02);
                        if (qVar.P().equals(lVar2.f26349d.f27658c)) {
                            i7++;
                        }
                        if (qVar == lVar2) {
                            f02 = i7;
                            break;
                        } else {
                            f02++;
                        }
                    }
                    f02 = i7;
                }
                break;
        }
        int i10 = this.f28390b;
        int i11 = this.f28389a;
        if (i11 == 0) {
            return f02 == i10;
        }
        int i12 = f02 - i10;
        return i12 * i11 >= 0 && i12 % i11 == 0;
    }

    public String toString() {
        String str;
        int i7 = this.f28390b;
        int i10 = this.f28389a;
        String str2 = i10 == 0 ? ":%s(%3$d)" : i7 == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
        switch (this.f28391c) {
            case 0:
                str = "nth-child";
                break;
            case 1:
                str = "nth-last-child";
                break;
            case 2:
                str = "nth-last-of-type";
                break;
            default:
                str = "nth-of-type";
                break;
        }
        return String.format(str2, str, Integer.valueOf(i10), Integer.valueOf(i7));
    }
}
