package Xb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11022b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11023c;

    /* renamed from: d, reason: collision with root package name */
    public int f11024d;

    public b(char c10, char c11, int i7) {
        this.f11021a = i7;
        this.f11022b = c11;
        boolean z8 = false;
        if (i7 <= 0 ? l.f(c10, c11) >= 0 : l.f(c10, c11) <= 0) {
            z8 = true;
        }
        this.f11023c = z8;
        this.f11024d = z8 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11023c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f11024d;
        if (i7 != this.f11022b) {
            this.f11024d = this.f11021a + i7;
        } else {
            if (!this.f11023c) {
                throw new NoSuchElementException();
            }
            this.f11023c = false;
        }
        return Character.valueOf((char) i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
