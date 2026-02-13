package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2052e f24666a;

    public C2051d(C2052e c2052e) {
        this.f24666a = c2052e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f24666a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f24666a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f24666a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2048a(this.f24666a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2052e c2052e = this.f24666a;
        int a9 = c2052e.a(obj);
        if (a9 < 0) {
            return false;
        }
        c2052e.h(a9);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2052e c2052e = this.f24666a;
        int i7 = c2052e.f24637c;
        int i10 = 0;
        boolean z8 = false;
        while (i10 < i7) {
            if (collection.contains(c2052e.k(i10))) {
                c2052e.h(i10);
                i10--;
                i7--;
                z8 = true;
            }
            i10++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2052e c2052e = this.f24666a;
        int i7 = c2052e.f24637c;
        int i10 = 0;
        boolean z8 = false;
        while (i10 < i7) {
            if (!collection.contains(c2052e.k(i10))) {
                c2052e.h(i10);
                i10--;
                i7--;
                z8 = true;
            }
            i10++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f24666a.f24637c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2052e c2052e = this.f24666a;
        int i7 = c2052e.f24637c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = c2052e.k(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2052e c2052e = this.f24666a;
        int i7 = c2052e.f24637c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = c2052e.k(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
