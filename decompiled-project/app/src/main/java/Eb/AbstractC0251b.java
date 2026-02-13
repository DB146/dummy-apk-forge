package Eb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Eb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0251b implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3870a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3871b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f3870a;
        if (i7 == 0) {
            this.f3870a = 3;
            a();
            if (this.f3870a != 1) {
                return false;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f3870a;
        if (i7 == 1) {
            this.f3870a = 0;
            return this.f3871b;
        }
        if (i7 != 2) {
            this.f3870a = 3;
            a();
            if (this.f3870a == 1) {
                this.f3870a = 0;
                return this.f3871b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
