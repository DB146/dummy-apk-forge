package I7;

import a.AbstractC0672a;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: a, reason: collision with root package name */
    public final i f5255a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f5256b;

    public n(i iVar, Comparator comparator) {
        this.f5255a = iVar;
        this.f5256b = comparator;
    }

    @Override // I7.c
    public final Iterator A() {
        return new d(this.f5255a, this.f5256b, true);
    }

    @Override // I7.c
    public final c C(Iterable iterable, Object obj) {
        i iVar = this.f5255a;
        Comparator comparator = this.f5256b;
        return new n(((k) iVar.b(obj, iterable, comparator)).a(2, null, null), comparator);
    }

    @Override // I7.c
    public final c D(Object obj) {
        if (!b(obj)) {
            return this;
        }
        i iVar = this.f5255a;
        Comparator comparator = this.f5256b;
        return new n(iVar.f(obj, comparator).a(2, null, null), comparator);
    }

    public final i E(Object obj) {
        i iVar = this.f5255a;
        while (!iVar.isEmpty()) {
            int compare = this.f5256b.compare(obj, iVar.getKey());
            if (compare < 0) {
                iVar = iVar.e();
            } else {
                if (compare == 0) {
                    return iVar;
                }
                iVar = iVar.m();
            }
        }
        return null;
    }

    @Override // I7.c
    public final boolean b(Object obj) {
        return E(obj) != null;
    }

    @Override // I7.c
    public final Object i(T7.c cVar) {
        i E10 = E(cVar);
        if (E10 != null) {
            return E10.getValue();
        }
        return null;
    }

    @Override // I7.c
    public final boolean isEmpty() {
        return this.f5255a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f5255a, this.f5256b, false);
    }

    @Override // I7.c
    public final Comparator o() {
        return this.f5256b;
    }

    @Override // I7.c
    public final int size() {
        return this.f5255a.size();
    }

    @Override // I7.c
    public final Object t() {
        return this.f5255a.h().getKey();
    }

    @Override // I7.c
    public final Object y() {
        return this.f5255a.g().getKey();
    }

    @Override // I7.c
    public final void z(AbstractC0672a abstractC0672a) {
        this.f5255a.c(abstractC0672a);
    }
}
