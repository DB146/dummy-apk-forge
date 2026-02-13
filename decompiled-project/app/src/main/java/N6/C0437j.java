package N6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: N6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0437j extends C0428e implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f7298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f7299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437j(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.f7299f = p0Var;
    }

    public SortedSet b() {
        return new C0438k(this.f7299f, d());
    }

    @Override // N6.C0428e, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f7298e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b2 = b();
        this.f7298e = b2;
        return b2;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f7289c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0437j(this.f7299f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0437j(this.f7299f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0437j(this.f7299f, d().tailMap(obj));
    }
}
