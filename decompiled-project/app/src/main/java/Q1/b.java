package Q1;

import Eb.B;
import Eb.o;
import Eb.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8603a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.a f8604b;

    public b(LinkedHashMap linkedHashMap, boolean z8) {
        this.f8603a = linkedHashMap;
        this.f8604b = new O1.a(z8);
    }

    public /* synthetic */ b(boolean z8) {
        this(new LinkedHashMap(), z8);
    }

    public final Map a() {
        Db.j jVar;
        Set<Map.Entry> entrySet = this.f8603a.entrySet();
        int F10 = B.F(p.S(entrySet, 10));
        if (F10 < 16) {
            F10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F10);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                l.d(copyOf, "copyOf(this, size)");
                jVar = new Db.j(key, copyOf);
            } else {
                jVar = new Db.j(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jVar.f3354a, jVar.f3355b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f8604b.f7420a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(g key) {
        l.e(key, "key");
        Object obj = this.f8603a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(g key, Object obj) {
        l.e(key, "key");
        b();
        LinkedHashMap linkedHashMap = this.f8603a;
        if (obj == null) {
            b();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(o.w0((Set) obj));
            l.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            l.d(copyOf, "copyOf(this, size)");
            linkedHashMap.put(key, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z8;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        LinkedHashMap linkedHashMap = bVar.f8603a;
        LinkedHashMap linkedHashMap2 = this.f8603a;
        if (linkedHashMap == linkedHashMap2) {
            return true;
        }
        if (linkedHashMap.size() != linkedHashMap2.size()) {
            return false;
        }
        LinkedHashMap linkedHashMap3 = bVar.f8603a;
        if (!linkedHashMap3.isEmpty()) {
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                Object obj2 = linkedHashMap2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z8 = l.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z8 = true;
                    }
                    if (z8) {
                        return false;
                    }
                }
                z8 = false;
                if (z8) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f8603a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i7 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i7;
    }

    public final String toString() {
        return o.d0(this.f8603a.entrySet(), ",\n", "{\n", "\n}", a.f8602a, 24);
    }
}
