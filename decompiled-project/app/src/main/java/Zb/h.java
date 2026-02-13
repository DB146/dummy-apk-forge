package Zb;

import Db.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class h implements Iterator, Hb.d, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f12348a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12349b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f12350c;

    /* renamed from: d, reason: collision with root package name */
    public Hb.d f12351d;

    public final RuntimeException a() {
        int i7 = this.f12348a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f12348a);
    }

    public final void c(Hb.d frame, Object obj) {
        this.f12349b = obj;
        this.f12348a = 3;
        this.f12351d = frame;
        Ib.a aVar = Ib.a.f5345a;
        l.e(frame, "frame");
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return Hb.j.f4919a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i7 = this.f12348a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f12350c;
                l.b(it);
                if (it.hasNext()) {
                    this.f12348a = 2;
                    return true;
                }
                this.f12350c = null;
            }
            this.f12348a = 5;
            Hb.d dVar = this.f12351d;
            l.b(dVar);
            this.f12351d = null;
            dVar.resumeWith(q.f3365a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f12348a;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f12348a = 1;
            Iterator it = this.f12350c;
            l.b(it);
            return it.next();
        }
        if (i7 != 3) {
            throw a();
        }
        this.f12348a = 0;
        Object obj = this.f12349b;
        this.f12349b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        com.bumptech.glide.c.c0(obj);
        this.f12348a = 4;
    }
}
