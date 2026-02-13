package e1;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // e1.d
    public final void a(d dVar) {
        f fVar = this.f16705h;
        if (fVar.f16681c && !fVar.j) {
            fVar.d((int) ((((f) fVar.f16687l.get(0)).g * ((d1.h) this.f16700b).f16475q0) + 0.5f));
        }
    }

    @Override // e1.o
    public final void d() {
        d1.d dVar = this.f16700b;
        d1.h hVar = (d1.h) dVar;
        int i7 = hVar.f16476r0;
        int i10 = hVar.f16477s0;
        int i11 = hVar.f16479u0;
        f fVar = this.f16705h;
        if (i11 == 1) {
            if (i7 != -1) {
                fVar.f16687l.add(dVar.f16358T.f16371d.f16705h);
                this.f16700b.f16358T.f16371d.f16705h.k.add(fVar);
                fVar.f16684f = i7;
            } else if (i10 != -1) {
                fVar.f16687l.add(dVar.f16358T.f16371d.f16706i);
                this.f16700b.f16358T.f16371d.f16706i.k.add(fVar);
                fVar.f16684f = -i10;
            } else {
                fVar.f16680b = true;
                fVar.f16687l.add(dVar.f16358T.f16371d.f16706i);
                this.f16700b.f16358T.f16371d.f16706i.k.add(fVar);
            }
            m(this.f16700b.f16371d.f16705h);
            m(this.f16700b.f16371d.f16706i);
            return;
        }
        if (i7 != -1) {
            fVar.f16687l.add(dVar.f16358T.f16373e.f16705h);
            this.f16700b.f16358T.f16373e.f16705h.k.add(fVar);
            fVar.f16684f = i7;
        } else if (i10 != -1) {
            fVar.f16687l.add(dVar.f16358T.f16373e.f16706i);
            this.f16700b.f16358T.f16373e.f16706i.k.add(fVar);
            fVar.f16684f = -i10;
        } else {
            fVar.f16680b = true;
            fVar.f16687l.add(dVar.f16358T.f16373e.f16706i);
            this.f16700b.f16358T.f16373e.f16706i.k.add(fVar);
        }
        m(this.f16700b.f16373e.f16705h);
        m(this.f16700b.f16373e.f16706i);
    }

    @Override // e1.o
    public final void e() {
        d1.d dVar = this.f16700b;
        int i7 = ((d1.h) dVar).f16479u0;
        f fVar = this.f16705h;
        if (i7 == 1) {
            dVar.f16363Y = fVar.g;
        } else {
            dVar.f16364Z = fVar.g;
        }
    }

    @Override // e1.o
    public final void f() {
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
