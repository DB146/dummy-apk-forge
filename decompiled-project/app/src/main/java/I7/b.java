package I7;

import a.AbstractC0672a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5236a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5237b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f5238c;

    public b(Comparator comparator) {
        this.f5236a = new Object[0];
        this.f5237b = new Object[0];
        this.f5238c = comparator;
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f5236a = objArr;
        this.f5237b = objArr2;
        this.f5238c = comparator;
    }

    public static b E(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(obj);
            i7++;
        }
        return new b(comparator, objArr, objArr2);
    }

    @Override // I7.c
    public final Iterator A() {
        return new a(this, this.f5236a.length - 1, true);
    }

    @Override // I7.c
    public final c C(Iterable iterable, Object obj) {
        int F10 = F(obj);
        Object[] objArr = this.f5237b;
        Object[] objArr2 = this.f5236a;
        Comparator comparator = this.f5238c;
        if (F10 != -1) {
            if (objArr2[F10] == obj && objArr[F10] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[F10] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[F10] = iterable;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i7 = 0; i7 < objArr2.length; i7++) {
                hashMap.put(objArr2[i7], objArr[i7]);
            }
            hashMap.put(obj, iterable);
            return q3.i.l(new ArrayList(hashMap.keySet()), hashMap, comparator);
        }
        int i10 = 0;
        while (i10 < objArr2.length && comparator.compare(objArr2[i10], obj) < 0) {
            i10++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i10);
        objArr5[i10] = obj;
        int i11 = i10 + 1;
        System.arraycopy(objArr2, i10, objArr5, i11, (r4 - i10) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i10);
        objArr6[i10] = iterable;
        System.arraycopy(objArr, i10, objArr6, i11, (r2 - i10) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // I7.c
    public final c D(Object obj) {
        int F10 = F(obj);
        if (F10 == -1) {
            return this;
        }
        Object[] objArr = this.f5236a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, F10);
        int i7 = F10 + 1;
        System.arraycopy(objArr, i7, objArr2, F10, length - F10);
        Object[] objArr3 = this.f5237b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, F10);
        System.arraycopy(objArr3, i7, objArr4, F10, length2 - F10);
        return new b(this.f5238c, objArr2, objArr4);
    }

    public final int F(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f5236a) {
            if (this.f5238c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // I7.c
    public final boolean b(Object obj) {
        return F(obj) != -1;
    }

    @Override // I7.c
    public final Object i(T7.c cVar) {
        int F10 = F(cVar);
        if (F10 != -1) {
            return this.f5237b[F10];
        }
        return null;
    }

    @Override // I7.c
    public final boolean isEmpty() {
        return this.f5236a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0, false);
    }

    @Override // I7.c
    public final Comparator o() {
        return this.f5238c;
    }

    @Override // I7.c
    public final int size() {
        return this.f5236a.length;
    }

    @Override // I7.c
    public final Object t() {
        Object[] objArr = this.f5236a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // I7.c
    public final Object y() {
        Object[] objArr = this.f5236a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // I7.c
    public final void z(AbstractC0672a abstractC0672a) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f5236a;
            if (i7 >= objArr.length) {
                return;
            }
            abstractC0672a.w(objArr[i7], this.f5237b[i7]);
            i7++;
        }
    }
}
