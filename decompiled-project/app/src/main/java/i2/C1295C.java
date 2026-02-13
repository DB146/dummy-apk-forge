package i2;

import java.util.ArrayList;

/* renamed from: i2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295C extends AbstractC1297E {
    @Override // i2.AbstractC1297E
    public final Number a(C1322j c1322j) {
        ArrayList arrayList = this.f18209a;
        if (arrayList.size() != 2) {
            throw new RuntimeException("Must use two marker values for direct mapping");
        }
        if (((C1294B) arrayList.get(0)).f18206a != ((C1294B) arrayList.get(1)).f18206a) {
            throw new RuntimeException("Marker value must use same Property for direct mapping");
        }
        throw h3.o.i(0, arrayList);
    }

    @Override // i2.AbstractC1297E
    public final float b(C1322j c1322j) {
        ArrayList arrayList = this.f18209a;
        if (arrayList.size() <= 0) {
            return 1.0f;
        }
        throw h3.o.i(0, arrayList);
    }
}
