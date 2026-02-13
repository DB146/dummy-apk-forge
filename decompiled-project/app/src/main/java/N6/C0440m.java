package N6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: N6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0440m extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7316a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f7317b;

    /* renamed from: c, reason: collision with root package name */
    public final C0440m f7318c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f7319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f7320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f7321f;

    public C0440m(p0 p0Var, Object obj, List list, C0440m c0440m) {
        this.f7321f = p0Var;
        this.f7320e = p0Var;
        this.f7316a = obj;
        this.f7317b = list;
        this.f7318c = c0440m;
        this.f7319d = c0440m == null ? null : c0440m.f7317b;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        i();
        boolean isEmpty = this.f7317b.isEmpty();
        ((List) this.f7317b).add(i7, obj);
        this.f7321f.f7330e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        boolean isEmpty = this.f7317b.isEmpty();
        boolean add = this.f7317b.add(obj);
        if (add) {
            this.f7320e.f7330e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f7317b).addAll(i7, collection);
        if (addAll) {
            this.f7321f.f7330e += this.f7317b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f7317b.addAll(collection);
        if (addAll) {
            this.f7320e.f7330e += this.f7317b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        C0440m c0440m = this.f7318c;
        if (c0440m != null) {
            c0440m.b();
        } else {
            this.f7320e.f7329d.put(this.f7316a, this.f7317b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f7317b.clear();
        this.f7320e.f7330e -= size;
        o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        i();
        return this.f7317b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        i();
        return this.f7317b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        i();
        return this.f7317b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        i();
        return ((List) this.f7317b).get(i7);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        return this.f7317b.hashCode();
    }

    public final void i() {
        Collection collection;
        C0440m c0440m = this.f7318c;
        if (c0440m != null) {
            c0440m.i();
            if (c0440m.f7317b != this.f7319d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f7317b.isEmpty() || (collection = (Collection) this.f7320e.f7329d.get(this.f7316a)) == null) {
                return;
            }
            this.f7317b = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        i();
        return ((List) this.f7317b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        i();
        return new C0426d(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        return ((List) this.f7317b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        i();
        return new C0439l(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        i();
        return new C0439l(this, i7);
    }

    public final void o() {
        C0440m c0440m = this.f7318c;
        if (c0440m != null) {
            c0440m.o();
        } else if (this.f7317b.isEmpty()) {
            this.f7320e.f7329d.remove(this.f7316a);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        i();
        Object remove = ((List) this.f7317b).remove(i7);
        p0 p0Var = this.f7321f;
        p0Var.f7330e--;
        o();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        boolean remove = this.f7317b.remove(obj);
        if (remove) {
            p0 p0Var = this.f7320e;
            p0Var.f7330e--;
            o();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f7317b.removeAll(collection);
        if (removeAll) {
            this.f7320e.f7330e += this.f7317b.size() - size;
            o();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f7317b.retainAll(collection);
        if (retainAll) {
            this.f7320e.f7330e += this.f7317b.size() - size;
            o();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        i();
        return ((List) this.f7317b).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        i();
        return this.f7317b.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        i();
        List subList = ((List) this.f7317b).subList(i7, i10);
        C0440m c0440m = this.f7318c;
        if (c0440m == null) {
            c0440m = this;
        }
        p0 p0Var = this.f7321f;
        p0Var.getClass();
        boolean z8 = subList instanceof RandomAccess;
        Object obj = this.f7316a;
        return z8 ? new C0440m(p0Var, obj, subList, c0440m) : new C0440m(p0Var, obj, subList, c0440m);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return this.f7317b.toString();
    }
}
