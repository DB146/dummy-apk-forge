package S;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements List, Sb.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f8953a;

    public b(e eVar) {
        this.f8953a = eVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f8953a.a(i7, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f8953a.b(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return this.f8953a.e(i7, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f8953a;
        return eVar.e(eVar.f8961c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8953a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8953a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f8953a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        f.a(i7, this);
        return this.f8953a.f8959a[i7];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f8953a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8953a.f8961c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f8953a;
        Object[] objArr = eVar.f8959a;
        for (int i7 = eVar.f8961c - 1; i7 >= 0; i7--) {
            if (l.a(obj, objArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new d(i7, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        f.a(i7, this);
        return this.f8953a.l(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8953a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f8953a;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i7 = eVar.f8961c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.k(it.next());
        }
        return i7 != eVar.f8961c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f8953a;
        int i7 = eVar.f8961c;
        for (int i10 = i7 - 1; -1 < i10; i10--) {
            if (!collection.contains(eVar.f8959a[i10])) {
                eVar.l(i10);
            }
        }
        return i7 != eVar.f8961c;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        f.a(i7, this);
        Object[] objArr = this.f8953a.f8959a;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8953a.f8961c;
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        f.b(this, i7, i10);
        return new c(this, i7, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }
}
