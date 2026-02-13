package A0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class r implements List, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0029s f303c;

    public r(C0029s c0029s, int i7, int i10) {
        this.f303c = c0029s;
        this.f301a = i7;
        this.f302b = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof c0.l) && indexOf((c0.l) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((c0.l) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object e2 = this.f303c.f306a.e(i7 + this.f301a);
        kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (c0.l) e2;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof c0.l)) {
            return -1;
        }
        c0.l lVar = (c0.l) obj;
        int i7 = this.f301a;
        int i10 = this.f302b;
        if (i7 > i10) {
            return -1;
        }
        int i11 = i7;
        while (!kotlin.jvm.internal.l.a(this.f303c.f306a.e(i11), lVar)) {
            if (i11 == i10) {
                return -1;
            }
            i11++;
        }
        return i11 - i7;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i7 = this.f301a;
        return new C0028q(this.f303c, i7, i7, this.f302b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof c0.l)) {
            return -1;
        }
        c0.l lVar = (c0.l) obj;
        int i7 = this.f302b;
        int i10 = this.f301a;
        if (i10 > i7) {
            return -1;
        }
        while (!kotlin.jvm.internal.l.a(this.f303c.f306a.e(i7), lVar)) {
            if (i7 == i10) {
                return -1;
            }
            i7--;
        }
        return i7 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i7 = this.f301a;
        return new C0028q(this.f303c, i7, i7, this.f302b);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        int i10 = this.f301a;
        int i11 = this.f302b;
        return new C0028q(this.f303c, i7 + i10, i10, i11);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f302b - this.f301a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        int i11 = this.f301a;
        return new r(this.f303c, i7 + i11, i11 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
