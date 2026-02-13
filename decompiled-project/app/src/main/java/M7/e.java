package M7;

import H2.E;
import L7.C0385e;
import T7.s;

/* loaded from: classes.dex */
public final class e extends E {

    /* renamed from: d, reason: collision with root package name */
    public final s f6831d;

    public e(d dVar, C0385e c0385e, s sVar) {
        super(1, c0385e, dVar);
        this.f6831d = sVar;
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (C0385e) this.f4588c, (d) this.f4587b, this.f6831d);
    }

    @Override // H2.E
    public final E x(T7.c cVar) {
        C0385e c0385e = (C0385e) this.f4588c;
        boolean isEmpty = c0385e.isEmpty();
        s sVar = this.f6831d;
        d dVar = (d) this.f4587b;
        return isEmpty ? new e(dVar, C0385e.f6337d, sVar.h(cVar)) : new e(dVar, c0385e.F(), sVar);
    }
}
