package A0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import u.C2042E;
import v.AbstractC2121a;

/* renamed from: A0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029s implements List, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2042E f306a = new C2042E(16);

    /* renamed from: b, reason: collision with root package name */
    public final u.z f307b = new u.z(16);

    /* renamed from: c, reason: collision with root package name */
    public int f308c = -1;

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

    public final long b() {
        long a9 = AbstractC0017g.a(Float.POSITIVE_INFINITY, false, false);
        int i7 = this.f308c + 1;
        int s3 = y7.u0.s(this);
        if (i7 <= s3) {
            while (true) {
                u.z zVar = this.f307b;
                if (i7 < 0) {
                    zVar.getClass();
                    break;
                }
                if (i7 >= zVar.f24736b) {
                    break;
                }
                long j = zVar.f24735a[i7];
                if (AbstractC0017g.g(j, a9) < 0) {
                    a9 = j;
                }
                if (AbstractC0017g.j(a9) < 0.0f && AbstractC0017g.o(a9)) {
                    return a9;
                }
                if (i7 == s3) {
                    break;
                }
                i7++;
            }
            AbstractC2121a.d("Index must be between 0 and size");
            throw null;
        }
        return a9;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f308c = -1;
        this.f306a.c();
        this.f307b.f24736b = 0;
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
        Object e2 = this.f306a.e(i7);
        kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (c0.l) e2;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof c0.l)) {
            return -1;
        }
        c0.l lVar = (c0.l) obj;
        int s3 = y7.u0.s(this);
        if (s3 < 0) {
            return -1;
        }
        int i7 = 0;
        while (!kotlin.jvm.internal.l.a(this.f306a.e(i7), lVar)) {
            if (i7 == s3) {
                return -1;
            }
            i7++;
        }
        return i7;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f306a.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0028q(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof c0.l)) {
            return -1;
        }
        c0.l lVar = (c0.l) obj;
        for (int s3 = y7.u0.s(this); -1 < s3; s3--) {
            if (kotlin.jvm.internal.l.a(this.f306a.e(s3), lVar)) {
                return s3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0028q(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C0028q(this, i7, 6);
    }

    public final void o(int i7, int i10) {
        if (i7 >= i10) {
            return;
        }
        this.f306a.j(i7, i10);
        u.z zVar = this.f307b;
        if (i7 >= 0) {
            int i11 = zVar.f24736b;
            if (i7 <= i11 && i10 >= 0 && i10 <= i11) {
                if (i10 < i7) {
                    AbstractC2121a.c("The end index must be < start index");
                    throw null;
                }
                if (i10 != i7) {
                    if (i10 < i11) {
                        long[] jArr = zVar.f24735a;
                        Eb.n.O(jArr, jArr, i7, i10, i11);
                    }
                    zVar.f24736b -= i10 - i7;
                    return;
                }
                return;
            }
        } else {
            zVar.getClass();
        }
        AbstractC2121a.d("Index must be between 0 and size");
        throw null;
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
        return this.f306a.f24585b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        return new r(this, i7, i10);
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
