package x4;

import A4.f;
import A4.r;
import F.C0257a;
import N6.t0;
import a5.e;
import h3.o;
import m4.C1586o0;
import m4.K;
import n5.AbstractC1705a;
import n5.v;
import org.xmlpull.v1.XmlPullParserException;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2263a implements InterfaceC1982j {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1984l f26204b;

    /* renamed from: c, reason: collision with root package name */
    public int f26205c;

    /* renamed from: d, reason: collision with root package name */
    public int f26206d;

    /* renamed from: e, reason: collision with root package name */
    public int f26207e;
    public L4.b g;

    /* renamed from: h, reason: collision with root package name */
    public C1979g f26209h;

    /* renamed from: i, reason: collision with root package name */
    public f f26210i;
    public r j;

    /* renamed from: a, reason: collision with root package name */
    public final v f26203a = new v(6);

    /* renamed from: f, reason: collision with root package name */
    public long f26208f = -1;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        if (j == 0) {
            this.f26205c = 0;
            this.j = null;
        } else if (this.f26205c == 5) {
            r rVar = this.j;
            rVar.getClass();
            rVar.a(j, j10);
        }
    }

    public final void b() {
        d(new F4.b[0]);
        InterfaceC1984l interfaceC1984l = this.f26204b;
        interfaceC1984l.getClass();
        interfaceC1984l.f();
        this.f26204b.i(new C1986n(-9223372036854775807L));
        this.f26205c = 6;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g = (C1979g) interfaceC1983k;
        v vVar = this.f26203a;
        vVar.D(2);
        c1979g.x(vVar.f21229a, 0, 2, false);
        if (vVar.A() != 65496) {
            return false;
        }
        vVar.D(2);
        c1979g.x(vVar.f21229a, 0, 2, false);
        int A10 = vVar.A();
        this.f26206d = A10;
        if (A10 == 65504) {
            vVar.D(2);
            c1979g.x(vVar.f21229a, 0, 2, false);
            c1979g.b(vVar.A() - 2, false);
            vVar.D(2);
            c1979g.x(vVar.f21229a, 0, 2, false);
            this.f26206d = vVar.A();
        }
        if (this.f26206d != 65505) {
            return false;
        }
        c1979g.b(2, false);
        vVar.D(6);
        c1979g.x(vVar.f21229a, 0, 6, false);
        return vVar.w() == 1165519206 && vVar.A() == 0;
    }

    public final void d(F4.b... bVarArr) {
        InterfaceC1984l interfaceC1984l = this.f26204b;
        interfaceC1984l.getClass();
        s4.v u3 = interfaceC1984l.u(1024, 4);
        K k = new K();
        k.j = "image/jpeg";
        k.f19983i = new F4.c(bVarArr);
        o.w(k, u3);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        String q10;
        e eVar;
        t0 t0Var;
        int i7;
        L4.b bVar;
        long j;
        int i10 = this.f26205c;
        v vVar = this.f26203a;
        if (i10 == 0) {
            vVar.D(2);
            ((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 2, false);
            int A10 = vVar.A();
            this.f26206d = A10;
            if (A10 == 65498) {
                if (this.f26208f != -1) {
                    this.f26205c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((A10 >= 65488 && A10 <= 65497) || A10 == 65281) {
                return 0;
            }
            this.f26205c = 1;
            return 0;
        }
        if (i10 == 1) {
            vVar.D(2);
            ((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 2, false);
            this.f26207e = vVar.A() - 2;
            this.f26205c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f26210i == null || interfaceC1983k != this.f26209h) {
                    C1979g c1979g = (C1979g) interfaceC1983k;
                    this.f26209h = c1979g;
                    this.f26210i = new f(c1979g, this.f26208f);
                }
                r rVar = this.j;
                rVar.getClass();
                int e2 = rVar.e(this.f26210i, c0257a);
                if (e2 == 1) {
                    c0257a.f3957a += this.f26208f;
                }
                return e2;
            }
            long j10 = ((C1979g) interfaceC1983k).f24055d;
            long j11 = this.f26208f;
            if (j10 != j11) {
                c0257a.f3957a = j11;
                return 1;
            }
            C1979g c1979g2 = (C1979g) interfaceC1983k;
            if (c1979g2.x(vVar.f21229a, 0, 1, true)) {
                c1979g2.f24057f = 0;
                if (this.j == null) {
                    this.j = new r();
                }
                f fVar = new f(c1979g2, this.f26208f);
                this.f26210i = fVar;
                this.j.getClass();
                if (A4.o.j(fVar, false, false)) {
                    r rVar2 = this.j;
                    long j12 = this.f26208f;
                    InterfaceC1984l interfaceC1984l = this.f26204b;
                    interfaceC1984l.getClass();
                    rVar2.f464q = new f(j12, interfaceC1984l);
                    L4.b bVar2 = this.g;
                    bVar2.getClass();
                    d(bVar2);
                    this.f26205c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        }
        if (this.f26206d == 65505) {
            v vVar2 = new v(this.f26207e);
            ((C1979g) interfaceC1983k).h(vVar2.f21229a, 0, this.f26207e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(vVar2.q()) && (q10 = vVar2.q()) != null) {
                long j13 = ((C1979g) interfaceC1983k).f24054c;
                if (j13 != -1) {
                    try {
                        eVar = AbstractC2266d.a(q10);
                    } catch (NumberFormatException | C1586o0 | XmlPullParserException unused) {
                        AbstractC1705a.S("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        eVar = null;
                    }
                    if (eVar != null && (i7 = (t0Var = eVar.f12750b).f7343d) >= 2) {
                        boolean z8 = false;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        for (int i11 = i7 - 1; i11 >= 0; i11--) {
                            C2264b c2264b = (C2264b) t0Var.get(i11);
                            z8 |= "video/mp4".equals(c2264b.f26211a);
                            if (i11 == 0) {
                                j13 -= c2264b.f26213c;
                                j = 0;
                            } else {
                                j = j13 - c2264b.f26212b;
                            }
                            long j18 = j;
                            long j19 = j13;
                            j13 = j18;
                            if (z8 && j13 != j19) {
                                j17 = j19 - j13;
                                j16 = j13;
                                z8 = false;
                            }
                            if (i11 == 0) {
                                j15 = j19;
                                j14 = j13;
                            }
                        }
                        if (j16 != -1 && j17 != -1 && j14 != -1 && j15 != -1) {
                            bVar = new L4.b(j14, j15, eVar.f12749a, j16, j17);
                            this.g = bVar;
                            if (bVar != null) {
                                this.f26208f = bVar.f6295d;
                            }
                        }
                    }
                }
                bVar = null;
                this.g = bVar;
                if (bVar != null) {
                }
            }
        } else {
            ((C1979g) interfaceC1983k).r(this.f26207e);
        }
        this.f26205c = 0;
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f26204b = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
        r rVar = this.j;
        if (rVar != null) {
            rVar.getClass();
        }
    }
}
