package w4;

import C9.h;
import F.C0257a;
import P4.o0;
import b5.f;
import h3.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m4.K;
import n5.AbstractC1705a;
import n5.v;
import o4.AbstractC1787a;
import o4.M;
import o5.C1806a;
import s4.C1979g;
import s4.C1981i;
import s4.C1986n;
import s4.C1989q;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2215b implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final v f25784a = new v(4);

    /* renamed from: b, reason: collision with root package name */
    public final v f25785b = new v(9);

    /* renamed from: c, reason: collision with root package name */
    public final v f25786c = new v(11);

    /* renamed from: d, reason: collision with root package name */
    public final v f25787d = new v();

    /* renamed from: e, reason: collision with root package name */
    public final C2216c f25788e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1984l f25789f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25790h;

    /* renamed from: i, reason: collision with root package name */
    public long f25791i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f25792l;

    /* renamed from: m, reason: collision with root package name */
    public long f25793m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25794n;

    /* renamed from: o, reason: collision with root package name */
    public C2214a f25795o;

    /* renamed from: p, reason: collision with root package name */
    public C2217d f25796p;

    /* JADX WARN: Type inference failed for: r0v4, types: [w4.c, C9.h] */
    public C2215b() {
        ?? hVar = new h(new C1981i());
        hVar.f25797b = -9223372036854775807L;
        hVar.f25798c = new long[0];
        hVar.f25799d = new long[0];
        this.f25788e = hVar;
        this.g = 1;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        if (j == 0) {
            this.g = 1;
            this.f25790h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final v b(C1979g c1979g) {
        int i7 = this.f25792l;
        v vVar = this.f25787d;
        byte[] bArr = vVar.f21229a;
        if (i7 > bArr.length) {
            vVar.E(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            vVar.G(0);
        }
        vVar.F(this.f25792l);
        c1979g.h(vVar.f21229a, 0, this.f25792l, false);
        return vVar;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        v vVar = this.f25784a;
        C1979g c1979g = (C1979g) interfaceC1983k;
        c1979g.x(vVar.f21229a, 0, 3, false);
        vVar.G(0);
        if (vVar.x() != 4607062) {
            return false;
        }
        c1979g.x(vVar.f21229a, 0, 2, false);
        vVar.G(0);
        if ((vVar.A() & 250) != 0) {
            return false;
        }
        c1979g.x(vVar.f21229a, 0, 4, false);
        vVar.G(0);
        int h10 = vVar.h();
        c1979g.f24057f = 0;
        c1979g.b(h10, false);
        c1979g.x(vVar.f21229a, 0, 4, false);
        vVar.G(0);
        return vVar.h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v53, types: [w4.a, C9.h] */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        long j;
        long j10;
        int i7;
        boolean z8;
        boolean z10;
        AbstractC1705a.n(this.f25789f);
        while (true) {
            int i10 = this.g;
            if (i10 == 1) {
                v vVar = this.f25785b;
                if (!((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 9, true)) {
                    return -1;
                }
                vVar.G(0);
                vVar.H(4);
                int v10 = vVar.v();
                boolean z11 = (v10 & 4) != 0;
                boolean z12 = (v10 & 1) != 0;
                if (z11 && this.f25795o == null) {
                    this.f25795o = new h(this.f25789f.u(8, 1));
                }
                if (z12 && this.f25796p == null) {
                    this.f25796p = new C2217d(this.f25789f.u(9, 2));
                }
                this.f25789f.f();
                this.j = vVar.h() - 5;
                this.g = 2;
            } else if (i10 == 2) {
                ((C1979g) interfaceC1983k).r(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i10 == 3) {
                v vVar2 = this.f25786c;
                if (!((C1979g) interfaceC1983k).h(vVar2.f21229a, 0, 11, true)) {
                    return -1;
                }
                vVar2.G(0);
                this.k = vVar2.v();
                this.f25792l = vVar2.x();
                this.f25793m = vVar2.x();
                this.f25793m = ((vVar2.v() << 24) | this.f25793m) * 1000;
                vVar2.H(3);
                this.g = 4;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                boolean z13 = this.f25790h;
                C2216c c2216c = this.f25788e;
                if (z13) {
                    j = this.f25791i + this.f25793m;
                } else if (c2216c.f25797b == -9223372036854775807L) {
                    j10 = 0;
                    i7 = this.k;
                    if (i7 != 8 && this.f25795o != null) {
                        if (!this.f25794n) {
                            this.f25789f.i(new C1986n(-9223372036854775807L));
                            this.f25794n = true;
                        }
                        C2214a c2214a = this.f25795o;
                        v b2 = b((C1979g) interfaceC1983k);
                        if (c2214a.f25781b) {
                            b2.H(1);
                        } else {
                            int v11 = b2.v();
                            int i11 = (v11 >> 4) & 15;
                            c2214a.f25783d = i11;
                            s4.v vVar3 = (s4.v) c2214a.f3094a;
                            if (i11 == 2) {
                                int i12 = C2214a.f25780e[(v11 >> 2) & 3];
                                K k = new K();
                                k.k = "audio/mpeg";
                                k.f19996x = 1;
                                k.f19997y = i12;
                                o.w(k, vVar3);
                                c2214a.f25782c = true;
                            } else if (i11 == 7 || i11 == 8) {
                                String str = i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                K k7 = new K();
                                k7.k = str;
                                k7.f19996x = 1;
                                k7.f19997y = 8000;
                                o.w(k7, vVar3);
                                c2214a.f25782c = true;
                            } else if (i11 != 10) {
                                throw new o0("Audio format not supported: " + c2214a.f25783d, 2);
                            }
                            c2214a.f25781b = true;
                        }
                        int i13 = c2214a.f25783d;
                        s4.v vVar4 = (s4.v) c2214a.f3094a;
                        z10 = true;
                        if (i13 == 2) {
                            int a9 = b2.a();
                            vVar4.c(a9, b2);
                            ((s4.v) c2214a.f3094a).e(j10, 1, a9, 0, null);
                        } else {
                            int v12 = b2.v();
                            if (v12 == 0 && !c2214a.f25782c) {
                                int a10 = b2.a();
                                byte[] bArr = new byte[a10];
                                b2.f(0, bArr, a10);
                                M k10 = AbstractC1787a.k(new f(bArr, a10), false);
                                K k11 = new K();
                                k11.k = "audio/mp4a-latm";
                                k11.f19982h = (String) k10.f21768c;
                                k11.f19996x = k10.f21767b;
                                k11.f19997y = k10.f21766a;
                                k11.f19985m = Collections.singletonList(bArr);
                                o.w(k11, vVar4);
                                c2214a.f25782c = true;
                            } else if (c2214a.f25783d != 10 || v12 == 1) {
                                int a11 = b2.a();
                                vVar4.c(a11, b2);
                                ((s4.v) c2214a.f3094a).e(j10, 1, a11, 0, null);
                            }
                            z10 = false;
                        }
                        z8 = true;
                        if (!this.f25790h) {
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z8) {
                        }
                    } else if (i7 == 9 || this.f25796p == null) {
                        if (i7 == 18 || this.f25794n) {
                            ((C1979g) interfaceC1983k).r(this.f25792l);
                            z8 = false;
                        } else {
                            v b10 = b((C1979g) interfaceC1983k);
                            c2216c.getClass();
                            c2216c.getClass();
                            if (b10.v() == 2 && "onMetaData".equals(C2216c.M(b10)) && b10.a() != 0 && b10.v() == 8) {
                                HashMap L = C2216c.L(b10);
                                Object obj = L.get("duration");
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        c2216c.f25797b = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = L.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        c2216c.f25798c = new long[size];
                                        c2216c.f25799d = new long[size];
                                        int i14 = 0;
                                        while (i14 < size) {
                                            Object obj5 = list.get(i14);
                                            Object obj6 = list2.get(i14);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                c2216c.f25798c = new long[0];
                                                c2216c.f25799d = new long[0];
                                                break;
                                            }
                                            c2216c.f25798c[i14] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            c2216c.f25799d[i14] = ((Double) obj5).longValue();
                                            i14++;
                                            list = list;
                                        }
                                    }
                                }
                            }
                            long j11 = c2216c.f25797b;
                            if (j11 != -9223372036854775807L) {
                                this.f25789f.i(new C1989q(c2216c.f25799d, c2216c.f25798c, j11));
                                this.f25794n = true;
                            }
                            z8 = true;
                        }
                        z10 = false;
                        if (!this.f25790h && z10) {
                            this.f25790h = true;
                            this.f25791i = c2216c.f25797b != -9223372036854775807L ? -this.f25793m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z8) {
                            return 0;
                        }
                    } else {
                        if (!this.f25794n) {
                            this.f25789f.i(new C1986n(-9223372036854775807L));
                            this.f25794n = true;
                        }
                        C2217d c2217d = this.f25796p;
                        v b11 = b((C1979g) interfaceC1983k);
                        c2217d.getClass();
                        int v13 = b11.v();
                        int i15 = (v13 >> 4) & 15;
                        int i16 = v13 & 15;
                        if (i16 != 7) {
                            throw new o0(o.l(i16, "Video format not supported: "), 2);
                        }
                        c2217d.f25805u = i15;
                        if (i15 != 5) {
                            int v14 = b11.v();
                            byte[] bArr2 = b11.f21229a;
                            int i17 = b11.f21230b;
                            int i18 = i17 + 1;
                            b11.f21230b = i18;
                            int i19 = ((bArr2[i17] & 255) << 24) >> 8;
                            b11.f21230b = i17 + 2;
                            int i20 = ((bArr2[i18] & 255) << 8) | i19;
                            b11.f21230b = i17 + 3;
                            long j12 = (((bArr2[r15] & 255) | i20) * 1000) + j10;
                            boolean z14 = true;
                            s4.v vVar5 = (s4.v) c2217d.f3094a;
                            if (v14 == 0 && !c2217d.f25803e) {
                                byte[] bArr3 = new byte[b11.a()];
                                v vVar6 = new v(bArr3);
                                b11.f(0, bArr3, b11.a());
                                C1806a a12 = C1806a.a(vVar6);
                                c2217d.f25802d = a12.f21928b;
                                K k12 = new K();
                                k12.k = "video/avc";
                                k12.f19982h = a12.f21934i;
                                k12.f19988p = a12.f21929c;
                                k12.f19989q = a12.f21930d;
                                k12.f19992t = a12.f21933h;
                                k12.f19985m = a12.f21927a;
                                o.w(k12, vVar5);
                                c2217d.f25803e = true;
                            } else if (v14 == 1 && c2217d.f25803e) {
                                int i21 = c2217d.f25805u == 1 ? 1 : 0;
                                if (c2217d.f25804f || i21 != 0) {
                                    v vVar7 = c2217d.f25801c;
                                    byte[] bArr4 = vVar7.f21229a;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i22 = 4 - c2217d.f25802d;
                                    int i23 = 0;
                                    while (b11.a() > 0) {
                                        b11.f(i22, vVar7.f21229a, c2217d.f25802d);
                                        vVar7.G(0);
                                        int y10 = vVar7.y();
                                        v vVar8 = c2217d.f25800b;
                                        vVar8.G(0);
                                        vVar5.c(4, vVar8);
                                        vVar5.c(y10, b11);
                                        i23 = i23 + 4 + y10;
                                    }
                                    ((s4.v) c2217d.f3094a).e(j12, i21, i23, 0, null);
                                    c2217d.f25804f = true;
                                    if (z14) {
                                        z10 = true;
                                        z8 = true;
                                        if (!this.f25790h) {
                                            this.f25790h = true;
                                            this.f25791i = c2216c.f25797b != -9223372036854775807L ? -this.f25793m : 0L;
                                        }
                                        this.j = 4;
                                        this.g = 2;
                                        if (z8) {
                                        }
                                    }
                                }
                            }
                            z14 = false;
                            if (z14) {
                            }
                        }
                        z10 = false;
                        z8 = true;
                        if (!this.f25790h) {
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z8) {
                        }
                    }
                } else {
                    j = this.f25793m;
                }
                j10 = j;
                i7 = this.k;
                if (i7 != 8) {
                }
                if (i7 == 9) {
                }
                if (i7 == 18) {
                }
                ((C1979g) interfaceC1983k).r(this.f25792l);
                z8 = false;
                z10 = false;
                if (!this.f25790h) {
                }
                this.j = 4;
                this.g = 2;
                if (z8) {
                }
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f25789f = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
