package M7;

import H2.E;
import L7.C0381a;
import L7.C0385e;
import O7.g;
import T7.s;

/* loaded from: classes.dex */
public final class c extends E {

    /* renamed from: d, reason: collision with root package name */
    public final C0381a f6825d;

    public c(d dVar, C0385e c0385e, C0381a c0381a) {
        super(2, c0385e, dVar);
        this.f6825d = c0381a;
    }

    public final String toString() {
        return "Merge { path=" + ((C0385e) this.f4588c) + ", source=" + ((d) this.f4587b) + ", children=" + this.f6825d + " }";
    }

    @Override // H2.E
    public final E x(T7.c cVar) {
        C0385e c0385e = (C0385e) this.f4588c;
        boolean isEmpty = c0385e.isEmpty();
        C0381a c0381a = this.f6825d;
        d dVar = (d) this.f4587b;
        if (!isEmpty) {
            if (c0385e.C().equals(cVar)) {
                return new c(dVar, c0385e.F(), c0381a);
            }
            return null;
        }
        C0381a y10 = c0381a.y(new C0385e(cVar));
        g gVar = y10.f6321a;
        if (gVar.isEmpty()) {
            return null;
        }
        Object obj = gVar.f7495a;
        return ((s) obj) != null ? new e(dVar, C0385e.f6337d, (s) obj) : new c(dVar, C0385e.f6337d, y10);
    }
}
