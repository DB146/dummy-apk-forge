package N6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: N6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446t extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0448v f7340b;

    public /* synthetic */ C0446t(C0448v c0448v, int i7) {
        this.f7339a = i7;
        this.f7340b = c0448v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7339a) {
            case 0:
                this.f7340b.clear();
                return;
            default:
                this.f7340b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7339a) {
            case 0:
                C0448v c0448v = this.f7340b;
                Map c10 = c0448v.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e2 = c0448v.e(entry.getKey());
                    if (e2 != -1 && O5.b.o(c0448v.l()[e2], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7340b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7339a) {
            case 0:
                C0448v c0448v = this.f7340b;
                Map c10 = c0448v.c();
                return c10 != null ? c10.entrySet().iterator() : new C0445s(c0448v, 1);
            default:
                C0448v c0448v2 = this.f7340b;
                Map c11 = c0448v2.c();
                return c11 != null ? c11.keySet().iterator() : new C0445s(c0448v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7339a) {
            case 0:
                C0448v c0448v = this.f7340b;
                Map c10 = c0448v.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0448v.g()) {
                        int d10 = c0448v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0448v.f7349a;
                        Objects.requireNonNull(obj2);
                        int q10 = r.q(key, value, d10, obj2, c0448v.j(), c0448v.k(), c0448v.l());
                        if (q10 != -1) {
                            c0448v.f(q10, d10);
                            c0448v.f7354f--;
                            c0448v.f7353e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0448v c0448v2 = this.f7340b;
                Map c11 = c0448v2.c();
                return c11 != null ? c11.keySet().remove(obj) : c0448v2.h(obj) != C0448v.f7348x;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7339a) {
            case 0:
                return this.f7340b.size();
            default:
                return this.f7340b.size();
        }
    }
}
