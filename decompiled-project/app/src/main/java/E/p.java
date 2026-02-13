package E;

import A0.C0005a;
import C.F;
import C.InterfaceC0220e;
import C.InterfaceC0222g;
import F.C0264h;
import F.C0266j;
import F.C0267k;
import F.C0278w;
import Q.C0481b0;
import a0.AbstractC0682i;
import a0.AbstractC0692s;
import cc.E;
import h3.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import u.AbstractC2058k;
import u.C2069w;
import x.C2238h;
import y0.InterfaceC2317B;
import y0.InterfaceC2332Q;
import y7.u0;
import z.V;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f3450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f3452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Yb.g f3453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0222g f3454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0220e f3455f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f3456u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0264h f3457v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0.c f3458w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0.d f3459x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(A a9, boolean z8, F f4, Yb.g gVar, InterfaceC0222g interfaceC0222g, InterfaceC0220e interfaceC0220e, E e2, j0.s sVar, C0264h c0264h, c0.c cVar, c0.d dVar) {
        super(2);
        this.f3450a = a9;
        this.f3451b = z8;
        this.f3452c = f4;
        this.f3453d = gVar;
        this.f3454e = interfaceC0222g;
        this.f3455f = interfaceC0220e;
        this.f3456u = e2;
        this.f3457v = c0264h;
        this.f3458w = cVar;
        this.f3459x = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x074d A[LOOP:15: B:267:0x074b->B:268:0x074d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x077b  */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.ArrayList] */
    @Override // Rb.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int B10;
        int B11;
        float a9;
        Xb.e eVar;
        Eb.v vVar;
        int i7;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        t tVar;
        t tVar2;
        int i15;
        int i16;
        int i17;
        float f4;
        ArrayList arrayList;
        List list;
        int i18;
        boolean z8;
        List list2;
        int size;
        int i19;
        int size2;
        int i20;
        boolean z10;
        long j10;
        int i21;
        boolean z11;
        o oVar;
        t tVar3;
        int i22;
        float f10;
        j jVar;
        androidx.compose.foundation.lazy.layout.b bVar;
        C0278w c0278w;
        int i23;
        int i24;
        ArrayList arrayList2;
        int i25;
        A4.s sVar;
        o oVar2;
        o oVar3;
        int i26;
        int i27;
        Eb.v vVar2;
        Integer valueOf;
        Integer valueOf2;
        int i28;
        int i29;
        Eb.v vVar3;
        s sVar2;
        A a10;
        C2069w c2069w;
        int i30;
        C0005a c0005a;
        long j11;
        int i31;
        Object obj3;
        int i32;
        int i33;
        int max;
        int i34;
        int i35;
        int i36;
        int[] iArr;
        t tVar4;
        float f11;
        t tVar5;
        t tVar6;
        int i37;
        Object obj4;
        int min;
        int i38;
        t tVar7;
        Object obj5;
        int i39;
        int i40;
        C0278w c0278w2 = (C0278w) obj;
        long j12 = ((V0.a) obj2).f9967a;
        A a11 = this.f3450a;
        a11.f3383r.getValue();
        boolean z12 = a11.f3370b || c0278w2.f4019b.m();
        boolean z13 = this.f3451b;
        if ((z13 ? V.f27943a : V.f27944b) == V.f27943a) {
            if (V0.a.g(j12) == Integer.MAX_VALUE) {
                B.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (V0.a.h(j12) == Integer.MAX_VALUE) {
            B.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        F f12 = this.f3452c;
        if (z13) {
            B10 = c0278w2.f4019b.B(f12.a(c0278w2.f4019b.getLayoutDirection()));
        } else {
            V0.l layoutDirection = c0278w2.f4019b.getLayoutDirection();
            B10 = c0278w2.f4019b.B(layoutDirection == V0.l.f9982a ? f12.a(layoutDirection) : f12.b(layoutDirection));
        }
        if (z13) {
            B11 = c0278w2.f4019b.B(f12.b(c0278w2.f4019b.getLayoutDirection()));
        } else {
            V0.l layoutDirection2 = c0278w2.f4019b.getLayoutDirection();
            B11 = c0278w2.f4019b.B(layoutDirection2 == V0.l.f9982a ? f12.b(layoutDirection2) : f12.a(layoutDirection2));
        }
        int B12 = c0278w2.f4019b.B(f12.f2349b);
        InterfaceC2332Q interfaceC2332Q = c0278w2.f4019b;
        int B13 = interfaceC2332Q.B(f12.f2351d) + B12;
        int i41 = B10 + B11;
        int i42 = z13 ? B13 : i41;
        int i43 = z13 ? B12 : !z13 ? B10 : B11;
        int i44 = i42 - i43;
        long h10 = V0.b.h(-i41, -B13, j12);
        j jVar2 = (j) this.f3453d.invoke();
        C0248c c0248c = jVar2.f3416c;
        int h11 = V0.a.h(h10);
        int i45 = i43;
        int g = V0.a.g(h10);
        c0248c.f3402a.e(h11);
        c0248c.f3403b.e(g);
        InterfaceC0220e interfaceC0220e = this.f3455f;
        InterfaceC0222g interfaceC0222g = this.f3454e;
        if (z13) {
            if (interfaceC0222g == null) {
                B.a.b("null verticalArrangement when isVertical == true");
                throw new Db.d(0);
            }
            a9 = interfaceC0222g.a();
        } else {
            if (interfaceC0220e == null) {
                B.a.b("null horizontalAlignment when isVertical == false");
                throw new Db.d(0);
            }
            a9 = interfaceC0220e.a();
        }
        int B14 = interfaceC2332Q.B(a9);
        int b2 = jVar2.b();
        int g2 = z13 ? V0.a.g(j12) - B13 : V0.a.h(j12) - i41;
        o oVar4 = new o(h10, this.f3451b, jVar2, c0278w2, b2, B14, this.f3458w, this.f3459x, i45, i44, (B10 << 32) | (B12 & 4294967295L), this.f3450a);
        AbstractC0682i c10 = AbstractC0692s.c();
        Rb.c e2 = c10 != null ? c10.e() : null;
        AbstractC0682i d10 = AbstractC0692s.d(c10);
        try {
            u uVar = a11.f3372d;
            int b10 = uVar.b();
            int f13 = F.x.f(b10, jVar2, uVar.f3501d);
            if (b10 != f13) {
                ((C0481b0) uVar.f3499b).e(f13);
                F.y yVar = (F.y) uVar.f3502e;
                if (b10 != yVar.f4024b) {
                    yVar.f4024b = b10;
                    int i46 = (b10 / 30) * 30;
                    yVar.f4023a.setValue(H.I(Math.max(i46 - 100, 0), i46 + 130));
                }
            }
            int c11 = uVar.c();
            AbstractC0692s.f(c10, d10, e2);
            C0267k c0267k = a11.f3379n;
            boolean z14 = c0267k.f3980a.f8961c != 0;
            Eb.v vVar4 = Eb.v.f3891a;
            F.A a12 = a11.f3382q;
            if (z14 || !a12.f3898a.isEmpty()) {
                ?? arrayList3 = new ArrayList();
                S.e eVar2 = c0267k.f3980a;
                if (eVar2.f8961c != 0) {
                    int i47 = eVar2.f8961c;
                    if (i47 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr = eVar2.f8959a;
                    int i48 = ((C0266j) objArr[0]).f3978a;
                    for (int i49 = 0; i49 < i47; i49++) {
                        int i50 = ((C0266j) objArr[i49]).f3978a;
                        if (i50 < i48) {
                            i48 = i50;
                        }
                    }
                    if (i48 < 0) {
                        B.a.a("negative minIndex");
                    }
                    int i51 = eVar2.f8961c;
                    if (i51 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr2 = eVar2.f8959a;
                    int i52 = ((C0266j) objArr2[0]).f3979b;
                    for (int i53 = 0; i53 < i51; i53++) {
                        int i54 = ((C0266j) objArr2[i53]).f3979b;
                        if (i54 > i52) {
                            i52 = i54;
                        }
                    }
                    eVar = new Xb.e(i48, Math.min(i52, jVar2.b() - 1), 1);
                } else {
                    eVar = Xb.g.f11032d;
                }
                int size3 = a12.f3898a.size();
                for (int i55 = 0; i55 < size3; i55++) {
                    F.z zVar = (F.z) a12.get(i55);
                    int f14 = F.x.f(zVar.f4027c, jVar2, zVar.f4025a);
                    int i56 = eVar.f11025a;
                    if ((f14 > eVar.f11026b || i56 > f14) && f14 >= 0 && f14 < jVar2.b()) {
                        arrayList3.add(Integer.valueOf(f14));
                    }
                }
                int i57 = eVar.f11025a;
                int i58 = eVar.f11026b;
                if (i57 <= i58) {
                    while (true) {
                        arrayList3.add(Integer.valueOf(i57));
                        if (i57 == i58) {
                            break;
                        }
                        i57++;
                    }
                }
                vVar = arrayList3;
            } else {
                vVar = vVar4;
            }
            float floatValue = (interfaceC2332Q.m() || !z12) ? a11.g : ((Number) ((C2238h) a11.f3387v.f17441b).f26093b.getValue()).floatValue();
            boolean m10 = interfaceC2332Q.m();
            s sVar3 = a11.f3371c;
            n nVar = new n(c0278w2, j12, i41, B13);
            if (i45 < 0) {
                B.a.a("invalid beforeContentPadding");
            }
            if (i44 < 0) {
                B.a.a("invalid afterContentPadding");
            }
            j jVar3 = oVar4.f3440a;
            androidx.compose.foundation.lazy.layout.b bVar2 = a11.f3378m;
            A4.s sVar4 = jVar3.f3417d;
            E e10 = this.f3456u;
            if (b2 <= 0) {
                int j13 = V0.a.j(h10);
                int i59 = V0.a.i(h10);
                bVar2.b(j13, i59, new ArrayList(), sVar4, oVar4, m10, z12, 0, 0);
                if (!m10) {
                    bVar2.a();
                    if (!V0.k.a(0L, 0L)) {
                        int f15 = V0.b.f((int) 0, h10);
                        i59 = V0.b.e((int) 0, h10);
                        j13 = f15;
                    }
                }
                sVar2 = new s(null, 0, false, 0.0f, (InterfaceC2317B) nVar.a(Integer.valueOf(j13), Integer.valueOf(i59), q.f3460b), 0.0f, false, e10, c0278w2, oVar4.f3442c, vVar4, -i45, g2 + i44, 0, z13 ? V.f27943a : V.f27944b, i44, B14);
                a10 = a11;
            } else {
                if (f13 >= b2) {
                    f13 = b2 - 1;
                    c11 = 0;
                }
                int round = Math.round(floatValue);
                int i60 = c11 - round;
                if (f13 != 0 || i60 >= 0) {
                    i7 = f13;
                } else {
                    round += i60;
                    i7 = f13;
                    i60 = 0;
                }
                Eb.l lVar = new Eb.l();
                int i61 = -i45;
                int i62 = i61 + (B14 < 0 ? B14 : 0);
                int i63 = i60 + i62;
                int i64 = i7;
                int i65 = 0;
                while (true) {
                    j = oVar4.f3442c;
                    if (i63 >= 0 || i64 <= 0) {
                        break;
                    }
                    i64--;
                    t a13 = oVar4.a(i64, j);
                    lVar.add(0, a13);
                    i65 = Math.max(i65, a13.f3494o);
                    i63 += a13.f3493n;
                }
                if (i63 < i62) {
                    round -= i62 - i63;
                    i63 = i62;
                }
                int i66 = round;
                int i67 = i65;
                int i68 = i63 - i62;
                int i69 = g2 + i44;
                int i70 = i64;
                int i71 = i69 < 0 ? 0 : i69;
                int i72 = -i68;
                int i73 = i70;
                int i74 = i61;
                int i75 = i68;
                int i76 = 0;
                boolean z15 = false;
                while (i76 < lVar.f3884c) {
                    if (i72 >= i71) {
                        lVar.o(i76);
                        z15 = true;
                    } else {
                        i73++;
                        i72 += ((t) lVar.get(i76)).f3493n;
                        i76++;
                    }
                }
                int i77 = i72;
                int i78 = i67;
                int i79 = i73;
                while (i79 < b2 && (i77 < i71 || i77 <= 0 || lVar.isEmpty())) {
                    int i80 = i71;
                    t a14 = oVar4.a(i79, j);
                    s sVar5 = sVar3;
                    int i81 = a14.f3493n;
                    i77 += i81;
                    if (i77 <= i62) {
                        i39 = i62;
                        if (i79 != b2 - 1) {
                            i40 = i79 + 1;
                            i75 -= i81;
                            z15 = true;
                            i79++;
                            i70 = i40;
                            i71 = i80;
                            sVar3 = sVar5;
                            i62 = i39;
                        }
                    } else {
                        i39 = i62;
                    }
                    int max2 = Math.max(i78, a14.f3494o);
                    lVar.addLast(a14);
                    i40 = i70;
                    i78 = max2;
                    i79++;
                    i70 = i40;
                    i71 = i80;
                    sVar3 = sVar5;
                    i62 = i39;
                }
                s sVar6 = sVar3;
                int i82 = g2;
                if (i77 < i82) {
                    int i83 = i82 - i77;
                    i77 += i83;
                    int i84 = i70;
                    int i85 = i75 - i83;
                    while (i85 < i45 && i84 > 0) {
                        int i86 = i79;
                        int i87 = i84 - 1;
                        int i88 = i82;
                        t a15 = oVar4.a(i87, j);
                        lVar.add(0, a15);
                        i78 = Math.max(i78, a15.f3494o);
                        i85 += a15.f3493n;
                        i84 = i87;
                        i79 = i86;
                        i82 = i88;
                    }
                    i10 = i79;
                    i11 = i82;
                    i13 = i83 + i66;
                    if (i85 < 0) {
                        i13 += i85;
                        i77 += i85;
                        i12 = i84;
                        i14 = 0;
                    } else {
                        i14 = i85;
                        i12 = i84;
                    }
                } else {
                    i10 = i79;
                    i11 = i82;
                    i12 = i70;
                    i13 = i66;
                    i14 = i75;
                }
                int i89 = i78;
                float f16 = (Integer.signum(Math.round(floatValue)) != Integer.signum(i13) || Math.abs(Math.round(floatValue)) < Math.abs(i13)) ? floatValue : i13;
                float f17 = floatValue - f16;
                float f18 = (!m10 || i13 <= i66 || f17 > 0.0f) ? 0.0f : (i13 - i66) + f17;
                if (i14 < 0) {
                    B.a.a("negative currentFirstItemScrollOffset");
                }
                int i90 = -i14;
                t tVar8 = (t) lVar.first();
                if (i45 > 0 || B14 < 0) {
                    int b11 = lVar.b();
                    int i91 = i14;
                    int i92 = 0;
                    while (true) {
                        if (i92 >= b11) {
                            tVar = tVar8;
                            break;
                        }
                        tVar = tVar8;
                        int i93 = ((t) lVar.get(i92)).f3493n;
                        if (i91 == 0 || i93 > i91) {
                            break;
                        }
                        int i94 = b11;
                        if (i92 == u0.s(lVar)) {
                            break;
                        }
                        i91 -= i93;
                        i92++;
                        tVar8 = (t) lVar.get(i92);
                        b11 = i94;
                    }
                    tVar2 = tVar;
                    i15 = 0;
                    i16 = i91;
                } else {
                    i16 = i14;
                    tVar2 = tVar8;
                    i15 = 0;
                }
                int max3 = Math.max(i15, i12);
                int i95 = i12 - 1;
                List list3 = null;
                if (max3 <= i95) {
                    while (true) {
                        if (list3 == null) {
                            list3 = new ArrayList();
                        }
                        list3.add(oVar4.a(i95, j));
                        if (i95 == max3) {
                            break;
                        }
                        i95--;
                    }
                }
                int size4 = vVar.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i96 = size4 - 1;
                        int intValue = ((Number) vVar.get(size4)).intValue();
                        if (intValue < max3) {
                            if (list3 == null) {
                                list3 = new ArrayList();
                            }
                            list3.add(oVar4.a(intValue, j));
                        }
                        if (i96 < 0) {
                            break;
                        }
                        size4 = i96;
                    }
                }
                if (list3 == null) {
                    list3 = vVar4;
                }
                int i97 = i89;
                int i98 = 0;
                for (int size5 = list3.size(); i98 < size5; size5 = size5) {
                    i97 = Math.max(i97, ((t) list3.get(i98)).f3494o);
                    i98++;
                }
                int i99 = b2 - 1;
                int min2 = Math.min(((t) Eb.o.e0(lVar)).f3483a, i99);
                int i100 = i97;
                int i101 = ((t) Eb.o.e0(lVar)).f3483a + 1;
                if (i101 <= min2) {
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        f4 = f18;
                        arrayList = arrayList4;
                        i17 = i90;
                        arrayList.add(oVar4.a(i101, j));
                        if (i101 == min2) {
                            break;
                        }
                        i101++;
                        i90 = i17;
                        arrayList4 = arrayList;
                        f18 = f4;
                    }
                } else {
                    i17 = i90;
                    f4 = f18;
                    arrayList = null;
                }
                if (m10 && sVar6 != null) {
                    ?? r52 = sVar6.k;
                    if (!r52.isEmpty()) {
                        ArrayList arrayList5 = arrayList;
                        z8 = m10;
                        for (int size6 = r52.size() - 1; -1 < size6; size6--) {
                            if (((t) r52.get(size6)).f3483a > min2 && (size6 == 0 || ((t) r52.get(size6 - 1)).f3483a <= min2)) {
                                tVar4 = (t) r52.get(size6);
                                break;
                            }
                        }
                        tVar4 = null;
                        t tVar9 = (t) Eb.o.e0(r52);
                        if (tVar4 != null && (i38 = tVar4.f3483a) <= (min = Math.min(tVar9.f3483a, i99))) {
                            int i102 = i38;
                            list2 = arrayList5;
                            while (true) {
                                if (list2 != null) {
                                    i18 = i77;
                                    int size7 = list2.size();
                                    list = list3;
                                    int i103 = 0;
                                    while (true) {
                                        if (i103 >= size7) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = list2.get(i103);
                                        int i104 = size7;
                                        if (((t) obj5).f3483a == i102) {
                                            break;
                                        }
                                        i103++;
                                        size7 = i104;
                                    }
                                    tVar7 = (t) obj5;
                                } else {
                                    list = list3;
                                    i18 = i77;
                                    tVar7 = null;
                                }
                                if (tVar7 == null) {
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(oVar4.a(i102, j));
                                }
                                if (i102 == min) {
                                    break;
                                }
                                i102++;
                                i77 = i18;
                                list3 = list;
                            }
                        } else {
                            list = list3;
                            i18 = i77;
                            list2 = arrayList5;
                        }
                        float f19 = ((sVar6.f3478m - tVar9.f3491l) - tVar9.f3492m) - f16;
                        if (f19 > 0.0f) {
                            int i105 = tVar9.f3483a + 1;
                            int i106 = 0;
                            while (i105 < b2 && i106 < f19) {
                                if (i105 <= min2) {
                                    int b12 = lVar.b();
                                    int i107 = 0;
                                    while (true) {
                                        if (i107 >= b12) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = lVar.get(i107);
                                        if (((t) obj4).f3483a == i105) {
                                            break;
                                        }
                                        i107++;
                                    }
                                    t tVar10 = (t) obj4;
                                    f11 = f19;
                                    tVar5 = tVar10;
                                } else if (list2 != null) {
                                    int size8 = list2.size();
                                    int i108 = 0;
                                    while (true) {
                                        if (i108 >= size8) {
                                            f11 = f19;
                                            tVar6 = 0;
                                            break;
                                        }
                                        tVar6 = list2.get(i108);
                                        f11 = f19;
                                        if (((t) tVar6).f3483a == i105) {
                                            break;
                                        }
                                        i108++;
                                        f19 = f11;
                                    }
                                    tVar5 = tVar6;
                                } else {
                                    f11 = f19;
                                    tVar5 = null;
                                }
                                if (tVar5 != null) {
                                    i105++;
                                    i37 = tVar5.f3493n;
                                } else {
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(oVar4.a(i105, j));
                                    i105++;
                                    i37 = ((t) Eb.o.e0(list2)).f3493n;
                                }
                                i106 += i37;
                                f19 = f11;
                            }
                        }
                        if (list2 != null && ((t) Eb.o.e0(list2)).f3483a > min2) {
                            min2 = ((t) Eb.o.e0(list2)).f3483a;
                        }
                        size = vVar.size();
                        for (i19 = 0; i19 < size; i19++) {
                            int intValue2 = ((Number) vVar.get(i19)).intValue();
                            if (intValue2 > min2) {
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                }
                                list2.add(oVar4.a(intValue2, j));
                            }
                        }
                        if (list2 == null) {
                            list2 = vVar4;
                        }
                        size2 = list2.size();
                        int i109 = i100;
                        for (i20 = 0; i20 < size2; i20++) {
                            i109 = Math.max(i109, ((t) list2.get(i20)).f3494o);
                        }
                        z10 = !kotlin.jvm.internal.l.a(tVar2, lVar.first()) && list.isEmpty() && list2.isEmpty();
                        if (z13) {
                            j10 = h10;
                            i21 = i18;
                        } else {
                            i21 = i109;
                            j10 = h10;
                        }
                        int f20 = V0.b.f(i21, j10);
                        if (z13) {
                            i109 = i18;
                        }
                        int e11 = V0.b.e(i109, j10);
                        int i110 = !z13 ? e11 : f20;
                        int i111 = i11;
                        int i112 = i18;
                        z11 = i112 >= Math.min(i110, i111);
                        if (z11 && i17 != 0) {
                            B.a.c("non-zero itemsScrollOffset");
                        }
                        ArrayList arrayList6 = new ArrayList(list2.size() + list.size() + lVar.b());
                        if (z11) {
                            oVar = oVar4;
                            tVar3 = tVar2;
                            i22 = b2;
                            f10 = f16;
                            jVar = jVar3;
                            bVar = bVar2;
                            c0278w = c0278w2;
                            i23 = i112;
                            i24 = 1;
                            arrayList2 = arrayList6;
                            i25 = i111;
                            sVar = sVar4;
                            int size9 = list.size();
                            int i113 = i17;
                            int i114 = 0;
                            while (i114 < size9) {
                                List list4 = list;
                                t tVar11 = (t) list4.get(i114);
                                i113 -= tVar11.f3493n;
                                tVar11.c(i113, f20, e11);
                                arrayList2.add(tVar11);
                                i114++;
                                list = list4;
                            }
                            int b13 = lVar.b();
                            int i115 = i17;
                            for (int i116 = 0; i116 < b13; i116++) {
                                t tVar12 = (t) lVar.get(i116);
                                tVar12.c(i115, f20, e11);
                                arrayList2.add(tVar12);
                                i115 += tVar12.f3493n;
                            }
                            int size10 = list2.size();
                            for (int i117 = 0; i117 < size10; i117++) {
                                t tVar13 = (t) list2.get(i117);
                                tVar13.c(i115, f20, e11);
                                arrayList2.add(tVar13);
                                i115 += tVar13.f3493n;
                            }
                        } else {
                            if (!list.isEmpty() || !list2.isEmpty()) {
                                B.a.a("no extra items");
                            }
                            int b14 = lVar.b();
                            int[] iArr2 = new int[b14];
                            int i118 = 0;
                            while (i118 < b14) {
                                iArr2[i118] = ((t) lVar.get(i118)).f3492m;
                                i118++;
                                arrayList6 = arrayList6;
                            }
                            ArrayList arrayList7 = arrayList6;
                            int[] iArr3 = new int[b14];
                            if (!z13) {
                                f10 = f16;
                                if (interfaceC0220e == null) {
                                    B.a.b("null horizontalArrangement when isVertical == false");
                                    throw new Db.d(0);
                                }
                                sVar = sVar4;
                                iArr = iArr3;
                                tVar3 = tVar2;
                                arrayList2 = arrayList7;
                                bVar = bVar2;
                                i22 = b2;
                                c0278w = c0278w2;
                                i23 = i112;
                                i25 = i111;
                                jVar = jVar3;
                                i24 = 1;
                                oVar = oVar4;
                                interfaceC0220e.b(c0278w2, i110, iArr2, V0.l.f9982a, iArr);
                            } else {
                                if (interfaceC0222g == null) {
                                    B.a.b("null verticalArrangement when isVertical == true");
                                    throw new Db.d(0);
                                }
                                f10 = f16;
                                interfaceC0222g.c(c0278w2, i110, iArr2, iArr3);
                                iArr = iArr3;
                                oVar = oVar4;
                                tVar3 = tVar2;
                                i22 = b2;
                                c0278w = c0278w2;
                                jVar = jVar3;
                                sVar = sVar4;
                                arrayList2 = arrayList7;
                                i23 = i112;
                                i24 = 1;
                                i25 = i111;
                                bVar = bVar2;
                            }
                            Xb.e eVar3 = new Xb.e(0, b14 - i24, i24);
                            int i119 = eVar3.f11026b;
                            int i120 = eVar3.f11027c;
                            if ((i120 > 0 && i119 >= 0) || (i120 < 0 && i119 <= 0)) {
                                int i121 = 0;
                                while (true) {
                                    int i122 = iArr[i121];
                                    t tVar14 = (t) lVar.get(i121);
                                    tVar14.c(i122, f20, e11);
                                    arrayList2.add(tVar14);
                                    if (i121 == i119) {
                                        break;
                                    }
                                    i121 += i120;
                                }
                            }
                        }
                        bVar.b(f20, e11, arrayList2, sVar, oVar, z8, z12, i16, i23);
                        if (!z8) {
                            bVar.a();
                            if (!V0.k.a(0L, 0L)) {
                                int i123 = z13 ? e11 : f20;
                                f20 = V0.b.f(Math.max(f20, (int) 0), j10);
                                e11 = V0.b.e(Math.max(e11, (int) 0), j10);
                                int i124 = z13 ? e11 : f20;
                                if (i124 != i123) {
                                    int size11 = arrayList2.size();
                                    for (int i125 = 0; i125 < size11; i125++) {
                                        ((t) arrayList2.get(i125)).f3496q = i124;
                                    }
                                }
                            }
                        }
                        jVar.f3415b.getClass();
                        C2069w c2069w2 = AbstractC2058k.f24690a;
                        oVar2 = oVar;
                        C0005a c0005a2 = new C0005a(oVar2, 6);
                        if (this.f3457v != null || arrayList2.isEmpty() || c2069w2.f24728b == 0) {
                            oVar3 = oVar2;
                            i26 = i24;
                            i27 = i74;
                            vVar2 = vVar4;
                        } else {
                            int i126 = ((t) Eb.o.Y(arrayList2)).f3483a;
                            if (((t) Eb.o.e0(arrayList2)).f3483a - i126 < 0 || (i34 = c2069w2.f24728b) == 0) {
                                c2069w = c2069w2;
                            } else {
                                Xb.g I6 = H.I(0, i34);
                                int i127 = I6.f11025a;
                                int i128 = I6.f11026b;
                                if (i127 <= i128) {
                                    int i129 = -1;
                                    for (int i130 = i127; c2069w2.b(i130) <= i126; i130++) {
                                        i129 = c2069w2.b(i130);
                                        if (i130 == i128) {
                                            break;
                                        }
                                    }
                                    i36 = i129;
                                    i35 = -1;
                                } else {
                                    i35 = -1;
                                    i36 = -1;
                                }
                                if (i36 == i35) {
                                    c2069w = AbstractC2058k.f24690a;
                                } else {
                                    C2069w c2069w3 = new C2069w(i24);
                                    c2069w3.a(i36);
                                    c2069w = c2069w3;
                                }
                            }
                            ?? arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList(arrayList2.size());
                            int size12 = arrayList2.size();
                            int i131 = 0;
                            while (i131 < size12) {
                                Object obj6 = arrayList2.get(i131);
                                int i132 = size12;
                                int i133 = ((t) obj6).f3483a;
                                int[] iArr4 = c2069w2.f24727a;
                                o oVar5 = oVar2;
                                int i134 = c2069w2.f24728b;
                                C2069w c2069w4 = c2069w2;
                                int i135 = 0;
                                while (true) {
                                    if (i135 < i134) {
                                        int i136 = i134;
                                        if (iArr4[i135] == i133) {
                                            arrayList9.add(obj6);
                                            break;
                                        }
                                        i135++;
                                        i134 = i136;
                                    }
                                }
                                i131++;
                                size12 = i132;
                                oVar2 = oVar5;
                                c2069w2 = c2069w4;
                            }
                            oVar3 = oVar2;
                            int[] iArr5 = c2069w.f24727a;
                            int i137 = c2069w.f24728b;
                            int i138 = 0;
                            while (i138 < i137) {
                                int i139 = iArr5[i138];
                                Iterator it = arrayList2.iterator();
                                int i140 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i30 = -1;
                                        i140 = -1;
                                        break;
                                    }
                                    if (((t) it.next()).f3483a == i139) {
                                        i30 = -1;
                                        break;
                                    }
                                    i140++;
                                }
                                t tVar15 = i140 == i30 ? (t) c0005a2.invoke(Integer.valueOf(i139)) : (t) arrayList2.remove(i140);
                                int i141 = tVar15.f3493n;
                                int[] iArr6 = iArr5;
                                if (i140 == -1) {
                                    c0005a = c0005a2;
                                    i31 = Integer.MIN_VALUE;
                                } else {
                                    long a16 = tVar15.a(0);
                                    if (tVar15.f3485c) {
                                        c0005a = c0005a2;
                                        j11 = a16 & 4294967295L;
                                    } else {
                                        c0005a = c0005a2;
                                        j11 = a16 >> 32;
                                    }
                                    i31 = (int) j11;
                                }
                                int size13 = arrayList9.size();
                                int i142 = i137;
                                int i143 = 0;
                                while (true) {
                                    if (i143 >= size13) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList9.get(i143);
                                    int i144 = size13;
                                    if (((t) obj3).f3483a != i139) {
                                        break;
                                    }
                                    i143++;
                                    size13 = i144;
                                }
                                t tVar16 = (t) obj3;
                                if (tVar16 != null) {
                                    long a17 = tVar16.a(0);
                                    i32 = (int) (tVar16.f3485c ? a17 & 4294967295L : a17 >> 32);
                                } else {
                                    i32 = Integer.MIN_VALUE;
                                }
                                if (i31 == Integer.MIN_VALUE) {
                                    max = i74;
                                    i33 = max;
                                } else {
                                    i33 = i74;
                                    max = Math.max(i33, i31);
                                }
                                if (i32 != Integer.MIN_VALUE) {
                                    max = Math.min(max, i32 - i141);
                                }
                                tVar15.f3495p = true;
                                tVar15.c(max, f20, e11);
                                arrayList8.add(tVar15);
                                i138++;
                                i74 = i33;
                                c0005a2 = c0005a;
                                iArr5 = iArr6;
                                i137 = i142;
                            }
                            i27 = i74;
                            i26 = 1;
                            vVar2 = arrayList8;
                        }
                        if (z10) {
                            t tVar17 = (t) lVar.z();
                            if (tVar17 != null) {
                                valueOf = Integer.valueOf(tVar17.f3483a);
                                if (z10) {
                                }
                                if (i28 >= i29) {
                                }
                                InterfaceC2317B interfaceC2317B = (InterfaceC2317B) nVar.a(Integer.valueOf(f20), Integer.valueOf(e11), new r(a11.f3386u, arrayList2, vVar2, z8));
                                if (valueOf == null) {
                                }
                                if (valueOf2 == null) {
                                }
                                if (arrayList2.isEmpty()) {
                                }
                                a10 = a11;
                                sVar2 = new s(tVar3, i16, r5, f10, interfaceC2317B, f4, z15, e10, c0278w, oVar3.f3442c, vVar3, i27, i69, i29, !z13 ? V.f27943a : V.f27944b, i44, B14);
                            }
                            valueOf = null;
                            if (z10) {
                            }
                            if (i28 >= i29) {
                            }
                            InterfaceC2317B interfaceC2317B2 = (InterfaceC2317B) nVar.a(Integer.valueOf(f20), Integer.valueOf(e11), new r(a11.f3386u, arrayList2, vVar2, z8));
                            if (valueOf == null) {
                            }
                            if (valueOf2 == null) {
                            }
                            if (arrayList2.isEmpty()) {
                            }
                            a10 = a11;
                            sVar2 = new s(tVar3, i16, r5, f10, interfaceC2317B2, f4, z15, e10, c0278w, oVar3.f3442c, vVar3, i27, i69, i29, !z13 ? V.f27943a : V.f27944b, i44, B14);
                        } else {
                            t tVar18 = (t) Eb.o.Z(arrayList2);
                            if (tVar18 != null) {
                                valueOf = Integer.valueOf(tVar18.f3483a);
                                if (z10) {
                                    t tVar19 = (t) lVar.D();
                                    if (tVar19 != null) {
                                        valueOf2 = Integer.valueOf(tVar19.f3483a);
                                        i28 = i10;
                                        i29 = i22;
                                    }
                                    i28 = i10;
                                    i29 = i22;
                                    valueOf2 = null;
                                } else {
                                    t tVar20 = (t) Eb.o.f0(arrayList2);
                                    if (tVar20 != null) {
                                        valueOf2 = Integer.valueOf(tVar20.f3483a);
                                        i28 = i10;
                                        i29 = i22;
                                    }
                                    i28 = i10;
                                    i29 = i22;
                                    valueOf2 = null;
                                }
                                ?? r53 = (i28 >= i29 || i23 > i25) ? i26 : 0;
                                InterfaceC2317B interfaceC2317B22 = (InterfaceC2317B) nVar.a(Integer.valueOf(f20), Integer.valueOf(e11), new r(a11.f3386u, arrayList2, vVar2, z8));
                                int intValue3 = valueOf == null ? valueOf.intValue() : 0;
                                int intValue4 = valueOf2 == null ? valueOf2.intValue() : 0;
                                if (arrayList2.isEmpty()) {
                                    ?? u02 = Eb.o.u0(vVar2);
                                    int size14 = arrayList2.size();
                                    for (int i145 = 0; i145 < size14; i145++) {
                                        t tVar21 = (t) arrayList2.get(i145);
                                        int i146 = tVar21.f3483a;
                                        if (intValue3 <= i146 && i146 <= intValue4) {
                                            u02.add(tVar21);
                                        }
                                    }
                                    Eb.r.T(u02, F.x.f4022a);
                                    vVar3 = u02;
                                } else {
                                    vVar3 = vVar4;
                                }
                                a10 = a11;
                                sVar2 = new s(tVar3, i16, r53, f10, interfaceC2317B22, f4, z15, e10, c0278w, oVar3.f3442c, vVar3, i27, i69, i29, !z13 ? V.f27943a : V.f27944b, i44, B14);
                            }
                            valueOf = null;
                            if (z10) {
                            }
                            if (i28 >= i29) {
                            }
                            InterfaceC2317B interfaceC2317B222 = (InterfaceC2317B) nVar.a(Integer.valueOf(f20), Integer.valueOf(e11), new r(a11.f3386u, arrayList2, vVar2, z8));
                            if (valueOf == null) {
                            }
                            if (valueOf2 == null) {
                            }
                            if (arrayList2.isEmpty()) {
                            }
                            a10 = a11;
                            sVar2 = new s(tVar3, i16, r53, f10, interfaceC2317B222, f4, z15, e10, c0278w, oVar3.f3442c, vVar3, i27, i69, i29, !z13 ? V.f27943a : V.f27944b, i44, B14);
                        }
                    }
                }
                list = list3;
                i18 = i77;
                z8 = m10;
                list2 = arrayList;
                if (list2 != null) {
                    min2 = ((t) Eb.o.e0(list2)).f3483a;
                }
                size = vVar.size();
                while (i19 < size) {
                }
                if (list2 == null) {
                }
                size2 = list2.size();
                int i1092 = i100;
                while (i20 < size2) {
                }
                if (kotlin.jvm.internal.l.a(tVar2, lVar.first())) {
                }
                if (z13) {
                }
                int f202 = V0.b.f(i21, j10);
                if (z13) {
                }
                int e112 = V0.b.e(i1092, j10);
                if (!z13) {
                }
                int i1112 = i11;
                int i1122 = i18;
                if (i1122 >= Math.min(i110, i1112)) {
                }
                if (z11) {
                    B.a.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList62 = new ArrayList(list2.size() + list.size() + lVar.b());
                if (z11) {
                }
                bVar.b(f202, e112, arrayList2, sVar, oVar, z8, z12, i16, i23);
                if (!z8) {
                }
                jVar.f3415b.getClass();
                C2069w c2069w22 = AbstractC2058k.f24690a;
                oVar2 = oVar;
                C0005a c0005a22 = new C0005a(oVar2, 6);
                if (this.f3457v != null) {
                }
                oVar3 = oVar2;
                i26 = i24;
                i27 = i74;
                vVar2 = vVar4;
                if (z10) {
                }
            }
            s sVar7 = sVar2;
            a10.a(sVar7, interfaceC2332Q.m(), false);
            return sVar7;
        } catch (Throwable th) {
            AbstractC0692s.f(c10, d10, e2);
            throw th;
        }
    }
}
