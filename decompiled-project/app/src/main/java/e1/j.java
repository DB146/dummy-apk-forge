package e1;

import d1.C1038a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // e1.d
    public final void a(d dVar) {
        C1038a c1038a = (C1038a) this.f16700b;
        int i7 = c1038a.f16314s0;
        f fVar = this.f16705h;
        Iterator it = fVar.f16687l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i7 == 0 || i7 == 2) {
            fVar.d(i11 + c1038a.f16316u0);
        } else {
            fVar.d(i10 + c1038a.f16316u0);
        }
    }

    @Override // e1.o
    public final void d() {
        d1.d dVar = this.f16700b;
        if (dVar instanceof C1038a) {
            f fVar = this.f16705h;
            fVar.f16680b = true;
            C1038a c1038a = (C1038a) dVar;
            int i7 = c1038a.f16314s0;
            boolean z8 = c1038a.f16315t0;
            int i10 = 0;
            if (i7 == 0) {
                fVar.f16683e = 4;
                while (i10 < c1038a.f16482r0) {
                    d1.d dVar2 = c1038a.f16481q0[i10];
                    if (z8 || dVar2.f16377g0 != 8) {
                        f fVar2 = dVar2.f16371d.f16705h;
                        fVar2.k.add(fVar);
                        fVar.f16687l.add(fVar2);
                    }
                    i10++;
                }
                m(this.f16700b.f16371d.f16705h);
                m(this.f16700b.f16371d.f16706i);
                return;
            }
            if (i7 == 1) {
                fVar.f16683e = 5;
                while (i10 < c1038a.f16482r0) {
                    d1.d dVar3 = c1038a.f16481q0[i10];
                    if (z8 || dVar3.f16377g0 != 8) {
                        f fVar3 = dVar3.f16371d.f16706i;
                        fVar3.k.add(fVar);
                        fVar.f16687l.add(fVar3);
                    }
                    i10++;
                }
                m(this.f16700b.f16371d.f16705h);
                m(this.f16700b.f16371d.f16706i);
                return;
            }
            if (i7 == 2) {
                fVar.f16683e = 6;
                while (i10 < c1038a.f16482r0) {
                    d1.d dVar4 = c1038a.f16481q0[i10];
                    if (z8 || dVar4.f16377g0 != 8) {
                        f fVar4 = dVar4.f16373e.f16705h;
                        fVar4.k.add(fVar);
                        fVar.f16687l.add(fVar4);
                    }
                    i10++;
                }
                m(this.f16700b.f16373e.f16705h);
                m(this.f16700b.f16373e.f16706i);
                return;
            }
            if (i7 != 3) {
                return;
            }
            fVar.f16683e = 7;
            while (i10 < c1038a.f16482r0) {
                d1.d dVar5 = c1038a.f16481q0[i10];
                if (z8 || dVar5.f16377g0 != 8) {
                    f fVar5 = dVar5.f16373e.f16706i;
                    fVar5.k.add(fVar);
                    fVar.f16687l.add(fVar5);
                }
                i10++;
            }
            m(this.f16700b.f16373e.f16705h);
            m(this.f16700b.f16373e.f16706i);
        }
    }

    @Override // e1.o
    public final void e() {
        d1.d dVar = this.f16700b;
        if (dVar instanceof C1038a) {
            int i7 = ((C1038a) dVar).f16314s0;
            f fVar = this.f16705h;
            if (i7 == 0 || i7 == 1) {
                dVar.f16363Y = fVar.g;
            } else {
                dVar.f16364Z = fVar.g;
            }
        }
    }

    @Override // e1.o
    public final void f() {
        this.f16701c = null;
        this.f16705h.c();
    }

    @Override // e1.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f16705h;
        fVar2.k.add(fVar);
        fVar.f16687l.add(fVar2);
    }
}
