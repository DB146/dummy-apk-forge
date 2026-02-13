package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class X implements Collection, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24654a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24655b;

    public X() {
        int i7 = P.f24632a;
        this.f24655b = new C2043F(6);
    }

    public X(C2046I parent) {
        kotlin.jvm.internal.l.e(parent, "parent");
        this.f24655b = parent;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2043F) this.f24655b).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C2043F) this.f24655b).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f24654a) {
            case 0:
                return ((C2046I) this.f24655b).d(obj);
            default:
                return ((C2043F) this.f24655b).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f24654a) {
            case 0:
                kotlin.jvm.internal.l.e(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C2046I) this.f24655b).d(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((C2043F) this.f24655b).c(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f24654a) {
            case 0:
                return ((C2046I) this.f24655b).i();
            default:
                return ((C2043F) this.f24655b).g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24654a) {
            case 0:
                return O5.b.w(new W(this, null));
            default:
                C2043F c2043f = (C2043F) this.f24655b;
                c2043f.getClass();
                return new W.c(new C2045H(c2043f));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2043F) this.f24655b).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2043F) this.f24655b).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f24654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2043F) this.f24655b).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f24654a) {
            case 0:
                return ((C2046I) this.f24655b).f24607e;
            default:
                return ((C2043F) this.f24655b).g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f24654a) {
            case 0:
                return kotlin.jvm.internal.k.a(this);
            default:
                return kotlin.jvm.internal.k.a(this);
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f24654a) {
            case 0:
                kotlin.jvm.internal.l.e(array, "array");
                return kotlin.jvm.internal.k.b(this, array);
            default:
                return kotlin.jvm.internal.k.b(this, array);
        }
    }
}
