package N6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: N6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0438k extends C0430f implements SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f7301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0438k(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.f7301d = p0Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f7291b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0438k(this.f7301d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0438k(this.f7301d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0438k(this.f7301d, b().tailMap(obj));
    }
}
