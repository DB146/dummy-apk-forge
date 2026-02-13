package N6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class T extends W {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f7258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(l0 l0Var, int i7) {
        super(0);
        this.f7257b = i7;
        this.f7258c = l0Var;
    }

    @Override // N6.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7257b) {
            case 0:
                this.f7258c.clear();
                return;
            default:
                this.f7258c.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        l0 l0Var;
        Object obj2;
        switch (this.f7257b) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (l0Var = this.f7258c).get(key)) != null && l0Var.f7312f.c().a().c(entry.getValue(), obj2);
            default:
                return this.f7258c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f7257b) {
            case 0:
                return this.f7258c.isEmpty();
            default:
                return this.f7258c.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7257b) {
            case 0:
                return new S(this.f7258c, 0);
            default:
                return new S(this.f7258c, 1);
        }
    }

    @Override // N6.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        switch (this.f7257b) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f7258c.remove(key, entry.getValue());
            default:
                return this.f7258c.remove(obj) != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7257b) {
            case 0:
                return this.f7258c.size();
            default:
                return this.f7258c.size();
        }
    }
}
