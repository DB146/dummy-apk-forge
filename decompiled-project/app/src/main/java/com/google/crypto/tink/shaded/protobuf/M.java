package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class M {
    public static void a(Object obj) {
        A3.c.p(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        L l10 = (L) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (l10.isEmpty()) {
            return;
        }
        Iterator it = l10.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((L) obj).f15724a;
    }

    public static L d(Object obj, Object obj2) {
        L l10 = (L) obj;
        L l11 = (L) obj2;
        if (!l11.isEmpty()) {
            if (!l10.f15724a) {
                l10 = l10.c();
            }
            l10.b();
            if (!l11.isEmpty()) {
                l10.putAll(l11);
            }
        }
        return l10;
    }

    public static L e() {
        return L.f15723b.c();
    }
}
