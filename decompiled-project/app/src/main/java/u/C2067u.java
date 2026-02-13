package u;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: u.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2067u implements Map, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2046I f24717a;

    /* renamed from: b, reason: collision with root package name */
    public C2056i f24718b;

    /* renamed from: c, reason: collision with root package name */
    public C2056i f24719c;

    /* renamed from: d, reason: collision with root package name */
    public X f24720d;

    public C2067u(C2046I parent) {
        kotlin.jvm.internal.l.e(parent, "parent");
        this.f24717a = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f24717a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f24717a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2056i c2056i = this.f24718b;
        if (c2056i != null) {
            return c2056i;
        }
        C2056i c2056i2 = new C2056i(this.f24717a, 0);
        this.f24718b = c2056i2;
        return c2056i2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2067u.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f24717a, ((C2067u) obj).f24717a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f24717a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f24717a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f24717a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2056i c2056i = this.f24719c;
        if (c2056i != null) {
            return c2056i;
        }
        C2056i c2056i2 = new C2056i(this.f24717a, 1);
        this.f24719c = c2056i2;
        return c2056i2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24717a.f24607e;
    }

    public final String toString() {
        return this.f24717a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        X x2 = this.f24720d;
        if (x2 != null) {
            return x2;
        }
        X x10 = new X(this.f24717a);
        this.f24720d = x10;
        return x10;
    }
}
