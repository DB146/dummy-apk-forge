package N6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class E0 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7223a;

    /* renamed from: b, reason: collision with root package name */
    public final M6.m f7224b;

    public E0(Set set, M6.m mVar) {
        this.f7223a = set;
        this.f7224b = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Q5.e.k(this.f7224b.apply(obj));
        return this.f7223a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Q5.e.k(this.f7224b.apply(it.next()));
        }
        return this.f7223a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f7223a;
        boolean z8 = set instanceof RandomAccess;
        M6.m mVar = this.f7224b;
        if (!z8 || !(set instanceof List)) {
            Iterator it = set.iterator();
            mVar.getClass();
            while (it.hasNext()) {
                if (mVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        mVar.getClass();
        int i7 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!mVar.apply(obj)) {
                if (i10 > i7) {
                    try {
                        list.set(i7, obj);
                    } catch (IllegalArgumentException unused) {
                        r.r(list, mVar, i7, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        r.r(list, mVar, i7, i10);
                        return;
                    }
                }
                i7++;
            }
        }
        list.subList(i7, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z8;
        Set set = this.f7223a;
        set.getClass();
        try {
            z8 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z8 = false;
        }
        if (z8) {
            return this.f7224b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f7223a.iterator();
        M6.m mVar = this.f7224b;
        Q5.e.m(mVar, "predicate");
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (mVar.apply(it.next())) {
                break;
            }
            i7++;
        }
        return true ^ (i7 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f7223a.iterator();
        it.getClass();
        M6.m mVar = this.f7224b;
        mVar.getClass();
        return new M(it, mVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f7223a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f7223a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7224b.apply(next) && collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f7223a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f7224b.apply(next) && !collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f7223a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f7224b.apply(it.next())) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC0420a abstractC0420a = (AbstractC0420a) it;
            if (!abstractC0420a.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC0420a.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC0420a abstractC0420a = (AbstractC0420a) it;
            if (!abstractC0420a.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(abstractC0420a.next());
        }
    }
}
