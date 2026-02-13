package A9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class U1 extends V1 {
    @Override // A9.V1
    public final Number a(C0115n0 c0115n0) {
        ArrayList arrayList = this.f986a;
        if (arrayList.size() != 2) {
            throw new RuntimeException("Must use two marker values for direct mapping");
        }
        if (((S1) arrayList.get(0)).f958a != ((S1) arrayList.get(1)).f958a) {
            throw new RuntimeException("Marker value must use same Property for direct mapping");
        }
        int a9 = ((S1) arrayList.get(0)).a(c0115n0);
        int a10 = ((S1) arrayList.get(1)).a(c0115n0);
        if (a9 > a10) {
            a10 = a9;
            a9 = a10;
        }
        C0125p2 c0125p2 = ((S1) arrayList.get(0)).f958a;
        c0125p2.getClass();
        int i7 = c0115n0.f1293c[c0125p2.f1342a];
        return i7 < a9 ? Integer.valueOf(a9) : i7 > a10 ? Integer.valueOf(a10) : Integer.valueOf(i7);
    }

    @Override // A9.V1
    public final float b(C0115n0 c0115n0) {
        float c10;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f986a;
            if (i7 >= arrayList.size()) {
                return 1.0f;
            }
            S1 s12 = (S1) arrayList.get(i7);
            int i13 = s12.f958a.f1342a;
            int a9 = s12.a(c0115n0);
            int i14 = c0115n0.f1293c[i13];
            if (i7 == 0) {
                if (i14 >= a9) {
                    return 0.0f;
                }
            } else {
                if (i10 == i13 && i11 < a9) {
                    throw new IllegalStateException("marker value of same variable must be descendant order");
                }
                if (i14 == Integer.MAX_VALUE) {
                    return c(i7, (i11 - i12) / c0115n0.c());
                }
                if (i14 >= a9) {
                    if (i10 == i13) {
                        c10 = (i11 - i14) / (i11 - a9);
                    } else if (i12 != Integer.MIN_VALUE) {
                        int i15 = (i14 - i12) + i11;
                        c10 = (i15 - i14) / (i15 - a9);
                    } else {
                        c10 = 1.0f - ((i14 - a9) / c0115n0.c());
                    }
                    return c(i7, c10);
                }
            }
            i7++;
            i11 = a9;
            i10 = i13;
            i12 = i14;
        }
    }
}
