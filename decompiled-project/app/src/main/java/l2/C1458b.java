package l2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19200a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19201b;

    public C1458b(HashMap hashMap) {
        this.f19201b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            r rVar = (r) entry.getValue();
            List list = (List) this.f19200a.get(rVar);
            if (list == null) {
                list = new ArrayList();
                this.f19200a.put(rVar, list);
            }
            list.add((C1459c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1479x interfaceC1479x, r rVar, InterfaceC1478w interfaceC1478w) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1459c c1459c = (C1459c) list.get(size);
                c1459c.getClass();
                try {
                    int i7 = c1459c.f19203a;
                    Method method = c1459c.f19204b;
                    if (i7 == 0) {
                        method.invoke(interfaceC1478w, null);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC1478w, interfaceC1479x);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC1478w, interfaceC1479x, rVar);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
