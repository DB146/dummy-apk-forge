package d1;

import android.view.View;
import e1.k;
import e1.m;
import h3.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public int f16340A;

    /* renamed from: B, reason: collision with root package name */
    public float f16341B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f16342C;

    /* renamed from: D, reason: collision with root package name */
    public float f16343D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16344E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f16345F;

    /* renamed from: G, reason: collision with root package name */
    public int f16346G;

    /* renamed from: H, reason: collision with root package name */
    public int f16347H;

    /* renamed from: I, reason: collision with root package name */
    public final C1040c f16348I;

    /* renamed from: J, reason: collision with root package name */
    public final C1040c f16349J;

    /* renamed from: K, reason: collision with root package name */
    public final C1040c f16350K;
    public final C1040c L;

    /* renamed from: M, reason: collision with root package name */
    public final C1040c f16351M;

    /* renamed from: N, reason: collision with root package name */
    public final C1040c f16352N;

    /* renamed from: O, reason: collision with root package name */
    public final C1040c f16353O;

    /* renamed from: P, reason: collision with root package name */
    public final C1040c f16354P;

    /* renamed from: Q, reason: collision with root package name */
    public final C1040c[] f16355Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f16356R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f16357S;

    /* renamed from: T, reason: collision with root package name */
    public d f16358T;

    /* renamed from: U, reason: collision with root package name */
    public int f16359U;

    /* renamed from: V, reason: collision with root package name */
    public int f16360V;

    /* renamed from: W, reason: collision with root package name */
    public float f16361W;

    /* renamed from: X, reason: collision with root package name */
    public int f16362X;

    /* renamed from: Y, reason: collision with root package name */
    public int f16363Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f16364Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f16366a0;

    /* renamed from: b, reason: collision with root package name */
    public e1.c f16367b;

    /* renamed from: b0, reason: collision with root package name */
    public int f16368b0;

    /* renamed from: c, reason: collision with root package name */
    public e1.c f16369c;

    /* renamed from: c0, reason: collision with root package name */
    public int f16370c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f16372d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f16374e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f16376f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f16377g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f16379h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f16381i0;
    public String j;

    /* renamed from: j0, reason: collision with root package name */
    public int f16382j0;
    public boolean k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f16383k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16384l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f16385l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16386m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f16387m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16388n;

    /* renamed from: n0, reason: collision with root package name */
    public int f16389n0;

    /* renamed from: o, reason: collision with root package name */
    public int f16390o;

    /* renamed from: o0, reason: collision with root package name */
    public int f16391o0;

    /* renamed from: p, reason: collision with root package name */
    public int f16392p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f16393p0;

    /* renamed from: q, reason: collision with root package name */
    public int f16394q;

    /* renamed from: r, reason: collision with root package name */
    public int f16395r;

    /* renamed from: s, reason: collision with root package name */
    public int f16396s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f16397t;

    /* renamed from: u, reason: collision with root package name */
    public int f16398u;

    /* renamed from: v, reason: collision with root package name */
    public int f16399v;

    /* renamed from: w, reason: collision with root package name */
    public float f16400w;

    /* renamed from: x, reason: collision with root package name */
    public int f16401x;

    /* renamed from: y, reason: collision with root package name */
    public int f16402y;

    /* renamed from: z, reason: collision with root package name */
    public float f16403z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16365a = false;

    /* renamed from: d, reason: collision with root package name */
    public k f16371d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f16373e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16375f = {true, true};
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f16378h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f16380i = -1;

    public d() {
        new HashMap();
        this.k = false;
        this.f16384l = false;
        this.f16386m = false;
        this.f16388n = false;
        this.f16390o = -1;
        this.f16392p = -1;
        this.f16394q = 0;
        this.f16395r = 0;
        this.f16396s = 0;
        this.f16397t = new int[2];
        this.f16398u = 0;
        this.f16399v = 0;
        this.f16400w = 1.0f;
        this.f16401x = 0;
        this.f16402y = 0;
        this.f16403z = 1.0f;
        this.f16340A = -1;
        this.f16341B = 1.0f;
        this.f16342C = new int[]{com.google.android.gms.common.api.f.API_PRIORITY_OTHER, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};
        this.f16343D = Float.NaN;
        this.f16344E = false;
        this.f16345F = false;
        this.f16346G = 0;
        this.f16347H = 0;
        C1040c c1040c = new C1040c(this, 2);
        this.f16348I = c1040c;
        C1040c c1040c2 = new C1040c(this, 3);
        this.f16349J = c1040c2;
        C1040c c1040c3 = new C1040c(this, 4);
        this.f16350K = c1040c3;
        C1040c c1040c4 = new C1040c(this, 5);
        this.L = c1040c4;
        C1040c c1040c5 = new C1040c(this, 6);
        this.f16351M = c1040c5;
        C1040c c1040c6 = new C1040c(this, 8);
        this.f16352N = c1040c6;
        C1040c c1040c7 = new C1040c(this, 9);
        this.f16353O = c1040c7;
        C1040c c1040c8 = new C1040c(this, 7);
        this.f16354P = c1040c8;
        this.f16355Q = new C1040c[]{c1040c, c1040c3, c1040c2, c1040c4, c1040c5, c1040c8};
        ArrayList arrayList = new ArrayList();
        this.f16356R = arrayList;
        this.f16357S = new boolean[2];
        this.f16393p0 = new int[]{1, 1};
        this.f16358T = null;
        this.f16359U = 0;
        this.f16360V = 0;
        this.f16361W = 0.0f;
        this.f16362X = -1;
        this.f16363Y = 0;
        this.f16364Z = 0;
        this.f16366a0 = 0;
        this.f16372d0 = 0.5f;
        this.f16374e0 = 0.5f;
        this.f16377g0 = 0;
        this.f16379h0 = null;
        this.f16381i0 = 0;
        this.f16382j0 = 0;
        this.f16383k0 = new float[]{-1.0f, -1.0f};
        this.f16385l0 = new d[]{null, null};
        this.f16387m0 = new d[]{null, null};
        this.f16389n0 = -1;
        this.f16391o0 = -1;
        arrayList.add(c1040c);
        arrayList.add(c1040c2);
        arrayList.add(c1040c3);
        arrayList.add(c1040c4);
        arrayList.add(c1040c6);
        arrayList.add(c1040c7);
        arrayList.add(c1040c8);
        arrayList.add(c1040c5);
    }

    public static void G(int i7, int i10, String str, StringBuilder sb2) {
        if (i7 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i7);
        sb2.append(",\n");
    }

    public static void H(StringBuilder sb2, String str, float f4, float f10) {
        if (f4 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f4);
        sb2.append(",\n");
    }

    public static void o(StringBuilder sb2, String str, int i7, int i10, int i11, int i12, int i13, float f4, int i14) {
        String str2;
        sb2.append(str);
        sb2.append(" :  {\n");
        if (i14 == 1) {
            str2 = "FIXED";
        } else if (i14 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i14 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i14 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            o.v(sb2, "      behavior", " :   ", str2, ",\n");
        }
        G(i7, 0, "      size", sb2);
        G(i10, 0, "      min", sb2);
        G(i11, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, "      max", sb2);
        G(i12, 0, "      matchMin", sb2);
        G(i13, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f4, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, C1040c c1040c) {
        if (c1040c.f16337f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(c1040c.f16337f);
        sb2.append("'");
        if (c1040c.f16338h != Integer.MIN_VALUE || c1040c.g != 0) {
            sb2.append(",");
            sb2.append(c1040c.g);
            if (c1040c.f16338h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(c1040c.f16338h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        return this.k || (this.f16348I.f16334c && this.f16350K.f16334c);
    }

    public boolean B() {
        return this.f16384l || (this.f16349J.f16334c && this.L.f16334c);
    }

    public void C() {
        this.f16348I.j();
        this.f16349J.j();
        this.f16350K.j();
        this.L.j();
        this.f16351M.j();
        this.f16352N.j();
        this.f16353O.j();
        this.f16354P.j();
        this.f16358T = null;
        this.f16343D = Float.NaN;
        this.f16359U = 0;
        this.f16360V = 0;
        this.f16361W = 0.0f;
        this.f16362X = -1;
        this.f16363Y = 0;
        this.f16364Z = 0;
        this.f16366a0 = 0;
        this.f16368b0 = 0;
        this.f16370c0 = 0;
        this.f16372d0 = 0.5f;
        this.f16374e0 = 0.5f;
        int[] iArr = this.f16393p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f16376f0 = null;
        this.f16377g0 = 0;
        this.f16381i0 = 0;
        this.f16382j0 = 0;
        float[] fArr = this.f16383k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f16390o = -1;
        this.f16392p = -1;
        int[] iArr2 = this.f16342C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f16395r = 0;
        this.f16396s = 0;
        this.f16400w = 1.0f;
        this.f16403z = 1.0f;
        this.f16399v = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f16402y = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f16398u = 0;
        this.f16401x = 0;
        this.f16340A = -1;
        this.f16341B = 1.0f;
        boolean[] zArr = this.f16375f;
        zArr[0] = true;
        zArr[1] = true;
        this.f16345F = false;
        boolean[] zArr2 = this.f16357S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.f16397t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f16378h = -1;
        this.f16380i = -1;
    }

    public final void D() {
        d dVar = this.f16358T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f16356R;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1040c) arrayList.get(i7)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.f16384l = false;
        this.f16386m = false;
        this.f16388n = false;
        ArrayList arrayList = this.f16356R;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1040c c1040c = (C1040c) arrayList.get(i7);
            c1040c.f16334c = false;
            c1040c.f16333b = 0;
        }
    }

    public void F(Q7.h hVar) {
        this.f16348I.k();
        this.f16349J.k();
        this.f16350K.k();
        this.L.k();
        this.f16351M.k();
        this.f16354P.k();
        this.f16352N.k();
        this.f16353O.k();
    }

    public final void I(int i7) {
        this.f16366a0 = i7;
        this.f16344E = i7 > 0;
    }

    public final void J(int i7, int i10) {
        if (this.k) {
            return;
        }
        this.f16348I.l(i7);
        this.f16350K.l(i10);
        this.f16363Y = i7;
        this.f16359U = i10 - i7;
        this.k = true;
    }

    public final void K(int i7, int i10) {
        if (this.f16384l) {
            return;
        }
        this.f16349J.l(i7);
        this.L.l(i10);
        this.f16364Z = i7;
        this.f16360V = i10 - i7;
        if (this.f16344E) {
            this.f16351M.l(i7 + this.f16366a0);
        }
        this.f16384l = true;
    }

    public final void L(int i7) {
        this.f16360V = i7;
        int i10 = this.f16370c0;
        if (i7 < i10) {
            this.f16360V = i10;
        }
    }

    public final void M(int i7) {
        this.f16393p0[0] = i7;
    }

    public final void N(int i7) {
        this.f16393p0[1] = i7;
    }

    public final void O(int i7) {
        this.f16359U = i7;
        int i10 = this.f16368b0;
        if (i7 < i10) {
            this.f16359U = i10;
        }
    }

    public void P(boolean z8, boolean z10) {
        int i7;
        int i10;
        k kVar = this.f16371d;
        boolean z11 = z8 & kVar.g;
        m mVar = this.f16373e;
        boolean z12 = z10 & mVar.g;
        int i11 = kVar.f16705h.g;
        int i12 = mVar.f16705h.g;
        int i13 = kVar.f16706i.g;
        int i14 = mVar.f16706i.g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z11) {
            this.f16363Y = i11;
        }
        if (z12) {
            this.f16364Z = i12;
        }
        if (this.f16377g0 == 8) {
            this.f16359U = 0;
            this.f16360V = 0;
            return;
        }
        int[] iArr = this.f16393p0;
        if (z11) {
            if (iArr[0] == 1 && i16 < (i10 = this.f16359U)) {
                i16 = i10;
            }
            this.f16359U = i16;
            int i18 = this.f16368b0;
            if (i16 < i18) {
                this.f16359U = i18;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i17 < (i7 = this.f16360V)) {
                i17 = i7;
            }
            this.f16360V = i17;
            int i19 = this.f16370c0;
            if (i17 < i19) {
                this.f16360V = i19;
            }
        }
    }

    public void Q(b1.c cVar, boolean z8) {
        int i7;
        int i10;
        m mVar;
        k kVar;
        C1040c c1040c = this.f16348I;
        cVar.getClass();
        int n6 = b1.c.n(c1040c);
        int n8 = b1.c.n(this.f16349J);
        int n10 = b1.c.n(this.f16350K);
        int n11 = b1.c.n(this.L);
        if (z8 && (kVar = this.f16371d) != null) {
            e1.f fVar = kVar.f16705h;
            if (fVar.j) {
                e1.f fVar2 = kVar.f16706i;
                if (fVar2.j) {
                    n6 = fVar.g;
                    n10 = fVar2.g;
                }
            }
        }
        if (z8 && (mVar = this.f16373e) != null) {
            e1.f fVar3 = mVar.f16705h;
            if (fVar3.j) {
                e1.f fVar4 = mVar.f16706i;
                if (fVar4.j) {
                    n8 = fVar3.g;
                    n11 = fVar4.g;
                }
            }
        }
        int i11 = n11 - n8;
        if (n10 - n6 < 0 || i11 < 0 || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n8 == Integer.MIN_VALUE || n8 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE) {
            n6 = 0;
            n8 = 0;
            n10 = 0;
            n11 = 0;
        }
        int i12 = n10 - n6;
        int i13 = n11 - n8;
        this.f16363Y = n6;
        this.f16364Z = n8;
        if (this.f16377g0 == 8) {
            this.f16359U = 0;
            this.f16360V = 0;
            return;
        }
        int[] iArr = this.f16393p0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.f16359U)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i7 = this.f16360V)) {
            i13 = i7;
        }
        this.f16359U = i12;
        this.f16360V = i13;
        int i15 = this.f16370c0;
        if (i13 < i15) {
            this.f16360V = i15;
        }
        int i16 = this.f16368b0;
        if (i12 < i16) {
            this.f16359U = i16;
        }
        int i17 = this.f16399v;
        if (i17 > 0 && i14 == 3) {
            this.f16359U = Math.min(this.f16359U, i17);
        }
        int i18 = this.f16402y;
        if (i18 > 0 && iArr[1] == 3) {
            this.f16360V = Math.min(this.f16360V, i18);
        }
        int i19 = this.f16359U;
        if (i12 != i19) {
            this.f16378h = i19;
        }
        int i20 = this.f16360V;
        if (i13 != i20) {
            this.f16380i = i20;
        }
    }

    public final void a(e eVar, b1.c cVar, HashSet hashSet, int i7, boolean z8) {
        if (z8) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i7 == 0) {
            HashSet hashSet2 = this.f16348I.f16332a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C1040c) it.next()).f16335d.a(eVar, cVar, hashSet, i7, true);
                }
            }
            HashSet hashSet3 = this.f16350K.f16332a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C1040c) it2.next()).f16335d.a(eVar, cVar, hashSet, i7, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f16349J.f16332a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C1040c) it3.next()).f16335d.a(eVar, cVar, hashSet, i7, true);
            }
        }
        HashSet hashSet5 = this.L.f16332a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C1040c) it4.next()).f16335d.a(eVar, cVar, hashSet, i7, true);
            }
        }
        HashSet hashSet6 = this.f16351M.f16332a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C1040c) it5.next()).f16335d.a(eVar, cVar, hashSet, i7, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(b1.c cVar, boolean z8) {
        boolean z10;
        boolean z11;
        int i7;
        boolean[] zArr;
        boolean z12;
        d dVar;
        d dVar2;
        C1040c c1040c;
        boolean[] zArr2;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        float f4;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        char c10;
        boolean z17;
        boolean z18;
        int i19;
        C1040c c1040c2;
        boolean z19;
        boolean z20;
        int i20;
        int[] iArr2;
        C1040c c1040c3;
        C1040c c1040c4;
        C1040c c1040c5;
        b1.f fVar;
        b1.f fVar2;
        b1.f fVar3;
        b1.f fVar4;
        b1.f fVar5;
        int[] iArr3;
        int i21;
        int i22;
        int i23;
        d dVar3;
        b1.c cVar2;
        b1.f fVar6;
        b1.f fVar7;
        b1.f fVar8;
        int i24;
        b1.f fVar9;
        b1.f fVar10;
        b1.c cVar3;
        boolean z21;
        k kVar;
        e1.f fVar11;
        int i25;
        boolean x2;
        boolean y10;
        boolean z22;
        k kVar2;
        m mVar;
        boolean z23;
        boolean z24;
        ?? r10;
        C1040c c1040c6 = this.f16348I;
        b1.f k = cVar.k(c1040c6);
        C1040c c1040c7 = this.f16350K;
        b1.f k7 = cVar.k(c1040c7);
        C1040c c1040c8 = this.f16349J;
        b1.f k10 = cVar.k(c1040c8);
        C1040c c1040c9 = this.L;
        b1.f k11 = cVar.k(c1040c9);
        C1040c c1040c10 = this.f16351M;
        b1.f k12 = cVar.k(c1040c10);
        d dVar4 = this.f16358T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f16393p0;
            if (iArr4[0] == 2) {
                r10 = 1;
                z24 = true;
            } else {
                z24 = false;
                r10 = 1;
            }
            boolean z25 = iArr4[r10] == 2 ? r10 : false;
            int i26 = this.f16394q;
            if (i26 == r10) {
                z11 = z24;
                z10 = false;
            } else if (i26 == 2) {
                z10 = z25;
                z11 = false;
            } else if (i26 != 3) {
                z10 = z25;
                z11 = z24;
            }
            i7 = this.f16377g0;
            zArr = this.f16357S;
            if (i7 == 8) {
                ArrayList arrayList = this.f16356R;
                int size = arrayList.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size) {
                        ArrayList arrayList2 = arrayList;
                        HashSet hashSet = ((C1040c) arrayList.get(i27)).f16332a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i27++;
                        arrayList = arrayList2;
                    } else if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                }
            }
            z12 = this.k;
            if (!z12 || this.f16384l) {
                if (z12) {
                    cVar.d(k, this.f16363Y);
                    cVar.d(k7, this.f16363Y + this.f16359U);
                    if (z11 && (dVar2 = this.f16358T) != null) {
                        e eVar = (e) dVar2;
                        WeakReference weakReference = eVar.f16410H0;
                        if (weakReference == null || weakReference.get() == null || c1040c6.d() > ((C1040c) eVar.f16410H0.get()).d()) {
                            eVar.f16410H0 = new WeakReference(c1040c6);
                        }
                        WeakReference weakReference2 = eVar.f16412J0;
                        if (weakReference2 == null || weakReference2.get() == null || c1040c7.d() > ((C1040c) eVar.f16412J0.get()).d()) {
                            eVar.f16412J0 = new WeakReference(c1040c7);
                        }
                    }
                }
                if (this.f16384l) {
                    cVar.d(k10, this.f16364Z);
                    cVar.d(k11, this.f16364Z + this.f16360V);
                    HashSet hashSet2 = c1040c10.f16332a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar.d(k12, this.f16364Z + this.f16366a0);
                    }
                    if (z10 && (dVar = this.f16358T) != null) {
                        e eVar2 = (e) dVar;
                        WeakReference weakReference3 = eVar2.f16409G0;
                        if (weakReference3 == null || weakReference3.get() == null || c1040c8.d() > ((C1040c) eVar2.f16409G0.get()).d()) {
                            eVar2.f16409G0 = new WeakReference(c1040c8);
                        }
                        WeakReference weakReference4 = eVar2.f16411I0;
                        if (weakReference4 == null || weakReference4.get() == null || c1040c9.d() > ((C1040c) eVar2.f16411I0.get()).d()) {
                            eVar2.f16411I0 = new WeakReference(c1040c9);
                        }
                    }
                }
                if (this.k && this.f16384l) {
                    this.k = false;
                    this.f16384l = false;
                    return;
                }
            }
            boolean[] zArr3 = this.f16375f;
            if (z8 || (kVar2 = this.f16371d) == null || (mVar = this.f16373e) == null) {
                c1040c = c1040c10;
                zArr2 = zArr;
            } else {
                zArr2 = zArr;
                e1.f fVar12 = kVar2.f16705h;
                c1040c = c1040c10;
                if (fVar12.j && kVar2.f16706i.j && mVar.f16705h.j && mVar.f16706i.j) {
                    cVar.d(k, fVar12.g);
                    cVar.d(k7, this.f16371d.f16706i.g);
                    cVar.d(k10, this.f16373e.f16705h.g);
                    cVar.d(k11, this.f16373e.f16706i.g);
                    cVar.d(k12, this.f16373e.k.g);
                    if (this.f16358T != null) {
                        if (z11 && zArr3[0] && !x()) {
                            cVar.f(cVar.k(this.f16358T.f16350K), k7, 0, 8);
                        }
                        if (z10 && zArr3[1] && !y()) {
                            z23 = false;
                            cVar.f(cVar.k(this.f16358T.L), k11, 0, 8);
                            this.k = z23;
                            this.f16384l = z23;
                            return;
                        }
                    }
                    z23 = false;
                    this.k = z23;
                    this.f16384l = z23;
                    return;
                }
            }
            if (this.f16358T == null) {
                if (w(0)) {
                    ((e) this.f16358T).R(this, 0);
                    x2 = true;
                } else {
                    x2 = x();
                }
                if (w(1)) {
                    ((e) this.f16358T).R(this, 1);
                    y10 = true;
                } else {
                    y10 = y();
                }
                if (!x2 && z11 && this.f16377g0 != 8 && c1040c6.f16337f == null && c1040c7.f16337f == null) {
                    z22 = x2;
                    cVar.f(cVar.k(this.f16358T.f16350K), k7, 0, 1);
                } else {
                    z22 = x2;
                }
                if (!y10 && z10 && this.f16377g0 != 8 && c1040c8.f16337f == null && c1040c9.f16337f == null && c1040c == null) {
                    cVar.f(cVar.k(this.f16358T.L), k11, 0, 1);
                }
                z13 = y10;
                z14 = z22;
            } else {
                z13 = false;
                z14 = false;
            }
            i10 = this.f16359U;
            i11 = this.f16368b0;
            if (i10 >= i11) {
                i11 = i10;
            }
            i12 = this.f16360V;
            i13 = this.f16370c0;
            if (i12 >= i13) {
                i13 = i12;
            }
            int[] iArr5 = this.f16393p0;
            int i28 = iArr5[0];
            int i29 = i11;
            boolean z26 = i28 == 3;
            int i30 = iArr5[1];
            int i31 = i13;
            boolean z27 = i30 == 3;
            int i32 = this.f16362X;
            this.f16340A = i32;
            f4 = this.f16361W;
            this.f16341B = f4;
            int i33 = this.f16395r;
            int i34 = this.f16396s;
            if (f4 <= 0.0f) {
                iArr = iArr5;
                if (this.f16377g0 != 8) {
                    if (i28 == 3 && i33 == 0) {
                        i33 = 3;
                    }
                    if (i30 == 3 && i34 == 0) {
                        i34 = 3;
                    }
                    if (i28 == 3 && i30 == 3 && i33 == 3 && i34 == 3) {
                        if (i32 == -1) {
                            if (z26 && !z27) {
                                this.f16340A = 0;
                            } else if (!z26 && z27) {
                                this.f16340A = 1;
                                if (i32 == -1) {
                                    this.f16341B = 1.0f / f4;
                                }
                            }
                        }
                        if (this.f16340A == 0 && (!c1040c8.h() || !c1040c9.h())) {
                            this.f16340A = 1;
                        } else if (this.f16340A == 1 && (!c1040c6.h() || !c1040c7.h())) {
                            this.f16340A = 0;
                        }
                        if (this.f16340A == -1 && (!c1040c8.h() || !c1040c9.h() || !c1040c6.h() || !c1040c7.h())) {
                            if (c1040c8.h() && c1040c9.h()) {
                                this.f16340A = 0;
                            } else if (c1040c6.h() && c1040c7.h()) {
                                this.f16341B = 1.0f / this.f16341B;
                                this.f16340A = 1;
                            }
                        }
                        if (this.f16340A == -1) {
                            int i35 = this.f16398u;
                            if (i35 > 0 && this.f16401x == 0) {
                                this.f16340A = 0;
                            } else if (i35 == 0 && this.f16401x > 0) {
                                this.f16341B = 1.0f / this.f16341B;
                                this.f16340A = 1;
                            }
                        }
                    } else {
                        if (i28 == 3 && i33 == 3) {
                            this.f16340A = 0;
                            i16 = (int) (f4 * i12);
                            if (i30 != 3) {
                                i15 = i34;
                                i17 = i31;
                                z15 = false;
                                i14 = 4;
                                int[] iArr6 = this.f16397t;
                                iArr6[0] = i14;
                                iArr6[1] = i15;
                                if (z15) {
                                }
                                z16 = false;
                                if (z15) {
                                }
                                c10 = 0;
                                z17 = false;
                                if (iArr[c10] != 2) {
                                }
                                if (!z18) {
                                }
                                c1040c2 = this.f16354P;
                                z19 = !c1040c2.h();
                                z20 = zArr2[0];
                                boolean z28 = zArr2[1];
                                i20 = this.f16390o;
                                iArr2 = this.f16342C;
                                if (i20 != 2) {
                                }
                                c1040c3 = c1040c9;
                                c1040c4 = c1040c2;
                                c1040c5 = c1040c;
                                fVar = k10;
                                fVar2 = k12;
                                fVar3 = k11;
                                fVar4 = k7;
                                fVar5 = k;
                                iArr3 = iArr2;
                                if (z8) {
                                }
                                i24 = i23;
                                if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                }
                                fVar9 = fVar7;
                                fVar10 = fVar8;
                                if (z15) {
                                }
                                if (c1040c4.h()) {
                                }
                                this.k = false;
                                this.f16384l = false;
                            }
                            i14 = i33;
                            i15 = i34;
                            i17 = i31;
                            z15 = true;
                            int[] iArr62 = this.f16397t;
                            iArr62[0] = i14;
                            iArr62[1] = i15;
                            if (z15) {
                            }
                            z16 = false;
                            if (z15) {
                            }
                            c10 = 0;
                            z17 = false;
                            if (iArr[c10] != 2) {
                            }
                            if (!z18) {
                            }
                            c1040c2 = this.f16354P;
                            z19 = !c1040c2.h();
                            z20 = zArr2[0];
                            boolean z282 = zArr2[1];
                            i20 = this.f16390o;
                            iArr2 = this.f16342C;
                            if (i20 != 2) {
                            }
                            c1040c3 = c1040c9;
                            c1040c4 = c1040c2;
                            c1040c5 = c1040c;
                            fVar = k10;
                            fVar2 = k12;
                            fVar3 = k11;
                            fVar4 = k7;
                            fVar5 = k;
                            iArr3 = iArr2;
                            if (z8) {
                            }
                            i24 = i23;
                            if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                            }
                            fVar9 = fVar7;
                            fVar10 = fVar8;
                            if (z15) {
                            }
                            if (c1040c4.h()) {
                            }
                            this.k = false;
                            this.f16384l = false;
                        }
                        if (i30 == 3 && i34 == 3) {
                            this.f16340A = 1;
                            if (i32 == -1) {
                                this.f16341B = 1.0f / f4;
                            }
                            i17 = (int) (this.f16341B * i10);
                            i14 = i33;
                            if (i28 == 3) {
                                i15 = i34;
                                i16 = i29;
                                z15 = true;
                                int[] iArr622 = this.f16397t;
                                iArr622[0] = i14;
                                iArr622[1] = i15;
                                if (z15) {
                                }
                                z16 = false;
                                if (z15) {
                                }
                                c10 = 0;
                                z17 = false;
                                if (iArr[c10] != 2) {
                                }
                                if (!z18) {
                                }
                                c1040c2 = this.f16354P;
                                z19 = !c1040c2.h();
                                z20 = zArr2[0];
                                boolean z2822 = zArr2[1];
                                i20 = this.f16390o;
                                iArr2 = this.f16342C;
                                if (i20 != 2) {
                                }
                                c1040c3 = c1040c9;
                                c1040c4 = c1040c2;
                                c1040c5 = c1040c;
                                fVar = k10;
                                fVar2 = k12;
                                fVar3 = k11;
                                fVar4 = k7;
                                fVar5 = k;
                                iArr3 = iArr2;
                                if (z8) {
                                }
                                i24 = i23;
                                if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                }
                                fVar9 = fVar7;
                                fVar10 = fVar8;
                                if (z15) {
                                }
                                if (c1040c4.h()) {
                                }
                                this.k = false;
                                this.f16384l = false;
                            }
                            i16 = i29;
                            z15 = false;
                            i15 = 4;
                            int[] iArr6222 = this.f16397t;
                            iArr6222[0] = i14;
                            iArr6222[1] = i15;
                            if (z15) {
                                int i36 = this.f16340A;
                                i18 = -1;
                                if (i36 == 0 || i36 == -1) {
                                    z16 = true;
                                    if (z15 || !((i25 = this.f16340A) == 1 || i25 == i18)) {
                                        c10 = 0;
                                        z17 = false;
                                    } else {
                                        c10 = 0;
                                        z17 = true;
                                    }
                                    z18 = iArr[c10] != 2 && (this instanceof e);
                                    i19 = !z18 ? 0 : i16;
                                    c1040c2 = this.f16354P;
                                    z19 = !c1040c2.h();
                                    z20 = zArr2[0];
                                    boolean z28222 = zArr2[1];
                                    i20 = this.f16390o;
                                    iArr2 = this.f16342C;
                                    if (i20 != 2 && !this.k) {
                                        if (z8 && (kVar = this.f16371d) != null) {
                                            fVar11 = kVar.f16705h;
                                            if (fVar11.j && kVar.f16706i.j) {
                                                if (!z8) {
                                                    cVar.d(k, fVar11.g);
                                                    cVar.d(k7, this.f16371d.f16706i.g);
                                                    if (this.f16358T != null && z11 && zArr3[0] && !x()) {
                                                        cVar.f(cVar.k(this.f16358T.f16350K), k7, 0, 8);
                                                    }
                                                    fVar4 = k7;
                                                    fVar5 = k;
                                                    c1040c3 = c1040c9;
                                                    c1040c4 = c1040c2;
                                                    c1040c5 = c1040c;
                                                    fVar = k10;
                                                    fVar2 = k12;
                                                    fVar3 = k11;
                                                    iArr3 = iArr2;
                                                    if (z8) {
                                                        dVar3 = this;
                                                        m mVar2 = dVar3.f16373e;
                                                        if (mVar2 != null) {
                                                            e1.f fVar13 = mVar2.f16705h;
                                                            if (fVar13.j && mVar2.f16706i.j) {
                                                                cVar2 = cVar;
                                                                fVar8 = fVar;
                                                                cVar2.d(fVar8, fVar13.g);
                                                                fVar7 = fVar3;
                                                                cVar2.d(fVar7, dVar3.f16373e.f16706i.g);
                                                                fVar6 = fVar2;
                                                                cVar2.d(fVar6, dVar3.f16373e.k.g);
                                                                d dVar5 = dVar3.f16358T;
                                                                if (dVar5 == null || z13 || !z10) {
                                                                    i21 = 8;
                                                                    i22 = 0;
                                                                    i23 = 1;
                                                                } else {
                                                                    i23 = 1;
                                                                    if (zArr3[1]) {
                                                                        i21 = 8;
                                                                        i22 = 0;
                                                                        cVar2.f(cVar2.k(dVar5.L), fVar7, 0, 8);
                                                                    } else {
                                                                        i21 = 8;
                                                                        i22 = 0;
                                                                    }
                                                                }
                                                                i24 = i22;
                                                                if ((dVar3.f16392p != 2 ? i22 : i24) != 0 || dVar3.f16384l) {
                                                                    fVar9 = fVar7;
                                                                    fVar10 = fVar8;
                                                                } else {
                                                                    boolean z29 = (iArr[i23] == 2 && (dVar3 instanceof e)) ? i23 : i22;
                                                                    if (z29) {
                                                                        i17 = i22;
                                                                    }
                                                                    d dVar6 = dVar3.f16358T;
                                                                    b1.f k13 = dVar6 != null ? cVar2.k(dVar6.L) : null;
                                                                    d dVar7 = dVar3.f16358T;
                                                                    b1.f k14 = dVar7 != null ? cVar2.k(dVar7.f16349J) : null;
                                                                    int i37 = dVar3.f16366a0;
                                                                    if (i37 > 0 || dVar3.f16377g0 == i21) {
                                                                        C1040c c1040c11 = c1040c5;
                                                                        if (c1040c11.f16337f != null) {
                                                                            cVar2.e(fVar6, fVar8, i37, i21);
                                                                            cVar2.e(fVar6, cVar2.k(c1040c11.f16337f), c1040c11.e(), i21);
                                                                            if (z10) {
                                                                                cVar2.f(k13, cVar2.k(c1040c3), i22, 5);
                                                                            }
                                                                            z21 = i22;
                                                                            fVar9 = fVar7;
                                                                            fVar10 = fVar8;
                                                                            d(cVar, false, z10, z11, zArr3[i23], k14, k13, iArr[i23], z29, dVar3.f16349J, dVar3.L, dVar3.f16364Z, i17, dVar3.f16370c0, iArr3[i23], dVar3.f16374e0, z17, iArr[i22] != 3 ? i23 : i22, z13, z14, z28222, i15, i14, dVar3.f16401x, dVar3.f16402y, dVar3.f16403z, z21);
                                                                        } else if (dVar3.f16377g0 == i21) {
                                                                            cVar2.e(fVar6, fVar8, c1040c11.e(), i21);
                                                                        } else {
                                                                            cVar2.e(fVar6, fVar8, i37, i21);
                                                                        }
                                                                    }
                                                                    z21 = z19;
                                                                    fVar9 = fVar7;
                                                                    fVar10 = fVar8;
                                                                    d(cVar, false, z10, z11, zArr3[i23], k14, k13, iArr[i23], z29, dVar3.f16349J, dVar3.L, dVar3.f16364Z, i17, dVar3.f16370c0, iArr3[i23], dVar3.f16374e0, z17, iArr[i22] != 3 ? i23 : i22, z13, z14, z28222, i15, i14, dVar3.f16401x, dVar3.f16402y, dVar3.f16403z, z21);
                                                                }
                                                                if (z15) {
                                                                    cVar3 = cVar;
                                                                } else if (this.f16340A == 1) {
                                                                    float f10 = this.f16341B;
                                                                    b1.b l10 = cVar.l();
                                                                    l10.f13781d.g(fVar9, -1.0f);
                                                                    l10.f13781d.g(fVar10, 1.0f);
                                                                    l10.f13781d.g(fVar4, f10);
                                                                    l10.f13781d.g(fVar5, -f10);
                                                                    cVar3 = cVar;
                                                                    cVar3.c(l10);
                                                                } else {
                                                                    cVar3 = cVar;
                                                                    float f11 = this.f16341B;
                                                                    b1.b l11 = cVar.l();
                                                                    l11.f13781d.g(fVar4, -1.0f);
                                                                    l11.f13781d.g(fVar5, 1.0f);
                                                                    l11.f13781d.g(fVar9, f11);
                                                                    l11.f13781d.g(fVar10, -f11);
                                                                    cVar3.c(l11);
                                                                }
                                                                if (c1040c4.h()) {
                                                                    C1040c c1040c12 = c1040c4;
                                                                    d dVar8 = c1040c12.f16337f.f16335d;
                                                                    float radians = (float) Math.toRadians(this.f16343D + 90.0f);
                                                                    int e2 = c1040c12.e();
                                                                    b1.f k15 = cVar3.k(i(2));
                                                                    b1.f k16 = cVar3.k(i(3));
                                                                    b1.f k17 = cVar3.k(i(4));
                                                                    b1.f k18 = cVar3.k(i(5));
                                                                    b1.f k19 = cVar3.k(dVar8.i(2));
                                                                    b1.f k20 = cVar3.k(dVar8.i(3));
                                                                    b1.f k21 = cVar3.k(dVar8.i(4));
                                                                    b1.f k22 = cVar3.k(dVar8.i(5));
                                                                    b1.b l12 = cVar.l();
                                                                    double d10 = radians;
                                                                    double d11 = e2;
                                                                    float sin = (float) (Math.sin(d10) * d11);
                                                                    l12.f13781d.g(k20, 0.5f);
                                                                    l12.f13781d.g(k22, 0.5f);
                                                                    l12.f13781d.g(k16, -0.5f);
                                                                    l12.f13781d.g(k18, -0.5f);
                                                                    l12.f13779b = -sin;
                                                                    cVar3.c(l12);
                                                                    b1.b l13 = cVar.l();
                                                                    float cos = (float) (Math.cos(d10) * d11);
                                                                    l13.f13781d.g(k19, 0.5f);
                                                                    l13.f13781d.g(k21, 0.5f);
                                                                    l13.f13781d.g(k15, -0.5f);
                                                                    l13.f13781d.g(k17, -0.5f);
                                                                    l13.f13779b = -cos;
                                                                    cVar3.c(l13);
                                                                }
                                                                this.k = false;
                                                                this.f16384l = false;
                                                            }
                                                        }
                                                        cVar2 = cVar;
                                                        fVar6 = fVar2;
                                                        fVar7 = fVar3;
                                                        fVar8 = fVar;
                                                        i21 = 8;
                                                        i22 = 0;
                                                        i23 = 1;
                                                    } else {
                                                        i21 = 8;
                                                        i22 = 0;
                                                        i23 = 1;
                                                        dVar3 = this;
                                                        cVar2 = cVar;
                                                        fVar6 = fVar2;
                                                        fVar7 = fVar3;
                                                        fVar8 = fVar;
                                                    }
                                                    i24 = i23;
                                                    if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                                    }
                                                    fVar9 = fVar7;
                                                    fVar10 = fVar8;
                                                    if (z15) {
                                                    }
                                                    if (c1040c4.h()) {
                                                    }
                                                    this.k = false;
                                                    this.f16384l = false;
                                                }
                                            }
                                        }
                                        d dVar9 = this.f16358T;
                                        b1.f k23 = dVar9 == null ? cVar.k(dVar9.f16350K) : null;
                                        d dVar10 = this.f16358T;
                                        fVar2 = k12;
                                        c1040c5 = c1040c;
                                        fVar3 = k11;
                                        iArr3 = iArr2;
                                        c1040c3 = c1040c9;
                                        fVar = k10;
                                        fVar4 = k7;
                                        c1040c4 = c1040c2;
                                        fVar5 = k;
                                        d(cVar, true, z11, z10, zArr3[0], dVar10 == null ? cVar.k(dVar10.f16348I) : null, k23, iArr[0], z18, this.f16348I, this.f16350K, this.f16363Y, i19, this.f16368b0, iArr2[0], this.f16372d0, z16, iArr[1] != 3, z14, z13, z20, i14, i15, this.f16398u, this.f16399v, this.f16400w, z19);
                                        if (z8) {
                                        }
                                        i24 = i23;
                                        if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                        }
                                        fVar9 = fVar7;
                                        fVar10 = fVar8;
                                        if (z15) {
                                        }
                                        if (c1040c4.h()) {
                                        }
                                        this.k = false;
                                        this.f16384l = false;
                                    }
                                    c1040c3 = c1040c9;
                                    c1040c4 = c1040c2;
                                    c1040c5 = c1040c;
                                    fVar = k10;
                                    fVar2 = k12;
                                    fVar3 = k11;
                                    fVar4 = k7;
                                    fVar5 = k;
                                    iArr3 = iArr2;
                                    if (z8) {
                                    }
                                    i24 = i23;
                                    if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                    }
                                    fVar9 = fVar7;
                                    fVar10 = fVar8;
                                    if (z15) {
                                    }
                                    if (c1040c4.h()) {
                                    }
                                    this.k = false;
                                    this.f16384l = false;
                                }
                            } else {
                                i18 = -1;
                            }
                            z16 = false;
                            if (z15) {
                            }
                            c10 = 0;
                            z17 = false;
                            if (iArr[c10] != 2) {
                            }
                            if (!z18) {
                            }
                            c1040c2 = this.f16354P;
                            z19 = !c1040c2.h();
                            z20 = zArr2[0];
                            boolean z282222 = zArr2[1];
                            i20 = this.f16390o;
                            iArr2 = this.f16342C;
                            if (i20 != 2) {
                                if (z8) {
                                    fVar11 = kVar.f16705h;
                                    if (fVar11.j) {
                                        if (!z8) {
                                        }
                                    }
                                }
                                d dVar92 = this.f16358T;
                                if (dVar92 == null) {
                                }
                                d dVar102 = this.f16358T;
                                if (dVar102 == null) {
                                }
                                fVar2 = k12;
                                c1040c5 = c1040c;
                                fVar3 = k11;
                                iArr3 = iArr2;
                                c1040c3 = c1040c9;
                                fVar = k10;
                                fVar4 = k7;
                                c1040c4 = c1040c2;
                                fVar5 = k;
                                d(cVar, true, z11, z10, zArr3[0], dVar102 == null ? cVar.k(dVar102.f16348I) : null, k23, iArr[0], z18, this.f16348I, this.f16350K, this.f16363Y, i19, this.f16368b0, iArr2[0], this.f16372d0, z16, iArr[1] != 3, z14, z13, z20, i14, i15, this.f16398u, this.f16399v, this.f16400w, z19);
                                if (z8) {
                                }
                                i24 = i23;
                                if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                                }
                                fVar9 = fVar7;
                                fVar10 = fVar8;
                                if (z15) {
                                }
                                if (c1040c4.h()) {
                                }
                                this.k = false;
                                this.f16384l = false;
                            }
                            c1040c3 = c1040c9;
                            c1040c4 = c1040c2;
                            c1040c5 = c1040c;
                            fVar = k10;
                            fVar2 = k12;
                            fVar3 = k11;
                            fVar4 = k7;
                            fVar5 = k;
                            iArr3 = iArr2;
                            if (z8) {
                            }
                            i24 = i23;
                            if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                            }
                            fVar9 = fVar7;
                            fVar10 = fVar8;
                            if (z15) {
                            }
                            if (c1040c4.h()) {
                            }
                            this.k = false;
                            this.f16384l = false;
                        }
                    }
                    i14 = i33;
                    i15 = i34;
                    i16 = i29;
                    i17 = i31;
                    z15 = true;
                    int[] iArr62222 = this.f16397t;
                    iArr62222[0] = i14;
                    iArr62222[1] = i15;
                    if (z15) {
                    }
                    z16 = false;
                    if (z15) {
                    }
                    c10 = 0;
                    z17 = false;
                    if (iArr[c10] != 2) {
                    }
                    if (!z18) {
                    }
                    c1040c2 = this.f16354P;
                    z19 = !c1040c2.h();
                    z20 = zArr2[0];
                    boolean z2822222 = zArr2[1];
                    i20 = this.f16390o;
                    iArr2 = this.f16342C;
                    if (i20 != 2) {
                    }
                    c1040c3 = c1040c9;
                    c1040c4 = c1040c2;
                    c1040c5 = c1040c;
                    fVar = k10;
                    fVar2 = k12;
                    fVar3 = k11;
                    fVar4 = k7;
                    fVar5 = k;
                    iArr3 = iArr2;
                    if (z8) {
                    }
                    i24 = i23;
                    if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
                    }
                    fVar9 = fVar7;
                    fVar10 = fVar8;
                    if (z15) {
                    }
                    if (c1040c4.h()) {
                    }
                    this.k = false;
                    this.f16384l = false;
                }
            } else {
                iArr = iArr5;
            }
            i14 = i33;
            i15 = i34;
            i16 = i29;
            i17 = i31;
            z15 = false;
            int[] iArr622222 = this.f16397t;
            iArr622222[0] = i14;
            iArr622222[1] = i15;
            if (z15) {
            }
            z16 = false;
            if (z15) {
            }
            c10 = 0;
            z17 = false;
            if (iArr[c10] != 2) {
            }
            if (!z18) {
            }
            c1040c2 = this.f16354P;
            z19 = !c1040c2.h();
            z20 = zArr2[0];
            boolean z28222222 = zArr2[1];
            i20 = this.f16390o;
            iArr2 = this.f16342C;
            if (i20 != 2) {
            }
            c1040c3 = c1040c9;
            c1040c4 = c1040c2;
            c1040c5 = c1040c;
            fVar = k10;
            fVar2 = k12;
            fVar3 = k11;
            fVar4 = k7;
            fVar5 = k;
            iArr3 = iArr2;
            if (z8) {
            }
            i24 = i23;
            if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
            }
            fVar9 = fVar7;
            fVar10 = fVar8;
            if (z15) {
            }
            if (c1040c4.h()) {
            }
            this.k = false;
            this.f16384l = false;
        }
        z10 = false;
        z11 = false;
        i7 = this.f16377g0;
        zArr = this.f16357S;
        if (i7 == 8) {
        }
        z12 = this.k;
        if (!z12) {
        }
        if (z12) {
        }
        if (this.f16384l) {
        }
        if (this.k) {
            this.k = false;
            this.f16384l = false;
            return;
        }
        boolean[] zArr32 = this.f16375f;
        if (z8) {
        }
        c1040c = c1040c10;
        zArr2 = zArr;
        if (this.f16358T == null) {
        }
        i10 = this.f16359U;
        i11 = this.f16368b0;
        if (i10 >= i11) {
        }
        i12 = this.f16360V;
        i13 = this.f16370c0;
        if (i12 >= i13) {
        }
        int[] iArr52 = this.f16393p0;
        int i282 = iArr52[0];
        int i292 = i11;
        if (i282 == 3) {
        }
        int i302 = iArr52[1];
        int i312 = i13;
        if (i302 == 3) {
        }
        int i322 = this.f16362X;
        this.f16340A = i322;
        f4 = this.f16361W;
        this.f16341B = f4;
        int i332 = this.f16395r;
        int i342 = this.f16396s;
        if (f4 <= 0.0f) {
        }
        i14 = i332;
        i15 = i342;
        i16 = i292;
        i17 = i312;
        z15 = false;
        int[] iArr6222222 = this.f16397t;
        iArr6222222[0] = i14;
        iArr6222222[1] = i15;
        if (z15) {
        }
        z16 = false;
        if (z15) {
        }
        c10 = 0;
        z17 = false;
        if (iArr[c10] != 2) {
        }
        if (!z18) {
        }
        c1040c2 = this.f16354P;
        z19 = !c1040c2.h();
        z20 = zArr2[0];
        boolean z282222222 = zArr2[1];
        i20 = this.f16390o;
        iArr2 = this.f16342C;
        if (i20 != 2) {
        }
        c1040c3 = c1040c9;
        c1040c4 = c1040c2;
        c1040c5 = c1040c;
        fVar = k10;
        fVar2 = k12;
        fVar3 = k11;
        fVar4 = k7;
        fVar5 = k;
        iArr3 = iArr2;
        if (z8) {
        }
        i24 = i23;
        if ((dVar3.f16392p != 2 ? i22 : i24) != 0) {
        }
        fVar9 = fVar7;
        fVar10 = fVar8;
        if (z15) {
        }
        if (c1040c4.h()) {
        }
        this.k = false;
        this.f16384l = false;
    }

    public boolean c() {
        return this.f16377g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(b1.c cVar, boolean z8, boolean z10, boolean z11, boolean z12, b1.f fVar, b1.f fVar2, int i7, boolean z13, C1040c c1040c, C1040c c1040c2, int i10, int i11, int i12, int i13, float f4, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, int i15, int i16, int i17, float f10, boolean z19) {
        boolean z20;
        boolean z21;
        int i18;
        boolean z22;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        b1.f k;
        b1.f k7;
        b1.f fVar3;
        b1.f fVar4;
        b1.f fVar5;
        b1.f fVar6;
        boolean z25;
        int i22;
        char c10;
        int i23;
        C1040c c1040c3;
        b1.f fVar7;
        int i24;
        boolean z26;
        b1.f fVar8;
        boolean z27;
        boolean z28;
        int i25;
        int i26;
        b1.f fVar9;
        int i27;
        boolean z29;
        int i28;
        boolean z30;
        C1040c c1040c4;
        b1.f fVar10;
        b1.f fVar11;
        boolean z31;
        int i29;
        d dVar;
        boolean z32;
        int i30;
        d dVar2;
        d dVar3;
        b1.f fVar12;
        b1.f fVar13;
        boolean z33;
        boolean z34;
        b1.f fVar14;
        b1.f fVar15;
        d dVar4;
        int i31;
        int i32;
        HashSet hashSet;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z35;
        boolean z36;
        boolean z37;
        int i37;
        int i38;
        b1.f fVar16;
        int i39;
        int i40 = i16;
        int i41 = i17;
        b1.f k10 = cVar.k(c1040c);
        b1.f k11 = cVar.k(c1040c2);
        b1.f k12 = cVar.k(c1040c.f16337f);
        b1.f k13 = cVar.k(c1040c2.f16337f);
        boolean h10 = c1040c.h();
        boolean h11 = c1040c2.h();
        boolean h12 = this.f16354P.h();
        int i42 = h11 ? (h10 ? 1 : 0) + 1 : h10 ? 1 : 0;
        if (h12) {
            i42++;
        }
        int i43 = i42;
        int i44 = z14 ? 3 : i14;
        int b2 = P.c.b(i7);
        boolean z38 = (b2 == 0 || b2 == 1 || b2 != 2 || i44 == 4) ? false : true;
        int i45 = this.f16378h;
        if (i45 == -1 || !z8) {
            i45 = i11;
            z20 = z38;
        } else {
            this.f16378h = -1;
            z20 = false;
        }
        int i46 = this.f16380i;
        if (i46 == -1 || z8) {
            z21 = z20;
        } else {
            this.f16380i = -1;
            i45 = i46;
            z21 = false;
        }
        int i47 = i45;
        if (this.f16377g0 == 8) {
            i18 = 0;
            z21 = false;
        } else {
            i18 = i47;
        }
        if (z19) {
            if (!h10 && !h11 && !h12) {
                cVar.d(k10, i10);
            } else if (h10 && !h11) {
                z22 = h12;
                i19 = 8;
                cVar.e(k10, k12, c1040c.e(), 8);
            }
            z22 = h12;
            i19 = 8;
        } else {
            z22 = h12;
            i19 = 8;
        }
        if (z21) {
            if (i43 == 2 || z14 || !(i44 == 1 || i44 == 0)) {
                if (i40 == -2) {
                    i40 = i18;
                }
                if (i41 == -2) {
                    i41 = i18;
                }
                if (i18 > 0 && i44 != 1) {
                    i18 = 0;
                }
                if (i40 > 0) {
                    cVar.f(k11, k10, i40, 8);
                    i18 = Math.max(i18, i40);
                }
                if (i41 > 0) {
                    if (!z10 || i44 != 1) {
                        cVar.g(k11, k10, i41, 8);
                    }
                    i18 = Math.min(i18, i41);
                }
                if (i44 == 1) {
                    if (z10) {
                        cVar.e(k11, k10, i18, 8);
                    } else if (z16) {
                        cVar.e(k11, k10, i18, 5);
                        cVar.g(k11, k10, i18, 8);
                    } else {
                        cVar.e(k11, k10, i18, 5);
                        cVar.g(k11, k10, i18, 8);
                    }
                } else if (i44 == 2) {
                    int i48 = c1040c.f16336e;
                    if (i48 == 3 || i48 == 5) {
                        k = cVar.k(this.f16358T.i(3));
                        k7 = cVar.k(this.f16358T.i(5));
                    } else {
                        k = cVar.k(this.f16358T.i(2));
                        k7 = cVar.k(this.f16358T.i(4));
                    }
                    b1.b l10 = cVar.l();
                    i20 = i43;
                    l10.f13781d.g(k11, -1.0f);
                    l10.f13781d.g(k10, 1.0f);
                    l10.f13781d.g(k7, f10);
                    l10.f13781d.g(k, -f10);
                    cVar.c(l10);
                    z24 = z12;
                    i21 = i40;
                    z23 = z10 ? false : z21;
                } else {
                    i20 = i43;
                    i21 = i40;
                    z23 = z21;
                    z24 = true;
                }
            } else {
                int max = Math.max(i40, i18);
                if (i41 > 0) {
                    max = Math.min(i41, max);
                }
                cVar.e(k11, k10, max, 8);
                z24 = z12;
                i20 = i43;
                z23 = false;
                i21 = i40;
            }
            if (z19) {
                fVar3 = fVar;
                fVar4 = fVar2;
                fVar5 = k11;
                fVar6 = k10;
                z25 = z24;
                i22 = i20;
                c10 = 1;
                i23 = 2;
            } else if (z16) {
                fVar3 = fVar;
                fVar4 = fVar2;
                fVar5 = k11;
                fVar6 = k10;
                z25 = z24;
                i22 = i20;
                i23 = 2;
                c10 = 1;
            } else {
                if (!h10 && !h11 && !z22) {
                    c1040c4 = c1040c2;
                    fVar15 = k11;
                    z31 = z24;
                    fVar14 = k13;
                } else if (!h10 || h11) {
                    if (h10 || !h11) {
                        fVar7 = k13;
                        if (h10 && h11) {
                            d dVar5 = c1040c.f16337f.f16335d;
                            d dVar6 = c1040c2.f16337f.f16335d;
                            d dVar7 = this.f16358T;
                            int i49 = 6;
                            if (z23) {
                                if (i44 != 0) {
                                    if (i44 == 2) {
                                        if ((dVar5 instanceof C1038a) || (dVar6 instanceof C1038a)) {
                                            i24 = i44;
                                            i25 = 6;
                                            i26 = 5;
                                            z26 = true;
                                            z27 = true;
                                            z28 = true;
                                            z29 = false;
                                            i28 = 4;
                                        } else {
                                            i24 = i44;
                                            i25 = 6;
                                            i26 = 5;
                                            z26 = true;
                                            z27 = true;
                                            z28 = true;
                                            z29 = false;
                                            i28 = 5;
                                        }
                                    } else if (i44 == 1) {
                                        i24 = i44;
                                        i25 = 6;
                                        i26 = 8;
                                        z26 = true;
                                        z27 = true;
                                        z28 = true;
                                        z29 = false;
                                        i28 = 4;
                                    } else if (i44 == 3) {
                                        i24 = i44;
                                        if (this.f16340A == -1) {
                                            if (z17) {
                                                fVar8 = fVar2;
                                                i26 = 8;
                                                z26 = true;
                                                z27 = true;
                                                z28 = true;
                                                z29 = true;
                                                i25 = z10 ? 5 : 4;
                                            } else {
                                                fVar8 = fVar2;
                                                i26 = 8;
                                                z26 = true;
                                                z27 = true;
                                                z28 = true;
                                                z29 = true;
                                                i25 = 8;
                                            }
                                        } else if (z14) {
                                            if (i15 != 2) {
                                                z26 = true;
                                                if (i15 != 1) {
                                                    i26 = 8;
                                                    i35 = 5;
                                                    i28 = i35;
                                                    z27 = z26;
                                                    z28 = z27;
                                                    z29 = z28;
                                                    i25 = 6;
                                                }
                                            } else {
                                                z26 = true;
                                            }
                                            i26 = 5;
                                            i35 = 4;
                                            i28 = i35;
                                            z27 = z26;
                                            z28 = z27;
                                            z29 = z28;
                                            i25 = 6;
                                        } else {
                                            z26 = true;
                                            if (i41 > 0) {
                                                fVar8 = fVar2;
                                                z27 = true;
                                                z28 = true;
                                                z29 = true;
                                                i25 = 6;
                                                i26 = 5;
                                            } else {
                                                if (i41 != 0 || i21 != 0) {
                                                    fVar8 = fVar2;
                                                    z27 = true;
                                                    z28 = true;
                                                    z29 = true;
                                                    i25 = 6;
                                                    i26 = 5;
                                                } else if (z17) {
                                                    i26 = (dVar5 == dVar7 || dVar6 == dVar7) ? 5 : 4;
                                                    fVar8 = fVar2;
                                                    z27 = true;
                                                    z28 = true;
                                                    z29 = true;
                                                    i25 = 6;
                                                } else {
                                                    fVar8 = fVar2;
                                                    z27 = true;
                                                    z28 = true;
                                                    z29 = true;
                                                    i25 = 6;
                                                    i26 = 5;
                                                    i28 = 8;
                                                    if (z28 || k12 != fVar7 || dVar5 == dVar7) {
                                                        z30 = z26;
                                                    } else {
                                                        z28 = false;
                                                        z30 = false;
                                                    }
                                                    if (z27) {
                                                        if (z23 || z15 || z17 || k12 != fVar || fVar7 != fVar8) {
                                                            z33 = z10;
                                                            i33 = i25;
                                                            i34 = i26;
                                                        } else {
                                                            z33 = false;
                                                            i34 = 8;
                                                            z30 = false;
                                                            i33 = 8;
                                                        }
                                                        dVar2 = dVar6;
                                                        c1040c4 = c1040c2;
                                                        z31 = z24;
                                                        dVar3 = dVar5;
                                                        i29 = i21;
                                                        fVar10 = fVar7;
                                                        i30 = 4;
                                                        z32 = true;
                                                        fVar12 = k12;
                                                        dVar = dVar7;
                                                        fVar11 = k11;
                                                        fVar13 = k10;
                                                        cVar.b(k10, k12, c1040c.e(), f4, fVar7, k11, c1040c2.e(), i33);
                                                        i26 = i34;
                                                    } else {
                                                        c1040c4 = c1040c2;
                                                        fVar10 = fVar7;
                                                        fVar11 = k11;
                                                        z31 = z24;
                                                        i29 = i21;
                                                        dVar = dVar7;
                                                        z32 = z26;
                                                        i30 = 4;
                                                        dVar2 = dVar6;
                                                        dVar3 = dVar5;
                                                        fVar12 = k12;
                                                        fVar13 = k10;
                                                        z33 = z10;
                                                    }
                                                    z34 = z30;
                                                    if (this.f16377g0 != 8 && ((hashSet = c1040c4.f16332a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    fVar14 = fVar10;
                                                    if (z28) {
                                                        if (z33 && fVar12 != fVar14 && !z23 && ((dVar3 instanceof C1038a) || (dVar2 instanceof C1038a))) {
                                                            i26 = 6;
                                                        }
                                                        cVar.f(fVar13, fVar12, c1040c.e(), i26);
                                                        fVar15 = fVar11;
                                                        cVar.g(fVar15, fVar14, -c1040c2.e(), i26);
                                                    } else {
                                                        fVar15 = fVar11;
                                                    }
                                                    if (z33 || !z18 || (dVar3 instanceof C1038a) || (dVar2 instanceof C1038a)) {
                                                        dVar4 = dVar;
                                                    } else {
                                                        dVar4 = dVar;
                                                        if (dVar2 != dVar4) {
                                                            i26 = 6;
                                                            i31 = 6;
                                                            z34 = z32;
                                                            if (z34) {
                                                                if (z29 && (!z17 || z11)) {
                                                                    if (dVar3 != dVar4 && dVar2 != dVar4) {
                                                                        i49 = i31;
                                                                    }
                                                                    if ((dVar3 instanceof h) || (dVar2 instanceof h)) {
                                                                        i49 = 5;
                                                                    }
                                                                    if ((dVar3 instanceof C1038a) || (dVar2 instanceof C1038a)) {
                                                                        i49 = 5;
                                                                    }
                                                                    i31 = Math.max(z17 ? 5 : i49, i31);
                                                                }
                                                                int i50 = i31;
                                                                if (z33) {
                                                                    i50 = Math.min(i26, i50);
                                                                    if (z14 && !z17 && (dVar3 == dVar4 || dVar2 == dVar4)) {
                                                                        i50 = i30;
                                                                    }
                                                                }
                                                                cVar.e(fVar13, fVar12, c1040c.e(), i50);
                                                                cVar.e(fVar15, fVar14, -c1040c2.e(), i50);
                                                            }
                                                            if (z33) {
                                                                b1.f fVar17 = fVar12;
                                                                int e2 = fVar == fVar17 ? c1040c.e() : 0;
                                                                if (fVar17 != fVar) {
                                                                    cVar.f(fVar13, fVar, e2, 5);
                                                                }
                                                            }
                                                            if (z33 && z23 && i12 == 0 && i29 == 0) {
                                                                if (z23 || i24 != 3) {
                                                                    i32 = 5;
                                                                    cVar.f(fVar15, fVar13, 0, 5);
                                                                } else {
                                                                    cVar.f(fVar15, fVar13, 0, 8);
                                                                }
                                                            }
                                                            i32 = 5;
                                                        }
                                                    }
                                                    i31 = i28;
                                                    if (z34) {
                                                    }
                                                    if (z33) {
                                                    }
                                                    if (z33) {
                                                        if (z23) {
                                                        }
                                                        i32 = 5;
                                                        cVar.f(fVar15, fVar13, 0, 5);
                                                    }
                                                    i32 = 5;
                                                }
                                                i28 = 4;
                                                if (z28) {
                                                }
                                                z30 = z26;
                                                if (z27) {
                                                }
                                                z34 = z30;
                                                if (this.f16377g0 != 8) {
                                                }
                                                fVar14 = fVar10;
                                                if (z28) {
                                                }
                                                if (z33) {
                                                }
                                                dVar4 = dVar;
                                                i31 = i28;
                                                if (z34) {
                                                }
                                                if (z33) {
                                                }
                                                if (z33) {
                                                }
                                                i32 = 5;
                                            }
                                        }
                                        i28 = 5;
                                        if (z28) {
                                        }
                                        z30 = z26;
                                        if (z27) {
                                        }
                                        z34 = z30;
                                        if (this.f16377g0 != 8) {
                                        }
                                        fVar14 = fVar10;
                                        if (z28) {
                                        }
                                        if (z33) {
                                        }
                                        dVar4 = dVar;
                                        i31 = i28;
                                        if (z34) {
                                        }
                                        if (z33) {
                                        }
                                        if (z33) {
                                        }
                                        i32 = 5;
                                    } else {
                                        i24 = i44;
                                        z26 = true;
                                        fVar8 = fVar2;
                                        i25 = 6;
                                        i26 = 5;
                                        z27 = false;
                                        z28 = false;
                                    }
                                    i38 = i32;
                                    if (z33 || !z31) {
                                        return;
                                    }
                                    if (c1040c4.f16337f != null) {
                                        i39 = c1040c2.e();
                                        fVar16 = fVar2;
                                    } else {
                                        fVar16 = fVar2;
                                        i39 = 0;
                                    }
                                    if (fVar14 != fVar16) {
                                        cVar.f(fVar16, fVar15, i39, i38);
                                        return;
                                    }
                                    return;
                                }
                                if (i41 != 0 || i21 != 0) {
                                    i36 = 5;
                                    z35 = true;
                                    z36 = false;
                                    z37 = true;
                                    i37 = 5;
                                } else if (k12.f13807f && fVar7.f13807f) {
                                    cVar.e(k10, k12, c1040c.e(), 8);
                                    cVar.e(k11, fVar7, -c1040c2.e(), 8);
                                    return;
                                } else {
                                    i36 = 8;
                                    z35 = false;
                                    z36 = true;
                                    z37 = false;
                                    i37 = 8;
                                }
                                if ((dVar5 instanceof C1038a) || (dVar6 instanceof C1038a)) {
                                    i26 = i36;
                                    i25 = 6;
                                    z28 = z37;
                                    z26 = true;
                                    i28 = 4;
                                } else {
                                    i26 = i36;
                                    z28 = z37;
                                    i28 = i37;
                                    z26 = true;
                                    i25 = 6;
                                }
                                z29 = z36;
                                z27 = z35;
                                i24 = i44;
                                fVar8 = fVar2;
                                if (z28) {
                                }
                                z30 = z26;
                                if (z27) {
                                }
                                z34 = z30;
                                if (this.f16377g0 != 8) {
                                }
                                fVar14 = fVar10;
                                if (z28) {
                                }
                                if (z33) {
                                }
                                dVar4 = dVar;
                                i31 = i28;
                                if (z34) {
                                }
                                if (z33) {
                                }
                                if (z33) {
                                }
                                i32 = 5;
                                i38 = i32;
                                if (z33) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            i24 = i44;
                            z26 = true;
                            if (k12.f13807f && fVar7.f13807f) {
                                cVar.b(k10, k12, c1040c.e(), f4, fVar7, k11, c1040c2.e(), 8);
                                if (z10 && z24) {
                                    if (c1040c2.f16337f != null) {
                                        i27 = c1040c2.e();
                                        fVar9 = fVar2;
                                    } else {
                                        fVar9 = fVar2;
                                        i27 = 0;
                                    }
                                    if (fVar7 != fVar9) {
                                        cVar.f(fVar9, k11, i27, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            fVar8 = fVar2;
                            z27 = true;
                            z28 = true;
                            i25 = 6;
                            i26 = 5;
                            z29 = false;
                            i28 = 4;
                            if (z28) {
                            }
                            z30 = z26;
                            if (z27) {
                            }
                            z34 = z30;
                            if (this.f16377g0 != 8) {
                            }
                            fVar14 = fVar10;
                            if (z28) {
                            }
                            if (z33) {
                            }
                            dVar4 = dVar;
                            i31 = i28;
                            if (z34) {
                            }
                            if (z33) {
                            }
                            if (z33) {
                            }
                            i32 = 5;
                            i38 = i32;
                            if (z33) {
                            }
                        }
                    } else {
                        fVar7 = k13;
                        cVar.e(k11, fVar7, -c1040c2.e(), 8);
                        if (z10) {
                            cVar.f(k10, fVar, 0, 5);
                            c1040c4 = c1040c2;
                            i32 = 5;
                            fVar14 = fVar7;
                            fVar15 = k11;
                            z31 = z24;
                            z33 = z10;
                            i38 = i32;
                            if (z33) {
                            }
                        }
                    }
                    c1040c4 = c1040c2;
                    fVar14 = fVar7;
                    fVar15 = k11;
                    z31 = z24;
                } else {
                    c1040c4 = c1040c2;
                    fVar15 = k11;
                    z31 = z24;
                    i38 = (z10 && (c1040c.f16337f.f16335d instanceof C1038a)) ? 8 : 5;
                    fVar14 = k13;
                    z33 = z10;
                    if (z33) {
                    }
                }
                i32 = 5;
                z33 = z10;
                i38 = i32;
                if (z33) {
                }
            }
            if (i22 >= i23 && z10 && z25) {
                cVar.f(fVar6, fVar3, 0, 8);
                C1040c c1040c5 = this.f16351M;
                char c11 = (z8 || c1040c5.f16337f == null) ? c10 : (char) 0;
                if (!z8 && (c1040c3 = c1040c5.f16337f) != null) {
                    d dVar8 = c1040c3.f16335d;
                    if (dVar8.f16361W != 0.0f) {
                        int[] iArr = dVar8.f16393p0;
                        if (iArr[0] == 3 && iArr[c10] == 3) {
                            c11 = c10;
                        }
                    }
                    c11 = 0;
                }
                if (c11 != 0) {
                    cVar.f(fVar4, fVar5, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z13) {
            cVar.e(k11, k10, 0, 3);
            if (i12 > 0) {
                cVar.f(k11, k10, i12, 8);
            }
            if (i13 < Integer.MAX_VALUE) {
                cVar.g(k11, k10, i13, 8);
            }
        } else {
            cVar.e(k11, k10, i18, i19);
        }
        z24 = z12;
        i20 = i43;
        i21 = i40;
        z23 = z21;
        if (z19) {
        }
        if (i22 >= i23) {
        }
    }

    public final void e(int i7, d dVar, int i10, int i11) {
        boolean z8;
        if (i7 == 7) {
            if (i10 != 7) {
                if (i10 == 2 || i10 == 4) {
                    e(2, dVar, i10, 0);
                    e(4, dVar, i10, 0);
                    i(7).a(dVar.i(i10), 0);
                    return;
                } else {
                    if (i10 == 3 || i10 == 5) {
                        e(3, dVar, i10, 0);
                        e(5, dVar, i10, 0);
                        i(7).a(dVar.i(i10), 0);
                        return;
                    }
                    return;
                }
            }
            C1040c i12 = i(2);
            C1040c i13 = i(4);
            C1040c i14 = i(3);
            C1040c i15 = i(5);
            boolean z10 = true;
            if ((i12 == null || !i12.h()) && (i13 == null || !i13.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i14 == null || !i14.h()) && (i15 == null || !i15.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z10 = false;
            }
            if (z8 && z10) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z8) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z10) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i7 == 8 && (i10 == 2 || i10 == 4)) {
            C1040c i16 = i(2);
            C1040c i17 = dVar.i(i10);
            C1040c i18 = i(4);
            i16.a(i17, 0);
            i18.a(i17, 0);
            i(8).a(i17, 0);
            return;
        }
        if (i7 == 9 && (i10 == 3 || i10 == 5)) {
            C1040c i19 = dVar.i(i10);
            i(3).a(i19, 0);
            i(5).a(i19, 0);
            i(9).a(i19, 0);
            return;
        }
        if (i7 == 8 && i10 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i10), 0);
            return;
        }
        if (i7 == 9 && i10 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i10), 0);
            return;
        }
        C1040c i20 = i(i7);
        C1040c i21 = dVar.i(i10);
        if (i20.i(i21)) {
            if (i7 == 6) {
                C1040c i22 = i(3);
                C1040c i23 = i(5);
                if (i22 != null) {
                    i22.j();
                }
                if (i23 != null) {
                    i23.j();
                }
            } else if (i7 == 3 || i7 == 5) {
                C1040c i24 = i(6);
                if (i24 != null) {
                    i24.j();
                }
                C1040c i25 = i(7);
                if (i25.f16337f != i21) {
                    i25.j();
                }
                C1040c f4 = i(i7).f();
                C1040c i26 = i(9);
                if (i26.h()) {
                    f4.j();
                    i26.j();
                }
            } else if (i7 == 2 || i7 == 4) {
                C1040c i27 = i(7);
                if (i27.f16337f != i21) {
                    i27.j();
                }
                C1040c f10 = i(i7).f();
                C1040c i28 = i(8);
                if (i28.h()) {
                    f10.j();
                    i28.j();
                }
            }
            i20.a(i21, i11);
        }
    }

    public final void f(C1040c c1040c, C1040c c1040c2, int i7) {
        if (c1040c.f16335d == this) {
            e(c1040c.f16336e, c1040c2.f16335d, c1040c2.f16336e, i7);
        }
    }

    public final void g(b1.c cVar) {
        cVar.k(this.f16348I);
        cVar.k(this.f16349J);
        cVar.k(this.f16350K);
        cVar.k(this.L);
        if (this.f16366a0 > 0) {
            cVar.k(this.f16351M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e1.o, e1.m] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e1.o, e1.k] */
    public final void h() {
        if (this.f16371d == null) {
            ?? oVar = new e1.o(this);
            oVar.f16705h.f16683e = 4;
            oVar.f16706i.f16683e = 5;
            oVar.f16704f = 0;
            this.f16371d = oVar;
        }
        if (this.f16373e == null) {
            ?? oVar2 = new e1.o(this);
            e1.f fVar = new e1.f(oVar2);
            oVar2.k = fVar;
            oVar2.f16692l = null;
            oVar2.f16705h.f16683e = 6;
            oVar2.f16706i.f16683e = 7;
            fVar.f16683e = 8;
            oVar2.f16704f = 1;
            this.f16373e = oVar2;
        }
    }

    public C1040c i(int i7) {
        switch (P.c.b(i7)) {
            case 0:
                return null;
            case 1:
                return this.f16348I;
            case 2:
                return this.f16349J;
            case 3:
                return this.f16350K;
            case 4:
                return this.L;
            case 5:
                return this.f16351M;
            case 6:
                return this.f16354P;
            case 7:
                return this.f16352N;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return this.f16353O;
            default:
                throw new AssertionError(X.c.z(i7));
        }
    }

    public final int j(int i7) {
        int[] iArr = this.f16393p0;
        if (i7 == 0) {
            return iArr[0];
        }
        if (i7 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f16377g0 == 8) {
            return 0;
        }
        return this.f16360V;
    }

    public final d l(int i7) {
        C1040c c1040c;
        C1040c c1040c2;
        if (i7 != 0) {
            if (i7 == 1 && (c1040c2 = (c1040c = this.L).f16337f) != null && c1040c2.f16337f == c1040c) {
                return c1040c2.f16335d;
            }
            return null;
        }
        C1040c c1040c3 = this.f16350K;
        C1040c c1040c4 = c1040c3.f16337f;
        if (c1040c4 == null || c1040c4.f16337f != c1040c3) {
            return null;
        }
        return c1040c4.f16335d;
    }

    public final d m(int i7) {
        C1040c c1040c;
        C1040c c1040c2;
        if (i7 != 0) {
            if (i7 == 1 && (c1040c2 = (c1040c = this.f16349J).f16337f) != null && c1040c2.f16337f == c1040c) {
                return c1040c2.f16335d;
            }
            return null;
        }
        C1040c c1040c3 = this.f16348I;
        C1040c c1040c4 = c1040c3.f16337f;
        if (c1040c4 == null || c1040c4.f16337f != c1040c3) {
            return null;
        }
        return c1040c4.f16335d;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f16359U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f16360V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f16363Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f16364Z);
        sb2.append("\n");
        p(sb2, "left", this.f16348I);
        p(sb2, "top", this.f16349J);
        p(sb2, "right", this.f16350K);
        p(sb2, "bottom", this.L);
        p(sb2, "baseline", this.f16351M);
        p(sb2, "centerX", this.f16352N);
        p(sb2, "centerY", this.f16353O);
        int i7 = this.f16359U;
        int i10 = this.f16368b0;
        int[] iArr = this.f16342C;
        int i11 = iArr[0];
        int i12 = this.f16398u;
        int i13 = this.f16395r;
        float f4 = this.f16400w;
        int[] iArr2 = this.f16393p0;
        int i14 = iArr2[0];
        float[] fArr = this.f16383k0;
        float f10 = fArr[0];
        o(sb2, "    width", i7, i10, i11, i12, i13, f4, i14);
        int i15 = this.f16360V;
        int i16 = this.f16370c0;
        int i17 = iArr[1];
        int i18 = this.f16401x;
        int i19 = this.f16396s;
        float f11 = this.f16403z;
        int i20 = iArr2[1];
        float f12 = fArr[1];
        o(sb2, "    height", i15, i16, i17, i18, i19, f11, i20);
        float f13 = this.f16361W;
        int i21 = this.f16362X;
        if (f13 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(",");
            sb2.append(i21);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f16372d0, 0.5f);
        H(sb2, "    verticalBias", this.f16374e0, 0.5f);
        G(this.f16381i0, 0, "    horizontalChainStyle", sb2);
        G(this.f16382j0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f16377g0 == 8) {
            return 0;
        }
        return this.f16359U;
    }

    public final int r() {
        d dVar = this.f16358T;
        return (dVar == null || !(dVar instanceof e)) ? this.f16363Y : ((e) dVar).f16422x0 + this.f16363Y;
    }

    public final int s() {
        d dVar = this.f16358T;
        return (dVar == null || !(dVar instanceof e)) ? this.f16364Z : ((e) dVar).f16423y0 + this.f16364Z;
    }

    public final boolean t(int i7) {
        if (i7 == 0) {
            return (this.f16348I.f16337f != null ? 1 : 0) + (this.f16350K.f16337f != null ? 1 : 0) < 2;
        }
        return ((this.f16349J.f16337f != null ? 1 : 0) + (this.L.f16337f != null ? 1 : 0)) + (this.f16351M.f16337f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder m10 = X.c.m("");
        m10.append(this.f16379h0 != null ? o.p(new StringBuilder("id: "), this.f16379h0, " ") : "");
        m10.append("(");
        m10.append(this.f16363Y);
        m10.append(", ");
        m10.append(this.f16364Z);
        m10.append(") - (");
        m10.append(this.f16359U);
        m10.append(" x ");
        return A3.c.k(m10, this.f16360V, ")");
    }

    public final boolean u(int i7, int i10) {
        C1040c c1040c;
        C1040c c1040c2;
        C1040c c1040c3;
        C1040c c1040c4;
        if (i7 == 0) {
            C1040c c1040c5 = this.f16348I;
            C1040c c1040c6 = c1040c5.f16337f;
            if (c1040c6 != null && c1040c6.f16334c && (c1040c4 = (c1040c3 = this.f16350K).f16337f) != null && c1040c4.f16334c) {
                return (c1040c4.d() - c1040c3.e()) - (c1040c5.e() + c1040c5.f16337f.d()) >= i10;
            }
        } else {
            C1040c c1040c7 = this.f16349J;
            C1040c c1040c8 = c1040c7.f16337f;
            if (c1040c8 != null && c1040c8.f16334c && (c1040c2 = (c1040c = this.L).f16337f) != null && c1040c2.f16334c) {
                return (c1040c2.d() - c1040c.e()) - (c1040c7.e() + c1040c7.f16337f.d()) >= i10;
            }
        }
        return false;
    }

    public final void v(int i7, int i10, int i11, int i12, d dVar) {
        i(i7).b(dVar.i(i10), i11, i12, true);
    }

    public final boolean w(int i7) {
        C1040c c1040c;
        C1040c c1040c2;
        int i10 = i7 * 2;
        C1040c[] c1040cArr = this.f16355Q;
        C1040c c1040c3 = c1040cArr[i10];
        C1040c c1040c4 = c1040c3.f16337f;
        return (c1040c4 == null || c1040c4.f16337f == c1040c3 || (c1040c2 = (c1040c = c1040cArr[i10 + 1]).f16337f) == null || c1040c2.f16337f != c1040c) ? false : true;
    }

    public final boolean x() {
        C1040c c1040c = this.f16348I;
        C1040c c1040c2 = c1040c.f16337f;
        if (c1040c2 != null && c1040c2.f16337f == c1040c) {
            return true;
        }
        C1040c c1040c3 = this.f16350K;
        C1040c c1040c4 = c1040c3.f16337f;
        return c1040c4 != null && c1040c4.f16337f == c1040c3;
    }

    public final boolean y() {
        C1040c c1040c = this.f16349J;
        C1040c c1040c2 = c1040c.f16337f;
        if (c1040c2 != null && c1040c2.f16337f == c1040c) {
            return true;
        }
        C1040c c1040c3 = this.L;
        C1040c c1040c4 = c1040c3.f16337f;
        return c1040c4 != null && c1040c4.f16337f == c1040c3;
    }

    public final boolean z() {
        return this.g && this.f16377g0 != 8;
    }
}
