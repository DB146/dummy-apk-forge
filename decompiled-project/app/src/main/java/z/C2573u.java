package z;

import A0.AbstractC0017g;
import A9.C0096i1;
import i0.C1289b;
import java.util.List;
import u0.C2075e;
import u0.C2080j;
import u0.EnumC2076f;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573u extends Jb.h implements Rb.e {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f28086A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ V f28087B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ S0.a f28088C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ A0.j0 f28089D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C2576x f28090E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C.D f28091F;

    /* renamed from: b, reason: collision with root package name */
    public Object f28092b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28093c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28094d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.u f28095e;

    /* renamed from: f, reason: collision with root package name */
    public A4.f f28096f;

    /* renamed from: u, reason: collision with root package name */
    public C2080j f28097u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28098v;

    /* renamed from: w, reason: collision with root package name */
    public float f28099w;

    /* renamed from: x, reason: collision with root package name */
    public int f28100x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f28101y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C2576x f28102z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2573u(C2576x c2576x, kotlin.jvm.internal.u uVar, V v10, S0.a aVar, A0.j0 j0Var, C2576x c2576x2, C.D d10, Hb.d dVar) {
        super(dVar);
        this.f28102z = c2576x;
        this.f28086A = uVar;
        this.f28087B = v10;
        this.f28088C = aVar;
        this.f28089D = j0Var;
        this.f28090E = c2576x2;
        this.f28091F = d10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2576x c2576x = this.f28090E;
        C.D d10 = this.f28091F;
        C2573u c2573u = new C2573u(this.f28102z, this.f28086A, this.f28087B, this.f28088C, this.f28089D, c2576x, d10, dVar);
        c2573u.f28101y = obj;
        return c2573u;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2573u) create((u0.v) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0533, code lost:
    
        if (r7 == 0.0f) goto L204;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04c0  */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [Rb.e] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x031c -> B:59:0x033e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0437 -> B:71:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x03bb -> B:59:0x033e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x03f8 -> B:59:0x033e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0419 -> B:57:0x041c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0156 -> B:143:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x01d3 -> B:143:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x022c -> B:152:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0225 -> B:144:0x025d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0250 -> B:140:0x0253). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x04b2 -> B:7:0x04b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x02d3 -> B:77:0x0290). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x030a -> B:70:0x030c). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u0.v vVar;
        Object a9;
        u0.v vVar2;
        C2080j c2080j;
        boolean booleanValue;
        Object a10;
        C2080j c2080j2;
        kotlin.jvm.internal.u uVar;
        float f4;
        Object obj2;
        A4.f fVar;
        kotlin.jvm.internal.u uVar2;
        C2080j c2080j3;
        kotlin.jvm.internal.u uVar3;
        u0.v vVar3;
        kotlin.jvm.internal.u uVar4;
        int size;
        int i7;
        List list;
        C2080j c2080j4;
        C2080j c2080j5;
        u0.v vVar4;
        kotlin.jvm.internal.u uVar5;
        C2080j c2080j6;
        Object obj3;
        List list2;
        int i10;
        long j;
        C2080j c2080j7;
        C2080j c2080j8;
        Object obj4;
        float f10;
        kotlin.jvm.internal.u uVar6;
        kotlin.jvm.internal.u uVar7;
        u0.v vVar5;
        Object obj5;
        A4.f fVar2;
        C2075e c2075e;
        int size2;
        int i11;
        ?? r10;
        int size3;
        int i12;
        C2080j c2080j9;
        int size4;
        int i13;
        List list3;
        C2080j c2080j10;
        C2080j c2080j11;
        Object obj6;
        List list4;
        int i14;
        kotlin.jvm.internal.u uVar8;
        kotlin.jvm.internal.u uVar9;
        u0.v vVar6;
        u0.v vVar7;
        C2080j c2080j12;
        Object a11;
        ?? r62;
        kotlin.jvm.internal.u uVar10;
        int size5;
        int i15;
        u0.v vVar8;
        C2080j c2080j13;
        C2080j c2080j14;
        Object obj7;
        int i16;
        Ib.a aVar = Ib.a.f5345a;
        int i17 = this.f28100x;
        kotlin.jvm.internal.u uVar11 = this.f28086A;
        V v10 = this.f28087B;
        long j10 = 0;
        switch (i17) {
            case 0:
                com.bumptech.glide.c.c0(obj);
                vVar = (u0.v) this.f28101y;
                EnumC2076f enumC2076f = EnumC2076f.f24757a;
                this.f28101y = vVar;
                this.f28100x = 1;
                a9 = G0.a(vVar, false, enumC2076f, this);
                if (a9 == aVar) {
                    return aVar;
                }
                vVar2 = vVar;
                c2080j = (C2080j) a9;
                booleanValue = ((Boolean) this.f28102z.invoke()).booleanValue();
                if (!booleanValue) {
                    c2080j.a();
                }
                this.f28101y = vVar2;
                this.f28092b = c2080j;
                this.f28098v = booleanValue;
                this.f28100x = 2;
                a10 = G0.a(vVar2, (r3 & 1) != 0, EnumC2076f.f24758b, this);
                if (a10 == aVar) {
                    return aVar;
                }
                c2080j2 = (C2080j) a10;
                uVar11.f19133a = 0L;
                if (!booleanValue) {
                    uVar = uVar11;
                    if (c2080j == null) {
                        ?? r22 = vVar2.f24806f.f24815G.f24754a;
                        int size6 = r22.size();
                        for (int i18 = 0; i18 < size6; i18++) {
                            if (((C2080j) r22.get(i18)).f24766d) {
                                c2080j7 = c2080j;
                                c2080j8 = c2080j2;
                                EnumC2076f enumC2076f2 = EnumC2076f.f24759c;
                                this.f28101y = vVar2;
                                this.f28092b = c2080j8;
                                this.f28093c = c2080j7;
                                this.f28094d = null;
                                this.f28095e = null;
                                this.f28096f = null;
                                this.f28097u = null;
                                this.f28100x = 5;
                                obj4 = vVar2.a(enumC2076f2, this);
                                if (obj4 == aVar) {
                                    return aVar;
                                }
                                c2075e = (C2075e) obj4;
                                ?? r42 = c2075e.f24754a;
                                size2 = r42.size();
                                i11 = 0;
                                while (true) {
                                    r10 = c2075e.f24754a;
                                    if (i11 < size2) {
                                        if (((C2080j) r42.get(i11)).b()) {
                                            int size7 = r10.size();
                                            for (int i19 = 0; i19 < size7; i19++) {
                                                if (!((C2080j) r10.get(i19)).f24766d) {
                                                }
                                            }
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                size3 = r10.size();
                                for (i12 = 0; i12 < size3; i12++) {
                                    if (((C2080j) r10.get(i12)).f24766d) {
                                        C2080j c2080j15 = (C2080j) Eb.o.Z(r10);
                                        long d10 = C1289b.d(c2080j15 != null ? c2080j15.f24765c : 0L, c2080j8.f24765c);
                                        C2075e c2075e2 = vVar2.f24806f.f24815G;
                                        long j11 = c2080j8.f24763a;
                                        if (!AbstractC2574v.a(c2075e2, j11)) {
                                            u0.y yVar = vVar2.f24806f;
                                            yVar.getClass();
                                            f10 = AbstractC2574v.b(AbstractC0017g.t(yVar).f55N, c2080j8.f24770i);
                                            ?? obj8 = new Object();
                                            obj8.f19133a = j11;
                                            fVar2 = new A4.f(v10, 8, d10);
                                            vVar5 = vVar2;
                                            uVar7 = uVar;
                                            uVar8 = obj8;
                                            this.f28101y = vVar5;
                                            this.f28092b = c2080j8;
                                            this.f28093c = vVar2;
                                            this.f28094d = uVar7;
                                            this.f28095e = uVar8;
                                            this.f28096f = fVar2;
                                            this.f28097u = null;
                                            this.f28099w = f10;
                                            this.f28100x = 6;
                                            obj5 = vVar2.a(EnumC2076f.f24758b, this);
                                            uVar6 = uVar8;
                                            if (obj5 == aVar) {
                                                return aVar;
                                            }
                                            C2075e c2075e3 = (C2075e) obj5;
                                            ?? r11 = c2075e3.f24754a;
                                            size4 = r11.size();
                                            i13 = 0;
                                            list3 = r11;
                                            while (true) {
                                                if (i13 < size4) {
                                                    ?? r15 = list3.get(i13);
                                                    list4 = list3;
                                                    i14 = size4;
                                                    if (u0.u.d(((C2080j) r15).f24763a, uVar6.f19133a)) {
                                                        c2080j10 = r15;
                                                    } else {
                                                        i13++;
                                                        size4 = i14;
                                                        list3 = list4;
                                                    }
                                                } else {
                                                    c2080j10 = null;
                                                }
                                            }
                                            c2080j11 = c2080j10;
                                            if (c2080j11 != null && !c2080j11.b()) {
                                                if (u0.u.b(c2080j11)) {
                                                    ?? r82 = c2075e3.f24754a;
                                                    int size8 = r82.size();
                                                    int i20 = 0;
                                                    while (true) {
                                                        if (i20 < size8) {
                                                            obj6 = r82.get(i20);
                                                            if (!((C2080j) obj6).f24766d) {
                                                                i20++;
                                                            }
                                                        } else {
                                                            obj6 = null;
                                                        }
                                                    }
                                                    C2080j c2080j16 = (C2080j) obj6;
                                                    if (c2080j16 != null) {
                                                        uVar6.f19133a = c2080j16.f24763a;
                                                        uVar8 = uVar6;
                                                    }
                                                } else if ((fVar2.F(c2080j11, f10) & 9223372034707292159L) != 9205357640488583168L) {
                                                    c2080j11.a();
                                                    uVar7.f19133a = u0.u.f(c2080j11, false);
                                                    if (c2080j11.b()) {
                                                        vVar2 = vVar5;
                                                        c2080j2 = c2080j8;
                                                        c2080j = c2080j11;
                                                        if (c2080j == null) {
                                                        }
                                                    } else {
                                                        fVar2.f382b = 0L;
                                                        uVar8 = uVar6;
                                                    }
                                                } else {
                                                    EnumC2076f enumC2076f3 = EnumC2076f.f24759c;
                                                    this.f28101y = vVar5;
                                                    this.f28092b = c2080j8;
                                                    this.f28093c = vVar2;
                                                    this.f28094d = uVar7;
                                                    this.f28095e = uVar6;
                                                    this.f28096f = fVar2;
                                                    this.f28097u = c2080j11;
                                                    this.f28099w = f10;
                                                    this.f28100x = 7;
                                                    uVar9 = uVar6;
                                                    if (vVar2.a(enumC2076f3, this) == aVar) {
                                                        return aVar;
                                                    }
                                                    uVar8 = uVar9;
                                                    if (c2080j11.b()) {
                                                        vVar2 = vVar5;
                                                        c2080j2 = c2080j8;
                                                        c2080j = null;
                                                        if (c2080j == null) {
                                                        }
                                                    }
                                                }
                                                this.f28101y = vVar5;
                                                this.f28092b = c2080j8;
                                                this.f28093c = vVar2;
                                                this.f28094d = uVar7;
                                                this.f28095e = uVar8;
                                                this.f28096f = fVar2;
                                                this.f28097u = null;
                                                this.f28099w = f10;
                                                this.f28100x = 6;
                                                obj5 = vVar2.a(EnumC2076f.f24758b, this);
                                                uVar6 = uVar8;
                                                if (obj5 == aVar) {
                                                }
                                                C2075e c2075e32 = (C2075e) obj5;
                                                ?? r112 = c2075e32.f24754a;
                                                size4 = r112.size();
                                                i13 = 0;
                                                list3 = r112;
                                                while (true) {
                                                    if (i13 < size4) {
                                                    }
                                                    i13++;
                                                    size4 = i14;
                                                    list3 = list4;
                                                }
                                                c2080j11 = c2080j10;
                                                if (c2080j11 != null) {
                                                    if (u0.u.b(c2080j11)) {
                                                    }
                                                    this.f28101y = vVar5;
                                                    this.f28092b = c2080j8;
                                                    this.f28093c = vVar2;
                                                    this.f28094d = uVar7;
                                                    this.f28095e = uVar8;
                                                    this.f28096f = fVar2;
                                                    this.f28097u = null;
                                                    this.f28099w = f10;
                                                    this.f28100x = 6;
                                                    obj5 = vVar2.a(EnumC2076f.f24758b, this);
                                                    uVar6 = uVar8;
                                                    if (obj5 == aVar) {
                                                    }
                                                    C2075e c2075e322 = (C2075e) obj5;
                                                    ?? r1122 = c2075e322.f24754a;
                                                    size4 = r1122.size();
                                                    i13 = 0;
                                                    list3 = r1122;
                                                    while (true) {
                                                        if (i13 < size4) {
                                                        }
                                                        i13++;
                                                        size4 = i14;
                                                        list3 = list4;
                                                    }
                                                    c2080j11 = c2080j10;
                                                    if (c2080j11 != null) {
                                                    }
                                                }
                                            }
                                            vVar2 = vVar5;
                                        }
                                        c2080j2 = c2080j8;
                                        c2080j = null;
                                        if (c2080j == null) {
                                        }
                                    }
                                }
                                c2080j2 = c2080j8;
                                c2080j = c2080j7;
                                if (c2080j == null) {
                                }
                            }
                        }
                    }
                    if (c2080j != null) {
                        kotlin.jvm.internal.u uVar12 = uVar;
                        this.f28088C.a(c2080j2, c2080j, new C1289b(uVar12.f19133a));
                        long j12 = uVar12.f19133a;
                        A0.j0 j0Var = this.f28089D;
                        q3.f.e((C0096i1) j0Var.f247b, c2080j);
                        ec.d dVar = ((p0) j0Var.f248c).f28053I;
                        if (dVar != null) {
                            dVar.h(new C2570q(j12));
                        }
                        C2075e c2075e4 = vVar2.f24806f.f24815G;
                        long j13 = c2080j.f24763a;
                        if (AbstractC2574v.a(c2075e4, j13)) {
                            c2080j9 = null;
                            if (c2080j9 == null) {
                                this.f28090E.invoke();
                            } else {
                                this.f28091F.invoke(c2080j9);
                            }
                        }
                        ?? obj9 = new Object();
                        obj9.f19133a = j13;
                        vVar7 = vVar2;
                        vVar6 = vVar7;
                        A0.j0 j0Var2 = j0Var;
                        kotlin.jvm.internal.u uVar13 = obj9;
                        this.f28101y = vVar6;
                        this.f28092b = j0Var2;
                        this.f28093c = v10;
                        this.f28094d = vVar7;
                        this.f28095e = uVar13;
                        c2080j12 = null;
                        this.f28096f = null;
                        this.f28097u = null;
                        this.f28100x = 8;
                        a11 = vVar7.a(EnumC2076f.f24758b, this);
                        uVar10 = uVar13;
                        r62 = j0Var2;
                        if (a11 == aVar) {
                            return aVar;
                        }
                        C2075e c2075e5 = (C2075e) a11;
                        ?? r52 = c2075e5.f24754a;
                        size5 = r52.size();
                        i15 = 0;
                        while (true) {
                            if (i15 >= size5) {
                                c2080j13 = r52.get(i15);
                                vVar8 = vVar6;
                                i16 = size5;
                                if (!u0.u.d(((C2080j) c2080j13).f24763a, uVar10.f19133a)) {
                                    i15++;
                                    vVar6 = vVar8;
                                    size5 = i16;
                                }
                            } else {
                                vVar8 = vVar6;
                                c2080j13 = c2080j12;
                            }
                        }
                        c2080j14 = c2080j13;
                        if (c2080j14 == null) {
                            if (!u0.u.b(c2080j14)) {
                                long f11 = u0.u.f(c2080j14, true);
                                break;
                            } else {
                                ?? r43 = c2075e5.f24754a;
                                int size9 = r43.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size9) {
                                        obj7 = r43.get(i21);
                                        if (!((C2080j) obj7).f24766d) {
                                            i21++;
                                        }
                                    } else {
                                        obj7 = c2080j12;
                                    }
                                }
                                C2080j c2080j17 = (C2080j) obj7;
                                if (c2080j17 != null) {
                                    uVar10.f19133a = c2080j17.f24763a;
                                }
                            }
                            vVar6 = vVar8;
                            uVar13 = uVar10;
                            j0Var2 = r62;
                            this.f28101y = vVar6;
                            this.f28092b = j0Var2;
                            this.f28093c = v10;
                            this.f28094d = vVar7;
                            this.f28095e = uVar13;
                            c2080j12 = null;
                            this.f28096f = null;
                            this.f28097u = null;
                            this.f28100x = 8;
                            a11 = vVar7.a(EnumC2076f.f24758b, this);
                            uVar10 = uVar13;
                            r62 = j0Var2;
                            if (a11 == aVar) {
                            }
                            C2075e c2075e52 = (C2075e) a11;
                            ?? r522 = c2075e52.f24754a;
                            size5 = r522.size();
                            i15 = 0;
                            while (true) {
                                if (i15 >= size5) {
                                }
                                i15++;
                                vVar6 = vVar8;
                                size5 = i16;
                            }
                            c2080j14 = c2080j13;
                            if (c2080j14 == null) {
                                c2080j14 = c2080j12;
                            }
                        }
                        if (c2080j14 == null || c2080j14.b()) {
                            c2080j9 = c2080j12;
                        } else if (u0.u.b(c2080j14)) {
                            r62.invoke(c2080j14, new C1289b(u0.u.f(c2080j14, false)));
                            c2080j14.a();
                            j13 = c2080j14.f24763a;
                            j0Var = r62;
                            vVar2 = vVar8;
                            ?? obj92 = new Object();
                            obj92.f19133a = j13;
                            vVar7 = vVar2;
                            vVar6 = vVar7;
                            A0.j0 j0Var22 = j0Var;
                            kotlin.jvm.internal.u uVar132 = obj92;
                            this.f28101y = vVar6;
                            this.f28092b = j0Var22;
                            this.f28093c = v10;
                            this.f28094d = vVar7;
                            this.f28095e = uVar132;
                            c2080j12 = null;
                            this.f28096f = null;
                            this.f28097u = null;
                            this.f28100x = 8;
                            a11 = vVar7.a(EnumC2076f.f24758b, this);
                            uVar10 = uVar132;
                            r62 = j0Var22;
                            if (a11 == aVar) {
                            }
                            C2075e c2075e522 = (C2075e) a11;
                            ?? r5222 = c2075e522.f24754a;
                            size5 = r5222.size();
                            i15 = 0;
                            while (true) {
                                if (i15 >= size5) {
                                }
                                i15++;
                                vVar6 = vVar8;
                                size5 = i16;
                            }
                            c2080j14 = c2080j13;
                            if (c2080j14 == null) {
                            }
                            if (c2080j14 == null) {
                                if (u0.u.b(c2080j14)) {
                                }
                            }
                            c2080j9 = c2080j12;
                        } else {
                            c2080j9 = c2080j14;
                        }
                        if (c2080j9 == null) {
                        }
                    }
                    return Db.q.f3365a;
                }
                j = c2080j2.f24763a;
                if (!AbstractC2574v.a(vVar2.f24806f.f24815G, j)) {
                    uVar = uVar11;
                    c2080j5 = null;
                    if (c2080j5 != null || c2080j5.b()) {
                        c2080j = c2080j5;
                        if (c2080j == null) {
                        }
                        if (c2080j != null) {
                        }
                        return Db.q.f3365a;
                    }
                    uVar11 = uVar;
                    j10 = 0;
                    j = c2080j2.f24763a;
                    if (!AbstractC2574v.a(vVar2.f24806f.f24815G, j)) {
                        u0.y yVar2 = vVar2.f24806f;
                        yVar2.getClass();
                        f4 = AbstractC2574v.b(AbstractC0017g.t(yVar2).f55N, c2080j2.f24770i);
                        ?? obj10 = new Object();
                        obj10.f19133a = j;
                        uVar3 = uVar11;
                        fVar = new A4.f(v10, 8, j10);
                        c2080j3 = c2080j2;
                        vVar3 = vVar2;
                        kotlin.jvm.internal.u uVar14 = obj10;
                        this.f28101y = vVar3;
                        this.f28092b = c2080j3;
                        this.f28093c = vVar2;
                        this.f28094d = uVar3;
                        this.f28095e = uVar14;
                        this.f28096f = fVar;
                        this.f28097u = null;
                        this.f28099w = f4;
                        this.f28100x = 3;
                        obj2 = vVar2.a(EnumC2076f.f24758b, this);
                        uVar2 = uVar14;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        C2075e c2075e6 = (C2075e) obj2;
                        ?? r44 = c2075e6.f24754a;
                        size = r44.size();
                        i7 = 0;
                        list = r44;
                        while (true) {
                            if (i7 >= size) {
                                ?? r113 = list.get(i7);
                                list2 = list;
                                c2080j4 = r113;
                                i10 = size;
                                uVar = uVar11;
                                if (!u0.u.d(((C2080j) r113).f24763a, uVar2.f19133a)) {
                                    i7++;
                                    list = list2;
                                    size = i10;
                                    uVar11 = uVar;
                                }
                            } else {
                                uVar = uVar11;
                                c2080j4 = null;
                            }
                        }
                        c2080j5 = c2080j4;
                        if (c2080j5 != null && !c2080j5.b()) {
                            if (u0.u.b(c2080j5)) {
                                long F10 = fVar.F(c2080j5, f4);
                                if ((F10 & 9223372034707292159L) != 9205357640488583168L) {
                                    c2080j5.a();
                                    uVar3.f19133a = F10;
                                    if (c2080j5.b()) {
                                        vVar2 = vVar3;
                                        c2080j2 = c2080j3;
                                        if (c2080j5 != null) {
                                        }
                                        c2080j = c2080j5;
                                        if (c2080j == null) {
                                        }
                                        if (c2080j != null) {
                                        }
                                        return Db.q.f3365a;
                                    }
                                    fVar.f382b = 0L;
                                    uVar4 = uVar2;
                                } else {
                                    EnumC2076f enumC2076f4 = EnumC2076f.f24759c;
                                    this.f28101y = vVar3;
                                    this.f28092b = c2080j3;
                                    this.f28093c = vVar2;
                                    this.f28094d = uVar3;
                                    this.f28095e = uVar2;
                                    this.f28096f = fVar;
                                    this.f28097u = c2080j5;
                                    this.f28099w = f4;
                                    this.f28100x = 4;
                                    if (vVar2.a(enumC2076f4, this) == aVar) {
                                        return aVar;
                                    }
                                    vVar4 = vVar3;
                                    uVar5 = uVar2;
                                    c2080j6 = c2080j5;
                                    if (!c2080j6.b()) {
                                        c2080j2 = c2080j3;
                                        vVar2 = vVar4;
                                        c2080j5 = null;
                                        if (c2080j5 != null) {
                                        }
                                        c2080j = c2080j5;
                                        if (c2080j == null) {
                                        }
                                        if (c2080j != null) {
                                        }
                                        return Db.q.f3365a;
                                    }
                                    uVar4 = uVar5;
                                    vVar3 = vVar4;
                                }
                            } else {
                                ?? r32 = c2075e6.f24754a;
                                int size10 = r32.size();
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size10) {
                                        obj3 = r32.get(i22);
                                        if (!((C2080j) obj3).f24766d) {
                                            i22++;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                C2080j c2080j18 = (C2080j) obj3;
                                if (c2080j18 != null) {
                                    uVar2.f19133a = c2080j18.f24763a;
                                    uVar4 = uVar2;
                                }
                            }
                            uVar11 = uVar;
                            uVar14 = uVar4;
                            this.f28101y = vVar3;
                            this.f28092b = c2080j3;
                            this.f28093c = vVar2;
                            this.f28094d = uVar3;
                            this.f28095e = uVar14;
                            this.f28096f = fVar;
                            this.f28097u = null;
                            this.f28099w = f4;
                            this.f28100x = 3;
                            obj2 = vVar2.a(EnumC2076f.f24758b, this);
                            uVar2 = uVar14;
                            if (obj2 == aVar) {
                            }
                            C2075e c2075e62 = (C2075e) obj2;
                            ?? r442 = c2075e62.f24754a;
                            size = r442.size();
                            i7 = 0;
                            list = r442;
                            while (true) {
                                if (i7 >= size) {
                                }
                                i7++;
                                list = list2;
                                size = i10;
                                uVar11 = uVar;
                            }
                            c2080j5 = c2080j4;
                            if (c2080j5 != null) {
                                if (u0.u.b(c2080j5)) {
                                }
                                uVar11 = uVar;
                                uVar14 = uVar4;
                                this.f28101y = vVar3;
                                this.f28092b = c2080j3;
                                this.f28093c = vVar2;
                                this.f28094d = uVar3;
                                this.f28095e = uVar14;
                                this.f28096f = fVar;
                                this.f28097u = null;
                                this.f28099w = f4;
                                this.f28100x = 3;
                                obj2 = vVar2.a(EnumC2076f.f24758b, this);
                                uVar2 = uVar14;
                                if (obj2 == aVar) {
                                }
                                C2075e c2075e622 = (C2075e) obj2;
                                ?? r4422 = c2075e622.f24754a;
                                size = r4422.size();
                                i7 = 0;
                                list = r4422;
                                while (true) {
                                    if (i7 >= size) {
                                    }
                                    i7++;
                                    list = list2;
                                    size = i10;
                                    uVar11 = uVar;
                                }
                                c2080j5 = c2080j4;
                                if (c2080j5 != null) {
                                }
                            }
                        }
                        vVar2 = vVar3;
                        c2080j2 = c2080j3;
                        c2080j5 = null;
                        if (c2080j5 != null) {
                        }
                        c2080j = c2080j5;
                        if (c2080j == null) {
                        }
                        if (c2080j != null) {
                        }
                        return Db.q.f3365a;
                    }
                }
            case 1:
                vVar = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                a9 = obj;
                vVar2 = vVar;
                c2080j = (C2080j) a9;
                booleanValue = ((Boolean) this.f28102z.invoke()).booleanValue();
                if (!booleanValue) {
                }
                this.f28101y = vVar2;
                this.f28092b = c2080j;
                this.f28098v = booleanValue;
                this.f28100x = 2;
                a10 = G0.a(vVar2, (r3 & 1) != 0, EnumC2076f.f24758b, this);
                if (a10 == aVar) {
                }
                c2080j2 = (C2080j) a10;
                uVar11.f19133a = 0L;
                if (!booleanValue) {
                }
                j = c2080j2.f24763a;
                if (!AbstractC2574v.a(vVar2.f24806f.f24815G, j)) {
                }
                break;
            case 2:
                booleanValue = this.f28098v;
                c2080j = (C2080j) this.f28092b;
                vVar2 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                a10 = obj;
                c2080j2 = (C2080j) a10;
                uVar11.f19133a = 0L;
                if (!booleanValue) {
                }
                j = c2080j2.f24763a;
                if (!AbstractC2574v.a(vVar2.f24806f.f24815G, j)) {
                }
                break;
            case 3:
                f4 = this.f28099w;
                A4.f fVar3 = this.f28096f;
                kotlin.jvm.internal.u uVar15 = this.f28095e;
                kotlin.jvm.internal.u uVar16 = (kotlin.jvm.internal.u) this.f28094d;
                u0.v vVar9 = (u0.v) this.f28093c;
                C2080j c2080j19 = (C2080j) this.f28092b;
                u0.v vVar10 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                obj2 = obj;
                fVar = fVar3;
                uVar2 = uVar15;
                vVar2 = vVar9;
                c2080j3 = c2080j19;
                uVar3 = uVar16;
                vVar3 = vVar10;
                C2075e c2075e6222 = (C2075e) obj2;
                ?? r44222 = c2075e6222.f24754a;
                size = r44222.size();
                i7 = 0;
                list = r44222;
                while (true) {
                    if (i7 >= size) {
                    }
                    i7++;
                    list = list2;
                    size = i10;
                    uVar11 = uVar;
                }
                c2080j5 = c2080j4;
                if (c2080j5 != null) {
                }
                vVar2 = vVar3;
                c2080j2 = c2080j3;
                c2080j5 = null;
                if (c2080j5 != null) {
                }
                c2080j = c2080j5;
                if (c2080j == null) {
                }
                if (c2080j != null) {
                }
                return Db.q.f3365a;
            case 4:
                f4 = this.f28099w;
                c2080j6 = this.f28097u;
                A4.f fVar4 = this.f28096f;
                uVar5 = this.f28095e;
                kotlin.jvm.internal.u uVar17 = (kotlin.jvm.internal.u) this.f28094d;
                u0.v vVar11 = (u0.v) this.f28093c;
                C2080j c2080j20 = (C2080j) this.f28092b;
                vVar4 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                uVar = uVar11;
                fVar = fVar4;
                vVar2 = vVar11;
                uVar3 = uVar17;
                c2080j3 = c2080j20;
                if (!c2080j6.b()) {
                }
                break;
            case 5:
                c2080j7 = (C2080j) this.f28093c;
                c2080j8 = (C2080j) this.f28092b;
                vVar2 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                uVar = uVar11;
                obj4 = obj;
                c2075e = (C2075e) obj4;
                ?? r422 = c2075e.f24754a;
                size2 = r422.size();
                i11 = 0;
                while (true) {
                    r10 = c2075e.f24754a;
                    if (i11 < size2) {
                    }
                    i11++;
                }
                size3 = r10.size();
                while (i12 < size3) {
                }
                c2080j2 = c2080j8;
                c2080j = c2080j7;
                if (c2080j == null) {
                }
                if (c2080j != null) {
                }
                return Db.q.f3365a;
            case 6:
                float f12 = this.f28099w;
                A4.f fVar5 = this.f28096f;
                kotlin.jvm.internal.u uVar18 = this.f28095e;
                kotlin.jvm.internal.u uVar19 = (kotlin.jvm.internal.u) this.f28094d;
                u0.v vVar12 = (u0.v) this.f28093c;
                C2080j c2080j21 = (C2080j) this.f28092b;
                u0.v vVar13 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                f10 = f12;
                uVar = uVar11;
                uVar6 = uVar18;
                uVar7 = uVar19;
                vVar2 = vVar12;
                vVar5 = vVar13;
                obj5 = obj;
                fVar2 = fVar5;
                c2080j8 = c2080j21;
                C2075e c2075e3222 = (C2075e) obj5;
                ?? r11222 = c2075e3222.f24754a;
                size4 = r11222.size();
                i13 = 0;
                list3 = r11222;
                while (true) {
                    if (i13 < size4) {
                    }
                    i13++;
                    size4 = i14;
                    list3 = list4;
                }
                c2080j11 = c2080j10;
                if (c2080j11 != null) {
                }
                vVar2 = vVar5;
                c2080j2 = c2080j8;
                c2080j = null;
                if (c2080j == null) {
                }
                if (c2080j != null) {
                }
                return Db.q.f3365a;
            case 7:
                float f13 = this.f28099w;
                c2080j11 = this.f28097u;
                A4.f fVar6 = this.f28096f;
                kotlin.jvm.internal.u uVar20 = this.f28095e;
                kotlin.jvm.internal.u uVar21 = (kotlin.jvm.internal.u) this.f28094d;
                u0.v vVar14 = (u0.v) this.f28093c;
                C2080j c2080j22 = (C2080j) this.f28092b;
                u0.v vVar15 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                f10 = f13;
                uVar = uVar11;
                uVar7 = uVar21;
                vVar2 = vVar14;
                vVar5 = vVar15;
                fVar2 = fVar6;
                uVar9 = uVar20;
                c2080j8 = c2080j22;
                uVar8 = uVar9;
                if (c2080j11.b()) {
                }
                this.f28101y = vVar5;
                this.f28092b = c2080j8;
                this.f28093c = vVar2;
                this.f28094d = uVar7;
                this.f28095e = uVar8;
                this.f28096f = fVar2;
                this.f28097u = null;
                this.f28099w = f10;
                this.f28100x = 6;
                obj5 = vVar2.a(EnumC2076f.f24758b, this);
                uVar6 = uVar8;
                if (obj5 == aVar) {
                }
                C2075e c2075e32222 = (C2075e) obj5;
                ?? r112222 = c2075e32222.f24754a;
                size4 = r112222.size();
                i13 = 0;
                list3 = r112222;
                while (true) {
                    if (i13 < size4) {
                    }
                    i13++;
                    size4 = i14;
                    list3 = list4;
                }
                c2080j11 = c2080j10;
                if (c2080j11 != null) {
                }
                vVar2 = vVar5;
                c2080j2 = c2080j8;
                c2080j = null;
                if (c2080j == null) {
                }
                if (c2080j != null) {
                }
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                kotlin.jvm.internal.u uVar22 = this.f28095e;
                vVar7 = (u0.v) this.f28094d;
                V v11 = (V) this.f28093c;
                Rb.e eVar = (Rb.e) this.f28092b;
                vVar6 = (u0.v) this.f28101y;
                com.bumptech.glide.c.c0(obj);
                a11 = obj;
                v10 = v11;
                c2080j12 = null;
                uVar10 = uVar22;
                r62 = eVar;
                C2075e c2075e5222 = (C2075e) a11;
                ?? r52222 = c2075e5222.f24754a;
                size5 = r52222.size();
                i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                    }
                    i15++;
                    vVar6 = vVar8;
                    size5 = i16;
                }
                c2080j14 = c2080j13;
                if (c2080j14 == null) {
                }
                if (c2080j14 == null) {
                }
                c2080j9 = c2080j12;
                if (c2080j9 == null) {
                }
                return Db.q.f3365a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
