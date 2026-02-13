package Fb;

import A0.C0028q;
import Eb.n;
import Z9.x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b extends Eb.h implements RandomAccess, Serializable {

    /* renamed from: d */
    public static final b f4185d;

    /* renamed from: a */
    public Object[] f4186a;

    /* renamed from: b */
    public int f4187b;

    /* renamed from: c */
    public boolean f4188c;

    static {
        b bVar = new b(0);
        bVar.f4188c = true;
        f4185d = bVar;
    }

    public b(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f4186a = new Object[i7];
    }

    public static final /* synthetic */ int t(b bVar) {
        return ((AbstractList) bVar).modCount;
    }

    public final void C() {
        if (this.f4188c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void D(int i7, int i10) {
        int i11 = this.f4187b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4186a;
        if (i11 > objArr.length) {
            int length = objArr.length;
            int i12 = length + (length >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i12);
            l.d(copyOf, "copyOf(...)");
            this.f4186a = copyOf;
        }
        Object[] objArr2 = this.f4186a;
        n.P(objArr2, i7 + i10, objArr2, i7, this.f4187b);
        this.f4187b += i10;
    }

    public final Object E(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4186a;
        Object obj = objArr[i7];
        n.P(objArr, i7, objArr, i7 + 1, this.f4187b);
        Object[] objArr2 = this.f4186a;
        int i10 = this.f4187b - 1;
        l.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f4187b--;
        return obj;
    }

    public final void F(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4186a;
        n.P(objArr, i7, objArr, i7 + i10, this.f4187b);
        Object[] objArr2 = this.f4186a;
        int i11 = this.f4187b;
        x.N(objArr2, i11 - i10, i11);
        this.f4187b -= i10;
    }

    public final int G(int i7, int i10, Collection collection, boolean z8) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i7 + i11;
            if (collection.contains(this.f4186a[i13]) == z8) {
                Object[] objArr = this.f4186a;
                i11++;
                objArr[i12 + i7] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f4186a;
        n.P(objArr2, i7 + i12, objArr2, i10 + i7, this.f4187b);
        Object[] objArr3 = this.f4186a;
        int i15 = this.f4187b;
        x.N(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4187b -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        C();
        int i10 = this.f4187b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        D(i7, 1);
        this.f4186a[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        C();
        int i7 = this.f4187b;
        ((AbstractList) this).modCount++;
        D(i7, 1);
        this.f4186a[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        l.e(elements, "elements");
        C();
        int i10 = this.f4187b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        int size = elements.size();
        y(i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        l.e(elements, "elements");
        C();
        int size = elements.size();
        y(this.f4187b, elements, size);
        return size > 0;
    }

    @Override // Eb.h
    public final int b() {
        return this.f4187b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C();
        F(0, this.f4187b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!x.a(this.f4186a, 0, this.f4187b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10 = this.f4187b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return this.f4186a[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4186a;
        int i7 = this.f4187b;
        int i10 = 1;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f4187b; i7++) {
            if (l.a(this.f4186a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4187b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f4187b - 1; i7 >= 0; i7--) {
            if (l.a(this.f4186a[i7], obj)) {
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
        int i10 = this.f4187b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return new C0028q(this, i7);
    }

    @Override // Eb.h
    public final Object o(int i7) {
        C();
        int i10 = this.f4187b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        return E(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        C();
        return G(0, this.f4187b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        l.e(elements, "elements");
        C();
        return G(0, this.f4187b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        C();
        int i10 = this.f4187b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f4186a;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        tc.b.n(i7, i10, this.f4187b);
        return new a(this.f4186a, i7, i10 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return n.T(this.f4186a, 0, this.f4187b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        l.e(array, "array");
        int length = array.length;
        int i7 = this.f4187b;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4186a, 0, i7, array.getClass());
            l.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        n.P(this.f4186a, 0, array, 0, i7);
        int i10 = this.f4187b;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return x.b(this.f4186a, 0, this.f4187b, this);
    }

    public final void y(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        D(i7, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4186a[i7 + i11] = it.next();
        }
    }

    public final void z(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        D(i7, 1);
        this.f4186a[i7] = obj;
    }
}
