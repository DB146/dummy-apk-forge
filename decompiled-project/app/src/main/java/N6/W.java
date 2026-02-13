package N6;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class W extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7259a;

    public /* synthetic */ W(int i7) {
        this.f7259a = i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f7259a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f7259a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f7259a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f7259a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f7259a) {
            case 1:
                collection.getClass();
                if (collection instanceof q0) {
                    collection = ((q0) collection).g();
                }
                boolean z8 = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z8 |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    collection.getClass();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z8 = true;
                        }
                    }
                }
                return z8;
            case 2:
                throw new UnsupportedOperationException();
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f7259a) {
            case 1:
                collection.getClass();
                return super.retainAll(collection);
            case 2:
                throw new UnsupportedOperationException();
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        switch (this.f7259a) {
            case 0:
                return l0.a(this).toArray();
            default:
                return super.toArray();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        switch (this.f7259a) {
            case 0:
                return l0.a(this).toArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }
}
