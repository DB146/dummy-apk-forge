package N6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class p0 extends AbstractC0443p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient Map f7329d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f7330e;

    /* renamed from: f, reason: collision with root package name */
    public transient o0 f7331f;

    @Override // N6.AbstractC0443p
    public final Map a() {
        Map map = this.f7328c;
        if (map == null) {
            Map map2 = this.f7329d;
            map = map2 instanceof NavigableMap ? new C0432g(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C0437j(this, (SortedMap) map2) : new C0428e(this, map2);
            this.f7328c = map;
        }
        return map;
    }

    public final void c() {
        Map map = this.f7329d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f7330e = 0;
    }
}
