package N6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: N6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0426d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7282a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f7283b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7285d;

    public C0426d(C0428e c0428e) {
        this.f7285d = c0428e;
        this.f7283b = c0428e.f7289c.entrySet().iterator();
    }

    public C0426d(C0430f c0430f, Iterator it) {
        this.f7285d = c0430f;
        this.f7283b = it;
    }

    public C0426d(C0440m c0440m) {
        this.f7285d = c0440m;
        Collection collection = c0440m.f7317b;
        this.f7284c = collection;
        this.f7283b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public C0426d(C0440m c0440m, ListIterator listIterator) {
        this.f7285d = c0440m;
        this.f7284c = c0440m.f7317b;
        this.f7283b = listIterator;
    }

    public void a() {
        C0440m c0440m = (C0440m) this.f7285d;
        c0440m.i();
        if (c0440m.f7317b != ((Collection) this.f7284c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7282a) {
            case 0:
                return this.f7283b.hasNext();
            case 1:
                return this.f7283b.hasNext();
            default:
                a();
                return this.f7283b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7282a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f7283b.next();
                this.f7284c = (Collection) entry.getValue();
                return ((C0428e) this.f7285d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f7283b.next();
                this.f7284c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f7283b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7282a) {
            case 0:
                Q5.e.p("no calls to next() since the last call to remove()", ((Collection) this.f7284c) != null);
                this.f7283b.remove();
                ((C0428e) this.f7285d).f7290d.f7330e -= ((Collection) this.f7284c).size();
                ((Collection) this.f7284c).clear();
                this.f7284c = null;
                return;
            case 1:
                Q5.e.p("no calls to next() since the last call to remove()", ((Map.Entry) this.f7284c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f7284c).getValue();
                this.f7283b.remove();
                ((C0430f) this.f7285d).f7292c.f7330e -= collection.size();
                collection.clear();
                this.f7284c = null;
                return;
            default:
                this.f7283b.remove();
                C0440m c0440m = (C0440m) this.f7285d;
                p0 p0Var = c0440m.f7320e;
                p0Var.f7330e--;
                c0440m.o();
                return;
        }
    }
}
