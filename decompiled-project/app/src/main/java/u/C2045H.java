package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045H implements Sb.e, Set, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2043F f24601a;

    /* renamed from: b, reason: collision with root package name */
    public final C2043F f24602b;

    public C2045H(C2043F parent) {
        kotlin.jvm.internal.l.e(parent, "parent");
        this.f24601a = parent;
        this.f24602b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f24602b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        C2043F c2043f = this.f24602b;
        c2043f.getClass();
        int i7 = c2043f.g;
        for (Object obj : elements) {
            int d10 = c2043f.d(obj);
            c2043f.f24587b[d10] = obj;
            long[] jArr = c2043f.f24588c;
            int i10 = c2043f.f24589d;
            jArr[d10] = (i10 & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((d10 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            c2043f.f24589d = d10;
            if (c2043f.f24590e == Integer.MAX_VALUE) {
                c2043f.f24590e = d10;
            }
        }
        return i7 != c2043f.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f24602b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f24601a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f24601a.c(it.next())) {
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
        if (obj == null || C2045H.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f24601a, ((C2045H) obj).f24601a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f24601a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f24601a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new W.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f24602b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection elements) {
        int i7;
        kotlin.jvm.internal.l.e(elements, "elements");
        C2043F c2043f = this.f24602b;
        c2043f.getClass();
        int i10 = c2043f.g;
        Iterator it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = hashCode ^ (hashCode << 16);
            int i14 = i13 & 127;
            int i15 = c2043f.f24591f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = c2043f.f24586a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i12;
                long j = (((-i18) >> 63) & (jArr[i17 + i11] << (64 - i18))) | (jArr[i17] >>> i18);
                long j10 = (i14 * 72340172838076673L) ^ j;
                long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                    if (kotlin.jvm.internal.l.a(c2043f.f24587b[i7], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                }
                i12 = i19 + 8;
                i16 = (i16 + i12) & i15;
                i11 = 1;
            }
            if (i7 >= 0) {
                c2043f.h(i7);
            }
        }
        return i10 != c2043f.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return this.f24602b.i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f24601a.g;
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
        return this.f24601a.toString();
    }
}
