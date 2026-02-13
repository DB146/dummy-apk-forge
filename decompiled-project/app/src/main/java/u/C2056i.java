package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056i implements Set, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24687a;

    /* renamed from: b, reason: collision with root package name */
    public final C2046I f24688b;

    public C2056i(C2046I parent, int i7) {
        this.f24687a = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.e(parent, "parent");
                this.f24688b = parent;
                return;
            default:
                kotlin.jvm.internal.l.e(parent, "parent");
                this.f24688b = parent;
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f24687a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.l.e(element, "element");
                return kotlin.jvm.internal.l.a(this.f24688b.g(element.getKey()), element.getValue());
            default:
                return this.f24688b.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f24687a) {
            case 0:
                kotlin.jvm.internal.l.e(elements, "elements");
                Collection<Map.Entry> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection) {
                    if (!kotlin.jvm.internal.l.a(this.f24688b.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.l.e(elements, "elements");
                Collection collection2 = elements;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!this.f24688b.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f24687a) {
            case 0:
                return this.f24688b.i();
            default:
                return this.f24688b.i();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24687a) {
            case 0:
                return O5.b.w(new C2055h(this, null));
            default:
                return O5.b.w(new C2062o(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f24687a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f24687a) {
            case 0:
                return this.f24688b.f24607e;
            default:
                return this.f24688b.f24607e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f24687a) {
            case 0:
                return kotlin.jvm.internal.k.a(this);
            default:
                return kotlin.jvm.internal.k.a(this);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f24687a) {
            case 0:
                kotlin.jvm.internal.l.e(array, "array");
                return kotlin.jvm.internal.k.b(this, array);
            default:
                kotlin.jvm.internal.l.e(array, "array");
                return kotlin.jvm.internal.k.b(this, array);
        }
    }
}
