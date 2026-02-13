package i9;

import h9.AbstractC1263a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1349a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18463a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i7 = -1;
        for (Map.Entry entry : this.f18463a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i7) {
                i7 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i7) {
                arrayList.add(entry.getKey());
            }
        }
        return AbstractC1263a.a(arrayList);
    }

    public final void b(int i7) {
        HashMap hashMap = this.f18463a;
        Integer num = (Integer) hashMap.get(Integer.valueOf(i7));
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() + 1));
    }
}
