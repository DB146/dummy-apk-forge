package A0;

import a0.AbstractC0692s;
import a0.C0691r;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import u.C2042E;

/* renamed from: A0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028q implements ListIterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295a;

    /* renamed from: b, reason: collision with root package name */
    public int f296b;

    /* renamed from: c, reason: collision with root package name */
    public int f297c;

    /* renamed from: d, reason: collision with root package name */
    public int f298d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f299e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0028q(C0029s c0029s, int i7, int i10) {
        this(c0029s, (i10 & 1) != 0 ? 0 : i7, 0, c0029s.f306a.f24585b);
        this.f295a = 0;
    }

    public C0028q(C0029s c0029s, int i7, int i10, int i11) {
        this.f295a = 0;
        this.f299e = c0029s;
        this.f296b = i7;
        this.f297c = i10;
        this.f298d = i11;
    }

    public C0028q(Fb.a aVar, int i7) {
        int i10;
        this.f295a = 1;
        this.f299e = aVar;
        this.f296b = i7;
        this.f297c = -1;
        i10 = ((AbstractList) aVar).modCount;
        this.f298d = i10;
    }

    public C0028q(Fb.b bVar, int i7) {
        int i10;
        this.f295a = 2;
        this.f299e = bVar;
        this.f296b = i7;
        this.f297c = -1;
        i10 = ((AbstractList) bVar).modCount;
        this.f298d = i10;
    }

    public C0028q(C0691r c0691r, int i7) {
        this.f295a = 3;
        this.f299e = c0691r;
        this.f296b = i7 - 1;
        this.f297c = -1;
        this.f298d = c0691r.C();
    }

    public void a() {
        int i7;
        i7 = ((AbstractList) ((Fb.a) this.f299e).f4184e).modCount;
        if (i7 != this.f298d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        int i10;
        switch (this.f295a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i11 = this.f296b;
                this.f296b = i11 + 1;
                Fb.a aVar = (Fb.a) this.f299e;
                aVar.add(i11, obj);
                this.f297c = -1;
                i7 = ((AbstractList) aVar).modCount;
                this.f298d = i7;
                return;
            case 2:
                b();
                int i12 = this.f296b;
                this.f296b = i12 + 1;
                Fb.b bVar = (Fb.b) this.f299e;
                bVar.add(i12, obj);
                this.f297c = -1;
                i10 = ((AbstractList) bVar).modCount;
                this.f298d = i10;
                return;
            default:
                c();
                int i13 = this.f296b + 1;
                C0691r c0691r = (C0691r) this.f299e;
                c0691r.add(i13, obj);
                this.f297c = -1;
                this.f296b++;
                this.f298d = c0691r.C();
                return;
        }
    }

    public void b() {
        int i7;
        i7 = ((AbstractList) ((Fb.b) this.f299e)).modCount;
        if (i7 != this.f298d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((C0691r) this.f299e).C() != this.f298d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f295a) {
            case 0:
                return this.f296b < this.f298d;
            case 1:
                return this.f296b < ((Fb.a) this.f299e).f4182c;
            case 2:
                return this.f296b < ((Fb.b) this.f299e).f4187b;
            default:
                return this.f296b < ((C0691r) this.f299e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f295a) {
            case 0:
                return this.f296b > this.f297c;
            case 1:
                return this.f296b > 0;
            case 2:
                return this.f296b > 0;
            default:
                return this.f296b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f295a) {
            case 0:
                C2042E c2042e = ((C0029s) this.f299e).f306a;
                int i7 = this.f296b;
                this.f296b = i7 + 1;
                Object e2 = c2042e.e(i7);
                kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (c0.l) e2;
            case 1:
                a();
                int i10 = this.f296b;
                Fb.a aVar = (Fb.a) this.f299e;
                if (i10 >= aVar.f4182c) {
                    throw new NoSuchElementException();
                }
                this.f296b = i10 + 1;
                this.f297c = i10;
                return aVar.f4180a[aVar.f4181b + i10];
            case 2:
                b();
                int i11 = this.f296b;
                Fb.b bVar = (Fb.b) this.f299e;
                if (i11 >= bVar.f4187b) {
                    throw new NoSuchElementException();
                }
                this.f296b = i11 + 1;
                this.f297c = i11;
                return bVar.f4186a[i11];
            default:
                c();
                int i12 = this.f296b + 1;
                this.f297c = i12;
                C0691r c0691r = (C0691r) this.f299e;
                AbstractC0692s.a(i12, c0691r.size());
                Object obj = c0691r.get(i12);
                this.f296b = i12;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f295a) {
            case 0:
                return this.f296b - this.f297c;
            case 1:
                return this.f296b;
            case 2:
                return this.f296b;
            default:
                return this.f296b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f295a) {
            case 0:
                C2042E c2042e = ((C0029s) this.f299e).f306a;
                int i7 = this.f296b - 1;
                this.f296b = i7;
                Object e2 = c2042e.e(i7);
                kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (c0.l) e2;
            case 1:
                a();
                int i10 = this.f296b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f296b = i11;
                this.f297c = i11;
                Fb.a aVar = (Fb.a) this.f299e;
                return aVar.f4180a[aVar.f4181b + i11];
            case 2:
                b();
                int i12 = this.f296b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f296b = i13;
                this.f297c = i13;
                return ((Fb.b) this.f299e).f4186a[i13];
            default:
                c();
                int i14 = this.f296b;
                C0691r c0691r = (C0691r) this.f299e;
                AbstractC0692s.a(i14, c0691r.size());
                int i15 = this.f296b;
                this.f297c = i15;
                this.f296b--;
                return c0691r.get(i15);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f295a) {
            case 0:
                return (this.f296b - this.f297c) - 1;
            case 1:
                return this.f296b - 1;
            case 2:
                return this.f296b - 1;
            default:
                return this.f296b;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7;
        int i10;
        switch (this.f295a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i11 = this.f297c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                Fb.a aVar = (Fb.a) this.f299e;
                aVar.o(i11);
                this.f296b = this.f297c;
                this.f297c = -1;
                i7 = ((AbstractList) aVar).modCount;
                this.f298d = i7;
                return;
            case 2:
                b();
                int i12 = this.f297c;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                Fb.b bVar = (Fb.b) this.f299e;
                bVar.o(i12);
                this.f296b = this.f297c;
                this.f297c = -1;
                i10 = ((AbstractList) bVar).modCount;
                this.f298d = i10;
                return;
            default:
                c();
                int i13 = this.f296b;
                C0691r c0691r = (C0691r) this.f299e;
                c0691r.remove(i13);
                this.f296b--;
                this.f297c = -1;
                this.f298d = c0691r.C();
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f295a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i7 = this.f297c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((Fb.a) this.f299e).set(i7, obj);
                return;
            case 2:
                b();
                int i10 = this.f297c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((Fb.b) this.f299e).set(i10, obj);
                return;
            default:
                c();
                int i11 = this.f297c;
                if (i11 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                C0691r c0691r = (C0691r) this.f299e;
                c0691r.set(i11, obj);
                this.f298d = c0691r.C();
                return;
        }
    }
}
