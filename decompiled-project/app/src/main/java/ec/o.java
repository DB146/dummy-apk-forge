package ec;

import cc.N0;
import kotlin.jvm.internal.w;

/* loaded from: classes2.dex */
public final class o extends d {

    /* renamed from: y, reason: collision with root package name */
    public final int f16896y;

    public o(int i7, int i10) {
        super(i7);
        this.f16896y = i10;
        if (i10 != 1) {
            if (i7 < 1) {
                throw new IllegalArgumentException(A3.c.f(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + w.a(d.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object] */
    public final Object J(Object obj, boolean z8) {
        l lVar;
        Db.q qVar = Db.q.f3365a;
        if (this.f16896y == 3) {
            Object h10 = super.h(obj);
            return (!(h10 instanceof j) || (h10 instanceof i)) ? h10 : qVar;
        }
        R7.a aVar = f.f16875d;
        l lVar2 = (l) d.f16865f.get(this);
        while (true) {
            long andIncrement = d.f16861b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean u3 = u(andIncrement, false);
            int i7 = f.f16873b;
            long j10 = i7;
            long j11 = j / j10;
            int i10 = (int) (j % j10);
            ?? r16 = aVar;
            if (lVar2.f17971c != j11) {
                l b2 = d.b(this, j11, lVar2);
                if (b2 != null) {
                    lVar = b2;
                } else {
                    if (u3) {
                        return new i(r());
                    }
                    aVar = r16;
                }
            } else {
                lVar = lVar2;
            }
            int e2 = d.e(this, lVar, i10, obj, j, r16, u3);
            if (e2 == 0) {
                lVar.a();
                return qVar;
            }
            if (e2 == 1) {
                return qVar;
            }
            if (e2 == 2) {
                if (u3) {
                    lVar.h();
                    return new i(r());
                }
                N0 n02 = r16 instanceof N0 ? (N0) r16 : null;
                if (n02 != null) {
                    n02.a(lVar, i10 + i7);
                }
                m((lVar.f17971c * j10) + i10);
                return qVar;
            }
            if (e2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e2 == 4) {
                if (j < d.f16862c.get(this)) {
                    lVar.a();
                }
                return new i(r());
            }
            if (e2 == 5) {
                lVar.a();
            }
            lVar2 = lVar;
            aVar = r16;
        }
    }

    @Override // ec.d, ec.u
    public final Object a(Hb.d dVar, Object obj) {
        if (J(obj, true) instanceof i) {
            throw r();
        }
        return Db.q.f3365a;
    }

    @Override // ec.d, ec.u
    public final Object h(Object obj) {
        return J(obj, false);
    }

    @Override // ec.d
    public final boolean x() {
        return this.f16896y == 2;
    }
}
