package A9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class T1 extends V1 {
    @Override // A9.V1
    public final Number a(C0115n0 c0115n0) {
        ArrayList arrayList = this.f986a;
        if (arrayList.size() != 2) {
            throw new RuntimeException("Must use two marker values for direct mapping");
        }
        if (((S1) arrayList.get(0)).f958a != ((S1) arrayList.get(1)).f958a) {
            throw new RuntimeException("Marker value must use same Property for direct mapping");
        }
        throw h3.o.i(0, arrayList);
    }

    @Override // A9.V1
    public final float b(C0115n0 c0115n0) {
        ArrayList arrayList = this.f986a;
        if (arrayList.size() <= 0) {
            return 1.0f;
        }
        throw h3.o.i(0, arrayList);
    }
}
