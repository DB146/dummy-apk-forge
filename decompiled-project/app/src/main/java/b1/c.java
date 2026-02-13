package b1;

import Q7.h;
import d1.C1040c;
import java.util.ArrayList;
import java.util.Arrays;
import q3.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f13783q = false;

    /* renamed from: d, reason: collision with root package name */
    public final e f13787d;

    /* renamed from: m, reason: collision with root package name */
    public final h f13793m;

    /* renamed from: p, reason: collision with root package name */
    public b f13796p;

    /* renamed from: a, reason: collision with root package name */
    public int f13784a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13785b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f13786c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f13788e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f13789f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13790h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f13791i = new boolean[32];
    public int j = 1;
    public int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f13792l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f13794n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f13795o = 0;
    public b[] g = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, b1.e, b1.b] */
    public c() {
        s();
        h hVar = new h(21, (char) 0);
        hVar.f8695b = new d();
        hVar.f8696c = new d();
        hVar.f8697d = new f[32];
        this.f13793m = hVar;
        ?? bVar = new b(hVar);
        bVar.f13799f = new f[128];
        bVar.g = new f[128];
        bVar.f13800h = 0;
        bVar.f13801i = new s((Object) bVar, 26);
        this.f13787d = bVar;
        this.f13796p = new b(hVar);
    }

    public static int n(Object obj) {
        f fVar = ((C1040c) obj).f16339i;
        if (fVar != null) {
            return (int) (fVar.f13806e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i7) {
        d dVar = (d) this.f13793m.f8696c;
        int i10 = dVar.f13798b;
        f fVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = dVar.f13797a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            dVar.f13798b = i11;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i7);
            fVar2.f13813z = i7;
        } else {
            fVar2.d();
            fVar2.f13813z = i7;
        }
        int i12 = this.f13795o;
        int i13 = this.f13784a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f13784a = i14;
            this.f13794n = (f[]) Arrays.copyOf(this.f13794n, i14);
        }
        f[] fVarArr = this.f13794n;
        int i15 = this.f13795o;
        this.f13795o = i15 + 1;
        fVarArr[i15] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i7, float f4, f fVar3, f fVar4, int i10, int i11) {
        b l10 = l();
        if (fVar2 == fVar3) {
            l10.f13781d.g(fVar, 1.0f);
            l10.f13781d.g(fVar4, 1.0f);
            l10.f13781d.g(fVar2, -2.0f);
        } else if (f4 == 0.5f) {
            l10.f13781d.g(fVar, 1.0f);
            l10.f13781d.g(fVar2, -1.0f);
            l10.f13781d.g(fVar3, -1.0f);
            l10.f13781d.g(fVar4, 1.0f);
            if (i7 > 0 || i10 > 0) {
                l10.f13779b = (-i7) + i10;
            }
        } else if (f4 <= 0.0f) {
            l10.f13781d.g(fVar, -1.0f);
            l10.f13781d.g(fVar2, 1.0f);
            l10.f13779b = i7;
        } else if (f4 >= 1.0f) {
            l10.f13781d.g(fVar4, -1.0f);
            l10.f13781d.g(fVar3, 1.0f);
            l10.f13779b = -i10;
        } else {
            float f10 = 1.0f - f4;
            l10.f13781d.g(fVar, f10 * 1.0f);
            l10.f13781d.g(fVar2, f10 * (-1.0f));
            l10.f13781d.g(fVar3, (-1.0f) * f4);
            l10.f13781d.g(fVar4, 1.0f * f4);
            if (i7 > 0 || i10 > 0) {
                l10.f13779b = (i10 * f4) + ((-i7) * f10);
            }
        }
        if (i11 != 8) {
            l10.a(this, i11);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f13812y <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f13812y <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f13812y <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f13812y <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z8;
        boolean z10;
        f fVar;
        f f4;
        ArrayList arrayList;
        if (this.k + 1 >= this.f13792l || this.j + 1 >= this.f13789f) {
            o();
        }
        if (bVar.f13782e) {
            z8 = false;
        } else {
            if (this.g.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int d10 = bVar.f13781d.d();
                    int i7 = 0;
                    while (true) {
                        arrayList = bVar.f13780c;
                        if (i7 >= d10) {
                            break;
                        }
                        f e2 = bVar.f13781d.e(i7);
                        if (e2.f13804c != -1 || e2.f13807f) {
                            arrayList.add(e2);
                        }
                        i7++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            f fVar2 = (f) arrayList.get(i10);
                            if (fVar2.f13807f) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.g[fVar2.f13804c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (bVar.f13778a != null && bVar.f13781d.d() == 0) {
                    bVar.f13782e = true;
                    this.f13785b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f13779b;
            if (f10 < 0.0f) {
                bVar.f13779b = f10 * (-1.0f);
                a aVar = bVar.f13781d;
                int i11 = aVar.f13776h;
                for (int i12 = 0; i11 != -1 && i12 < aVar.f13770a; i12++) {
                    float[] fArr = aVar.g;
                    fArr[i11] = fArr[i11] * (-1.0f);
                    i11 = aVar.f13775f[i11];
                }
            }
            int d11 = bVar.f13781d.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i13 = 0; i13 < d11; i13++) {
                float f13 = bVar.f13781d.f(i13);
                f e10 = bVar.f13781d.e(i13);
                if (e10.f13813z == 1) {
                    if (fVar3 != null) {
                        if (f11 <= f13) {
                            if (!z12) {
                                if (e10.f13812y > 1) {
                                }
                            }
                        }
                        z12 = true;
                    }
                    fVar3 = e10;
                    f11 = f13;
                } else if (fVar3 == null && f13 < 0.0f) {
                    if (fVar4 != null) {
                        if (f12 <= f13) {
                            if (!z13) {
                                if (e10.f13812y > 1) {
                                }
                            }
                        }
                        z13 = true;
                    }
                    fVar4 = e10;
                    f12 = f13;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z10 = true;
            } else {
                bVar.g(fVar3);
                z10 = false;
            }
            if (bVar.f13781d.d() == 0) {
                bVar.f13782e = true;
            }
            if (z10) {
                if (this.j + 1 >= this.f13789f) {
                    o();
                }
                f a9 = a(3);
                int i14 = this.f13786c + 1;
                this.f13786c = i14;
                this.j++;
                a9.f13803b = i14;
                h hVar = this.f13793m;
                ((f[]) hVar.f8697d)[i14] = a9;
                bVar.f13778a = a9;
                int i15 = this.k;
                h(bVar);
                if (this.k == i15 + 1) {
                    b bVar2 = this.f13796p;
                    bVar2.f13778a = null;
                    bVar2.f13781d.b();
                    for (int i16 = 0; i16 < bVar.f13781d.d(); i16++) {
                        bVar2.f13781d.a(bVar.f13781d.e(i16), bVar.f13781d.f(i16), true);
                    }
                    r(this.f13796p);
                    if (a9.f13804c == -1) {
                        if (bVar.f13778a == a9 && (f4 = bVar.f(null, a9)) != null) {
                            bVar.g(f4);
                        }
                        if (!bVar.f13782e) {
                            bVar.f13778a.g(this, bVar);
                        }
                        ((d) hVar.f8695b).b(bVar);
                        this.k--;
                    }
                    z8 = true;
                    fVar = bVar.f13778a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f13813z != 1 && bVar.f13779b < 0.0f) {
                        return;
                    }
                }
            }
            z8 = false;
            fVar = bVar.f13778a;
            if (fVar != null) {
            }
        }
        if (z8) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i7) {
        int i10 = fVar.f13804c;
        if (i10 == -1) {
            fVar.f(this, i7);
            for (int i11 = 0; i11 < this.f13786c + 1; i11++) {
                f fVar2 = ((f[]) this.f13793m.f8697d)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b l10 = l();
            l10.f13778a = fVar;
            float f4 = i7;
            fVar.f13806e = f4;
            l10.f13779b = f4;
            l10.f13782e = true;
            c(l10);
            return;
        }
        b bVar = this.g[i10];
        if (bVar.f13782e) {
            bVar.f13779b = i7;
            return;
        }
        if (bVar.f13781d.d() == 0) {
            bVar.f13782e = true;
            bVar.f13779b = i7;
            return;
        }
        b l11 = l();
        if (i7 < 0) {
            l11.f13779b = i7 * (-1);
            l11.f13781d.g(fVar, 1.0f);
        } else {
            l11.f13779b = i7;
            l11.f13781d.g(fVar, -1.0f);
        }
        c(l11);
    }

    public final void e(f fVar, f fVar2, int i7, int i10) {
        if (i10 == 8 && fVar2.f13807f && fVar.f13804c == -1) {
            fVar.f(this, fVar2.f13806e + i7);
            return;
        }
        b l10 = l();
        boolean z8 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z8 = true;
            }
            l10.f13779b = i7;
        }
        if (z8) {
            l10.f13781d.g(fVar, 1.0f);
            l10.f13781d.g(fVar2, -1.0f);
        } else {
            l10.f13781d.g(fVar, -1.0f);
            l10.f13781d.g(fVar2, 1.0f);
        }
        if (i10 != 8) {
            l10.a(this, i10);
        }
        c(l10);
    }

    public final void f(f fVar, f fVar2, int i7, int i10) {
        b l10 = l();
        f m10 = m();
        m10.f13805d = 0;
        l10.b(fVar, fVar2, m10, i7);
        if (i10 != 8) {
            l10.f13781d.g(j(i10), (int) (l10.f13781d.c(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(f fVar, f fVar2, int i7, int i10) {
        b l10 = l();
        f m10 = m();
        m10.f13805d = 0;
        l10.c(fVar, fVar2, m10, i7);
        if (i10 != 8) {
            l10.f13781d.g(j(i10), (int) (l10.f13781d.c(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i7;
        if (bVar.f13782e) {
            bVar.f13778a.f(this, bVar.f13779b);
        } else {
            b[] bVarArr = this.g;
            int i10 = this.k;
            bVarArr[i10] = bVar;
            f fVar = bVar.f13778a;
            fVar.f13804c = i10;
            this.k = i10 + 1;
            fVar.g(this, bVar);
        }
        if (this.f13785b) {
            int i11 = 0;
            while (i11 < this.k) {
                if (this.g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.g[i11];
                if (bVar2 != null && bVar2.f13782e) {
                    bVar2.f13778a.f(this, bVar2.f13779b);
                    ((d) this.f13793m.f8695b).b(bVar2);
                    this.g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i7 = this.k;
                        if (i12 >= i7) {
                            break;
                        }
                        b[] bVarArr2 = this.g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        f fVar2 = bVar3.f13778a;
                        if (fVar2.f13804c == i12) {
                            fVar2.f13804c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i7) {
                        this.g[i13] = null;
                    }
                    this.k = i7 - 1;
                    i11--;
                }
                i11++;
            }
            this.f13785b = false;
        }
    }

    public final void i() {
        for (int i7 = 0; i7 < this.k; i7++) {
            b bVar = this.g[i7];
            bVar.f13778a.f13806e = bVar.f13779b;
        }
    }

    public final f j(int i7) {
        if (this.j + 1 >= this.f13789f) {
            o();
        }
        f a9 = a(4);
        int i10 = this.f13786c + 1;
        this.f13786c = i10;
        this.j++;
        a9.f13803b = i10;
        a9.f13805d = i7;
        ((f[]) this.f13793m.f8697d)[i10] = a9;
        e eVar = this.f13787d;
        eVar.f13801i.f23438b = a9;
        float[] fArr = a9.f13809v;
        Arrays.fill(fArr, 0.0f);
        fArr[a9.f13805d] = 1.0f;
        eVar.j(a9);
        return a9;
    }

    public final f k(Object obj) {
        f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f13789f) {
            o();
        }
        if (obj instanceof C1040c) {
            C1040c c1040c = (C1040c) obj;
            fVar = c1040c.f16339i;
            if (fVar == null) {
                c1040c.k();
                fVar = c1040c.f16339i;
            }
            int i7 = fVar.f13803b;
            h hVar = this.f13793m;
            if (i7 == -1 || i7 > this.f13786c || ((f[]) hVar.f8697d)[i7] == null) {
                if (i7 != -1) {
                    fVar.d();
                }
                int i10 = this.f13786c + 1;
                this.f13786c = i10;
                this.j++;
                fVar.f13803b = i10;
                fVar.f13813z = 1;
                ((f[]) hVar.f8697d)[i10] = fVar;
            }
        }
        return fVar;
    }

    public final b l() {
        Object obj;
        h hVar = this.f13793m;
        d dVar = (d) hVar.f8695b;
        int i7 = dVar.f13798b;
        if (i7 > 0) {
            int i10 = i7 - 1;
            Object[] objArr = dVar.f13797a;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f13798b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(hVar);
        }
        bVar.f13778a = null;
        bVar.f13781d.b();
        bVar.f13779b = 0.0f;
        bVar.f13782e = false;
        return bVar;
    }

    public final f m() {
        if (this.j + 1 >= this.f13789f) {
            o();
        }
        f a9 = a(3);
        int i7 = this.f13786c + 1;
        this.f13786c = i7;
        this.j++;
        a9.f13803b = i7;
        ((f[]) this.f13793m.f8697d)[i7] = a9;
        return a9;
    }

    public final void o() {
        int i7 = this.f13788e * 2;
        this.f13788e = i7;
        this.g = (b[]) Arrays.copyOf(this.g, i7);
        h hVar = this.f13793m;
        hVar.f8697d = (f[]) Arrays.copyOf((f[]) hVar.f8697d, this.f13788e);
        int i10 = this.f13788e;
        this.f13791i = new boolean[i10];
        this.f13789f = i10;
        this.f13792l = i10;
    }

    public final void p() {
        e eVar = this.f13787d;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f13790h) {
            q(eVar);
            return;
        }
        for (int i7 = 0; i7 < this.k; i7++) {
            if (!this.g[i7].f13782e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        int i7 = 0;
        while (true) {
            if (i7 >= this.k) {
                break;
            }
            b bVar = this.g[i7];
            int i10 = 1;
            if (bVar.f13778a.f13813z != 1) {
                float f4 = 0.0f;
                if (bVar.f13779b < 0.0f) {
                    boolean z8 = false;
                    int i11 = 0;
                    while (!z8) {
                        i11 += i10;
                        float f10 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.k) {
                            b bVar2 = this.g[i14];
                            if (bVar2.f13778a.f13813z != i10 && !bVar2.f13782e && bVar2.f13779b < f4) {
                                int d10 = bVar2.f13781d.d();
                                int i16 = 0;
                                while (i16 < d10) {
                                    f e2 = bVar2.f13781d.e(i16);
                                    float c10 = bVar2.f13781d.c(e2);
                                    if (c10 > f4) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f11 = e2.f13808u[i17] / c10;
                                            if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = e2.f13803b;
                                                i12 = i14;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i16++;
                                    f4 = 0.0f;
                                }
                            }
                            i14++;
                            f4 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.g[i12];
                            bVar3.f13778a.f13804c = -1;
                            bVar3.g(((f[]) this.f13793m.f8697d)[i13]);
                            f fVar = bVar3.f13778a;
                            fVar.f13804c = i12;
                            fVar.g(this, bVar3);
                        } else {
                            z8 = true;
                        }
                        if (i11 > this.j / 2) {
                            z8 = true;
                        }
                        f4 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i7++;
        }
        r(eVar);
        i();
    }

    public final void r(b bVar) {
        boolean z8;
        int i7 = 0;
        for (int i10 = 0; i10 < this.j; i10++) {
            this.f13791i[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            int i12 = 1;
            i11++;
            if (i11 >= this.j * 2) {
                return;
            }
            f fVar = bVar.f13778a;
            if (fVar != null) {
                this.f13791i[fVar.f13803b] = true;
            }
            f d10 = bVar.d(this.f13791i);
            if (d10 != null) {
                boolean[] zArr = this.f13791i;
                int i13 = d10.f13803b;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (d10 != null) {
                float f4 = Float.MAX_VALUE;
                int i14 = i7;
                int i15 = -1;
                while (i14 < this.k) {
                    b bVar2 = this.g[i14];
                    if (bVar2.f13778a.f13813z != i12 && !bVar2.f13782e) {
                        a aVar = bVar2.f13781d;
                        int i16 = aVar.f13776h;
                        if (i16 != -1) {
                            for (int i17 = 0; i16 != -1 && i17 < aVar.f13770a; i17++) {
                                if (aVar.f13774e[i16] == d10.f13803b) {
                                    z8 = true;
                                    break;
                                }
                                i16 = aVar.f13775f[i16];
                            }
                        }
                        z8 = false;
                        if (z8) {
                            float c10 = bVar2.f13781d.c(d10);
                            if (c10 < 0.0f) {
                                float f10 = (-bVar2.f13779b) / c10;
                                if (f10 < f4) {
                                    f4 = f10;
                                    i15 = i14;
                                }
                            }
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 > -1) {
                    b bVar3 = this.g[i15];
                    bVar3.f13778a.f13804c = -1;
                    bVar3.g(d10);
                    f fVar2 = bVar3.f13778a;
                    fVar2.f13804c = i15;
                    fVar2.g(this, bVar3);
                }
            } else {
                z10 = true;
            }
            i7 = 0;
        }
    }

    public final void s() {
        for (int i7 = 0; i7 < this.k; i7++) {
            b bVar = this.g[i7];
            if (bVar != null) {
                ((d) this.f13793m.f8695b).b(bVar);
            }
            this.g[i7] = null;
        }
    }

    public final void t() {
        h hVar;
        int i7 = 0;
        while (true) {
            hVar = this.f13793m;
            f[] fVarArr = (f[]) hVar.f8697d;
            if (i7 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i7];
            if (fVar != null) {
                fVar.d();
            }
            i7++;
        }
        d dVar = (d) hVar.f8696c;
        f[] fVarArr2 = this.f13794n;
        int i10 = this.f13795o;
        dVar.getClass();
        if (i10 > fVarArr2.length) {
            i10 = fVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = dVar.f13798b;
            Object[] objArr = dVar.f13797a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                dVar.f13798b = i12 + 1;
            }
        }
        this.f13795o = 0;
        Arrays.fill((f[]) hVar.f8697d, (Object) null);
        this.f13786c = 0;
        e eVar = this.f13787d;
        eVar.f13800h = 0;
        eVar.f13779b = 0.0f;
        this.j = 1;
        for (int i13 = 0; i13 < this.k; i13++) {
            b bVar = this.g[i13];
        }
        s();
        this.k = 0;
        this.f13796p = new b(hVar);
    }
}
