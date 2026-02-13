package I7;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final c f5243a;

    public f(c cVar) {
        this.f5243a = cVar;
    }

    public f(List list, Comparator comparator) {
        Map emptyMap = Collections.emptyMap();
        this.f5243a = list.size() < 25 ? b.E(list, emptyMap, comparator) : q3.i.l(list, emptyMap, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f5243a.equals(((f) obj).f5243a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5243a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f5243a.iterator(), 0);
    }
}
