package u;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import v.AbstractC2121a;

/* loaded from: classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24635a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24636b;

    /* renamed from: c, reason: collision with root package name */
    public int f24637c;

    public T(int i7) {
        this.f24635a = i7 == 0 ? AbstractC2121a.f24921a : new int[i7];
        this.f24636b = i7 == 0 ? AbstractC2121a.f24923c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f24637c * 2;
        Object[] objArr = this.f24636b;
        if (obj == null) {
            for (int i10 = 1; i10 < i7; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i7; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i7) {
        int i10 = this.f24637c;
        int[] iArr = this.f24635a;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24635a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24636b, i7 * 2);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            this.f24636b = copyOf2;
        }
        if (this.f24637c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i7, Object obj) {
        int i10 = this.f24637c;
        if (i10 == 0) {
            return -1;
        }
        int a9 = AbstractC2121a.a(i10, i7, this.f24635a);
        if (a9 < 0 || kotlin.jvm.internal.l.a(obj, this.f24636b[a9 << 1])) {
            return a9;
        }
        int i11 = a9 + 1;
        while (i11 < i10 && this.f24635a[i11] == i7) {
            if (kotlin.jvm.internal.l.a(obj, this.f24636b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a9 - 1; i12 >= 0 && this.f24635a[i12] == i7; i12--) {
            if (kotlin.jvm.internal.l.a(obj, this.f24636b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.f24637c > 0) {
            this.f24635a = AbstractC2121a.f24921a;
            this.f24636b = AbstractC2121a.f24923c;
            this.f24637c = 0;
        }
        if (this.f24637c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f24637c;
        if (i7 == 0) {
            return -1;
        }
        int a9 = AbstractC2121a.a(i7, 0, this.f24635a);
        if (a9 < 0 || this.f24636b[a9 << 1] == null) {
            return a9;
        }
        int i10 = a9 + 1;
        while (i10 < i7 && this.f24635a[i10] == 0) {
            if (this.f24636b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a9 - 1; i11 >= 0 && this.f24635a[i11] == 0; i11--) {
            if (this.f24636b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof T) {
                int i7 = this.f24637c;
                if (i7 != ((T) obj).f24637c) {
                    return false;
                }
                T t5 = (T) obj;
                for (int i10 = 0; i10 < i7; i10++) {
                    Object f4 = f(i10);
                    Object k = k(i10);
                    Object obj2 = t5.get(f4);
                    if (k == null) {
                        if (obj2 != null || !t5.containsKey(f4)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f24637c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f24637c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object f10 = f(i12);
                Object k7 = k(i12);
                Object obj3 = ((Map) obj).get(f10);
                if (k7 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f10)) {
                        return false;
                    }
                } else if (!k7.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f24637c) {
            z8 = true;
        }
        if (z8) {
            return this.f24636b[i7 << 1];
        }
        AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public void g(C2052e c2052e) {
        int i7 = c2052e.f24637c;
        b(this.f24637c + i7);
        if (this.f24637c != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                put(c2052e.f(i10), c2052e.k(i10));
            }
        } else if (i7 > 0) {
            Eb.n.M(0, 0, i7, c2052e.f24635a, this.f24635a);
            Eb.n.P(c2052e.f24636b, 0, this.f24636b, 0, i7 << 1);
            this.f24637c = i7;
        }
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f24636b[(d10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        return d10 >= 0 ? this.f24636b[(d10 << 1) + 1] : obj2;
    }

    public Object h(int i7) {
        if (!(i7 >= 0 && i7 < this.f24637c)) {
            AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f24636b;
        int i10 = i7 << 1;
        Object obj = objArr[i10 + 1];
        int i11 = this.f24637c;
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f24635a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i7 < i12) {
                    int i13 = i7 + 1;
                    Eb.n.M(i7, i13, i11, iArr, iArr);
                    Object[] objArr2 = this.f24636b;
                    Eb.n.P(objArr2, i10, objArr2, i13 << 1, i11 << 1);
                }
                Object[] objArr3 = this.f24636b;
                int i14 = i12 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                int i15 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i15);
                kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
                this.f24635a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f24636b, i15 << 1);
                kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
                this.f24636b = copyOf2;
                if (i11 != this.f24637c) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    Eb.n.M(0, 0, i7, iArr, this.f24635a);
                    Eb.n.P(objArr, 0, this.f24636b, 0, i10);
                }
                if (i7 < i12) {
                    int i16 = i7 + 1;
                    Eb.n.M(i7, i16, i11, iArr, this.f24635a);
                    Eb.n.P(objArr, i10, this.f24636b, i16 << 1, i11 << 1);
                }
            }
            if (i11 != this.f24637c) {
                throw new ConcurrentModificationException();
            }
            this.f24637c = i12;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f24635a;
        Object[] objArr = this.f24636b;
        int i7 = this.f24637c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i7) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final boolean isEmpty() {
        return this.f24637c <= 0;
    }

    public Object j(int i7, Object obj) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f24637c) {
            z8 = true;
        }
        if (!z8) {
            AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i10 = (i7 << 1) + 1;
        Object[] objArr = this.f24636b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final Object k(int i7) {
        boolean z8 = false;
        if (i7 >= 0 && i7 < this.f24637c) {
            z8 = true;
        }
        if (z8) {
            return this.f24636b[(i7 << 1) + 1];
        }
        AbstractC2121a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i7 = this.f24637c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c10 = obj != null ? c(hashCode, obj) : e();
        if (c10 >= 0) {
            int i10 = (c10 << 1) + 1;
            Object[] objArr = this.f24636b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~c10;
        int[] iArr = this.f24635a;
        if (i7 >= iArr.length) {
            int i12 = 8;
            if (i7 >= 8) {
                i12 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24635a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f24636b, i12 << 1);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            this.f24636b = copyOf2;
            if (i7 != this.f24637c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i7) {
            int[] iArr2 = this.f24635a;
            int i13 = i11 + 1;
            Eb.n.M(i13, i11, i7, iArr2, iArr2);
            Object[] objArr2 = this.f24636b;
            Eb.n.P(objArr2, i13 << 1, objArr2, i11 << 1, this.f24637c << 1);
        }
        int i14 = this.f24637c;
        if (i7 == i14) {
            int[] iArr3 = this.f24635a;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.f24636b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f24637c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !kotlin.jvm.internal.l.a(obj2, k(d10))) {
            return false;
        }
        h(d10);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return j(d10, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !kotlin.jvm.internal.l.a(obj2, k(d10))) {
            return false;
        }
        j(d10, obj3);
        return true;
    }

    public final int size() {
        return this.f24637c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24637c * 28);
        sb2.append('{');
        int i7 = this.f24637c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f4 = f(i10);
            if (f4 != sb2) {
                sb2.append(f4);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object k = k(i10);
            if (k != sb2) {
                sb2.append(k);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
