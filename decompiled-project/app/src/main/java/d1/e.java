package d1;

import e1.n;
import e1.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f16404A0;

    /* renamed from: B0, reason: collision with root package name */
    public C1039b[] f16405B0;
    public C1039b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f16406D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f16407E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f16408F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f16409G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f16410H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f16411I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f16412J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f16413K0;

    /* renamed from: L0, reason: collision with root package name */
    public final e1.b f16414L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f16415q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final Q7.h f16416r0 = new Q7.h(this);

    /* renamed from: s0, reason: collision with root package name */
    public final e1.e f16417s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f16418t0;

    /* renamed from: u0, reason: collision with root package name */
    public g1.f f16419u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f16420v0;

    /* renamed from: w0, reason: collision with root package name */
    public final b1.c f16421w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f16422x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f16423y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f16424z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, e1.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, e1.b] */
    public e() {
        ?? obj = new Object();
        obj.f16673b = true;
        obj.f16674c = true;
        obj.f16676e = new ArrayList();
        new ArrayList();
        obj.f16677f = null;
        obj.g = new Object();
        obj.f16678h = new ArrayList();
        obj.f16672a = this;
        obj.f16675d = this;
        this.f16417s0 = obj;
        this.f16419u0 = null;
        this.f16420v0 = false;
        this.f16421w0 = new b1.c();
        this.f16424z0 = 0;
        this.f16404A0 = 0;
        this.f16405B0 = new C1039b[4];
        this.C0 = new C1039b[4];
        this.f16406D0 = 257;
        this.f16407E0 = false;
        this.f16408F0 = false;
        this.f16409G0 = null;
        this.f16410H0 = null;
        this.f16411I0 = null;
        this.f16412J0 = null;
        this.f16413K0 = new HashSet();
        this.f16414L0 = new Object();
    }

    public static void V(d dVar, g1.f fVar, e1.b bVar) {
        int i7;
        int i10;
        if (fVar == null) {
            return;
        }
        if (dVar.f16377g0 == 8 || (dVar instanceof h) || (dVar instanceof C1038a)) {
            bVar.f16667e = 0;
            bVar.f16668f = 0;
            return;
        }
        int[] iArr = dVar.f16393p0;
        bVar.f16663a = iArr[0];
        bVar.f16664b = iArr[1];
        bVar.f16665c = dVar.q();
        bVar.f16666d = dVar.k();
        bVar.f16670i = false;
        bVar.j = 0;
        boolean z8 = bVar.f16663a == 3;
        boolean z10 = bVar.f16664b == 3;
        boolean z11 = z8 && dVar.f16361W > 0.0f;
        boolean z12 = z10 && dVar.f16361W > 0.0f;
        if (z8 && dVar.t(0) && dVar.f16395r == 0 && !z11) {
            bVar.f16663a = 2;
            if (z10 && dVar.f16396s == 0) {
                bVar.f16663a = 1;
            }
            z8 = false;
        }
        if (z10 && dVar.t(1) && dVar.f16396s == 0 && !z12) {
            bVar.f16664b = 2;
            if (z8 && dVar.f16395r == 0) {
                bVar.f16664b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f16663a = 1;
            z8 = false;
        }
        if (dVar.B()) {
            bVar.f16664b = 1;
            z10 = false;
        }
        int[] iArr2 = dVar.f16397t;
        if (z11) {
            if (iArr2[0] == 4) {
                bVar.f16663a = 1;
            } else if (!z10) {
                if (bVar.f16664b == 1) {
                    i10 = bVar.f16666d;
                } else {
                    bVar.f16663a = 2;
                    fVar.b(dVar, bVar);
                    i10 = bVar.f16668f;
                }
                bVar.f16663a = 1;
                bVar.f16665c = (int) (dVar.f16361W * i10);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                bVar.f16664b = 1;
            } else if (!z8) {
                if (bVar.f16663a == 1) {
                    i7 = bVar.f16665c;
                } else {
                    bVar.f16664b = 2;
                    fVar.b(dVar, bVar);
                    i7 = bVar.f16667e;
                }
                bVar.f16664b = 1;
                if (dVar.f16362X == -1) {
                    bVar.f16666d = (int) (i7 / dVar.f16361W);
                } else {
                    bVar.f16666d = (int) (dVar.f16361W * i7);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f16667e);
        dVar.L(bVar.f16668f);
        dVar.f16344E = bVar.f16669h;
        dVar.I(bVar.g);
        bVar.j = 0;
    }

    @Override // d1.d
    public final void C() {
        this.f16421w0.t();
        this.f16422x0 = 0;
        this.f16423y0 = 0;
        this.f16415q0.clear();
        super.C();
    }

    @Override // d1.d
    public final void F(Q7.h hVar) {
        super.F(hVar);
        int size = this.f16415q0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d) this.f16415q0.get(i7)).F(hVar);
        }
    }

    @Override // d1.d
    public final void P(boolean z8, boolean z10) {
        super.P(z8, z10);
        int size = this.f16415q0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d) this.f16415q0.get(i7)).P(z8, z10);
        }
    }

    public final void R(d dVar, int i7) {
        if (i7 == 0) {
            int i10 = this.f16424z0 + 1;
            C1039b[] c1039bArr = this.C0;
            if (i10 >= c1039bArr.length) {
                this.C0 = (C1039b[]) Arrays.copyOf(c1039bArr, c1039bArr.length * 2);
            }
            C1039b[] c1039bArr2 = this.C0;
            int i11 = this.f16424z0;
            c1039bArr2[i11] = new C1039b(dVar, 0, this.f16420v0);
            this.f16424z0 = i11 + 1;
            return;
        }
        if (i7 == 1) {
            int i12 = this.f16404A0 + 1;
            C1039b[] c1039bArr3 = this.f16405B0;
            if (i12 >= c1039bArr3.length) {
                this.f16405B0 = (C1039b[]) Arrays.copyOf(c1039bArr3, c1039bArr3.length * 2);
            }
            C1039b[] c1039bArr4 = this.f16405B0;
            int i13 = this.f16404A0;
            c1039bArr4[i13] = new C1039b(dVar, 1, this.f16420v0);
            this.f16404A0 = i13 + 1;
        }
    }

    public final void S(b1.c cVar) {
        boolean W10 = W(64);
        b(cVar, W10);
        int size = this.f16415q0.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) this.f16415q0.get(i7);
            boolean[] zArr = dVar.f16357S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C1038a) {
                z8 = true;
            }
        }
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f16415q0.get(i10);
                if (dVar2 instanceof C1038a) {
                    C1038a c1038a = (C1038a) dVar2;
                    for (int i11 = 0; i11 < c1038a.f16482r0; i11++) {
                        d dVar3 = c1038a.f16481q0[i11];
                        if (c1038a.f16315t0 || dVar3.c()) {
                            int i12 = c1038a.f16314s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.f16357S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.f16357S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f16413K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f16415q0.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W10);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f16482r0; i14++) {
                    if (hashSet.contains(gVar.f16481q0[i14])) {
                        gVar.b(cVar, W10);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W10);
                }
                hashSet.clear();
            }
        }
        if (b1.c.f13783q) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f16415q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            a(this, cVar, hashSet2, this.f16393p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar, dVar6);
                dVar6.b(cVar, W10);
            }
        } else {
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) this.f16415q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f16393p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar, W10);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar, W10);
                    }
                }
            }
        }
        if (this.f16424z0 > 0) {
            j.a(this, cVar, null, 0);
        }
        if (this.f16404A0 > 0) {
            j.a(this, cVar, null, 1);
        }
    }

    public final boolean T(int i7, boolean z8) {
        boolean z10;
        e1.e eVar = this.f16417s0;
        e eVar2 = eVar.f16672a;
        boolean z11 = false;
        int j = eVar2.j(0);
        int j10 = eVar2.j(1);
        int r10 = eVar2.r();
        int s3 = eVar2.s();
        ArrayList arrayList = eVar.f16676e;
        if (z8 && (j == 2 || j10 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f16704f == i7 && !oVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z8 && j == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f16371d.f16703e.d(eVar2.q());
                }
            } else if (z8 && j10 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f16373e.f16703e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f16393p0;
        if (i7 == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int q10 = eVar2.q() + r10;
                eVar2.f16371d.f16706i.d(q10);
                eVar2.f16371d.f16703e.d(q10 - r10);
                z10 = true;
            }
            z10 = false;
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int k = eVar2.k() + s3;
                eVar2.f16373e.f16706i.d(k);
                eVar2.f16373e.f16703e.d(k - s3);
                z10 = true;
            }
            z10 = false;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f16704f == i7 && (oVar2.f16700b != eVar2 || oVar2.g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z11 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f16704f == i7 && (z10 || oVar3.f16700b != eVar2)) {
                if (!oVar3.f16705h.j) {
                    break;
                }
                if (!oVar3.f16706i.j) {
                    break;
                }
                if (!(oVar3 instanceof e1.c) && !oVar3.f16703e.j) {
                    break;
                }
            }
        }
        eVar2.M(j);
        eVar2.N(j10);
        return z11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:227|228|229|(1:231)|232|233|(2:234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i7;
        Object[] objArr;
        C1040c c1040c;
        int i10;
        int i11;
        C1040c c1040c2;
        int i12;
        int i13;
        b1.c cVar;
        int i14;
        boolean z8;
        char c10;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int max;
        ?? r62;
        boolean z14;
        int max2;
        boolean z15;
        boolean z16;
        int i17;
        int i18;
        int max3;
        int max4;
        WeakReference weakReference;
        b1.f k;
        b1.c cVar2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        b1.c cVar3;
        C1040c c1040c3;
        int i19;
        int i20;
        int i21;
        char c11;
        n nVar;
        n nVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        int b2;
        n nVar3;
        n nVar4;
        int[] iArr;
        this.f16363Y = 0;
        this.f16364Z = 0;
        this.f16407E0 = false;
        this.f16408F0 = false;
        int size = this.f16415q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f16393p0;
        int i26 = iArr2[1];
        int i27 = iArr2[0];
        int i28 = this.f16418t0;
        C1040c c1040c4 = this.f16349J;
        C1040c c1040c5 = this.f16348I;
        if (i28 == 0 && j.c(this.f16406D0, 1)) {
            g1.f fVar = this.f16419u0;
            int i29 = iArr2[0];
            int i30 = iArr2[1];
            E();
            ArrayList arrayList = this.f16415q0;
            int size2 = arrayList.size();
            for (int i31 = 0; i31 < size2; i31++) {
                ((d) arrayList.get(i31)).E();
            }
            boolean z17 = this.f16420v0;
            if (i29 == 1) {
                J(0, q());
            } else {
                c1040c5.l(0);
                this.f16363Y = 0;
            }
            int i32 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i32 < size2) {
                C1040c c1040c6 = c1040c5;
                d dVar = (d) arrayList.get(i32);
                int i33 = max6;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    iArr = iArr2;
                    if (hVar.f16479u0 == 1) {
                        int i34 = hVar.f16476r0;
                        if (i34 != -1) {
                            hVar.R(i34);
                        } else if (hVar.f16477s0 != -1 && A()) {
                            hVar.R(q() - hVar.f16477s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f16475q0 * q()) + 0.5f));
                        }
                        z18 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar instanceof C1038a) && ((C1038a) dVar).U() == 0) {
                        z19 = true;
                    }
                }
                i32++;
                max6 = i33;
                c1040c5 = c1040c6;
                iArr2 = iArr;
            }
            i7 = max6;
            objArr = iArr2;
            c1040c = c1040c5;
            if (z18) {
                for (int i35 = 0; i35 < size2; i35++) {
                    d dVar2 = (d) arrayList.get(i35);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        if (hVar2.f16479u0 == 1) {
                            e1.h.c(0, hVar2, fVar, z17);
                        }
                    }
                }
            }
            e1.h.c(0, this, fVar, z17);
            if (z19) {
                for (int i36 = 0; i36 < size2; i36++) {
                    d dVar3 = (d) arrayList.get(i36);
                    if (dVar3 instanceof C1038a) {
                        C1038a c1038a = (C1038a) dVar3;
                        if (c1038a.U() == 0 && c1038a.T()) {
                            e1.h.c(1, c1038a, fVar, z17);
                        }
                    }
                }
            }
            if (i30 == 1) {
                K(0, k());
            } else {
                c1040c4.l(0);
                this.f16364Z = 0;
            }
            boolean z20 = false;
            boolean z21 = false;
            for (int i37 = 0; i37 < size2; i37++) {
                d dVar4 = (d) arrayList.get(i37);
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f16479u0 == 0) {
                        int i38 = hVar3.f16476r0;
                        if (i38 != -1) {
                            hVar3.R(i38);
                        } else if (hVar3.f16477s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f16477s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f16475q0 * k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((dVar4 instanceof C1038a) && ((C1038a) dVar4).U() == 1) {
                    z21 = true;
                }
            }
            if (z20) {
                for (int i39 = 0; i39 < size2; i39++) {
                    d dVar5 = (d) arrayList.get(i39);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f16479u0 == 0) {
                            e1.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            e1.h.i(0, this, fVar);
            if (z21) {
                for (int i40 = 0; i40 < size2; i40++) {
                    d dVar6 = (d) arrayList.get(i40);
                    if (dVar6 instanceof C1038a) {
                        C1038a c1038a2 = (C1038a) dVar6;
                        if (c1038a2.U() == 1 && c1038a2.T()) {
                            e1.h.i(1, c1038a2, fVar);
                        }
                    }
                }
            }
            for (int i41 = 0; i41 < size2; i41++) {
                d dVar7 = (d) arrayList.get(i41);
                if (dVar7.z() && e1.h.a(dVar7)) {
                    V(dVar7, fVar, e1.h.f16689a);
                    if (!(dVar7 instanceof h)) {
                        e1.h.c(0, dVar7, fVar, z17);
                        e1.h.i(0, dVar7, fVar);
                    } else if (((h) dVar7).f16479u0 == 0) {
                        e1.h.i(0, dVar7, fVar);
                    } else {
                        e1.h.c(0, dVar7, fVar, z17);
                    }
                }
            }
            for (int i42 = 0; i42 < size; i42++) {
                d dVar8 = (d) this.f16415q0.get(i42);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof C1038a) && !(dVar8 instanceof g) && !dVar8.f16345F) {
                    int j = dVar8.j(0);
                    int j10 = dVar8.j(1);
                    if (j != 3 || dVar8.f16395r == 1 || j10 != 3 || dVar8.f16396s == 1) {
                        V(dVar8, this.f16419u0, new Object());
                    }
                }
            }
        } else {
            i7 = max6;
            objArr = iArr2;
            c1040c = c1040c5;
        }
        b1.c cVar4 = this.f16421w0;
        if (size <= 2 || !((i27 == 2 || i26 == 2) && j.c(this.f16406D0, 1024))) {
            i10 = size;
            i11 = i26;
            c1040c2 = c1040c4;
            i12 = i7;
            i13 = max5;
            cVar = cVar4;
            i14 = i27;
        } else {
            g1.f fVar2 = this.f16419u0;
            ArrayList arrayList2 = this.f16415q0;
            int size3 = arrayList2.size();
            int i43 = 0;
            while (i43 < size3) {
                d dVar9 = (d) arrayList2.get(i43);
                char c12 = objArr[0];
                char c13 = objArr[1];
                int[] iArr3 = dVar9.f16393p0;
                c1040c2 = c1040c4;
                if (!e1.h.h(c12, c13, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i19 = max5;
                    i10 = size;
                    i20 = i26;
                    i21 = i27;
                    cVar = cVar4;
                    break;
                }
                i43++;
                c1040c4 = c1040c2;
            }
            c1040c2 = c1040c4;
            int i44 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i44 < size3) {
                int i45 = size;
                d dVar10 = (d) arrayList2.get(i44);
                int i46 = i26;
                char c14 = objArr[0];
                int i47 = max5;
                char c15 = objArr[1];
                int i48 = i27;
                int[] iArr4 = dVar10.f16393p0;
                b1.c cVar5 = cVar4;
                if (!e1.h.h(c14, c15, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.f16414L0);
                }
                boolean z22 = dVar10 instanceof h;
                if (z22) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f16479u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f16479u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (dVar10 instanceof i) {
                    if (dVar10 instanceof C1038a) {
                        C1038a c1038a3 = (C1038a) dVar10;
                        if (c1038a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c1038a3);
                        }
                        if (c1038a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c1038a3);
                        }
                    } else {
                        i iVar = (i) dVar10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iVar);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(iVar);
                    }
                }
                if (dVar10.f16348I.f16337f == null && dVar10.f16350K.f16337f == null && !z22 && !(dVar10 instanceof C1038a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(dVar10);
                }
                if (dVar10.f16349J.f16337f == null && dVar10.L.f16337f == null && dVar10.f16351M.f16337f == null && !z22 && !(dVar10 instanceof C1038a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(dVar10);
                }
                i44++;
                i26 = i46;
                size = i45;
                max5 = i47;
                i27 = i48;
                cVar4 = cVar5;
            }
            i19 = max5;
            b1.c cVar6 = cVar4;
            i10 = size;
            i20 = i26;
            i21 = i27;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    e1.h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i49 = 0;
            n nVar5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    n b10 = e1.h.b(iVar2, i49, arrayList9, nVar5);
                    iVar2.R(i49, b10, arrayList9);
                    b10.a(arrayList9);
                    i49 = 0;
                    nVar5 = null;
                }
            }
            HashSet hashSet = i(2).f16332a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    e1.h.b(((C1040c) it3.next()).f16335d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f16332a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    e1.h.b(((C1040c) it4.next()).f16335d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f16332a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    e1.h.b(((C1040c) it5.next()).f16335d, 0, arrayList9, null);
                }
            }
            n nVar6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    e1.h.b((d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    e1.h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i50 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    n b11 = e1.h.b(iVar3, i50, arrayList9, nVar6);
                    iVar3.R(i50, b11, arrayList9);
                    b11.a(arrayList9);
                    i50 = 1;
                    nVar6 = null;
                }
            }
            HashSet hashSet4 = i(3).f16332a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    e1.h.b(((C1040c) it9.next()).f16335d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f16332a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    e1.h.b(((C1040c) it10.next()).f16335d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f16332a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    e1.h.b(((C1040c) it11.next()).f16335d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f16332a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    e1.h.b(((C1040c) it12.next()).f16335d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    e1.h.b((d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i51 = 0; i51 < size3; i51++) {
                d dVar11 = (d) arrayList2.get(i51);
                int[] iArr5 = dVar11.f16393p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i52 = dVar11.f16389n0;
                    int size4 = arrayList9.size();
                    int i53 = 0;
                    while (true) {
                        if (i53 >= size4) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i53);
                        if (i52 == nVar3.f16695b) {
                            break;
                        } else {
                            i53++;
                        }
                    }
                    int i54 = dVar11.f16391o0;
                    int size5 = arrayList9.size();
                    int i55 = 0;
                    while (true) {
                        if (i55 >= size5) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i55);
                        if (i54 == nVar4.f16695b) {
                            break;
                        } else {
                            i55++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.f16696c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i56 = 0;
                    nVar = null;
                    while (it14.hasNext()) {
                        n nVar7 = (n) it14.next();
                        if (nVar7.f16696c != 1) {
                            b1.c cVar7 = cVar6;
                            int b12 = nVar7.b(cVar7, 0);
                            if (b12 > i56) {
                                nVar = nVar7;
                                i56 = b12;
                            }
                            cVar6 = cVar7;
                        }
                    }
                    cVar = cVar6;
                    c11 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i56);
                        if (objArr[c11] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i57 = 0;
                            nVar2 = null;
                            while (it15.hasNext()) {
                                n nVar8 = (n) it15.next();
                                if (nVar8.f16696c != 0 && (b2 = nVar8.b(cVar, 1)) > i57) {
                                    nVar2 = nVar8;
                                    i57 = b2;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i57);
                                if (nVar == null || nVar2 != null) {
                                    i14 = i21;
                                    if (i14 == 2) {
                                        i22 = i19;
                                        if (i22 >= q() || i22 <= 0) {
                                            i23 = q();
                                            i11 = i20;
                                            if (i11 != 2) {
                                                i24 = i7;
                                                if (i24 >= k() || i24 <= 0) {
                                                    i25 = k();
                                                    i12 = i25;
                                                    i13 = i23;
                                                    z8 = true;
                                                    boolean z23 = !W(64) || W(128);
                                                    cVar.getClass();
                                                    cVar.f13790h = false;
                                                    if (this.f16406D0 == 0 && z23) {
                                                        c10 = 1;
                                                        cVar.f13790h = true;
                                                    } else {
                                                        c10 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f16415q0;
                                                    boolean z24 = objArr[0] != 2 || objArr[c10] == 2;
                                                    this.f16424z0 = 0;
                                                    this.f16404A0 = 0;
                                                    i15 = i10;
                                                    for (i16 = 0; i16 < i15; i16++) {
                                                        d dVar12 = (d) this.f16415q0.get(i16);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W10 = W(64);
                                                    boolean z25 = z8;
                                                    int i58 = 0;
                                                    z10 = true;
                                                    while (z10) {
                                                        int i59 = i58 + 1;
                                                        try {
                                                            cVar.t();
                                                            this.f16424z0 = 0;
                                                            this.f16404A0 = 0;
                                                            g(cVar);
                                                            for (int i60 = 0; i60 < i15; i60++) {
                                                                ((d) this.f16415q0.get(i60)).g(cVar);
                                                            }
                                                            S(cVar);
                                                            try {
                                                                weakReference = this.f16409G0;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                z12 = z25;
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z12 = z25;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                z12 = z25;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                C1040c c1040c7 = (C1040c) this.f16409G0.get();
                                                                C1040c c1040c8 = c1040c2;
                                                                try {
                                                                    k = cVar.k(c1040c8);
                                                                    cVar2 = this.f16421w0;
                                                                    z12 = z25;
                                                                    c1040c2 = c1040c8;
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    z12 = z25;
                                                                    c1040c2 = c1040c8;
                                                                }
                                                                try {
                                                                    cVar2.f(cVar2.k(c1040c7), k, 0, 5);
                                                                    this.f16409G0 = null;
                                                                    weakReference2 = this.f16411I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        C1040c c1040c9 = (C1040c) this.f16411I0.get();
                                                                        b1.f k7 = cVar.k(this.L);
                                                                        b1.c cVar8 = this.f16421w0;
                                                                        cVar8.f(k7, cVar8.k(c1040c9), 0, 5);
                                                                        this.f16411I0 = null;
                                                                    }
                                                                    weakReference3 = this.f16410H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        C1040c c1040c10 = (C1040c) this.f16410H0.get();
                                                                        c1040c3 = c1040c;
                                                                        try {
                                                                            b1.f k10 = cVar.k(c1040c3);
                                                                            b1.c cVar9 = this.f16421w0;
                                                                            c1040c = c1040c3;
                                                                            cVar9.f(cVar9.k(c1040c10), k10, 0, 5);
                                                                            this.f16410H0 = null;
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            c1040c = c1040c3;
                                                                            z10 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f16483a;
                                                                            if (z10) {
                                                                            }
                                                                            if (z24) {
                                                                            }
                                                                            max = Math.max(this.f16368b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f16370c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z15) {
                                                                            }
                                                                            z25 = z15;
                                                                            z16 = z13;
                                                                            i17 = 8;
                                                                            if (i59 <= i17) {
                                                                            }
                                                                            z10 = z16;
                                                                            i58 = i59;
                                                                        }
                                                                    }
                                                                    weakReference4 = this.f16412J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        C1040c c1040c11 = (C1040c) this.f16412J0.get();
                                                                        b1.f k11 = cVar.k(this.f16350K);
                                                                        try {
                                                                            cVar3 = this.f16421w0;
                                                                        } catch (Exception e14) {
                                                                            e = e14;
                                                                            z10 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f16483a;
                                                                            if (z10) {
                                                                            }
                                                                            if (z24) {
                                                                            }
                                                                            max = Math.max(this.f16368b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f16370c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z15) {
                                                                            }
                                                                            z25 = z15;
                                                                            z16 = z13;
                                                                            i17 = 8;
                                                                            if (i59 <= i17) {
                                                                            }
                                                                            z10 = z16;
                                                                            i58 = i59;
                                                                        }
                                                                        try {
                                                                            cVar3.f(k11, cVar3.k(c1040c11), 0, 5);
                                                                            try {
                                                                                this.f16412J0 = null;
                                                                            } catch (Exception e15) {
                                                                                e = e15;
                                                                                z10 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f16483a;
                                                                                if (z10) {
                                                                                }
                                                                                if (z24) {
                                                                                }
                                                                                max = Math.max(this.f16368b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f16370c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z15) {
                                                                                }
                                                                                z25 = z15;
                                                                                z16 = z13;
                                                                                i17 = 8;
                                                                                if (i59 <= i17) {
                                                                                }
                                                                                z10 = z16;
                                                                                i58 = i59;
                                                                            }
                                                                        } catch (Exception e16) {
                                                                            e = e16;
                                                                            z10 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = j.f16483a;
                                                                            if (z10) {
                                                                            }
                                                                            if (z24) {
                                                                            }
                                                                            max = Math.max(this.f16368b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f16370c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z15) {
                                                                            }
                                                                            z25 = z15;
                                                                            z16 = z13;
                                                                            i17 = 8;
                                                                            if (i59 <= i17) {
                                                                            }
                                                                            z10 = z16;
                                                                            i58 = i59;
                                                                        }
                                                                    }
                                                                    cVar.p();
                                                                    z10 = true;
                                                                } catch (Exception e17) {
                                                                    e = e17;
                                                                    z10 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f16483a;
                                                                    if (z10) {
                                                                    }
                                                                    if (z24) {
                                                                    }
                                                                    max = Math.max(this.f16368b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f16370c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z15) {
                                                                    }
                                                                    z25 = z15;
                                                                    z16 = z13;
                                                                    i17 = 8;
                                                                    if (i59 <= i17) {
                                                                    }
                                                                    z10 = z16;
                                                                    i58 = i59;
                                                                }
                                                                boolean[] zArr22222 = j.f16483a;
                                                                if (z10) {
                                                                    zArr22222[2] = false;
                                                                    boolean W11 = W(64);
                                                                    Q(cVar, W11);
                                                                    int size6 = this.f16415q0.size();
                                                                    int i61 = 0;
                                                                    z13 = false;
                                                                    while (i61 < size6) {
                                                                        d dVar13 = (d) this.f16415q0.get(i61);
                                                                        dVar13.Q(cVar, W11);
                                                                        boolean z26 = W11;
                                                                        int i62 = size6;
                                                                        if (dVar13.f16378h != -1 || dVar13.f16380i != -1) {
                                                                            z13 = true;
                                                                        }
                                                                        i61++;
                                                                        W11 = z26;
                                                                        size6 = i62;
                                                                    }
                                                                } else {
                                                                    Q(cVar, W10);
                                                                    for (int i63 = 0; i63 < i15; i63++) {
                                                                        ((d) this.f16415q0.get(i63)).Q(cVar, W10);
                                                                    }
                                                                    z13 = false;
                                                                }
                                                                if (z24 && i59 < 8 && zArr22222[2]) {
                                                                    int i64 = 0;
                                                                    int i65 = 0;
                                                                    for (i18 = 0; i18 < i15; i18++) {
                                                                        d dVar14 = (d) this.f16415q0.get(i18);
                                                                        i64 = Math.max(i64, dVar14.q() + dVar14.f16363Y);
                                                                        i65 = Math.max(i65, dVar14.k() + dVar14.f16364Z);
                                                                    }
                                                                    max3 = Math.max(this.f16368b0, i64);
                                                                    max4 = Math.max(this.f16370c0, i65);
                                                                    if (i14 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z13 = true;
                                                                        z12 = true;
                                                                    }
                                                                    if (i11 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z13 = true;
                                                                        z12 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f16368b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r62 = 1;
                                                                    objArr[0] = 1;
                                                                    z13 = true;
                                                                    z14 = true;
                                                                } else {
                                                                    r62 = 1;
                                                                    z14 = z12;
                                                                }
                                                                max2 = Math.max(this.f16370c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r62] = r62;
                                                                    z15 = r62;
                                                                    z13 = z15;
                                                                } else {
                                                                    z15 = z14;
                                                                }
                                                                if (!z15) {
                                                                    if (objArr[0] == 2 && i13 > 0 && q() > i13) {
                                                                        this.f16407E0 = r62;
                                                                        objArr[0] = r62;
                                                                        O(i13);
                                                                        z15 = r62;
                                                                        z13 = z15;
                                                                    }
                                                                    if (objArr[r62] == 2 && i12 > 0 && k() > i12) {
                                                                        this.f16408F0 = r62;
                                                                        objArr[r62] = r62;
                                                                        L(i12);
                                                                        i17 = 8;
                                                                        z16 = true;
                                                                        z25 = true;
                                                                        if (i59 <= i17) {
                                                                            z16 = false;
                                                                        }
                                                                        z10 = z16;
                                                                        i58 = i59;
                                                                    }
                                                                }
                                                                z25 = z15;
                                                                z16 = z13;
                                                                i17 = 8;
                                                                if (i59 <= i17) {
                                                                }
                                                                z10 = z16;
                                                                i58 = i59;
                                                            }
                                                        }
                                                        z12 = z25;
                                                        weakReference2 = this.f16411I0;
                                                        if (weakReference2 != null) {
                                                            C1040c c1040c92 = (C1040c) this.f16411I0.get();
                                                            b1.f k72 = cVar.k(this.L);
                                                            b1.c cVar82 = this.f16421w0;
                                                            cVar82.f(k72, cVar82.k(c1040c92), 0, 5);
                                                            this.f16411I0 = null;
                                                        }
                                                        weakReference3 = this.f16410H0;
                                                        if (weakReference3 != null) {
                                                            C1040c c1040c102 = (C1040c) this.f16410H0.get();
                                                            c1040c3 = c1040c;
                                                            b1.f k102 = cVar.k(c1040c3);
                                                            b1.c cVar92 = this.f16421w0;
                                                            c1040c = c1040c3;
                                                            cVar92.f(cVar92.k(c1040c102), k102, 0, 5);
                                                            this.f16410H0 = null;
                                                        }
                                                        weakReference4 = this.f16412J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        cVar.p();
                                                        z10 = true;
                                                        boolean[] zArr222222 = j.f16483a;
                                                        if (z10) {
                                                        }
                                                        if (z24) {
                                                            int i642 = 0;
                                                            int i652 = 0;
                                                            while (i18 < i15) {
                                                            }
                                                            max3 = Math.max(this.f16368b0, i642);
                                                            max4 = Math.max(this.f16370c0, i652);
                                                            if (i14 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z13 = true;
                                                                z12 = true;
                                                            }
                                                            if (i11 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z13 = true;
                                                                z12 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f16368b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f16370c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z15) {
                                                        }
                                                        z25 = z15;
                                                        z16 = z13;
                                                        i17 = 8;
                                                        if (i59 <= i17) {
                                                        }
                                                        z10 = z16;
                                                        i58 = i59;
                                                    }
                                                    z11 = z25;
                                                    this.f16415q0 = arrayList10;
                                                    if (z11) {
                                                        objArr[0] = i14;
                                                        objArr[1] = i11;
                                                    }
                                                    F(cVar.f13793m);
                                                }
                                                L(i24);
                                                this.f16408F0 = true;
                                            } else {
                                                i24 = i7;
                                            }
                                            i25 = i24;
                                            i12 = i25;
                                            i13 = i23;
                                            z8 = true;
                                            if (W(64)) {
                                            }
                                            cVar.getClass();
                                            cVar.f13790h = false;
                                            if (this.f16406D0 == 0) {
                                            }
                                            c10 = 1;
                                            ArrayList arrayList102 = this.f16415q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f16424z0 = 0;
                                            this.f16404A0 = 0;
                                            i15 = i10;
                                            while (i16 < i15) {
                                            }
                                            boolean W102 = W(64);
                                            boolean z252 = z8;
                                            int i582 = 0;
                                            z10 = true;
                                            while (z10) {
                                            }
                                            z11 = z252;
                                            this.f16415q0 = arrayList102;
                                            if (z11) {
                                            }
                                            F(cVar.f13793m);
                                        }
                                        O(i22);
                                        this.f16407E0 = true;
                                    } else {
                                        i22 = i19;
                                    }
                                    i23 = i22;
                                    i11 = i20;
                                    if (i11 != 2) {
                                    }
                                    i25 = i24;
                                    i12 = i25;
                                    i13 = i23;
                                    z8 = true;
                                    if (W(64)) {
                                    }
                                    cVar.getClass();
                                    cVar.f13790h = false;
                                    if (this.f16406D0 == 0) {
                                    }
                                    c10 = 1;
                                    ArrayList arrayList1022 = this.f16415q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f16424z0 = 0;
                                    this.f16404A0 = 0;
                                    i15 = i10;
                                    while (i16 < i15) {
                                    }
                                    boolean W1022 = W(64);
                                    boolean z2522 = z8;
                                    int i5822 = 0;
                                    z10 = true;
                                    while (z10) {
                                    }
                                    z11 = z2522;
                                    this.f16415q0 = arrayList1022;
                                    if (z11) {
                                    }
                                    F(cVar.f13793m);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i14 = i21;
                        if (i14 == 2) {
                        }
                        i23 = i22;
                        i11 = i20;
                        if (i11 != 2) {
                        }
                        i25 = i24;
                        i12 = i25;
                        i13 = i23;
                        z8 = true;
                        if (W(64)) {
                        }
                        cVar.getClass();
                        cVar.f13790h = false;
                        if (this.f16406D0 == 0) {
                        }
                        c10 = 1;
                        ArrayList arrayList10222 = this.f16415q0;
                        if (objArr[0] != 2) {
                        }
                        this.f16424z0 = 0;
                        this.f16404A0 = 0;
                        i15 = i10;
                        while (i16 < i15) {
                        }
                        boolean W10222 = W(64);
                        boolean z25222 = z8;
                        int i58222 = 0;
                        z10 = true;
                        while (z10) {
                        }
                        z11 = z25222;
                        this.f16415q0 = arrayList10222;
                        if (z11) {
                        }
                        F(cVar.f13793m);
                    }
                } else {
                    cVar = cVar6;
                    c11 = 1;
                }
                nVar = null;
                if (objArr[c11] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i14 = i21;
                if (i14 == 2) {
                }
                i23 = i22;
                i11 = i20;
                if (i11 != 2) {
                }
                i25 = i24;
                i12 = i25;
                i13 = i23;
                z8 = true;
                if (W(64)) {
                }
                cVar.getClass();
                cVar.f13790h = false;
                if (this.f16406D0 == 0) {
                }
                c10 = 1;
                ArrayList arrayList102222 = this.f16415q0;
                if (objArr[0] != 2) {
                }
                this.f16424z0 = 0;
                this.f16404A0 = 0;
                i15 = i10;
                while (i16 < i15) {
                }
                boolean W102222 = W(64);
                boolean z252222 = z8;
                int i582222 = 0;
                z10 = true;
                while (z10) {
                }
                z11 = z252222;
                this.f16415q0 = arrayList102222;
                if (z11) {
                }
                F(cVar.f13793m);
            }
            cVar = cVar6;
            i12 = i7;
            i11 = i20;
            i13 = i19;
            i14 = i21;
        }
        z8 = false;
        if (W(64)) {
        }
        cVar.getClass();
        cVar.f13790h = false;
        if (this.f16406D0 == 0) {
        }
        c10 = 1;
        ArrayList arrayList1022222 = this.f16415q0;
        if (objArr[0] != 2) {
        }
        this.f16424z0 = 0;
        this.f16404A0 = 0;
        i15 = i10;
        while (i16 < i15) {
        }
        boolean W1022222 = W(64);
        boolean z2522222 = z8;
        int i5822222 = 0;
        z10 = true;
        while (z10) {
        }
        z11 = z2522222;
        this.f16415q0 = arrayList1022222;
        if (z11) {
        }
        F(cVar.f13793m);
    }

    public final boolean W(int i7) {
        return (this.f16406D0 & i7) == i7;
    }

    @Override // d1.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f16359U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f16360V);
        sb2.append("\n");
        Iterator it = this.f16415q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
