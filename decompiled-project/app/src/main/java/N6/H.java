package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class H extends C implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final F f7232b = new F(t0.f7341e, 0);

    public static t0 D(int i7, Object[] objArr) {
        return i7 == 0 ? t0.f7341e : new t0(objArr, i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [N6.B, N6.E] */
    public static E E() {
        return new B();
    }

    public static H F(Collection collection) {
        if (!(collection instanceof C)) {
            Object[] array = collection.toArray();
            r.c(array.length, array);
            return D(array.length, array);
        }
        H b2 = ((C) collection).b();
        if (!b2.z()) {
            return b2;
        }
        Object[] array2 = b2.toArray(C.f7214a);
        return D(array2.length, array2);
    }

    public static t0 G(Object[] objArr) {
        if (objArr.length == 0) {
            return t0.f7341e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.c(objArr2.length, objArr2);
        return D(objArr2.length, objArr2);
    }

    public static t0 I() {
        return t0.f7341e;
    }

    public static t0 J(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        r.c(5, objArr);
        return D(5, objArr);
    }

    public static t0 K(Object obj) {
        Object[] objArr = {obj};
        r.c(1, objArr);
        return D(1, objArr);
    }

    public static t0 L(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.c(2, objArr);
        return D(2, objArr);
    }

    public static t0 M(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        r.c(3, objArr);
        return D(3, objArr);
    }

    @Override // N6.C
    /* renamed from: C */
    public final H0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final F listIterator(int i7) {
        Q5.e.n(i7, size());
        return isEmpty() ? f7232b : new F(this, i7);
    }

    @Override // java.util.List
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public H subList(int i7, int i10) {
        Q5.e.o(i7, i10, size());
        int i11 = i10 - i7;
        return i11 == size() ? this : i11 == 0 ? t0.f7341e : new G(this, i7, i11);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // N6.C
    public final H b() {
        return this;
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (O5.b.o(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && O5.b.o(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = ~(~(get(i10).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // N6.C
    public int i(int i7, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i7 + i10] = get(i10);
        }
        return i7 + size;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // N6.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }
}
