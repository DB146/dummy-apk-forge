package Eb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y7.u0;

/* loaded from: classes2.dex */
public final class l extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f3881d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f3882a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3883b = f3881d;

    /* renamed from: c, reason: collision with root package name */
    public int f3884c;

    public final int C(int i7) {
        kotlin.jvm.internal.l.e(this.f3883b, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object D() {
        if (isEmpty()) {
            return null;
        }
        return this.f3883b[G(u0.s(this) + this.f3882a)];
    }

    public final int E(int i7) {
        return i7 < 0 ? i7 + this.f3883b.length : i7;
    }

    public final void F(int i7, int i10) {
        if (i7 < i10) {
            n.U(this.f3883b, null, i7, i10);
            return;
        }
        Object[] objArr = this.f3883b;
        Arrays.fill(objArr, i7, objArr.length, (Object) null);
        n.U(this.f3883b, null, 0, i10);
    }

    public final int G(int i7) {
        Object[] objArr = this.f3883b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void H() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int i11 = this.f3884c;
        if (i7 < 0 || i7 > i11) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i11, "index: ", ", size: "));
        }
        if (i7 == i11) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        H();
        y(this.f3884c + 1);
        int G9 = G(this.f3882a + i7);
        int i12 = this.f3884c;
        if (i7 < ((i12 + 1) >> 1)) {
            if (G9 == 0) {
                Object[] objArr = this.f3883b;
                kotlin.jvm.internal.l.e(objArr, "<this>");
                G9 = objArr.length;
            }
            int i13 = G9 - 1;
            int i14 = this.f3882a;
            if (i14 == 0) {
                Object[] objArr2 = this.f3883b;
                kotlin.jvm.internal.l.e(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = i14 - 1;
            }
            int i15 = this.f3882a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f3883b;
                objArr3[i10] = objArr3[i15];
                n.P(objArr3, i15, objArr3, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f3883b;
                n.P(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                Object[] objArr5 = this.f3883b;
                objArr5[objArr5.length - 1] = objArr5[0];
                n.P(objArr5, 0, objArr5, 1, i13 + 1);
            }
            this.f3883b[i13] = obj;
            this.f3882a = i10;
        } else {
            int G10 = G(i12 + this.f3882a);
            if (G9 < G10) {
                Object[] objArr6 = this.f3883b;
                n.P(objArr6, G9 + 1, objArr6, G9, G10);
            } else {
                Object[] objArr7 = this.f3883b;
                n.P(objArr7, 1, objArr7, 0, G10);
                Object[] objArr8 = this.f3883b;
                objArr8[0] = objArr8[objArr8.length - 1];
                n.P(objArr8, G9 + 1, objArr8, G9, objArr8.length - 1);
            }
            this.f3883b[G9] = obj;
        }
        this.f3884c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        int i10 = this.f3884c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == this.f3884c) {
            return addAll(elements);
        }
        H();
        y(elements.size() + this.f3884c);
        int G9 = G(this.f3884c + this.f3882a);
        int G10 = G(this.f3882a + i7);
        int size = elements.size();
        if (i7 < ((this.f3884c + 1) >> 1)) {
            int i11 = this.f3882a;
            int i12 = i11 - size;
            if (G10 < i11) {
                Object[] objArr = this.f3883b;
                n.P(objArr, i12, objArr, i11, objArr.length);
                if (size >= G10) {
                    Object[] objArr2 = this.f3883b;
                    n.P(objArr2, objArr2.length - size, objArr2, 0, G10);
                } else {
                    Object[] objArr3 = this.f3883b;
                    n.P(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f3883b;
                    n.P(objArr4, 0, objArr4, size, G10);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f3883b;
                n.P(objArr5, i12, objArr5, i11, G10);
            } else {
                Object[] objArr6 = this.f3883b;
                i12 += objArr6.length;
                int i13 = G10 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    n.P(objArr6, i12, objArr6, i11, G10);
                } else {
                    n.P(objArr6, i12, objArr6, i11, i11 + length);
                    Object[] objArr7 = this.f3883b;
                    n.P(objArr7, 0, objArr7, this.f3882a + length, G10);
                }
            }
            this.f3882a = i12;
            t(E(G10 - size), elements);
        } else {
            int i14 = G10 + size;
            if (G10 < G9) {
                int i15 = size + G9;
                Object[] objArr8 = this.f3883b;
                if (i15 <= objArr8.length) {
                    n.P(objArr8, i14, objArr8, G10, G9);
                } else if (i14 >= objArr8.length) {
                    n.P(objArr8, i14 - objArr8.length, objArr8, G10, G9);
                } else {
                    int length2 = G9 - (i15 - objArr8.length);
                    n.P(objArr8, 0, objArr8, length2, G9);
                    Object[] objArr9 = this.f3883b;
                    n.P(objArr9, i14, objArr9, G10, length2);
                }
            } else {
                Object[] objArr10 = this.f3883b;
                n.P(objArr10, size, objArr10, 0, G9);
                Object[] objArr11 = this.f3883b;
                if (i14 >= objArr11.length) {
                    n.P(objArr11, i14 - objArr11.length, objArr11, G10, objArr11.length);
                } else {
                    n.P(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f3883b;
                    n.P(objArr12, i14, objArr12, G10, objArr12.length - size);
                }
            }
            t(G10, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        H();
        y(elements.size() + b());
        t(G(b() + this.f3882a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        H();
        y(this.f3884c + 1);
        int i7 = this.f3882a;
        if (i7 == 0) {
            Object[] objArr = this.f3883b;
            kotlin.jvm.internal.l.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i10 = i7 - 1;
        this.f3882a = i10;
        this.f3883b[i10] = obj;
        this.f3884c++;
    }

    public final void addLast(Object obj) {
        H();
        y(b() + 1);
        this.f3883b[G(b() + this.f3882a)] = obj;
        this.f3884c = b() + 1;
    }

    @Override // Eb.h
    public final int b() {
        return this.f3884c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            H();
            F(this.f3882a, G(b() + this.f3882a));
        }
        this.f3882a = 0;
        this.f3884c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f3883b[this.f3882a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int b2 = b();
        if (i7 < 0 || i7 >= b2) {
            throw new IndexOutOfBoundsException(X.c.e(i7, b2, "index: ", ", size: "));
        }
        return this.f3883b[G(this.f3882a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int G9 = G(b() + this.f3882a);
        int i10 = this.f3882a;
        if (i10 < G9) {
            while (i10 < G9) {
                if (kotlin.jvm.internal.l.a(obj, this.f3883b[i10])) {
                    i7 = this.f3882a;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < G9) {
            return -1;
        }
        int length = this.f3883b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < G9; i11++) {
                    if (kotlin.jvm.internal.l.a(obj, this.f3883b[i11])) {
                        i10 = i11 + this.f3883b.length;
                        i7 = this.f3882a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l.a(obj, this.f3883b[i10])) {
                i7 = this.f3882a;
                break;
            }
            i10++;
        }
        return i10 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f3883b[G(u0.s(this) + this.f3882a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int G9 = G(this.f3884c + this.f3882a);
        int i10 = this.f3882a;
        if (i10 < G9) {
            length = G9 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.l.a(obj, this.f3883b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f3882a;
                return length - i7;
            }
            return -1;
        }
        if (i10 > G9) {
            int i11 = G9 - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f3883b;
                    kotlin.jvm.internal.l.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f3882a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.l.a(obj, this.f3883b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i7 = this.f3882a;
                    }
                } else {
                    if (kotlin.jvm.internal.l.a(obj, this.f3883b[i11])) {
                        length = i11 + this.f3883b.length;
                        i7 = this.f3882a;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    @Override // Eb.h
    public final Object o(int i7) {
        int i10 = this.f3884c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
        if (i7 == u0.s(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        H();
        int G9 = G(this.f3882a + i7);
        Object[] objArr = this.f3883b;
        Object obj = objArr[G9];
        if (i7 < (this.f3884c >> 1)) {
            int i11 = this.f3882a;
            if (G9 >= i11) {
                n.P(objArr, i11 + 1, objArr, i11, G9);
            } else {
                n.P(objArr, 1, objArr, 0, G9);
                Object[] objArr2 = this.f3883b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f3882a;
                n.P(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3883b;
            int i13 = this.f3882a;
            objArr3[i13] = null;
            this.f3882a = C(i13);
        } else {
            int G10 = G(u0.s(this) + this.f3882a);
            if (G9 <= G10) {
                Object[] objArr4 = this.f3883b;
                n.P(objArr4, G9, objArr4, G9 + 1, G10 + 1);
            } else {
                Object[] objArr5 = this.f3883b;
                n.P(objArr5, G9, objArr5, G9 + 1, objArr5.length);
                Object[] objArr6 = this.f3883b;
                objArr6[objArr6.length - 1] = objArr6[0];
                n.P(objArr6, 0, objArr6, 1, G10 + 1);
            }
            this.f3883b[G10] = null;
        }
        this.f3884c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int G9;
        kotlin.jvm.internal.l.e(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f3883b.length != 0) {
            int G10 = G(this.f3884c + this.f3882a);
            int i7 = this.f3882a;
            if (i7 < G10) {
                G9 = i7;
                while (i7 < G10) {
                    Object obj = this.f3883b[i7];
                    if (elements.contains(obj)) {
                        z8 = true;
                    } else {
                        this.f3883b[G9] = obj;
                        G9++;
                    }
                    i7++;
                }
                n.U(this.f3883b, null, G9, G10);
            } else {
                int length = this.f3883b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f3883b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f3883b[i10] = obj2;
                        i10++;
                    }
                    i7++;
                }
                G9 = G(i10);
                for (int i11 = 0; i11 < G10; i11++) {
                    Object[] objArr2 = this.f3883b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f3883b[G9] = obj3;
                        G9 = C(G9);
                    }
                }
                z8 = z10;
            }
            if (z8) {
                H();
                this.f3884c = E(G9 - this.f3882a);
            }
        }
        return z8;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        H();
        Object[] objArr = this.f3883b;
        int i7 = this.f3882a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f3882a = C(i7);
        this.f3884c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        H();
        int G9 = G(u0.s(this) + this.f3882a);
        Object[] objArr = this.f3883b;
        Object obj = objArr[G9];
        objArr[G9] = null;
        this.f3884c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        tc.b.n(i7, i10, this.f3884c);
        int i11 = i10 - i7;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f3884c) {
            clear();
            return;
        }
        if (i11 == 1) {
            o(i7);
            return;
        }
        H();
        if (i7 < this.f3884c - i10) {
            int G9 = G(this.f3882a + (i7 - 1));
            int G10 = G(this.f3882a + (i10 - 1));
            while (i7 > 0) {
                int i12 = G9 + 1;
                int min = Math.min(i7, Math.min(i12, G10 + 1));
                Object[] objArr = this.f3883b;
                int i13 = G10 - min;
                int i14 = G9 - min;
                n.P(objArr, i13 + 1, objArr, i14 + 1, i12);
                G9 = E(i14);
                G10 = E(i13);
                i7 -= min;
            }
            int G11 = G(this.f3882a + i11);
            F(this.f3882a, G11);
            this.f3882a = G11;
        } else {
            int G12 = G(this.f3882a + i10);
            int G13 = G(this.f3882a + i7);
            int i15 = this.f3884c;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3883b;
                i10 = Math.min(i15, Math.min(objArr2.length - G12, objArr2.length - G13));
                Object[] objArr3 = this.f3883b;
                int i16 = G12 + i10;
                n.P(objArr3, G13, objArr3, G12, i16);
                G12 = G(i16);
                G13 = G(G13 + i10);
            }
            int G14 = G(this.f3884c + this.f3882a);
            F(E(G14 - i11), G14);
        }
        this.f3884c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int G9;
        kotlin.jvm.internal.l.e(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f3883b.length != 0) {
            int G10 = G(this.f3884c + this.f3882a);
            int i7 = this.f3882a;
            if (i7 < G10) {
                G9 = i7;
                while (i7 < G10) {
                    Object obj = this.f3883b[i7];
                    if (elements.contains(obj)) {
                        this.f3883b[G9] = obj;
                        G9++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                n.U(this.f3883b, null, G9, G10);
            } else {
                int length = this.f3883b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f3883b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f3883b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i7++;
                }
                G9 = G(i10);
                for (int i11 = 0; i11 < G10; i11++) {
                    Object[] objArr2 = this.f3883b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f3883b[G9] = obj3;
                        G9 = C(G9);
                    } else {
                        z10 = true;
                    }
                }
                z8 = z10;
            }
            if (z8) {
                H();
                this.f3884c = E(G9 - this.f3882a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int b2 = b();
        if (i7 < 0 || i7 >= b2) {
            throw new IndexOutOfBoundsException(X.c.e(i7, b2, "index: ", ", size: "));
        }
        int G9 = G(this.f3882a + i7);
        Object[] objArr = this.f3883b;
        Object obj2 = objArr[G9];
        objArr[G9] = obj;
        return obj2;
    }

    public final void t(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3883b.length;
        while (i7 < length && it.hasNext()) {
            this.f3883b[i7] = it.next();
            i7++;
        }
        int i10 = this.f3882a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f3883b[i11] = it.next();
        }
        this.f3884c = collection.size() + this.f3884c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        int length = array.length;
        int i7 = this.f3884c;
        if (length < i7) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i7);
            kotlin.jvm.internal.l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int G9 = G(this.f3884c + this.f3882a);
        int i10 = this.f3882a;
        if (i10 < G9) {
            n.R(this.f3883b, i10, array, G9, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f3883b;
            n.P(objArr, 0, array, this.f3882a, objArr.length);
            Object[] objArr2 = this.f3883b;
            n.P(objArr2, objArr2.length - this.f3882a, array, 0, G9);
        }
        int i11 = this.f3884c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    public final void y(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3883b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f3881d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f3883b = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i7 < 0) {
            i10 = i7;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        n.P(objArr, 0, objArr2, this.f3882a, objArr.length);
        Object[] objArr3 = this.f3883b;
        int length2 = objArr3.length;
        int i11 = this.f3882a;
        n.P(objArr3, length2 - i11, objArr2, 0, i11);
        this.f3882a = 0;
        this.f3883b = objArr2;
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return this.f3883b[this.f3882a];
    }
}
