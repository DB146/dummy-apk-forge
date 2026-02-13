package M7;

import H2.E;
import L7.C0385e;
import O7.k;

/* loaded from: classes.dex */
public final class b extends E {
    public b(d dVar, C0385e c0385e) {
        super(4, c0385e, dVar);
        k.b("Can't have a listen complete from a user source", !(dVar.f6828a == 1));
    }

    public final String toString() {
        return "ListenComplete { path=" + ((C0385e) this.f4588c) + ", source=" + ((d) this.f4587b) + " }";
    }

    @Override // H2.E
    public final E x(T7.c cVar) {
        C0385e c0385e = (C0385e) this.f4588c;
        boolean isEmpty = c0385e.isEmpty();
        d dVar = (d) this.f4587b;
        return isEmpty ? new b(dVar, C0385e.f6337d) : new b(dVar, c0385e.F());
    }
}
