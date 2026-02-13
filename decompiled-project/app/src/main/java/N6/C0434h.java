package N6;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: N6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434h extends C0438k implements NavigableSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f7296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434h(p0 p0Var, NavigableMap navigableMap) {
        super(p0Var, navigableMap);
        this.f7296e = p0Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0430f) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0434h(this.f7296e, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z8) {
        return new C0434h(this.f7296e, b().headMap(obj, z8));
    }

    @Override // N6.C0438k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // N6.C0438k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f7291b);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0426d c0426d = (C0426d) iterator();
        if (!c0426d.hasNext()) {
            return null;
        }
        Object next = c0426d.next();
        c0426d.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z10) {
        return new C0434h(this.f7296e, b().subMap(obj, z8, obj2, z10));
    }

    @Override // N6.C0438k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z8) {
        return new C0434h(this.f7296e, b().tailMap(obj, z8));
    }

    @Override // N6.C0438k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
