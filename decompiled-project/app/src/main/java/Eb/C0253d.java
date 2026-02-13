package Eb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: Eb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0253d extends C0252c implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0255f f3875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253d(AbstractC0255f abstractC0255f, int i7) {
        super(abstractC0255f, 0);
        this.f3875d = abstractC0255f;
        int b2 = abstractC0255f.b();
        if (i7 < 0 || i7 > b2) {
            throw new IndexOutOfBoundsException(X.c.e(i7, b2, "index: ", ", size: "));
        }
        this.f3873b = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3873b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3873b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3873b - 1;
        this.f3873b = i7;
        return this.f3875d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3873b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
