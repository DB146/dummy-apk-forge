package Zb;

import Eb.C0252c;
import Eb.o;
import java.util.ArrayList;
import java.util.Iterator;
import y1.N;

/* loaded from: classes2.dex */
public final class k implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12355a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f12356b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12357c;

    public k(C0252c c0252c) {
        this.f12355a = 1;
        this.f12357c = new ArrayList();
        this.f12356b = c0252c;
    }

    public k(j jVar) {
        this.f12355a = 0;
        this.f12357c = jVar;
        this.f12356b = jVar.f12353b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12355a) {
            case 0:
                return this.f12356b.hasNext();
            default:
                return this.f12356b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12355a) {
            case 0:
                return ((j) this.f12357c).f12354c.invoke(this.f12356b.next());
            default:
                Object next = this.f12356b.next();
                Iterator it = (Iterator) N.f26650a.invoke(next);
                ArrayList arrayList = (ArrayList) this.f12357c;
                if (it == null || !it.hasNext()) {
                    while (!this.f12356b.hasNext() && !arrayList.isEmpty()) {
                        this.f12356b = (Iterator) o.e0(arrayList);
                        o.k0(arrayList);
                    }
                } else {
                    arrayList.add(this.f12356b);
                    this.f12356b = it;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12355a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
