package zc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final class e extends ArrayList {
    /* JADX WARN: Multi-variable type inference failed */
    public final xc.q b() {
        if (isEmpty()) {
            return null;
        }
        return (xc.q) get(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            xc.q qVar = (xc.q) it.next();
            xc.l lVar = qVar.f26368a;
            if (lVar != null) {
                lVar.W(qVar);
            }
        }
        super.clear();
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.add(((xc.l) it.next()).E());
        }
        return arrayList;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        xc.q qVar = (xc.q) super.remove(i7);
        xc.l lVar = qVar.f26368a;
        if (lVar != null) {
            lVar.W(qVar);
        }
        return (xc.l) qVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        xc.q qVar = (xc.q) super.remove(indexOf);
        xc.l lVar = qVar.f26368a;
        if (lVar != null) {
            lVar.W(qVar);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (predicate.test((xc.q) it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i7 = 0; i7 < size(); i7++) {
            xc.l lVar = (xc.l) ((xc.q) unaryOperator.apply((xc.q) get(i7)));
            vc.i.D(lVar);
            xc.q qVar = (xc.q) super.set(i7, lVar);
            qVar.X(lVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (!collection.contains((xc.q) it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        xc.l lVar = (xc.l) obj;
        vc.i.D(lVar);
        xc.q qVar = (xc.q) super.set(i7, lVar);
        qVar.X(lVar);
        return (xc.l) qVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return (String) stream().map(new wc.b(7)).collect(wc.l.k("\n"));
    }
}
