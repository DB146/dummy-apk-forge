package J8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: J8.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0370z extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.l();
        while (aVar.W()) {
            try {
                arrayList.add(Integer.valueOf(aVar.b0()));
            } catch (NumberFormatException e2) {
                throw new Db.d(4, e2);
            }
        }
        aVar.P();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.n();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i7 = 0; i7 < length; i7++) {
            bVar.c0(r6.get(i7));
        }
        bVar.P();
    }
}
