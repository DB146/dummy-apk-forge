package N6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class F0 extends E0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f7223a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f7223a.iterator();
        it.getClass();
        M6.m mVar = this.f7224b;
        mVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, N6.E0] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new E0(((SortedSet) this.f7223a).headSet(obj), this.f7224b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f7223a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f7224b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, N6.E0] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new E0(((SortedSet) this.f7223a).subSet(obj, obj2), this.f7224b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, N6.E0] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new E0(((SortedSet) this.f7223a).tailSet(obj), this.f7224b);
    }
}
