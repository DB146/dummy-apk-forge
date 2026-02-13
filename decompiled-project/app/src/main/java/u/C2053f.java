package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import v.AbstractC2121a;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053f implements Collection, Set, Sb.b, Sb.e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24670a = AbstractC2121a.f24921a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24671b = AbstractC2121a.f24923c;

    /* renamed from: c, reason: collision with root package name */
    public int f24672c;

    public C2053f(int i7) {
        if (i7 > 0) {
            AbstractC2065s.b(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int c10;
        int i10 = this.f24672c;
        if (obj == null) {
            c10 = AbstractC2065s.c(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            c10 = AbstractC2065s.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int[] iArr = this.f24670a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f24671b;
            AbstractC2065s.b(this, i12);
            if (i10 != this.f24672c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f24670a;
            if (iArr2.length != 0) {
                Eb.n.Q(0, iArr.length, 6, iArr, iArr2);
                Eb.n.R(objArr, 0, this.f24671b, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f24670a;
            int i13 = i11 + 1;
            Eb.n.M(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f24671b;
            Eb.n.P(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f24672c;
        if (i10 == i14) {
            int[] iArr4 = this.f24670a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i7;
                this.f24671b[i11] = obj;
                this.f24672c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        int size = elements.size() + this.f24672c;
        int i7 = this.f24672c;
        int[] iArr = this.f24670a;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f24671b;
            AbstractC2065s.b(this, size);
            int i10 = this.f24672c;
            if (i10 > 0) {
                Eb.n.Q(0, i10, 6, iArr, this.f24670a);
                Eb.n.R(objArr, 0, this.f24671b, this.f24672c, 6);
            }
        }
        if (this.f24672c != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    public final Object b(int i7) {
        int i10 = this.f24672c;
        Object[] objArr = this.f24671b;
        Object obj = objArr[i7];
        if (i10 <= 1) {
            clear();
        } else {
            int i11 = i10 - 1;
            int[] iArr = this.f24670a;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    Eb.n.M(i7, i12, i10, iArr, iArr);
                    Object[] objArr2 = this.f24671b;
                    Eb.n.P(objArr2, i7, objArr2, i12, i10);
                }
                this.f24671b[i11] = null;
            } else {
                AbstractC2065s.b(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
                if (i7 > 0) {
                    Eb.n.Q(0, i7, 6, iArr, this.f24670a);
                    Eb.n.R(objArr, 0, this.f24671b, i7, 6);
                }
                if (i7 < i11) {
                    int i13 = i7 + 1;
                    Eb.n.M(i7, i13, i10, iArr, this.f24670a);
                    Eb.n.P(objArr, i7, this.f24671b, i13, i10);
                }
            }
            if (i10 != this.f24672c) {
                throw new ConcurrentModificationException();
            }
            this.f24672c = i11;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f24672c != 0) {
            this.f24670a = AbstractC2121a.f24921a;
            this.f24671b = AbstractC2121a.f24923c;
            this.f24672c = 0;
        }
        if (this.f24672c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2065s.c(this, null, 0) : AbstractC2065s.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f24672c == ((Set) obj).size()) {
            try {
                int i7 = this.f24672c;
                for (int i10 = 0; i10 < i7; i10++) {
                    if (((Set) obj).contains(this.f24671b[i10])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f24670a;
        int i7 = this.f24672c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f24672c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2048a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c10 = obj == null ? AbstractC2065s.c(this, null, 0) : AbstractC2065s.c(this, obj, obj.hashCode());
        if (c10 < 0) {
            return false;
        }
        b(c10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        boolean z8 = false;
        for (int i7 = this.f24672c - 1; -1 < i7; i7--) {
            if (!Eb.o.V(elements, this.f24671b[i7])) {
                b(i7);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f24672c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Eb.n.T(this.f24671b, 0, this.f24672c);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        int i7 = this.f24672c;
        if (array.length < i7) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
        } else if (array.length > i7) {
            array[i7] = null;
        }
        Eb.n.P(this.f24671b, 0, array, 0, this.f24672c);
        return array;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24672c * 14);
        sb2.append('{');
        int i7 = this.f24672c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f24671b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
