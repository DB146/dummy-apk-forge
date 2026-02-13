package I7;

import a.AbstractC0672a;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5246a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5247b;

    /* renamed from: c, reason: collision with root package name */
    public i f5248c;

    /* renamed from: d, reason: collision with root package name */
    public final i f5249d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f5246a = obj;
        this.f5247b = obj2;
        h hVar = h.f5245a;
        this.f5248c = iVar == null ? hVar : iVar;
        this.f5249d = iVar2 == null ? hVar : iVar2;
    }

    @Override // I7.i
    public final i b(Object obj, Iterable iterable, Comparator comparator) {
        int compare = comparator.compare(obj, this.f5246a);
        return (compare < 0 ? k(null, null, this.f5248c.b(obj, iterable, comparator), null) : compare == 0 ? k(obj, iterable, null, null) : k(null, null, null, this.f5249d.b(obj, iterable, comparator))).l();
    }

    @Override // I7.i
    public final void c(AbstractC0672a abstractC0672a) {
        this.f5248c.c(abstractC0672a);
        abstractC0672a.w(this.f5246a, this.f5247b);
        this.f5249d.c(abstractC0672a);
    }

    @Override // I7.i
    public final i e() {
        return this.f5248c;
    }

    @Override // I7.i
    public final i f(Object obj, Comparator comparator) {
        k k;
        if (comparator.compare(obj, this.f5246a) < 0) {
            k o10 = (this.f5248c.isEmpty() || this.f5248c.d() || ((k) this.f5248c).f5248c.d()) ? this : o();
            k = o10.k(null, null, o10.f5248c.f(obj, comparator), null);
        } else {
            k q10 = this.f5248c.d() ? q() : this;
            i iVar = q10.f5249d;
            if (!iVar.isEmpty() && !iVar.d() && !((k) iVar).f5248c.d()) {
                q10 = q10.i();
                if (q10.f5248c.e().d()) {
                    q10 = q10.q().i();
                }
            }
            if (comparator.compare(obj, q10.f5246a) == 0) {
                i iVar2 = q10.f5249d;
                if (iVar2.isEmpty()) {
                    return h.f5245a;
                }
                i g = iVar2.g();
                q10 = q10.k(g.getKey(), g.getValue(), null, ((k) iVar2).p());
            }
            k = q10.k(null, null, null, q10.f5249d.f(obj, comparator));
        }
        return k.l();
    }

    @Override // I7.i
    public final i g() {
        return this.f5248c.isEmpty() ? this : this.f5248c.g();
    }

    @Override // I7.i
    public final Object getKey() {
        return this.f5246a;
    }

    @Override // I7.i
    public final Object getValue() {
        return this.f5247b;
    }

    @Override // I7.i
    public final i h() {
        i iVar = this.f5249d;
        return iVar.isEmpty() ? this : iVar.h();
    }

    public final k i() {
        i iVar = this.f5248c;
        i a9 = iVar.a(iVar.d() ? 2 : 1, null, null);
        i iVar2 = this.f5249d;
        return a(d() ? 2 : 1, a9, iVar2.a(iVar2.d() ? 2 : 1, null, null));
    }

    @Override // I7.i
    public final boolean isEmpty() {
        return false;
    }

    @Override // I7.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final k a(int i7, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f5248c;
        }
        if (iVar2 == null) {
            iVar2 = this.f5249d;
        }
        Object obj = this.f5246a;
        Object obj2 = this.f5247b;
        return i7 == 1 ? new k(obj, obj2, iVar, iVar2) : new g(obj, obj2, iVar, iVar2);
    }

    public abstract k k(Object obj, Object obj2, i iVar, i iVar2);

    public final k l() {
        i iVar = this.f5249d;
        k kVar = (!iVar.d() || this.f5248c.d()) ? this : (k) iVar.a(n(), a(1, null, ((k) iVar).f5248c), null);
        if (kVar.f5248c.d() && ((k) kVar.f5248c).f5248c.d()) {
            kVar = kVar.q();
        }
        return (kVar.f5248c.d() && kVar.f5249d.d()) ? kVar.i() : kVar;
    }

    @Override // I7.i
    public final i m() {
        return this.f5249d;
    }

    public abstract int n();

    public final k o() {
        k i7 = i();
        i iVar = i7.f5249d;
        if (!iVar.e().d()) {
            return i7;
        }
        k k = i7.k(null, null, null, ((k) iVar).q());
        i iVar2 = k.f5249d;
        return ((k) iVar2.a(k.n(), k.a(1, null, ((k) iVar2).f5248c), null)).i();
    }

    public final i p() {
        if (this.f5248c.isEmpty()) {
            return h.f5245a;
        }
        k o10 = (this.f5248c.d() || this.f5248c.e().d()) ? this : o();
        return o10.k(null, null, ((k) o10.f5248c).p(), null).l();
    }

    public final k q() {
        return (k) this.f5248c.a(n(), null, a(1, ((k) this.f5248c).f5249d, null));
    }

    public void r(k kVar) {
        this.f5248c = kVar;
    }
}
