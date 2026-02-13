package U;

import Eb.AbstractC0255f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0255f implements List, Collection, Sb.a {
    public abstract c C(b bVar);

    public abstract c D(int i7);

    public abstract c E(int i7, Object obj);

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Eb.AbstractC0250a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // Eb.AbstractC0255f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c o(int i7, Object obj);

    @Override // Eb.AbstractC0255f, java.util.List
    public final List subList(int i7, int i10) {
        return new T.a(this, i7, i10);
    }

    public abstract c t(Object obj);

    public c y(Collection collection) {
        f z8 = z();
        z8.addAll(collection);
        return z8.t();
    }

    public abstract f z();
}
