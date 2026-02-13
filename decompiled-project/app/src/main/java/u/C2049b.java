package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2052e f24661a;

    public C2049b(C2052e c2052e) {
        this.f24661a = c2052e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f24661a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f24661a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f24661a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            C2052e c2052e = this.f24661a;
            try {
                if (c2052e.f24637c == set.size()) {
                    if (c2052e.l(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2052e c2052e = this.f24661a;
        int i7 = 0;
        for (int i10 = c2052e.f24637c - 1; i10 >= 0; i10--) {
            Object f4 = c2052e.f(i10);
            i7 += f4 == null ? 0 : f4.hashCode();
        }
        return i7;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f24661a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2048a(this.f24661a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2052e c2052e = this.f24661a;
        int d10 = c2052e.d(obj);
        if (d10 < 0) {
            return false;
        }
        c2052e.h(d10);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f24661a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f24661a.n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f24661a.f24637c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2052e c2052e = this.f24661a;
        int i7 = c2052e.f24637c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = c2052e.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2052e c2052e = this.f24661a;
        int i7 = c2052e.f24637c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = c2052e.f(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
