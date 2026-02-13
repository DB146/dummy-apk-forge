package Zb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e implements Iterator, Sb.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f12341b;

    /* renamed from: d, reason: collision with root package name */
    public Object f12343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f12344e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12340a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f12342c = -1;

    public e(f fVar) {
        this.f12344e = fVar;
        this.f12341b = fVar.f12345a.iterator();
    }

    public e(j jVar) {
        this.f12344e = jVar;
        this.f12341b = jVar.f12353b.iterator();
    }

    public void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f12341b;
            if (!it.hasNext()) {
                this.f12342c = 0;
                return;
            } else {
                next = it.next();
                fVar = (f) this.f12344e;
            }
        } while (((Boolean) fVar.f12347c.invoke(next)).booleanValue() != fVar.f12346b);
        this.f12343d = next;
        this.f12342c = 1;
    }

    public void b() {
        Iterator it = this.f12341b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((j) this.f12344e).f12354c.invoke(next)).booleanValue()) {
                this.f12342c = 1;
                this.f12343d = next;
                return;
            }
        }
        this.f12342c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12340a) {
            case 0:
                if (this.f12342c == -1) {
                    a();
                }
                return this.f12342c == 1;
            default:
                if (this.f12342c == -1) {
                    b();
                }
                return this.f12342c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12340a) {
            case 0:
                if (this.f12342c == -1) {
                    a();
                }
                if (this.f12342c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f12343d;
                this.f12343d = null;
                this.f12342c = -1;
                return obj;
            default:
                if (this.f12342c == -1) {
                    b();
                }
                if (this.f12342c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f12343d;
                this.f12343d = null;
                this.f12342c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12340a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
