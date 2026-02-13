package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Y extends AbstractC1008b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Y f15748d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f15749b;

    /* renamed from: c, reason: collision with root package name */
    public int f15750c;

    static {
        Y y10 = new Y(new Object[0], 0);
        f15748d = y10;
        y10.f15755a = false;
    }

    public Y(Object[] objArr, int i7) {
        this.f15749b = objArr;
        this.f15750c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        b();
        if (i7 < 0 || i7 > (i10 = this.f15750c)) {
            StringBuilder r10 = h3.o.r(i7, "Index:", ", Size:");
            r10.append(this.f15750c);
            throw new IndexOutOfBoundsException(r10.toString());
        }
        Object[] objArr = this.f15749b;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
        } else {
            Object[] objArr2 = new Object[X.c.b(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f15749b, i7, objArr2, i7 + 1, this.f15750c - i7);
            this.f15749b = objArr2;
        }
        this.f15749b[i7] = obj;
        this.f15750c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1008b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i7 = this.f15750c;
        Object[] objArr = this.f15749b;
        if (i7 == objArr.length) {
            this.f15749b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15749b;
        int i10 = this.f15750c;
        this.f15750c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        o(i7);
        return this.f15749b[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC1031z
    public final InterfaceC1031z j(int i7) {
        if (i7 >= this.f15750c) {
            return new Y(Arrays.copyOf(this.f15749b, i7), this.f15750c);
        }
        throw new IllegalArgumentException();
    }

    public final void o(int i7) {
        if (i7 < 0 || i7 >= this.f15750c) {
            StringBuilder r10 = h3.o.r(i7, "Index:", ", Size:");
            r10.append(this.f15750c);
            throw new IndexOutOfBoundsException(r10.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        b();
        o(i7);
        Object[] objArr = this.f15749b;
        Object obj = objArr[i7];
        if (i7 < this.f15750c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f15750c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        o(i7);
        Object[] objArr = this.f15749b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15750c;
    }
}
