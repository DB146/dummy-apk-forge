package S;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8959a;

    /* renamed from: b, reason: collision with root package name */
    public b f8960b;

    /* renamed from: c, reason: collision with root package name */
    public int f8961c = 0;

    public e(Object[] objArr) {
        this.f8959a = objArr;
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f8961c + 1;
        if (this.f8959a.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f8959a;
        int i11 = this.f8961c;
        if (i7 != i11) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i11 - i7);
        }
        objArr[i7] = obj;
        this.f8961c++;
    }

    public final void b(Object obj) {
        int i7 = this.f8961c + 1;
        if (this.f8959a.length < i7) {
            n(i7);
        }
        Object[] objArr = this.f8959a;
        int i10 = this.f8961c;
        objArr[i10] = obj;
        this.f8961c = i10 + 1;
    }

    public final void c(int i7, e eVar) {
        int i10 = eVar.f8961c;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f8961c + i10;
        if (this.f8959a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f8959a;
        int i12 = this.f8961c;
        if (i7 != i12) {
            System.arraycopy(objArr, i7, objArr, i7 + i10, i12 - i7);
        }
        System.arraycopy(eVar.f8959a, 0, objArr, i7, i10);
        this.f8961c += i10;
    }

    public final void d(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f8961c + size;
        if (this.f8959a.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f8959a;
        int i11 = this.f8961c;
        if (i7 != i11) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i11 - i7);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i7 + i12] = list.get(i12);
        }
        this.f8961c += size;
    }

    public final boolean e(int i7, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f8961c + size;
        if (this.f8959a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f8959a;
        int i12 = this.f8961c;
        if (i7 != i12) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i12 - i7);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                u0.M();
                throw null;
            }
            objArr[i10 + i7] = obj;
            i10 = i13;
        }
        this.f8961c += size;
        return true;
    }

    public final List f() {
        b bVar = this.f8960b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f8960b = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f8959a;
        int i7 = this.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f8961c = 0;
    }

    public final boolean h(Object obj) {
        int i7 = this.f8961c - 1;
        if (i7 >= 0) {
            for (int i10 = 0; !l.a(this.f8959a[i10], obj); i10++) {
                if (i10 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f8959a;
        int i7 = this.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (l.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int i7 = i(obj);
        if (i7 < 0) {
            return false;
        }
        l(i7);
        return true;
    }

    public final Object l(int i7) {
        Object[] objArr = this.f8959a;
        Object obj = objArr[i7];
        int i10 = this.f8961c;
        if (i7 != i10 - 1) {
            int i11 = i7 + 1;
            System.arraycopy(objArr, i11, objArr, i7, i10 - i11);
        }
        int i12 = this.f8961c - 1;
        this.f8961c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void m(int i7, int i10) {
        if (i10 > i7) {
            int i11 = this.f8961c;
            if (i10 < i11) {
                Object[] objArr = this.f8959a;
                System.arraycopy(objArr, i10, objArr, i7, i11 - i10);
            }
            int i12 = this.f8961c;
            int i13 = i12 - (i10 - i7);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f8959a[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f8961c = i13;
        }
    }

    public final void n(int i7) {
        Object[] objArr = this.f8959a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f8959a = objArr2;
    }

    public final void o(Comparator comparator) {
        Arrays.sort(this.f8959a, 0, this.f8961c, comparator);
    }
}
