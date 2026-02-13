package l4;

import Y3.d;
import android.util.SparseArray;
import h3.o;
import java.util.HashMap;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1485a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f19258a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19259b;

    static {
        HashMap hashMap = new HashMap();
        f19259b = hashMap;
        hashMap.put(d.f11149a, 0);
        hashMap.put(d.f11150b, 1);
        hashMap.put(d.f11151c, 2);
        for (d dVar : hashMap.keySet()) {
            f19258a.append(((Integer) f19259b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f19259b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f19258a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o.l(i7, "Unknown Priority for value "));
    }
}
