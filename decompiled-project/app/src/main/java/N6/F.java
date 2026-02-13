package N6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class F extends H0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f7225a;

    /* renamed from: b, reason: collision with root package name */
    public int f7226b;

    /* renamed from: c, reason: collision with root package name */
    public final H f7227c;

    public F(H h10, int i7) {
        int size = h10.size();
        Q5.e.n(i7, size);
        this.f7225a = size;
        this.f7226b = i7;
        this.f7227c = h10;
    }

    public final Object a(int i7) {
        return this.f7227c.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7226b < this.f7225a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7226b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7226b;
        this.f7226b = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7226b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7226b - 1;
        this.f7226b = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7226b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
