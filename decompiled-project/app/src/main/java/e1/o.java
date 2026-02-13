package e1;

import d1.C1040c;

/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f16699a;

    /* renamed from: b, reason: collision with root package name */
    public d1.d f16700b;

    /* renamed from: c, reason: collision with root package name */
    public l f16701c;

    /* renamed from: d, reason: collision with root package name */
    public int f16702d;

    /* renamed from: e, reason: collision with root package name */
    public final g f16703e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f16704f = 0;
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f16705h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f16706i = new f(this);
    public int j = 1;

    public o(d1.d dVar) {
        this.f16700b = dVar;
    }

    public static void b(f fVar, f fVar2, int i7) {
        fVar.f16687l.add(fVar2);
        fVar.f16684f = i7;
        fVar2.k.add(fVar);
    }

    public static f h(C1040c c1040c) {
        C1040c c1040c2 = c1040c.f16337f;
        if (c1040c2 == null) {
            return null;
        }
        int b2 = P.c.b(c1040c2.f16336e);
        d1.d dVar = c1040c2.f16335d;
        if (b2 == 1) {
            return dVar.f16371d.f16705h;
        }
        if (b2 == 2) {
            return dVar.f16373e.f16705h;
        }
        if (b2 == 3) {
            return dVar.f16371d.f16706i;
        }
        if (b2 == 4) {
            return dVar.f16373e.f16706i;
        }
        if (b2 != 5) {
            return null;
        }
        return dVar.f16373e.k;
    }

    public static f i(C1040c c1040c, int i7) {
        C1040c c1040c2 = c1040c.f16337f;
        if (c1040c2 == null) {
            return null;
        }
        d1.d dVar = c1040c2.f16335d;
        o oVar = i7 == 0 ? dVar.f16371d : dVar.f16373e;
        int b2 = P.c.b(c1040c2.f16336e);
        if (b2 == 1 || b2 == 2) {
            return oVar.f16705h;
        }
        if (b2 == 3 || b2 == 4) {
            return oVar.f16706i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f16687l.add(fVar2);
        fVar.f16687l.add(this.f16703e);
        fVar.f16685h = i7;
        fVar.f16686i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i10) {
        int max;
        if (i10 == 0) {
            d1.d dVar = this.f16700b;
            int i11 = dVar.f16399v;
            max = Math.max(dVar.f16398u, i7);
            if (i11 > 0) {
                max = Math.min(i11, i7);
            }
            if (max == i7) {
                return i7;
            }
        } else {
            d1.d dVar2 = this.f16700b;
            int i12 = dVar2.f16402y;
            max = Math.max(dVar2.f16401x, i7);
            if (i12 > 0) {
                max = Math.min(i12, i7);
            }
            if (max == i7) {
                return i7;
            }
        }
        return max;
    }

    public long j() {
        if (this.f16703e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f16699a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C1040c c1040c, C1040c c1040c2, int i7) {
        f h10 = h(c1040c);
        f h11 = h(c1040c2);
        if (h10.j && h11.j) {
            int e2 = c1040c.e() + h10.g;
            int e10 = h11.g - c1040c2.e();
            int i10 = e10 - e2;
            g gVar = this.f16703e;
            if (!gVar.j && this.f16702d == 3) {
                int i11 = this.f16699a;
                if (i11 == 0) {
                    gVar.d(g(i10, i7));
                } else if (i11 == 1) {
                    gVar.d(Math.min(g(gVar.f16688m, i7), i10));
                } else if (i11 == 2) {
                    d1.d dVar = this.f16700b;
                    d1.d dVar2 = dVar.f16358T;
                    if (dVar2 != null) {
                        if ((i7 == 0 ? dVar2.f16371d : dVar2.f16373e).f16703e.j) {
                            gVar.d(g((int) ((r6.g * (i7 == 0 ? dVar.f16400w : dVar.f16403z)) + 0.5f), i7));
                        }
                    }
                } else if (i11 == 3) {
                    d1.d dVar3 = this.f16700b;
                    o oVar = dVar3.f16371d;
                    if (oVar.f16702d == 3 && oVar.f16699a == 3) {
                        m mVar = dVar3.f16373e;
                        if (mVar.f16702d == 3) {
                        }
                    }
                    if (i7 == 0) {
                        oVar = dVar3.f16373e;
                    }
                    if (oVar.f16703e.j) {
                        float f4 = dVar3.f16361W;
                        gVar.d(i7 == 1 ? (int) ((r6.g / f4) + 0.5f) : (int) ((f4 * r6.g) + 0.5f));
                    }
                }
            }
            if (gVar.j) {
                int i12 = gVar.g;
                f fVar = this.f16706i;
                f fVar2 = this.f16705h;
                if (i12 == i10) {
                    fVar2.d(e2);
                    fVar.d(e10);
                    return;
                }
                float f10 = i7 == 0 ? this.f16700b.f16372d0 : this.f16700b.f16374e0;
                if (h10 == h11) {
                    e2 = h10.g;
                    e10 = h11.g;
                    f10 = 0.5f;
                }
                fVar2.d((int) ((((e10 - e2) - i12) * f10) + e2 + 0.5f));
                fVar.d(fVar2.g + gVar.g);
            }
        }
    }
}
