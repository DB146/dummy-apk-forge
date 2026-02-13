package N6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: N6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f7333a;

    /* renamed from: b, reason: collision with root package name */
    public int f7334b;

    /* renamed from: c, reason: collision with root package name */
    public int f7335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0448v f7336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0448v f7338f;

    public C0445s(C0448v c0448v, int i7) {
        this.f7337e = i7;
        this.f7338f = c0448v;
        this.f7336d = c0448v;
        this.f7333a = c0448v.f7353e;
        this.f7334b = c0448v.isEmpty() ? -1 : 0;
        this.f7335c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7334b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C0448v c0448v = this.f7336d;
        if (c0448v.f7353e != this.f7333a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7334b;
        this.f7335c = i7;
        switch (this.f7337e) {
            case 0:
                obj = this.f7338f.k()[i7];
                break;
            case 1:
                obj = new C0447u(this.f7338f, i7);
                break;
            default:
                obj = this.f7338f.l()[i7];
                break;
        }
        int i10 = this.f7334b + 1;
        if (i10 >= c0448v.f7354f) {
            i10 = -1;
        }
        this.f7334b = i10;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0448v c0448v = this.f7336d;
        if (c0448v.f7353e != this.f7333a) {
            throw new ConcurrentModificationException();
        }
        Q5.e.p("no calls to next() since the last call to remove()", this.f7335c >= 0);
        this.f7333a += 32;
        c0448v.remove(c0448v.k()[this.f7335c]);
        this.f7334b--;
        this.f7335c = -1;
    }
}
