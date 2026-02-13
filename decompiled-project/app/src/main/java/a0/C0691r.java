package a0;

import A0.C0028q;
import Q.AbstractC0495i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: a0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691r implements InterfaceC0695v, List, RandomAccess, Sb.c {

    /* renamed from: a, reason: collision with root package name */
    public C0690q f12415a;

    public C0691r() {
        U.i iVar = U.i.f9409b;
        AbstractC0682i k = AbstractC0688o.k();
        C0690q c0690q = new C0690q(k.g(), iVar);
        if (!(k instanceof C0677d)) {
            c0690q.f12436b = new C0690q(1, iVar);
        }
        this.f12415a = c0690q;
    }

    public static boolean o(C0690q c0690q, int i7, U.c cVar, boolean z8) {
        boolean z10;
        synchronized (AbstractC0692s.f12416a) {
            try {
                int i10 = c0690q.f12413d;
                if (i10 == i7) {
                    c0690q.f12412c = cVar;
                    z10 = true;
                    if (z8) {
                        c0690q.f12414e++;
                    }
                    c0690q.f12413d = i10 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final int C() {
        C0690q c0690q = this.f12415a;
        kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C0690q) AbstractC0688o.i(c0690q)).f12414e;
    }

    public final boolean D(Rb.c cVar) {
        int i7;
        U.c cVar2;
        Object invoke;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar2 = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar2);
            U.f z8 = cVar2.z();
            invoke = cVar.invoke(z8);
            U.c t5 = z8.t();
            if (kotlin.jvm.internal.l.a(t5, cVar2)) {
                break;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i7, t5, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i10 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c o11 = cVar.o(i7, obj);
            if (o11.equals(cVar)) {
                return;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i10, o11, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c t5 = cVar.t(obj);
            if (t5.equals(cVar)) {
                return false;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i7, t5, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return D(new E.w(i7, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c y10 = cVar.y(collection);
            if (kotlin.jvm.internal.l.a(y10, cVar)) {
                return false;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i7, y10, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return true;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f12415a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0682i k;
        C0690q c0690q = this.f12415a;
        kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AbstractC0688o.f12405b) {
            k = AbstractC0688o.k();
            C0690q c0690q2 = (C0690q) AbstractC0688o.w(c0690q, this, k);
            synchronized (AbstractC0692s.f12416a) {
                c0690q2.f12412c = U.i.f9409b;
                c0690q2.f12413d++;
                c0690q2.f12414e++;
            }
        }
        AbstractC0688o.n(k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return y().f12412c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return y().f12412c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return y().f12412c.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return y().f12412c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return y().f12412c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return y().f12412c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0028q(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C0028q(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i10;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        Object obj = get(i7);
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i10 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c D10 = cVar.D(i7);
            if (kotlin.jvm.internal.l.a(D10, cVar)) {
                break;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i10, D10, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            int indexOf = cVar.indexOf(obj);
            U.c D10 = indexOf != -1 ? cVar.D(indexOf) : cVar;
            if (kotlin.jvm.internal.l.a(D10, cVar)) {
                return false;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i7, D10, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i7 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c C2 = cVar.C(new U.b(0, collection));
            if (kotlin.jvm.internal.l.a(C2, cVar)) {
                return false;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i7, C2, true);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return D(new U.b(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        int i10;
        U.c cVar;
        AbstractC0682i k;
        boolean o10;
        Object obj2 = get(i7);
        do {
            synchronized (AbstractC0692s.f12416a) {
                C0690q c0690q = this.f12415a;
                kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0690q c0690q2 = (C0690q) AbstractC0688o.i(c0690q);
                i10 = c0690q2.f12413d;
                cVar = c0690q2.f12412c;
            }
            kotlin.jvm.internal.l.b(cVar);
            U.c E10 = cVar.E(i7, obj);
            if (E10.equals(cVar)) {
                break;
            }
            C0690q c0690q3 = this.f12415a;
            kotlin.jvm.internal.l.c(c0690q3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                o10 = o((C0690q) AbstractC0688o.w(c0690q3, this, k), i10, E10, false);
            }
            AbstractC0688o.n(k, this);
        } while (!o10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return y().f12412c.b();
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        if (!(i7 >= 0 && i7 <= i10 && i10 <= size())) {
            AbstractC0495i0.a("fromIndex or toIndex are out of bounds");
        }
        return new C0698y(this, i7, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    public final String toString() {
        C0690q c0690q = this.f12415a;
        kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C0690q) AbstractC0688o.i(c0690q)).f12412c + ")@" + hashCode();
    }

    public final C0690q y() {
        C0690q c0690q = this.f12415a;
        kotlin.jvm.internal.l.c(c0690q, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C0690q) AbstractC0688o.t(c0690q, this);
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        abstractC0697x.f12436b = this.f12415a;
        this.f12415a = (C0690q) abstractC0697x;
    }
}
