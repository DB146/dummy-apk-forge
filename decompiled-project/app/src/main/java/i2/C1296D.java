package i2;

import java.util.ArrayList;

/* renamed from: i2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296D extends AbstractC1297E {
    @Override // i2.AbstractC1297E
    public final Number a(C1322j c1322j) {
        ArrayList arrayList = this.f18209a;
        if (arrayList.size() != 2) {
            throw new RuntimeException("Must use two marker values for direct mapping");
        }
        if (((C1294B) arrayList.get(0)).f18206a != ((C1294B) arrayList.get(1)).f18206a) {
            throw new RuntimeException("Marker value must use same Property for direct mapping");
        }
        int a9 = ((C1294B) arrayList.get(0)).a(c1322j);
        int a10 = ((C1294B) arrayList.get(1)).a(c1322j);
        if (a9 > a10) {
            a10 = a9;
            a9 = a10;
        }
        C1303K c1303k = ((C1294B) arrayList.get(0)).f18206a;
        c1303k.getClass();
        int i7 = c1322j.f18269c[c1303k.f18219a];
        return i7 < a9 ? Integer.valueOf(a9) : i7 > a10 ? Integer.valueOf(a10) : Integer.valueOf(i7);
    }

    @Override // i2.AbstractC1297E
    public final float b(C1322j c1322j) {
        float f4;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f18209a;
            if (i7 >= arrayList.size()) {
                return 1.0f;
            }
            C1294B c1294b = (C1294B) arrayList.get(i7);
            int i13 = c1294b.f18206a.f18219a;
            int a9 = c1294b.a(c1322j);
            int i14 = c1322j.f18269c[i13];
            if (i7 == 0) {
                if (i14 >= a9) {
                    return 0.0f;
                }
            } else {
                if (i10 == i13 && i11 < a9) {
                    throw new IllegalStateException("marker value of same variable must be descendant order");
                }
                if (i14 == Integer.MAX_VALUE) {
                    return c(i7, (i11 - i12) / 0.0f);
                }
                if (i14 >= a9) {
                    if (i10 == i13) {
                        f4 = (i11 - i14) / (i11 - a9);
                    } else if (i12 != Integer.MIN_VALUE) {
                        int i15 = (i14 - i12) + i11;
                        f4 = (i15 - i14) / (i15 - a9);
                    } else {
                        f4 = 1.0f - ((i14 - a9) / 0.0f);
                    }
                    return c(i7, f4);
                }
            }
            i7++;
            i11 = a9;
            i10 = i13;
            i12 = i14;
        }
    }
}
