package M7;

import H2.E;
import L7.C0385e;
import O7.g;
import O7.k;

/* loaded from: classes.dex */
public final class a extends E {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6823d;

    /* renamed from: e, reason: collision with root package name */
    public final g f6824e;

    public a(C0385e c0385e, g gVar, boolean z8) {
        super(3, c0385e, d.f6826d);
        this.f6824e = gVar;
        this.f6823d = z8;
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((C0385e) this.f4588c) + ", revert=" + this.f6823d + ", affectedTree=" + this.f6824e + " }";
    }

    @Override // H2.E
    public final E x(T7.c cVar) {
        C0385e c0385e = (C0385e) this.f4588c;
        boolean isEmpty = c0385e.isEmpty();
        boolean z8 = this.f6823d;
        g gVar = this.f6824e;
        if (!isEmpty) {
            k.b("operationForChild called for unrelated child.", c0385e.C().equals(cVar));
            return new a(c0385e.F(), gVar, z8);
        }
        if (gVar.f7495a != null) {
            k.b("affectedTree should not have overlapping affected paths.", gVar.f7496b.isEmpty());
            return this;
        }
        return new a(C0385e.f6337d, gVar.D(new C0385e(cVar)), z8);
    }
}
