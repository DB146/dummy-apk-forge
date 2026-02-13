package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC0799b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final U f13355d = new U(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13356b;

    /* renamed from: c, reason: collision with root package name */
    public int f13357c;

    public U(Object[] objArr, int i7, boolean z8) {
        this.f13378a = z8;
        this.f13356b = objArr;
        this.f13357c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        b();
        if (i7 < 0 || i7 > (i10 = this.f13357c)) {
            StringBuilder r10 = h3.o.r(i7, "Index:", ", Size:");
            r10.append(this.f13357c);
            throw new IndexOutOfBoundsException(r10.toString());
        }
        Object[] objArr = this.f13356b;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
        } else {
            Object[] objArr2 = new Object[X.c.b(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f13356b, i7, objArr2, i7 + 1, this.f13357c - i7);
            this.f13356b = objArr2;
        }
        this.f13356b[i7] = obj;
        this.f13357c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i7 = this.f13357c;
        Object[] objArr = this.f13356b;
        if (i7 == objArr.length) {
            this.f13356b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13356b;
        int i10 = this.f13357c;
        this.f13357c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.f13356b[i7];
    }

    public final void i(int i7) {
        if (i7 < 0 || i7 >= this.f13357c) {
            StringBuilder r10 = h3.o.r(i7, "Index:", ", Size:");
            r10.append(this.f13357c);
            throw new IndexOutOfBoundsException(r10.toString());
        }
    }

    public final U o(int i7) {
        if (i7 >= this.f13357c) {
            return new U(Arrays.copyOf(this.f13356b, i7), this.f13357c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0799b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        b();
        i(i7);
        Object[] objArr = this.f13356b;
        Object obj = objArr[i7];
        if (i7 < this.f13357c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f13357c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        i(i7);
        Object[] objArr = this.f13356b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13357c;
    }
}
