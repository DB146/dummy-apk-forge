package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Y extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13365f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f13366a;

    /* renamed from: b, reason: collision with root package name */
    public Map f13367b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13368c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f13369d;

    /* renamed from: e, reason: collision with root package name */
    public Map f13370e;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.Y, java.util.AbstractMap] */
    public static Y f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f13366a = Collections.emptyList();
        abstractMap.f13367b = Collections.emptyMap();
        abstractMap.f13370e = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f13366a.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f13366a.get(i10)).f13371a);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f13366a.get(i12)).f13371a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i7 = i11 + 1;
        return -i7;
    }

    public final void b() {
        if (this.f13368c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f13366a.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f13366a.isEmpty()) {
            this.f13366a.clear();
        }
        if (this.f13367b.isEmpty()) {
            return;
        }
        this.f13367b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f13367b.containsKey(comparable);
    }

    public final Set d() {
        return this.f13367b.isEmpty() ? Collections.emptySet() : this.f13367b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f13367b.isEmpty() && !(this.f13367b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13367b = treeMap;
            this.f13370e = treeMap.descendingMap();
        }
        return (SortedMap) this.f13367b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13369d == null) {
            this.f13369d = new b0(this, 0);
        }
        return this.f13369d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y10 = (Y) obj;
        int size = size();
        if (size != y10.size()) {
            return false;
        }
        int size2 = this.f13366a.size();
        if (size2 != y10.f13366a.size()) {
            return ((AbstractSet) entrySet()).equals(y10.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(y10.c(i7))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f13367b.equals(y10.f13367b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a9 = a(comparable);
        if (a9 >= 0) {
            return ((Z) this.f13366a.get(a9)).setValue(obj);
        }
        b();
        if (this.f13366a.isEmpty() && !(this.f13366a instanceof ArrayList)) {
            this.f13366a = new ArrayList(16);
        }
        int i7 = -(a9 + 1);
        if (i7 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f13366a.size() == 16) {
            Z z8 = (Z) this.f13366a.remove(15);
            e().put(z8.f13371a, z8.f13372b);
        }
        this.f13366a.add(i7, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        return a9 >= 0 ? ((Z) this.f13366a.get(a9)).f13372b : this.f13367b.get(comparable);
    }

    public final Object h(int i7) {
        b();
        Object obj = ((Z) this.f13366a.remove(i7)).f13372b;
        if (!this.f13367b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f13366a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f13366a.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += ((Z) this.f13366a.get(i10)).hashCode();
        }
        return this.f13367b.size() > 0 ? i7 + this.f13367b.hashCode() : i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        if (a9 >= 0) {
            return h(a9);
        }
        if (this.f13367b.isEmpty()) {
            return null;
        }
        return this.f13367b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13367b.size() + this.f13366a.size();
    }
}
