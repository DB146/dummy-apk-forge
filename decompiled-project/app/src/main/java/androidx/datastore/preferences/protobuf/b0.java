package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import u.C2050c;
import u.C2052e;

/* loaded from: classes.dex */
public class b0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f13380b;

    public /* synthetic */ b0(Map map, int i7) {
        this.f13379a = i7;
        this.f13380b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f13379a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Y) this.f13380b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f13379a) {
            case 0:
                ((Y) this.f13380b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f13379a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Y) this.f13380b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f13379a) {
            case 0:
                return new a0((Y) this.f13380b);
            default:
                return new C2050c((C2052e) this.f13380b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f13379a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Y) this.f13380b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f13379a) {
            case 0:
                return ((Y) this.f13380b).size();
            default:
                return ((C2052e) this.f13380b).f24637c;
        }
    }
}
