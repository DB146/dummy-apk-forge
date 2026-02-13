package L7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: L7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385e implements Iterable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0385e f6337d = new C0385e("");

    /* renamed from: a, reason: collision with root package name */
    public final T7.c[] f6338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6340c;

    public C0385e(String str) {
        String[] split = str.split("/", -1);
        int i7 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f6338a = new T7.c[i7];
        int i10 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f6338a[i10] = T7.c.b(str3);
                i10++;
            }
        }
        this.f6339b = 0;
        this.f6340c = this.f6338a.length;
    }

    public C0385e(ArrayList arrayList) {
        this.f6338a = new T7.c[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f6338a[i7] = T7.c.b((String) it.next());
            i7++;
        }
        this.f6339b = 0;
        this.f6340c = arrayList.size();
    }

    public C0385e(T7.c... cVarArr) {
        this.f6338a = (T7.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f6339b = 0;
        this.f6340c = cVarArr.length;
        for (T7.c cVar : cVarArr) {
            O7.k.b("Can't construct a path with a null value!", cVar != null);
        }
    }

    public C0385e(T7.c[] cVarArr, int i7, int i10) {
        this.f6338a = cVarArr;
        this.f6339b = i7;
        this.f6340c = i10;
    }

    public static C0385e E(C0385e c0385e, C0385e c0385e2) {
        T7.c C2 = c0385e.C();
        T7.c C10 = c0385e2.C();
        if (C2 == null) {
            return c0385e2;
        }
        if (C2.equals(C10)) {
            return E(c0385e.F(), c0385e2.F());
        }
        throw new RuntimeException("INTERNAL ERROR: " + c0385e2 + " is not contained in " + c0385e);
    }

    public final T7.c C() {
        if (isEmpty()) {
            return null;
        }
        return this.f6338a[this.f6339b];
    }

    public final C0385e D() {
        if (isEmpty()) {
            return null;
        }
        return new C0385e(this.f6338a, this.f6339b, this.f6340c - 1);
    }

    public final C0385e F() {
        boolean isEmpty = isEmpty();
        int i7 = this.f6339b;
        if (!isEmpty) {
            i7++;
        }
        return new C0385e(this.f6338a, i7, this.f6340c);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(size());
        I7.l lVar = new I7.l(this);
        while (lVar.hasNext()) {
            arrayList.add(((T7.c) lVar.next()).f9331a);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0385e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0385e c0385e = (C0385e) obj;
        if (size() != c0385e.size()) {
            return false;
        }
        int i7 = this.f6339b;
        for (int i10 = c0385e.f6339b; i7 < this.f6340c && i10 < c0385e.f6340c; i10++) {
            if (!this.f6338a[i7].equals(c0385e.f6338a[i10])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 0;
        for (int i10 = this.f6339b; i10 < this.f6340c; i10++) {
            i7 = (i7 * 37) + this.f6338a[i10].f9331a.hashCode();
        }
        return i7;
    }

    public final C0385e i(C0385e c0385e) {
        int size = c0385e.size() + size();
        T7.c[] cVarArr = new T7.c[size];
        System.arraycopy(this.f6338a, this.f6339b, cVarArr, 0, size());
        System.arraycopy(c0385e.f6338a, c0385e.f6339b, cVarArr, size(), c0385e.size());
        return new C0385e(cVarArr, 0, size);
    }

    public final boolean isEmpty() {
        return this.f6339b >= this.f6340c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new I7.l(this);
    }

    public final C0385e o(T7.c cVar) {
        int size = size();
        int i7 = size + 1;
        T7.c[] cVarArr = new T7.c[i7];
        System.arraycopy(this.f6338a, this.f6339b, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new C0385e(cVarArr, 0, i7);
    }

    public final int size() {
        return this.f6340c - this.f6339b;
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0385e c0385e) {
        int i7;
        int i10;
        int i11 = c0385e.f6339b;
        int i12 = this.f6339b;
        while (true) {
            i7 = c0385e.f6340c;
            i10 = this.f6340c;
            if (i12 >= i10 || i11 >= i7) {
                break;
            }
            int compareTo = this.f6338a[i12].compareTo(c0385e.f6338a[i11]);
            if (compareTo != 0) {
                return compareTo;
            }
            i12++;
            i11++;
        }
        if (i12 == i10 && i11 == i7) {
            return 0;
        }
        return i12 == i10 ? -1 : 1;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = this.f6339b; i7 < this.f6340c; i7++) {
            sb2.append("/");
            sb2.append(this.f6338a[i7].f9331a);
        }
        return sb2.toString();
    }

    public final boolean y(C0385e c0385e) {
        if (size() > c0385e.size()) {
            return false;
        }
        int i7 = this.f6339b;
        int i10 = c0385e.f6339b;
        while (i7 < this.f6340c) {
            if (!this.f6338a[i7].equals(c0385e.f6338a[i10])) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    public final T7.c z() {
        if (isEmpty()) {
            return null;
        }
        return this.f6338a[this.f6340c - 1];
    }
}
