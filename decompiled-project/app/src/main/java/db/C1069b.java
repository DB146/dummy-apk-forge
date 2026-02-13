package db;

import N6.E0;
import N6.r;
import N6.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.C1623u;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1069b implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16622b;

    public /* synthetic */ C1069b(Map map, int i7) {
        this.f16621a = i7;
        this.f16622b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
            default:
                this.f16622b.clear();
                return;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f16621a) {
            case 0:
                if (obj instanceof Class) {
                    return ((y0) this.f16622b).containsKey(((Class) obj).getName());
                }
                throw new IllegalArgumentException("Key must be a class");
            default:
                return obj != null && this.f16622b.containsKey(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r4.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L22;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsValue(Object obj) {
        switch (this.f16621a) {
            case 0:
                return ((y0) this.f16622b).containsValue(obj);
            default:
                Iterator it = ((E0) entrySet()).iterator();
                it.getClass();
                break;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
            default:
                return r.j(this.f16622b.entrySet(), new C1623u(1));
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f16621a) {
            case 1:
                return obj != null && r.h(obj, this);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        switch (this.f16621a) {
            case 0:
                if (!(obj instanceof Class)) {
                    throw new IllegalArgumentException("Key must be a class");
                }
                return ((y0) this.f16622b).get(((Class) obj).getName());
            default:
                if (obj == null) {
                    return null;
                }
                return (List) this.f16622b.get(obj);
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f16621a) {
            case 1:
                return r.m(entrySet());
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f16621a) {
            case 0:
                return ((y0) this.f16622b).isEmpty();
            default:
                Map map = this.f16622b;
                if (map.isEmpty()) {
                    return true;
                }
                return map.size() == 1 && map.containsKey(null);
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
            default:
                return r.j(this.f16622b.keySet(), new C1623u(0));
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
            default:
                return this.f16622b.put(obj, obj2);
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
            default:
                this.f16622b.putAll(map);
                return;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f16621a) {
            case 0:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
            default:
                return this.f16622b.remove(obj);
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f16621a) {
            case 0:
                return ((y0) this.f16622b).f7374f;
            default:
                Map map = this.f16622b;
                return map.size() - (map.containsKey(null) ? 1 : 0);
        }
    }

    public String toString() {
        switch (this.f16621a) {
            case 1:
                return this.f16622b.toString();
            default:
                return super.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f16621a) {
            case 0:
                return ((y0) this.f16622b).values();
            default:
                return this.f16622b.values();
        }
    }
}
