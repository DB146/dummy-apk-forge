package Q6;

import Q5.e;
import h3.H;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8668c;

    public a(int i7, int i10, int[] iArr) {
        this.f8666a = iArr;
        this.f8667b = i7;
        this.f8668c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (H.x(this.f8666a, ((Integer) obj).intValue(), this.f8667b, this.f8668c) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        int size = size();
        if (aVar.size() != size) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f8666a[this.f8667b + i7] != aVar.f8666a[aVar.f8667b + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        e.l(i7, size());
        return Integer.valueOf(this.f8666a[this.f8667b + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = this.f8667b; i10 < this.f8668c; i10++) {
            i7 = (i7 * 31) + this.f8666a[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int[] iArr = this.f8666a;
        int i7 = this.f8667b;
        int x2 = H.x(iArr, intValue, i7, this.f8668c);
        if (x2 >= 0) {
            return x2 - i7;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f8668c;
            while (true) {
                i10--;
                i7 = this.f8667b;
                if (i10 < i7) {
                    i10 = -1;
                    break;
                }
                if (this.f8666a[i10] == intValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        e.l(i7, size());
        int i10 = this.f8667b + i7;
        int[] iArr = this.f8666a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8668c - this.f8667b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        e.o(i7, i10, size());
        if (i7 == i10) {
            return Collections.emptyList();
        }
        int i11 = this.f8667b;
        return new a(i7 + i11, i11 + i10, this.f8666a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f8666a;
        int i7 = this.f8667b;
        sb2.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= this.f8668c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i7]);
        }
    }
}
