package S;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements List, Sb.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8955b;

    /* renamed from: c, reason: collision with root package name */
    public int f8956c;

    public c(List list, int i7, int i10) {
        this.f8954a = list;
        this.f8955b = i7;
        this.f8956c = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f8954a.add(i7 + this.f8955b, obj);
        this.f8956c++;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7 = this.f8956c;
        this.f8956c = i7 + 1;
        this.f8954a.add(i7, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        this.f8954a.addAll(i7 + this.f8955b, collection);
        int size = collection.size();
        this.f8956c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f8954a.addAll(this.f8956c, collection);
        int size = collection.size();
        this.f8956c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7 = this.f8956c - 1;
        int i10 = this.f8955b;
        if (i10 <= i7) {
            while (true) {
                this.f8954a.remove(i7);
                if (i7 == i10) {
                    break;
                } else {
                    i7--;
                }
            }
        }
        this.f8956c = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i7 = this.f8956c;
        for (int i10 = this.f8955b; i10 < i7; i10++) {
            if (l.a(this.f8954a.get(i10), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i7) {
        f.a(i7, this);
        return this.f8954a.get(i7 + this.f8955b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i7 = this.f8956c;
        int i10 = this.f8955b;
        for (int i11 = i10; i11 < i7; i11++) {
            if (l.a(this.f8954a.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8956c == this.f8955b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7 = this.f8956c - 1;
        int i10 = this.f8955b;
        if (i10 > i7) {
            return -1;
        }
        while (!l.a(this.f8954a.get(i7), obj)) {
            if (i7 == i10) {
                return -1;
            }
            i7--;
        }
        return i7 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new d(i7, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i7) {
        f.a(i7, this);
        this.f8956c--;
        return this.f8954a.remove(i7 + this.f8955b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7 = this.f8956c;
        for (int i10 = this.f8955b; i10 < i7; i10++) {
            ?? r22 = this.f8954a;
            if (l.a(r22.get(i10), obj)) {
                r22.remove(i10);
                this.f8956c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7 = this.f8956c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i7 != this.f8956c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7 = this.f8956c;
        int i10 = i7 - 1;
        int i11 = this.f8955b;
        if (i11 <= i10) {
            while (true) {
                ?? r32 = this.f8954a;
                if (!collection.contains(r32.get(i10))) {
                    r32.remove(i10);
                    this.f8956c--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        return i7 != this.f8956c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        f.a(i7, this);
        return this.f8954a.set(i7 + this.f8955b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8956c - this.f8955b;
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
