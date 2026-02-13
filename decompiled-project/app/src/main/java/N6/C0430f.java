package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: N6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0430f extends W {

    /* renamed from: b, reason: collision with root package name */
    public final Map f7291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f7292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430f(p0 p0Var, Map map) {
        super(1);
        this.f7292c = p0Var;
        map.getClass();
        this.f7291b = map;
    }

    @Override // N6.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0426d c0426d = (C0426d) it;
            if (!c0426d.hasNext()) {
                return;
            }
            c0426d.next();
            c0426d.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7291b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f7291b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f7291b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7291b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7291b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0426d(this, this.f7291b.entrySet().iterator());
    }

    @Override // N6.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f7291b.remove(obj);
        if (collection != null) {
            i7 = collection.size();
            collection.clear();
            this.f7292c.f7330e -= i7;
        } else {
            i7 = 0;
        }
        return i7 > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7291b.size();
    }
}
