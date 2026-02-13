package U;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f9385a;

    /* renamed from: b, reason: collision with root package name */
    public int f9386b;

    public a(int i7, int i10) {
        this.f9385a = i7;
        this.f9386b = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9385a < this.f9386b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9385a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9385a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9385a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
