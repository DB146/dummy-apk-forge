package u0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.n0;
import A0.y0;
import i0.C1289b;
import java.util.ArrayList;
import java.util.List;
import u.C2042E;
import y0.InterfaceC2345m;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073c extends C2074d {

    /* renamed from: c, reason: collision with root package name */
    public final c0.l f24746c;

    /* renamed from: d, reason: collision with root package name */
    public final n5.m f24747d;

    /* renamed from: e, reason: collision with root package name */
    public final u.r f24748e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f24749f;
    public C2075e g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24750h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24751i;
    public boolean j;

    public C2073c(c0.l lVar) {
        this.f24746c = lVar;
        n5.m mVar = new n5.m(1);
        mVar.f21192c = new long[2];
        this.f24747d = mVar;
        this.f24748e = new u.r(2);
        this.f24751i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // u0.C2074d
    public final boolean a(u.r rVar, InterfaceC2345m interfaceC2345m, P3.p pVar, boolean z8) {
        u.r rVar2;
        n5.m mVar;
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        C2075e c2075e;
        int i7;
        boolean z13;
        int i10;
        int i11;
        int i12;
        long j;
        List list;
        boolean a9 = super.a(rVar, interfaceC2345m, pVar, z8);
        AbstractC0025n abstractC0025n = this.f24746c;
        if (!abstractC0025n.f14112B) {
            return true;
        }
        ?? r82 = 0;
        while (abstractC0025n != 0) {
            if (abstractC0025n instanceof y0) {
                this.f24749f = AbstractC0017g.r((y0) abstractC0025n, 16);
            } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                c0.l lVar = abstractC0025n.f269D;
                int i13 = 0;
                abstractC0025n = abstractC0025n;
                r82 = r82;
                while (lVar != null) {
                    if ((lVar.f14115c & 16) != 0) {
                        i13++;
                        r82 = r82;
                        if (i13 == 1) {
                            abstractC0025n = lVar;
                        } else {
                            if (r82 == 0) {
                                r82 = new S.e(new c0.l[16]);
                            }
                            if (abstractC0025n != 0) {
                                r82.b(abstractC0025n);
                                abstractC0025n = 0;
                            }
                            r82.b(lVar);
                        }
                    }
                    lVar = lVar.f14118f;
                    abstractC0025n = abstractC0025n;
                    r82 = r82;
                }
                if (i13 == 1) {
                }
            }
            abstractC0025n = AbstractC0017g.e(r82);
        }
        if (this.f24749f == null) {
            return true;
        }
        int g = rVar.g();
        int i14 = 0;
        while (true) {
            rVar2 = this.f24748e;
            mVar = this.f24747d;
            if (i14 >= g) {
                break;
            }
            long d10 = rVar.d(i14);
            C2080j c2080j = (C2080j) rVar.h(i14);
            if (mVar.b(d10)) {
                long j10 = c2080j.g;
                if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    long j11 = c2080j.f24765c;
                    if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                        List list2 = c2080j.k;
                        List list3 = Eb.v.f3891a;
                        if (list2 == null) {
                            list2 = list3;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list4 = c2080j.k;
                        i10 = g;
                        if (list4 == null) {
                            list4 = list3;
                        }
                        int size = list4.size();
                        z13 = a9;
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            C2071a c2071a = (C2071a) list4.get(i15);
                            long j12 = d10;
                            long j13 = c2071a.f24738b;
                            if ((((j13 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                list = list4;
                                n0 n0Var = this.f24749f;
                                kotlin.jvm.internal.l.b(n0Var);
                                long C0 = n0Var.C0(interfaceC2345m, j13);
                                i12 = i14;
                                j = j11;
                                arrayList.add(new C2071a(c2071a.f24737a, C0, c2071a.f24739c));
                            } else {
                                i12 = i14;
                                j = j11;
                                list = list4;
                            }
                            i15++;
                            i14 = i12;
                            list4 = list;
                            size = i16;
                            j11 = j;
                            d10 = j12;
                        }
                        i11 = i14;
                        long j14 = d10;
                        n0 n0Var2 = this.f24749f;
                        kotlin.jvm.internal.l.b(n0Var2);
                        long C02 = n0Var2.C0(interfaceC2345m, j10);
                        n0 n0Var3 = this.f24749f;
                        kotlin.jvm.internal.l.b(n0Var3);
                        C2080j c2080j2 = new C2080j(c2080j.f24763a, c2080j.f24764b, n0Var3.C0(interfaceC2345m, j11), c2080j.f24766d, c2080j.f24767e, c2080j.f24768f, C02, c2080j.f24769h, c2080j.f24770i, arrayList, c2080j.j, c2080j.f24771l);
                        C2080j c2080j3 = c2080j.f24774o;
                        if (c2080j3 == null) {
                            c2080j3 = c2080j;
                        }
                        c2080j2.f24774o = c2080j3;
                        C2080j c2080j4 = c2080j.f24774o;
                        if (c2080j4 != null) {
                            c2080j = c2080j4;
                        }
                        c2080j2.f24774o = c2080j;
                        rVar2.e(c2080j2, j14);
                        i14 = i11 + 1;
                        g = i10;
                        a9 = z13;
                    }
                }
            }
            z13 = a9;
            i10 = g;
            i11 = i14;
            i14 = i11 + 1;
            g = i10;
            a9 = z13;
        }
        boolean z14 = a9;
        if (rVar2.g() == 0) {
            mVar.f21191b = 0;
            this.f24752a.g();
            return true;
        }
        for (int i17 = mVar.f21191b - 1; -1 < i17; i17--) {
            if (rVar.c(mVar.f21192c[i17]) < 0 && i17 < (i7 = mVar.f21191b)) {
                int i18 = i7 - 1;
                int i19 = i17;
                while (i19 < i18) {
                    long[] jArr = mVar.f21192c;
                    int i20 = i19 + 1;
                    jArr[i19] = jArr[i20];
                    i19 = i20;
                }
                mVar.f21191b--;
            }
        }
        ArrayList arrayList2 = new ArrayList(rVar2.g());
        int g2 = rVar2.g();
        for (int i21 = 0; i21 < g2; i21++) {
            arrayList2.add(rVar2.h(i21));
        }
        C2075e c2075e2 = new C2075e(arrayList2, pVar);
        int size2 = arrayList2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i22);
            if (pVar.a(((C2080j) obj).f24763a)) {
                break;
            }
            i22++;
        }
        C2080j c2080j5 = (C2080j) obj;
        if (c2080j5 != null) {
            boolean z15 = c2080j5.f24766d;
            if (z8) {
                z10 = false;
                if (!this.f24751i && (z15 || c2080j5.f24769h)) {
                    n0 n0Var4 = this.f24749f;
                    kotlin.jvm.internal.l.b(n0Var4);
                    long j15 = n0Var4.f26556c;
                    long j16 = c2080j5.f24765c;
                    float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                    z11 = true;
                    this.f24751i = !((intBitsToFloat < 0.0f) | (intBitsToFloat > ((float) ((int) (j15 >> 32)))) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) ((int) (j15 & 4294967295L)))));
                    if (this.f24751i == this.f24750h && (u.c(c2075e2.f24756c, 3) || u.c(c2075e2.f24756c, 4) || u.c(c2075e2.f24756c, 5))) {
                        c2075e2.f24756c = this.f24751i ? 4 : 5;
                    } else if (!u.c(c2075e2.f24756c, 4) && this.f24750h && !this.j) {
                        c2075e2.f24756c = 3;
                    } else if (u.c(c2075e2.f24756c, 5) && this.f24751i && z15) {
                        c2075e2.f24756c = 3;
                    }
                }
            } else {
                z10 = false;
                this.f24751i = false;
            }
            z11 = true;
            if (this.f24751i == this.f24750h) {
            }
            if (!u.c(c2075e2.f24756c, 4)) {
            }
            if (u.c(c2075e2.f24756c, 5)) {
                c2075e2.f24756c = 3;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        if (!z14 && u.c(c2075e2.f24756c, 3) && (c2075e = this.g) != null) {
            ?? r12 = c2075e.f24754a;
            int size3 = r12.size();
            ?? r52 = c2075e2.f24754a;
            if (size3 == r52.size()) {
                int size4 = r52.size();
                for (?? r72 = z10; r72 < size4; r72++) {
                    if (C1289b.b(((C2080j) r12.get(r72)).f24765c, ((C2080j) r52.get(r72)).f24765c)) {
                    }
                }
                z12 = z10;
                this.g = c2075e2;
                return z12;
            }
        }
        z12 = z11;
        this.g = c2075e2;
        return z12;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // u0.C2074d
    public final void b(P3.p pVar) {
        super.b(pVar);
        C2075e c2075e = this.g;
        if (c2075e == null) {
            return;
        }
        this.f24750h = this.f24751i;
        ?? r12 = c2075e.f24754a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            C2080j c2080j = (C2080j) r12.get(i7);
            boolean z8 = c2080j.f24766d;
            long j = c2080j.f24763a;
            boolean a9 = pVar.a(j);
            boolean z10 = this.f24751i;
            if ((!z8 && !a9) || (!z8 && !z10)) {
                this.f24747d.d(j);
            }
        }
        this.f24751i = false;
        this.j = u.c(c2075e.f24756c, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [S.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [S.e] */
    public final void c() {
        S.e eVar = this.f24752a;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((C2073c) objArr[i10]).c();
        }
        AbstractC0025n abstractC0025n = this.f24746c;
        ?? r32 = 0;
        while (abstractC0025n != 0) {
            if (abstractC0025n instanceof y0) {
                ((y0) abstractC0025n).L();
            } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                c0.l lVar = abstractC0025n.f269D;
                int i11 = 0;
                abstractC0025n = abstractC0025n;
                r32 = r32;
                while (lVar != null) {
                    if ((lVar.f14115c & 16) != 0) {
                        i11++;
                        r32 = r32;
                        if (i11 == 1) {
                            abstractC0025n = lVar;
                        } else {
                            if (r32 == 0) {
                                r32 = new S.e(new c0.l[16]);
                            }
                            if (abstractC0025n != 0) {
                                r32.b(abstractC0025n);
                                abstractC0025n = 0;
                            }
                            r32.b(lVar);
                        }
                    }
                    lVar = lVar.f14118f;
                    abstractC0025n = abstractC0025n;
                    r32 = r32;
                }
                if (i11 == 1) {
                }
            }
            abstractC0025n = AbstractC0017g.e(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean d(P3.p pVar) {
        u.r rVar = this.f24748e;
        boolean z8 = false;
        z8 = false;
        if (!(rVar.g() == 0)) {
            c0.l lVar = this.f24746c;
            if (lVar.f14112B) {
                C2075e c2075e = this.g;
                kotlin.jvm.internal.l.b(c2075e);
                n0 n0Var = this.f24749f;
                kotlin.jvm.internal.l.b(n0Var);
                long j = n0Var.f26556c;
                AbstractC0025n abstractC0025n = lVar;
                ?? r92 = 0;
                while (abstractC0025n != 0) {
                    if (abstractC0025n instanceof y0) {
                        ((y0) abstractC0025n).H(c2075e, EnumC2076f.f24759c, j);
                    } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                        c0.l lVar2 = abstractC0025n.f269D;
                        int i7 = 0;
                        abstractC0025n = abstractC0025n;
                        r92 = r92;
                        while (lVar2 != null) {
                            if ((lVar2.f14115c & 16) != 0) {
                                i7++;
                                r92 = r92;
                                if (i7 == 1) {
                                    abstractC0025n = lVar2;
                                } else {
                                    if (r92 == 0) {
                                        r92 = new S.e(new c0.l[16]);
                                    }
                                    if (abstractC0025n != 0) {
                                        r92.b(abstractC0025n);
                                        abstractC0025n = 0;
                                    }
                                    r92.b(lVar2);
                                }
                            }
                            lVar2 = lVar2.f14118f;
                            abstractC0025n = abstractC0025n;
                            r92 = r92;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC0025n = AbstractC0017g.e(r92);
                }
                if (lVar.f14112B) {
                    S.e eVar = this.f24752a;
                    Object[] objArr = eVar.f8959a;
                    int i10 = eVar.f8961c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C2073c) objArr[i11]).d(pVar);
                    }
                }
                z8 = true;
            }
        }
        b(pVar);
        rVar.a();
        this.f24749f = null;
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [S.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [S.e] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(P3.p pVar, boolean z8) {
        if (this.f24748e.g() == 0) {
            return false;
        }
        AbstractC0025n abstractC0025n = this.f24746c;
        if (!abstractC0025n.f14112B) {
            return false;
        }
        C2075e c2075e = this.g;
        kotlin.jvm.internal.l.b(c2075e);
        n0 n0Var = this.f24749f;
        kotlin.jvm.internal.l.b(n0Var);
        long j = n0Var.f26556c;
        AbstractC0025n abstractC0025n2 = abstractC0025n;
        ?? r82 = 0;
        while (abstractC0025n2 != 0) {
            if (abstractC0025n2 instanceof y0) {
                ((y0) abstractC0025n2).H(c2075e, EnumC2076f.f24757a, j);
            } else if ((abstractC0025n2.f14115c & 16) != 0 && (abstractC0025n2 instanceof AbstractC0025n)) {
                c0.l lVar = abstractC0025n2.f269D;
                int i7 = 0;
                abstractC0025n2 = abstractC0025n2;
                r82 = r82;
                while (lVar != null) {
                    if ((lVar.f14115c & 16) != 0) {
                        i7++;
                        r82 = r82;
                        if (i7 == 1) {
                            abstractC0025n2 = lVar;
                        } else {
                            if (r82 == 0) {
                                r82 = new S.e(new c0.l[16]);
                            }
                            if (abstractC0025n2 != 0) {
                                r82.b(abstractC0025n2);
                                abstractC0025n2 = 0;
                            }
                            r82.b(lVar);
                        }
                    }
                    lVar = lVar.f14118f;
                    abstractC0025n2 = abstractC0025n2;
                    r82 = r82;
                }
                if (i7 == 1) {
                }
            }
            abstractC0025n2 = AbstractC0017g.e(r82);
        }
        if (abstractC0025n.f14112B) {
            S.e eVar = this.f24752a;
            Object[] objArr = eVar.f8959a;
            int i10 = eVar.f8961c;
            for (int i11 = 0; i11 < i10; i11++) {
                C2073c c2073c = (C2073c) objArr[i11];
                kotlin.jvm.internal.l.b(this.f24749f);
                c2073c.e(pVar, z8);
            }
        }
        if (abstractC0025n.f14112B) {
            ?? r14 = 0;
            while (abstractC0025n != 0) {
                if (abstractC0025n instanceof y0) {
                    ((y0) abstractC0025n).H(c2075e, EnumC2076f.f24758b, j);
                } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                    c0.l lVar2 = abstractC0025n.f269D;
                    int i12 = 0;
                    abstractC0025n = abstractC0025n;
                    r14 = r14;
                    while (lVar2 != null) {
                        if ((lVar2.f14115c & 16) != 0) {
                            i12++;
                            r14 = r14;
                            if (i12 == 1) {
                                abstractC0025n = lVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new S.e(new c0.l[16]);
                                }
                                if (abstractC0025n != 0) {
                                    r14.b(abstractC0025n);
                                    abstractC0025n = 0;
                                }
                                r14.b(lVar2);
                            }
                        }
                        lVar2 = lVar2.f14118f;
                        abstractC0025n = abstractC0025n;
                        r14 = r14;
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC0025n = AbstractC0017g.e(r14);
            }
        }
        return true;
    }

    public final void f(long j, C2042E c2042e) {
        n5.m mVar = this.f24747d;
        if (mVar.b(j) && c2042e.f(this) < 0) {
            mVar.d(j);
            this.f24748e.f(j);
        }
        S.e eVar = this.f24752a;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((C2073c) objArr[i10]).f(j, c2042e);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f24746c + ", children=" + this.f24752a + ", pointerIds=" + this.f24747d + ')';
    }
}
