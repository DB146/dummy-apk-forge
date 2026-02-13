package N6;

import java.util.NoSuchElementException;

/* renamed from: N6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0420a extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7267a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f7268b;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f7267a;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            return true;
        }
        if (b2 == 2) {
            return false;
        }
        this.f7267a = 4;
        this.f7268b = a();
        if (this.f7267a == 3) {
            return false;
        }
        this.f7267a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7267a = 2;
        Object obj = this.f7268b;
        this.f7268b = null;
        return obj;
    }
}
