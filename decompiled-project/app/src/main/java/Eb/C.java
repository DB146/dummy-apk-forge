package Eb;

import a0.AbstractC0692s;
import a0.C0698y;
import java.util.List;
import java.util.ListIterator;
import y7.u0;

/* loaded from: classes2.dex */
public final class C implements ListIterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3853c;

    public C(D d10, int i7) {
        this.f3853c = d10;
        if (i7 >= 0 && i7 <= d10.b()) {
            this.f3852b = ((List) d10.f3855b).listIterator(d10.b() - i7);
        } else {
            StringBuilder r10 = h3.o.r(i7, "Position index ", " must be in range [");
            r10.append(new Xb.e(0, d10.b(), 1));
            r10.append("].");
            throw new IndexOutOfBoundsException(r10.toString());
        }
    }

    public C(kotlin.jvm.internal.t tVar, C0698y c0698y) {
        this.f3852b = tVar;
        this.f3853c = c0698y;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f3851a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3851a) {
            case 0:
                return ((ListIterator) this.f3852b).hasPrevious();
            default:
                return ((kotlin.jvm.internal.t) this.f3852b).f19132a < ((C0698y) this.f3853c).f12440d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3851a) {
            case 0:
                return ((ListIterator) this.f3852b).hasNext();
            default:
                return ((kotlin.jvm.internal.t) this.f3852b).f19132a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3851a) {
            case 0:
                return ((ListIterator) this.f3852b).previous();
            default:
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) this.f3852b;
                int i7 = tVar.f19132a + 1;
                C0698y c0698y = (C0698y) this.f3853c;
                AbstractC0692s.a(i7, c0698y.f12440d);
                tVar.f19132a = i7;
                return c0698y.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3851a) {
            case 0:
                return u0.s((D) this.f3853c) - ((ListIterator) this.f3852b).previousIndex();
            default:
                return ((kotlin.jvm.internal.t) this.f3852b).f19132a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3851a) {
            case 0:
                return ((ListIterator) this.f3852b).next();
            default:
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) this.f3852b;
                int i7 = tVar.f19132a;
                C0698y c0698y = (C0698y) this.f3853c;
                AbstractC0692s.a(i7, c0698y.f12440d);
                tVar.f19132a = i7 - 1;
                return c0698y.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f3851a) {
            case 0:
                return u0.s((D) this.f3853c) - ((ListIterator) this.f3852b).nextIndex();
            default:
                return ((kotlin.jvm.internal.t) this.f3852b).f19132a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f3851a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3851a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }
}
