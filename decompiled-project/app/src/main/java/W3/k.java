package W3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10611a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f10612b;

    /* renamed from: c, reason: collision with root package name */
    public long f10613c;

    public k(long j) {
        this.f10612b = j;
    }

    public final synchronized Object a(Object obj) {
        j jVar;
        jVar = (j) this.f10611a.get(obj);
        return jVar != null ? jVar.f10609a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int b2 = b(obj2);
        long j = b2;
        if (j >= this.f10612b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f10613c += j;
        }
        j jVar = (j) this.f10611a.put(obj, obj2 == null ? null : new j(obj2, b2));
        if (jVar != null) {
            this.f10613c -= jVar.f10610b;
            if (!jVar.f10609a.equals(obj2)) {
                c(obj, jVar.f10609a);
            }
        }
        e(this.f10612b);
        return jVar != null ? jVar.f10609a : null;
    }

    public final synchronized void e(long j) {
        while (this.f10613c > j) {
            Iterator it = this.f10611a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getValue();
            this.f10613c -= jVar.f10610b;
            Object key = entry.getKey();
            it.remove();
            c(key, jVar.f10609a);
        }
    }
}
