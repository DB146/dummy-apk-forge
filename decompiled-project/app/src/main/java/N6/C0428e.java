package N6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: N6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0428e extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C0424c f7287a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0442o f7288b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f7289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f7290d;

    public C0428e(p0 p0Var, Map map) {
        this.f7290d = p0Var;
        this.f7289c = map;
    }

    public final D a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        p0 p0Var = this.f7290d;
        List list = (List) collection;
        return new D(key, list instanceof RandomAccess ? new C0440m(p0Var, key, list, null) : new C0440m(p0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p0 p0Var = this.f7290d;
        if (this.f7289c == p0Var.f7329d) {
            p0Var.c();
            return;
        }
        C0426d c0426d = new C0426d(this);
        while (c0426d.hasNext()) {
            c0426d.next();
            c0426d.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f7289c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0424c c0424c = this.f7287a;
        if (c0424c != null) {
            return c0424c;
        }
        C0424c c0424c2 = new C0424c(this);
        this.f7287a = c0424c2;
        return c0424c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f7289c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f7289c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        p0 p0Var = this.f7290d;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0440m(p0Var, obj, list, null) : new C0440m(p0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f7289c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        p0 p0Var = this.f7290d;
        Set set = p0Var.f7326a;
        if (set == null) {
            Map map = p0Var.f7329d;
            set = map instanceof NavigableMap ? new C0434h(p0Var, (NavigableMap) map) : map instanceof SortedMap ? new C0438k(p0Var, (SortedMap) map) : new C0430f(p0Var, map);
            p0Var.f7326a = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f7289c.remove(obj);
        if (collection == null) {
            return null;
        }
        p0 p0Var = this.f7290d;
        List list = (List) p0Var.f7331f.get();
        list.addAll(collection);
        p0Var.f7330e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7289c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f7289c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0442o c0442o = this.f7288b;
        if (c0442o != null) {
            return c0442o;
        }
        C0442o c0442o2 = new C0442o(this);
        this.f7288b = c0442o2;
        return c0442o2;
    }
}
