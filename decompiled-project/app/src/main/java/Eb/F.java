package Eb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class F extends AbstractC0255f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3860b;

    /* renamed from: c, reason: collision with root package name */
    public int f3861c;

    /* renamed from: d, reason: collision with root package name */
    public int f3862d;

    public F(Object[] objArr, int i7) {
        this.f3859a = objArr;
        if (i7 < 0) {
            throw new IllegalArgumentException(h3.o.l(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= objArr.length) {
            this.f3860b = objArr.length;
            this.f3862d = i7;
        } else {
            StringBuilder r10 = h3.o.r(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            r10.append(objArr.length);
            throw new IllegalArgumentException(r10.toString().toString());
        }
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f3862d;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int b2 = b();
        if (i7 < 0 || i7 >= b2) {
            throw new IndexOutOfBoundsException(X.c.e(i7, b2, "index: ", ", size: "));
        }
        return this.f3859a[(this.f3861c + i7) % this.f3860b];
    }

    @Override // Eb.AbstractC0255f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new E(this);
    }

    public final void o() {
        if (20 > this.f3862d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f3862d).toString());
        }
        int i7 = this.f3861c;
        int i10 = this.f3860b;
        int i11 = (i7 + 20) % i10;
        Object[] objArr = this.f3859a;
        if (i7 > i11) {
            n.U(objArr, null, i7, i10);
            Arrays.fill(objArr, 0, i11, (Object) null);
        } else {
            n.U(objArr, null, i7, i11);
        }
        this.f3861c = i11;
        this.f3862d -= 20;
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.l.e(array, "array");
        int length = array.length;
        int i7 = this.f3862d;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
            kotlin.jvm.internal.l.d(array, "copyOf(...)");
        }
        int i10 = this.f3862d;
        int i11 = this.f3861c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f3859a;
            if (i13 >= i10 || i11 >= this.f3860b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
