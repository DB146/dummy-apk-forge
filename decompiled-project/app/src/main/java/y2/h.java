package y2;

import B4.j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u.AbstractC2065s;
import u.U;
import v2.q;

/* loaded from: classes.dex */
public final class h implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f26790a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f26792c;

    public h(j jVar) {
        this.f26792c = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26790a + 1 < ((U) this.f26792c.f2091d).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26791b = true;
        U u3 = (U) this.f26792c.f2091d;
        int i7 = this.f26790a + 1;
        this.f26790a = i7;
        return (q) u3.g(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26791b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        U u3 = (U) this.f26792c.f2091d;
        ((q) u3.g(this.f26790a)).f25018c = null;
        int i7 = this.f26790a;
        Object[] objArr = u3.f24640c;
        Object obj = objArr[i7];
        Object obj2 = AbstractC2065s.f24716c;
        if (obj != obj2) {
            objArr[i7] = obj2;
            u3.f24638a = true;
        }
        this.f26790a = i7 - 1;
        this.f26791b = false;
    }
}
