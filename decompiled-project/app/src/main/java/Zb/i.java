package Zb;

import A9.N2;
import Eb.t;
import Eb.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class i extends O5.b {
    public static g M(Iterator it) {
        l.e(it, "<this>");
        return new a(new t(it, 2));
    }

    public static g N(Object obj, Rb.c cVar) {
        return obj == null ? d.f12339a : new Ob.h(new N2(obj, 20), cVar);
    }

    public static String O(g gVar, String str) {
        l.e(gVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i7 = 0;
        for (Object obj : gVar) {
            i7++;
            if (i7 > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.d.b(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static List P(g gVar) {
        l.e(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return v.f3891a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return u0.x(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
