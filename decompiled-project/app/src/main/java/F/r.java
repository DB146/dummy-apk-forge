package F;

import A0.j0;
import u.C2046I;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Z.c f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final E.l f3997b;

    /* renamed from: c, reason: collision with root package name */
    public final C2046I f3998c;

    public r(Z.c cVar, E.l lVar) {
        this.f3996a = cVar;
        this.f3997b = lVar;
        long[] jArr = u.Q.f24633a;
        this.f3998c = new C2046I();
    }

    public final Rb.e a(int i7, Object obj, Object obj2) {
        Y.e eVar;
        C2046I c2046i = this.f3998c;
        C0273q c0273q = (C0273q) c2046i.g(obj);
        if (c0273q != null && c0273q.f3993c == i7 && kotlin.jvm.internal.l.a(c0273q.f3992b, obj2)) {
            Y.e eVar2 = c0273q.f3994d;
            if (eVar2 != null) {
                return eVar2;
            }
            eVar = new Y.e(1403994769, new j0(2, c0273q.f3995e, c0273q), true);
            c0273q.f3994d = eVar;
        } else {
            C0273q c0273q2 = new C0273q(this, i7, obj, obj2);
            c2046i.l(obj, c0273q2);
            Y.e eVar3 = c0273q2.f3994d;
            if (eVar3 != null) {
                return eVar3;
            }
            eVar = new Y.e(1403994769, new j0(2, this, c0273q2), true);
            c0273q2.f3994d = eVar;
        }
        return eVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C0273q c0273q = (C0273q) this.f3998c.g(obj);
        if (c0273q != null) {
            return c0273q.f3992b;
        }
        E.j jVar = (E.j) this.f3997b.invoke();
        int m10 = jVar.f3417d.m(obj);
        if (m10 != -1) {
            return jVar.a(m10);
        }
        return null;
    }
}
