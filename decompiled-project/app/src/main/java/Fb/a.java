package Fb;

import A0.C0028q;
import Eb.n;
import Z9.x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a extends Eb.h implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4181b;

    /* renamed from: c, reason: collision with root package name */
    public int f4182c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4183d;

    /* renamed from: e, reason: collision with root package name */
    public final b f4184e;

    public a(Object[] backing, int i7, int i10, a aVar, b root) {
        l.e(backing, "backing");
        l.e(root, "root");
        this.f4180a = backing;
        this.f4181b = i7;
        this.f4182c = i10;
        this.f4183d = aVar;
        this.f4184e = root;
        ((AbstractList) this).modCount = b.t(root);
    }

    public final void C() {
        if (b.t(this.f4184e) != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void D() {
        if (this.f4184e.f4188c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object E(int i7) {
        Object E10;
        ((AbstractList) this).modCount++;
        a aVar = this.f4183d;
        if (aVar != null) {
            E10 = aVar.E(i7);
        } else {
            b bVar = b.f4185d;
            E10 = this.f4184e.E(i7);
        }
        this.f4182c--;
        return E10;
    }

    public final void F(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f4183d;
        if (aVar != null) {
            aVar.F(i7, i10);
        } else {
            b bVar = b.f4185d;
            this.f4184e.F(i7, i10);
        }
        this.f4182c -= i10;
    }

    public final int G(int i7, int i10, Collection collection, boolean z8) {
        int G9;
        a aVar = this.f4183d;
        if (aVar != null) {
            G9 = aVar.G(i7, i10, collection, z8);
        } else {
            b bVar = b.f4185d;
            G9 = this.f4184e.G(i7, i10, collection, z8);
        }
        if (G9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4182c -= G9;
        return G9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        D();
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        z(this.f4181b + i7, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        D();
        C();
        z(this.f4181b + this.f4182c, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        l.e(elements, "elements");
        D();
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        int size = elements.size();
        y(this.f4181b + i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        l.e(elements, "elements");
        D();
        C();
        int size = elements.size();
        y(this.f4181b + this.f4182c, elements, size);
        return size > 0;
    }

    @Override // Eb.h
    public final int b() {
        C();
        return this.f4182c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        D();
        C();
        F(this.f4181b, this.f4182c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C();
        if (obj != this) {
            if (obj instanceof List) {
                if (x.a(this.f4180a, this.f4181b, this.f4182c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return this.f4180a[this.f4181b + i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        C();
        Object[] objArr = this.f4180a;
        int i7 = this.f4182c;
        int i10 = 1;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[this.f4181b + i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        C();
        for (int i7 = 0; i7 < this.f4182c; i7++) {
            if (l.a(this.f4180a[this.f4181b + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        C();
        return this.f4182c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        C();
        for (int i7 = this.f4182c - 1; i7 >= 0; i7--) {
            if (l.a(this.f4180a[this.f4181b + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return new C0028q(this, i7);
    }

    @Override // Eb.h
    public final Object o(int i7) {
        D();
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return E(this.f4181b + i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        D();
        C();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            o(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        l.e(elements, "elements");
        D();
        C();
        return G(this.f4181b, this.f4182c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        l.e(elements, "elements");
        D();
        C();
        return G(this.f4181b, this.f4182c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        D();
        C();
        int i10 = this.f4182c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f4180a;
        int i11 = this.f4181b;
        Object obj2 = objArr[i11 + i7];
        objArr[i11 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        tc.b.n(i7, i10, this.f4182c);
        return new a(this.f4180a, this.f4181b + i7, i10 - i7, this, this.f4184e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        C();
        Object[] objArr = this.f4180a;
        int i7 = this.f4182c;
        int i10 = this.f4181b;
        return n.T(objArr, i10, i7 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        l.e(array, "array");
        C();
        int length = array.length;
        int i7 = this.f4182c;
        int i10 = this.f4181b;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4180a, i10, i7 + i10, array.getClass());
            l.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        n.P(this.f4180a, 0, array, i10, i7 + i10);
        int i11 = this.f4182c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C();
        return x.b(this.f4180a, this.f4181b, this.f4182c, this);
    }

    public final void y(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        b bVar = this.f4184e;
        a aVar = this.f4183d;
        if (aVar != null) {
            aVar.y(i7, collection, i10);
        } else {
            b bVar2 = b.f4185d;
            bVar.y(i7, collection, i10);
        }
        this.f4180a = bVar.f4186a;
        this.f4182c += i10;
    }

    public final void z(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f4184e;
        a aVar = this.f4183d;
        if (aVar != null) {
            aVar.z(i7, obj);
        } else {
            b bVar2 = b.f4185d;
            bVar.z(i7, obj);
        }
        this.f4180a = bVar.f4186a;
        this.f4182c++;
    }
}
