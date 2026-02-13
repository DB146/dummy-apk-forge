package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: N6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f7272a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7273b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f7274c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f7275d = O.f7244a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f7276e;

    public C0422b(p0 p0Var) {
        this.f7276e = p0Var;
        this.f7272a = p0Var.f7329d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7272a.hasNext() || this.f7275d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7275d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7272a.next();
            this.f7273b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7274c = collection;
            this.f7275d = collection.iterator();
        }
        return this.f7275d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7275d.remove();
        Collection collection = this.f7274c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f7272a.remove();
        }
        p0 p0Var = this.f7276e;
        p0Var.f7330e--;
    }
}
