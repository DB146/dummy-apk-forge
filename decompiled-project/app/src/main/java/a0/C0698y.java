package a0;

import Eb.C;
import Q.AbstractC0495i0;
import h3.H;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698y implements List, Sb.c {

    /* renamed from: a, reason: collision with root package name */
    public final C0691r f12437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12438b;

    /* renamed from: c, reason: collision with root package name */
    public int f12439c;

    /* renamed from: d, reason: collision with root package name */
    public int f12440d;

    public C0698y(C0691r c0691r, int i7, int i10) {
        this.f12437a = c0691r;
        this.f12438b = i7;
        this.f12439c = c0691r.C();
        this.f12440d = i10 - i7;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        b();
        int i10 = this.f12438b + i7;
        C0691r c0691r = this.f12437a;
        c0691r.add(i10, obj);
        this.f12440d++;
        this.f12439c = c0691r.C();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i7 = this.f12438b + this.f12440d;
        C0691r c0691r = this.f12437a;
        c0691r.add(i7, obj);
        this.f12440d++;
        this.f12439c = c0691r.C();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        b();
        int i10 = i7 + this.f12438b;
        C0691r c0691r = this.f12437a;
        boolean addAll = c0691r.addAll(i10, collection);
        if (addAll) {
            this.f12440d = collection.size() + this.f12440d;
            this.f12439c = c0691r.C();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f12440d, collection);
    }

    public final void b() {
        if (this.f12437a.C() != this.f12439c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        if (this.f12440d > 0) {
            b();
            C0691r c0691r = this.f12437a;
            int i10 = this.f12438b;
            int i11 = this.f12440d + i10;
            do {
                synchronized (AbstractC0692s.f12416a) {
                    C0690q c0690q = c0691r.f12415a;
                    kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                    i7 = c0690q2.f12413d;
                    cVar = c0690q2.f12412c;
                }
                kotlin.jvm.internal.l.b(cVar);
                U.f z8 = cVar.z();
                z8.subList(i10, i11).clear();
                U.c t5 = z8.t();
                if (kotlin.jvm.internal.l.a(t5, cVar)) {
                    break;
                }
                C0690q c0690q3 = c0691r.f12415a;
                kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC0688o.f12405b) {
                    k = AbstractC0688o.k();
                    o10 = C0691r.o((C0690q) AbstractC0688o.w(c0690q3, c0691r, k), i7, t5, true);
                }
                AbstractC0688o.n(k, c0691r);
            } while (!o10);
            this.f12440d = 0;
            this.f12439c = this.f12437a.C();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        b();
        AbstractC0692s.a(i7, this.f12440d);
        return this.f12437a.get(this.f12438b + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i7 = this.f12440d;
        int i10 = this.f12438b;
        Iterator it = H.I(i10, i7 + i10).iterator();
        while (it.hasNext()) {
            int a9 = ((Eb.z) it).a();
            if (kotlin.jvm.internal.l.a(obj, this.f12437a.get(a9))) {
                return a9 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12440d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i7 = this.f12440d;
        int i10 = this.f12438b;
        for (int i11 = (i7 + i10) - 1; i11 >= i10; i11--) {
            if (kotlin.jvm.internal.l.a(obj, this.f12437a.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.t, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        b();
        ?? obj = new Object();
        obj.f19132a = i7 - 1;
        return new C((kotlin.jvm.internal.t) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        b();
        int i10 = this.f12438b + i7;
        C0691r c0691r = this.f12437a;
        Object remove = c0691r.remove(i10);
        this.f12440d--;
        this.f12439c = c0691r.C();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        b();
        C0691r c0691r = this.f12437a;
        int i10 = this.f12438b;
        int i11 = this.f12440d + i10;
        int size = c0691r.size();
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = c0691r.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.f z8 = cVar.z();
            z8.subList(i10, i11).retainAll(collection);
            U.c t5 = z8.t();
            if (kotlin.jvm.internal.l.a(t5, cVar)) {
                break;
            }
            C0690q c0690q3 = c0691r.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = C0691r.o((C0690q) AbstractC0688o.w(c0690q3, c0691r, k), i7, t5, true);
            }
            AbstractC0688o.n(k, c0691r);
        } while (!o10);
        int size2 = size - c0691r.size();
        if (size2 > 0) {
            this.f12439c = this.f12437a.C();
            this.f12440d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC0692s.a(i7, this.f12440d);
        b();
        int i10 = i7 + this.f12438b;
        C0691r c0691r = this.f12437a;
        Object obj2 = c0691r.set(i10, obj);
        this.f12439c = c0691r.C();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12440d;
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        if (!(i7 >= 0 && i7 <= i10 && i10 <= this.f12440d)) {
            AbstractC0495i0.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i11 = this.f12438b;
        return new C0698y(this.f12437a, i7 + i11, i10 + i11);
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
