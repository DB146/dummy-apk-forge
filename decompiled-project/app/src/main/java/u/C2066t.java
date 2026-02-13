package u;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.AbstractC2121a;
import v.C2122b;
import v.C2123c;

/* renamed from: u.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2066t {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C2122b lock;
    private final C2123c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, v.b] */
    public C2066t(int i7) {
        this.maxSize = i7;
        if (i7 <= 0) {
            AbstractC2121a.c("maxSize <= 0");
            throw null;
        }
        this.map = new C2123c();
        this.lock = new Object();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.l.e(message, "message");
        throw new IllegalStateException(message);
    }

    public Object create(Object key) {
        kotlin.jvm.internal.l.e(key, "key");
        return null;
    }

    public final int createCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.createCount;
        }
        return i7;
    }

    public void entryRemoved(boolean z8, Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.evictionCount;
        }
        return i7;
    }

    public final Object get(Object key) {
        Object put;
        kotlin.jvm.internal.l.e(key, "key");
        synchronized (this.lock) {
            C2123c c2123c = this.map;
            c2123c.getClass();
            Object obj = c2123c.f24924a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    put = this.map.f24924a.put(key, create);
                    if (put != null) {
                        this.map.f24924a.put(key, put);
                    } else {
                        this.size += a(key, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, key, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.hitCount;
        }
        return i7;
    }

    public final int maxSize() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final int missCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.missCount;
        }
        return i7;
    }

    public final Object put(Object key, Object value) {
        Object put;
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            put = this.map.f24924a.put(key, value);
            if (put != null) {
                this.size -= a(key, put);
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.putCount;
        }
        return i7;
    }

    public final Object remove(Object key) {
        Object remove;
        kotlin.jvm.internal.l.e(key, "key");
        synchronized (this.lock) {
            C2123c c2123c = this.map;
            c2123c.getClass();
            remove = c2123c.f24924a.remove(key);
            if (remove != null) {
                this.size -= a(key, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(int i7) {
        if (!(i7 > 0)) {
            AbstractC2121a.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i7;
        }
        trimToSize(i7);
    }

    public final int size() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    public int sizeOf(Object key, Object value) {
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set entrySet = this.map.f24924a.entrySet();
            kotlin.jvm.internal.l.d(entrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = this.map.f24924a.entrySet();
            kotlin.jvm.internal.l.d(entrySet2, "<get-entries>(...)");
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i7 = this.hitCount;
                int i10 = this.missCount + i7;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i10 != 0 ? (i7 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0013, B:13:0x0020, B:15:0x0024, B:17:0x002f, B:19:0x0043, B:22:0x0061, B:24:0x0067, B:31:0x004d, B:32:0x0052, B:35:0x005d, B:42:0x0094, B:43:0x009b), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0013, B:13:0x0020, B:15:0x0024, B:17:0x002f, B:19:0x0043, B:22:0x0061, B:24:0x0067, B:31:0x004d, B:32:0x0052, B:35:0x005d, B:42:0x0094, B:43:0x009b), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[EDGE_INSN: B:41:0x0094->B:42:0x0094 BREAK  A[LOOP:0: B:1:0x0000->B:26:0x008d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i7) {
        boolean z8;
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f24924a.isEmpty() && this.size != 0)) {
                        z8 = false;
                        if (!z8) {
                            if (this.size <= i7 || this.map.f24924a.isEmpty()) {
                                break;
                            }
                            Set entrySet = this.map.f24924a.entrySet();
                            kotlin.jvm.internal.l.d(entrySet, "<get-entries>(...)");
                            Set set = entrySet;
                            if (set instanceof List) {
                                List list = (List) set;
                                if (!list.isEmpty()) {
                                    next = list.get(0);
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                        return;
                                    }
                                    key = entry.getKey();
                                    value = entry.getValue();
                                    C2123c c2123c = this.map;
                                    c2123c.getClass();
                                    kotlin.jvm.internal.l.e(key, "key");
                                    c2123c.f24924a.remove(key);
                                    this.size -= a(key, value);
                                    this.evictionCount++;
                                }
                                next = null;
                                entry = (Map.Entry) next;
                                if (entry != null) {
                                }
                            } else {
                                Iterator it = set.iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                    }
                                } else {
                                    next = null;
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    z8 = true;
                    if (!z8) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
