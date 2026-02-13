package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class L implements Sb.e, Set, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2047J f24626a;

    /* renamed from: b, reason: collision with root package name */
    public final C2047J f24627b;

    public L(C2047J c2047j) {
        this.f24626a = c2047j;
        this.f24627b = c2047j;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f24627b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        C2047J c2047j = this.f24627b;
        c2047j.getClass();
        int i7 = c2047j.f24612d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c2047j.j(it.next());
        }
        return i7 != c2047j.f24612d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f24627b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f24626a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f24626a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f24626a, ((L) obj).f24626a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f24626a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f24626a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new W.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f24627b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        C2047J c2047j = this.f24627b;
        c2047j.getClass();
        int i7 = c2047j.f24612d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c2047j.i(it.next());
        }
        return i7 != c2047j.f24612d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        C2047J c2047j = this.f24627b;
        c2047j.getClass();
        Object[] objArr = c2047j.f24610b;
        int i7 = c2047j.f24612d;
        long[] jArr = c2047j.f24609a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!Eb.o.V(elements, objArr[i13])) {
                                c2047j.m(i13);
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i7 != c2047j.f24612d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f24626a.f24612d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        return kotlin.jvm.internal.k.b(this, array);
    }

    public final String toString() {
        return this.f24626a.toString();
    }
}
