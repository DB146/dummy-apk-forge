package B4;

import F.C0257a;
import java.util.Arrays;
import m4.C1586o0;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import s4.C1979g;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import s4.s;
import y7.u0;

/* loaded from: classes.dex */
public final class d implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1984l f2060a;

    /* renamed from: b, reason: collision with root package name */
    public i f2061b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2062c;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        i iVar = this.f2061b;
        if (iVar != null) {
            e eVar = iVar.f2077a;
            f fVar = eVar.f2063a;
            fVar.f2068a = 0;
            fVar.f2069b = 0L;
            fVar.f2070c = 0;
            fVar.f2071d = 0;
            fVar.f2072e = 0;
            eVar.f2064b.D(0);
            eVar.f2065c = -1;
            eVar.f2067e = false;
            if (j == 0) {
                iVar.d(!iVar.f2085l);
                return;
            }
            if (iVar.f2083h != 0) {
                long j11 = (iVar.f2084i * j10) / 1000000;
                iVar.f2081e = j11;
                g gVar = iVar.f2080d;
                int i7 = D.f21141a;
                gVar.p(j11);
                iVar.f2083h = 2;
            }
        }
    }

    public final boolean b(C1979g c1979g) {
        boolean z8;
        f fVar = new f();
        if (fVar.a(c1979g, true) && (fVar.f2068a & 2) == 2) {
            int min = Math.min(fVar.f2072e, 8);
            v vVar = new v(min);
            c1979g.x(vVar.f21229a, 0, min, false);
            vVar.G(0);
            if (vVar.a() >= 5 && vVar.v() == 127 && vVar.w() == 1179402563) {
                this.f2061b = new i();
            } else {
                vVar.G(0);
                try {
                    z8 = u0.Q(1, vVar, true);
                } catch (C1586o0 unused) {
                    z8 = false;
                }
                if (z8) {
                    this.f2061b = new i();
                } else {
                    vVar.G(0);
                    if (h.e(vVar, h.f2074o)) {
                        this.f2061b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        try {
            return b((C1979g) interfaceC1983k);
        } catch (C1586o0 unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        v vVar;
        byte[] bArr;
        AbstractC1705a.n(this.f2060a);
        if (this.f2061b == null) {
            C1979g c1979g = (C1979g) interfaceC1983k;
            if (!b(c1979g)) {
                throw C1586o0.a("Failed to determine bitstream type", null);
            }
            c1979g.f24057f = 0;
        }
        if (!this.f2062c) {
            s4.v u3 = this.f2060a.u(0, 1);
            this.f2060a.f();
            i iVar = this.f2061b;
            iVar.f2079c = this.f2060a;
            iVar.f2078b = u3;
            iVar.d(true);
            this.f2062c = true;
        }
        i iVar2 = this.f2061b;
        AbstractC1705a.n(iVar2.f2078b);
        int i7 = D.f21141a;
        int i10 = iVar2.f2083h;
        e eVar = iVar2.f2077a;
        if (i10 == 0) {
            while (true) {
                C1979g c1979g2 = (C1979g) interfaceC1983k;
                if (!eVar.b(c1979g2)) {
                    iVar2.f2083h = 3;
                    break;
                }
                long j = c1979g2.f24055d;
                long j10 = iVar2.f2082f;
                iVar2.k = j - j10;
                q3.c cVar = iVar2.j;
                v vVar2 = eVar.f2064b;
                if (!iVar2.c(vVar2, j10, cVar)) {
                    L l10 = (L) iVar2.j.f23371b;
                    iVar2.f2084i = l10.f20076N;
                    if (!iVar2.f2086m) {
                        iVar2.f2078b.a(l10);
                        iVar2.f2086m = true;
                    }
                    A4.e eVar2 = (A4.e) iVar2.j.f23372c;
                    if (eVar2 != null) {
                        iVar2.f2080d = eVar2;
                    } else {
                        long j11 = ((C1979g) interfaceC1983k).f24054c;
                        if (j11 != -1) {
                            f fVar = eVar.f2063a;
                            vVar = vVar2;
                            iVar2.f2080d = new b(iVar2, iVar2.f2082f, j11, fVar.f2071d + fVar.f2072e, fVar.f2069b, (fVar.f2068a & 4) != 0);
                            iVar2.f2083h = 2;
                            bArr = vVar.f21229a;
                            if (bArr.length != 65025) {
                                vVar.E(vVar.f21231c, Arrays.copyOf(bArr, Math.max(65025, vVar.f21231c)));
                            }
                            return 0;
                        }
                        iVar2.f2080d = new Hc.e(2);
                    }
                    vVar = vVar2;
                    iVar2.f2083h = 2;
                    bArr = vVar.f21229a;
                    if (bArr.length != 65025) {
                    }
                    return 0;
                }
                iVar2.f2082f = ((C1979g) interfaceC1983k).f24055d;
            }
        } else {
            if (i10 == 1) {
                ((C1979g) interfaceC1983k).r((int) iVar2.f2082f);
                iVar2.f2083h = 2;
                return 0;
            }
            if (i10 == 2) {
                C1979g c1979g3 = (C1979g) interfaceC1983k;
                long n6 = iVar2.f2080d.n(c1979g3);
                if (n6 >= 0) {
                    c0257a.f3957a = n6;
                    return 1;
                }
                if (n6 < -1) {
                    iVar2.a(-(n6 + 2));
                }
                if (!iVar2.f2085l) {
                    s b2 = iVar2.f2080d.b();
                    AbstractC1705a.n(b2);
                    iVar2.f2079c.i(b2);
                    iVar2.f2085l = true;
                }
                if (iVar2.k > 0 || eVar.b(c1979g3)) {
                    iVar2.k = 0L;
                    v vVar3 = eVar.f2064b;
                    long b10 = iVar2.b(vVar3);
                    if (b10 >= 0) {
                        long j12 = iVar2.g;
                        if (j12 + b10 >= iVar2.f2081e) {
                            iVar2.f2078b.c(vVar3.f21231c, vVar3);
                            iVar2.f2078b.e((j12 * 1000000) / iVar2.f2084i, 1, vVar3.f21231c, 0, null);
                            iVar2.f2081e = -1L;
                        }
                    }
                    iVar2.g += b10;
                    return 0;
                }
                iVar2.f2083h = 3;
            } else if (i10 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f2060a = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
