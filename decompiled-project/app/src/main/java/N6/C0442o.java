package N6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: N6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442o extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7323a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7324b;

    public /* synthetic */ C0442o(int i7, Serializable serializable) {
        this.f7323a = i7;
        this.f7324b = serializable;
    }

    public C0442o(C0428e c0428e) {
        this.f7323a = 3;
        this.f7324b = c0428e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7323a) {
            case 0:
                ((p0) this.f7324b).c();
                return;
            case 1:
                ((C0448v) this.f7324b).clear();
                return;
            case 2:
                ((l0) this.f7324b).clear();
                return;
            default:
                ((C0428e) this.f7324b).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f7323a) {
            case 0:
                return ((p0) this.f7324b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((l0) this.f7324b).containsValue(obj);
            case 3:
                return ((C0428e) this.f7324b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f7323a) {
            case 2:
                return ((l0) this.f7324b).isEmpty();
            case 3:
                return ((C0428e) this.f7324b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7323a) {
            case 0:
                return new C0422b((p0) this.f7324b);
            case 1:
                C0448v c0448v = (C0448v) this.f7324b;
                Map c10 = c0448v.c();
                return c10 != null ? c10.values().iterator() : new C0445s(c0448v, 2);
            case 2:
                return new S((l0) this.f7324b, 2);
            default:
                return new I7.e(((C0428e) this.f7324b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f7323a) {
            case 3:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0428e c0428e = (C0428e) this.f7324b;
                    for (Map.Entry entry : c0428e.entrySet()) {
                        if (O5.b.o(obj, entry.getValue())) {
                            c0428e.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f7323a) {
            case 3:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0428e c0428e = (C0428e) this.f7324b;
                    for (Map.Entry entry : c0428e.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0428e.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f7323a) {
            case 3:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0428e c0428e = (C0428e) this.f7324b;
                    for (Map.Entry entry : c0428e.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0428e.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f7323a) {
            case 0:
                return ((p0) this.f7324b).f7330e;
            case 1:
                return ((C0448v) this.f7324b).size();
            case 2:
                return ((l0) this.f7324b).size();
            default:
                return ((C0428e) this.f7324b).f7289c.size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        switch (this.f7323a) {
            case 2:
                return l0.a(this).toArray();
            default:
                return super.toArray();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        switch (this.f7323a) {
            case 2:
                return l0.a(this).toArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }
}
