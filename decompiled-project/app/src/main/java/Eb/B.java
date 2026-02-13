package Eb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class B extends E6.b {
    public static Object E(Object obj, Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        if (map instanceof A) {
            return ((A) map).i();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int F(int i7) {
        return i7 < 0 ? i7 : i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map G(Db.j pair) {
        kotlin.jvm.internal.l.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f3354a, pair.f3355b);
        kotlin.jvm.internal.l.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map H(Db.j... jVarArr) {
        if (jVarArr.length <= 0) {
            return w.f3892a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(jVarArr.length));
        J(linkedHashMap, jVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap I(Db.j... jVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(jVarArr.length));
        J(linkedHashMap, jVarArr);
        return linkedHashMap;
    }

    public static final void J(HashMap hashMap, Db.j[] jVarArr) {
        for (Db.j jVar : jVarArr) {
            hashMap.put(jVar.f3354a, jVar.f3355b);
        }
    }

    public static Map K(ArrayList arrayList) {
        w wVar = w.f3892a;
        int size = arrayList.size();
        if (size == 0) {
            return wVar;
        }
        if (size == 1) {
            return G((Db.j) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Db.j jVar = (Db.j) it.next();
            linkedHashMap.put(jVar.f3354a, jVar.f3355b);
        }
        return linkedHashMap;
    }

    public static Map L(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return w.f3892a;
        }
        if (size != 1) {
            return M(map);
        }
        kotlin.jvm.internal.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.l.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap M(Map map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
