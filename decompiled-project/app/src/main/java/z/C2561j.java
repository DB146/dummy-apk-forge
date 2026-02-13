package z;

import A0.AbstractC0017g;
import A0.InterfaceC0023l;
import A0.InterfaceC0034x;
import F.C0267k;
import a.AbstractC0672a;
import y0.InterfaceC2345m;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2561j extends c0.l implements InterfaceC0034x, InterfaceC0023l {

    /* renamed from: C, reason: collision with root package name */
    public V f28004C;

    /* renamed from: D, reason: collision with root package name */
    public final w0 f28005D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f28006E;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC2345m f28008G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f28009H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f28010I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f28012K;

    /* renamed from: F, reason: collision with root package name */
    public final C0267k f28007F = new C0267k(1);

    /* renamed from: J, reason: collision with root package name */
    public long f28011J = 0;

    public C2561j(V v10, w0 w0Var, boolean z8) {
        this.f28004C = v10;
        this.f28005D = w0Var;
        this.f28006E = z8;
    }

    public static final float p0(C2561j c2561j, InterfaceC2547c interfaceC2547c) {
        i0.c cVar;
        float a9;
        int compare;
        if (!V0.k.a(c2561j.f28011J, 0L)) {
            S.e eVar = c2561j.f28007F.f3980a;
            int i7 = eVar.f8961c - 1;
            Object[] objArr = eVar.f8959a;
            if (i7 < objArr.length) {
                cVar = null;
                while (true) {
                    if (i7 < 0) {
                        break;
                    }
                    i0.c cVar2 = (i0.c) ((C2555g) objArr[i7]).f27979a.invoke();
                    if (cVar2 != null) {
                        long b2 = cVar2.b();
                        long u3 = AbstractC0672a.u(c2561j.f28011J);
                        int ordinal = c2561j.f28004C.ordinal();
                        if (ordinal == 0) {
                            compare = Float.compare(Float.intBitsToFloat((int) (b2 & 4294967295L)), Float.intBitsToFloat((int) (u3 & 4294967295L)));
                        } else {
                            if (ordinal != 1) {
                                throw new Db.d(1);
                            }
                            compare = Float.compare(Float.intBitsToFloat((int) (b2 >> 32)), Float.intBitsToFloat((int) (u3 >> 32)));
                        }
                        if (compare <= 0) {
                            cVar = cVar2;
                        } else if (cVar == null) {
                            cVar = cVar2;
                        }
                    }
                    i7--;
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                i0.c q02 = c2561j.f28009H ? c2561j.q0() : null;
                if (q02 != null) {
                    cVar = q02;
                }
            }
            long u10 = AbstractC0672a.u(c2561j.f28011J);
            int ordinal2 = c2561j.f28004C.ordinal();
            if (ordinal2 == 0) {
                float f4 = cVar.f18177d;
                float f10 = cVar.f18175b;
                a9 = interfaceC2547c.a(f10, f4 - f10, Float.intBitsToFloat((int) (u10 & 4294967295L)));
            } else {
                if (ordinal2 != 1) {
                    throw new Db.d(1);
                }
                float f11 = cVar.f18176c;
                float f12 = cVar.f18174a;
                a9 = interfaceC2547c.a(f12, f11 - f12, Float.intBitsToFloat((int) (u10 >> 32)));
            }
            return a9;
        }
        return 0.0f;
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // A0.InterfaceC0034x
    public final void l(long j) {
        int f4;
        i0.c q02;
        long j10 = this.f28011J;
        this.f28011J = j;
        int ordinal = this.f28004C.ordinal();
        if (ordinal == 0) {
            f4 = kotlin.jvm.internal.l.f((int) (j & 4294967295L), (int) (4294967295L & j10));
        } else {
            if (ordinal != 1) {
                throw new Db.d(1);
            }
            f4 = kotlin.jvm.internal.l.f((int) (j >> 32), (int) (j10 >> 32));
        }
        if (f4 >= 0 || this.f28012K || this.f28009H || (q02 = q0()) == null || !r0(q02, j10)) {
            return;
        }
        this.f28010I = true;
    }

    public final i0.c q0() {
        if (!this.f14112B) {
            return null;
        }
        A0.n0 s3 = AbstractC0017g.s(this);
        InterfaceC2345m interfaceC2345m = this.f28008G;
        if (interfaceC2345m != null) {
            if (!interfaceC2345m.w()) {
                interfaceC2345m = null;
            }
            if (interfaceC2345m != null) {
                return s3.x(interfaceC2345m, false);
            }
        }
        return null;
    }

    public final boolean r0(i0.c cVar, long j) {
        long t02 = t0(cVar, j);
        return Math.abs(Float.intBitsToFloat((int) (t02 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (t02 & 4294967295L))) <= 0.5f;
    }

    public final void s0() {
        InterfaceC2547c interfaceC2547c = (InterfaceC2547c) AbstractC0017g.h(this, AbstractC2553f.f27972a);
        if (this.f28012K) {
            B.a.c("launchAnimation called when previous animation was running");
        }
        InterfaceC2547c.f27963a.getClass();
        cc.F.B(d0(), null, 4, new C2559i(this, new J0(C2545b.f27961b), interfaceC2547c, null), 1);
    }

    public final long t0(i0.c cVar, long j) {
        long floatToRawIntBits;
        long j10;
        long u3 = AbstractC0672a.u(j);
        int ordinal = this.f28004C.ordinal();
        if (ordinal == 0) {
            InterfaceC2547c interfaceC2547c = (InterfaceC2547c) AbstractC0017g.h(this, AbstractC2553f.f27972a);
            float f4 = cVar.f18177d;
            float f10 = cVar.f18175b;
            float a9 = interfaceC2547c.a(f10, f4 - f10, Float.intBitsToFloat((int) (u3 & 4294967295L)));
            long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(a9);
            j10 = floatToRawIntBits2 << 32;
        } else {
            if (ordinal != 1) {
                throw new Db.d(1);
            }
            InterfaceC2547c interfaceC2547c2 = (InterfaceC2547c) AbstractC0017g.h(this, AbstractC2553f.f27972a);
            float f11 = cVar.f18176c;
            float f12 = cVar.f18174a;
            long floatToRawIntBits3 = Float.floatToRawIntBits(interfaceC2547c2.a(f12, f11 - f12, Float.intBitsToFloat((int) (u3 >> 32))));
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = floatToRawIntBits3 << 32;
        }
        return j10 | (floatToRawIntBits & 4294967295L);
    }
}
