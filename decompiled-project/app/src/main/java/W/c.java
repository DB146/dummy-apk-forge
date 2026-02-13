package W;

import Ob.h;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import u.C2044G;
import u.C2045H;
import u.K;
import u.L;

/* loaded from: classes.dex */
public final class c implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10247a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10248b;

    /* renamed from: c, reason: collision with root package name */
    public int f10249c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10250d;

    public c(h hVar) {
        this.f10247a = 1;
        this.f10250d = hVar;
        this.f10249c = -2;
    }

    public c(Object obj, Map map) {
        this.f10247a = 0;
        this.f10248b = obj;
        this.f10250d = map;
    }

    public c(C2045H c2045h) {
        this.f10247a = 2;
        this.f10250d = c2045h;
        this.f10249c = -1;
        this.f10248b = O5.b.w(new C2044G(c2045h, this, null));
    }

    public c(L l10) {
        this.f10247a = 3;
        this.f10250d = l10;
        this.f10249c = -1;
        this.f10248b = O5.b.w(new K(l10, this, null));
    }

    public void a() {
        Object invoke;
        int i7 = this.f10249c;
        h hVar = (h) this.f10250d;
        if (i7 == -2) {
            invoke = ((Rb.a) hVar.f7553b).invoke();
        } else {
            Rb.c cVar = (Rb.c) hVar.f7554c;
            Object obj = this.f10248b;
            l.b(obj);
            invoke = cVar.invoke(obj);
        }
        this.f10248b = invoke;
        this.f10249c = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10247a) {
            case 0:
                return this.f10249c < ((Map) this.f10250d).size();
            case 1:
                if (this.f10249c < 0) {
                    a();
                }
                return this.f10249c == 1;
            case 2:
                return ((Zb.h) this.f10248b).hasNext();
            default:
                return ((Zb.h) this.f10248b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10247a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f10248b;
                this.f10249c++;
                Object obj2 = ((Map) this.f10250d).get(obj);
                if (obj2 != null) {
                    this.f10248b = ((a) obj2).f10242b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f10249c < 0) {
                    a();
                }
                if (this.f10249c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f10248b;
                l.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f10249c = -1;
                return obj3;
            case 2:
                return ((Zb.h) this.f10248b).next();
            default:
                return ((Zb.h) this.f10248b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10247a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i7 = this.f10249c;
                if (i7 != -1) {
                    ((C2045H) this.f10250d).f24602b.h(i7);
                    this.f10249c = -1;
                    return;
                }
                return;
            default:
                int i10 = this.f10249c;
                if (i10 != -1) {
                    ((L) this.f10250d).f24627b.m(i10);
                    this.f10249c = -1;
                    return;
                }
                return;
        }
    }
}
