package K0;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import i0.C1289b;
import j0.AbstractC1362A;
import java.util.ArrayList;
import java.util.List;
import y7.u0;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5962a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f5951b = new t(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final t f5952c = new t(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final t f5953d = new t(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final t f5954e = new t(2, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final t f5955f = new t(2, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final t f5956u = new t(2, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final t f5957v = new t(2, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final t f5958w = new t(2, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final t f5959x = new t(2, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final t f5960y = new t(2, 9);

    /* renamed from: z, reason: collision with root package name */
    public static final t f5961z = new t(2, 10);

    /* renamed from: A, reason: collision with root package name */
    public static final t f5937A = new t(2, 11);

    /* renamed from: B, reason: collision with root package name */
    public static final t f5938B = new t(2, 12);

    /* renamed from: C, reason: collision with root package name */
    public static final t f5939C = new t(2, 13);

    /* renamed from: D, reason: collision with root package name */
    public static final t f5940D = new t(2, 14);

    /* renamed from: E, reason: collision with root package name */
    public static final t f5941E = new t(2, 15);

    /* renamed from: F, reason: collision with root package name */
    public static final t f5942F = new t(2, 16);

    /* renamed from: G, reason: collision with root package name */
    public static final t f5943G = new t(2, 17);

    /* renamed from: H, reason: collision with root package name */
    public static final t f5944H = new t(2, 18);

    /* renamed from: I, reason: collision with root package name */
    public static final t f5945I = new t(2, 19);

    /* renamed from: J, reason: collision with root package name */
    public static final t f5946J = new t(2, 20);

    /* renamed from: K, reason: collision with root package name */
    public static final t f5947K = new t(2, 21);
    public static final t L = new t(2, 22);

    /* renamed from: M, reason: collision with root package name */
    public static final t f5948M = new t(2, 23);

    /* renamed from: N, reason: collision with root package name */
    public static final t f5949N = new t(2, 24);

    /* renamed from: O, reason: collision with root package name */
    public static final t f5950O = new t(2, 25);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i7, int i10) {
        super(i7);
        this.f5962a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        EnumC0376f enumC0376f;
        Object a9;
        int i7 = 0;
        switch (this.f5962a) {
            case 0:
                C0374d c0374d = (C0374d) obj2;
                return u0.f(c0374d.f5871b, v.a(c0374d.f5870a, v.f5965a, (Z.b) obj));
            case 1:
                Z.b bVar = (Z.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i7 < size) {
                    arrayList.add(v.a((C0373c) list.get(i7), v.f5966b, bVar));
                    i7++;
                }
                return arrayList;
            case 2:
                Z.b bVar2 = (Z.b) obj;
                C0373c c0373c = (C0373c) obj2;
                Object obj3 = c0373c.f5866a;
                if (obj3 instanceof p) {
                    enumC0376f = EnumC0376f.f5875a;
                } else if (obj3 instanceof x) {
                    enumC0376f = EnumC0376f.f5876b;
                } else if (obj3 instanceof H) {
                    enumC0376f = EnumC0376f.f5877c;
                } else if (obj3 instanceof G) {
                    enumC0376f = EnumC0376f.f5878d;
                } else if (obj3 instanceof i) {
                    enumC0376f = EnumC0376f.f5879e;
                } else if (obj3 instanceof C0378h) {
                    enumC0376f = EnumC0376f.f5880f;
                } else {
                    if (!(obj3 instanceof A)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0376f = EnumC0376f.f5881u;
                }
                int ordinal = enumC0376f.ordinal();
                Object obj4 = c0373c.f5866a;
                switch (ordinal) {
                    case 0:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        a9 = v.a((p) obj4, v.g, bVar2);
                        break;
                    case 1:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        a9 = v.a((x) obj4, v.f5971h, bVar2);
                        break;
                    case 2:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        a9 = v.a((H) obj4, v.f5967c, bVar2);
                        break;
                    case 3:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        a9 = v.a((G) obj4, v.f5968d, bVar2);
                        break;
                    case 4:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        a9 = v.a((i) obj4, v.f5969e, bVar2);
                        break;
                    case 5:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        a9 = v.a((C0378h) obj4, v.f5970f, bVar2);
                        break;
                    case 6:
                        kotlin.jvm.internal.l.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        q3.s sVar = v.f5965a;
                        a9 = ((A) obj4).f5832a;
                        break;
                    default:
                        throw new Db.d(1);
                }
                return u0.f(enumC0376f, a9, Integer.valueOf(c0373c.f5867b), Integer.valueOf(c0373c.f5868c), c0373c.f5869d);
            case 3:
                return Float.valueOf(((U0.a) obj2).f9414a);
            case 4:
                C0378h c0378h = (C0378h) obj2;
                return u0.f(c0378h.f5883a, v.a(c0378h.f5884b, v.f5972i, (Z.b) obj));
            case 5:
                long j = ((j0.n) obj2).f18554a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC1362A.z(j));
            case 6:
                return Integer.valueOf(((N0.k) obj2).f7143a);
            case 7:
                U0.i iVar = (U0.i) obj2;
                U0.f fVar = new U0.f(iVar.f9426a);
                q3.s sVar2 = v.f5965a;
                return u0.f(fVar, new U0.h(iVar.f9427b), new Object());
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                i iVar2 = (i) obj2;
                return u0.f(iVar2.f5885a, v.a(iVar2.f5886b, v.f5972i, (Z.b) obj));
            case 9:
                Z.b bVar3 = (Z.b) obj;
                List list2 = ((Q0.b) obj2).f8599a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i7 < size2) {
                    arrayList2.add(v.a((Q0.a) list2.get(i7), v.f5981t, bVar3));
                    i7++;
                }
                return arrayList2;
            case 10:
                return ((Q0.a) obj2).f8597a.toLanguageTag();
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                long j10 = ((C1289b) obj2).f18172a;
                if (C1289b.b(j10, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)));
                q3.s sVar3 = v.f5965a;
                return u0.f(valueOf, Float.valueOf(Float.intBitsToFloat((int) (4294967295L & j10))));
            case 12:
                Z.b bVar4 = (Z.b) obj;
                p pVar = (p) obj2;
                U0.k kVar = new U0.k(pVar.f5925a);
                q3.s sVar4 = v.f5965a;
                U0.m mVar = new U0.m(pVar.f5926b);
                Object a10 = v.a(new V0.n(pVar.f5927c), v.f5978q, bVar4);
                U0.r rVar = U0.r.f9442c;
                Object a11 = v.a(pVar.f5928d, v.f5973l, bVar4);
                Object a12 = v.a(pVar.f5929e, w.f5983a, bVar4);
                U0.i iVar3 = U0.i.f9425c;
                return u0.f(kVar, mVar, a10, a11, a12, v.a(pVar.f5930f, v.f5982u, bVar4), v.a(new U0.e(pVar.g), w.f5984b, bVar4), new U0.d(pVar.f5931h), v.a(pVar.f5932i, w.f5985c, bVar4));
            case 13:
                Z.b bVar5 = (Z.b) obj;
                j0.C c10 = (j0.C) obj2;
                return u0.f(v.a(new j0.n(c10.f18512a), v.f5977p, bVar5), v.a(new C1289b(c10.f18513b), v.f5979r, bVar5), Float.valueOf(c10.f18514c));
            case 14:
                Z.b bVar6 = (Z.b) obj;
                x xVar = (x) obj2;
                j0.n nVar = new j0.n(xVar.f5986a.b());
                u uVar = v.f5977p;
                Object a13 = v.a(nVar, uVar, bVar6);
                V0.n nVar2 = new V0.n(xVar.f5987b);
                u uVar2 = v.f5978q;
                Object a14 = v.a(nVar2, uVar2, bVar6);
                N0.k kVar2 = N0.k.f7139b;
                Object a15 = v.a(xVar.f5988c, v.f5974m, bVar6);
                Object a16 = v.a(new V0.n(xVar.f5992h), uVar2, bVar6);
                Object a17 = v.a(xVar.f5993i, v.f5975n, bVar6);
                Object a18 = v.a(xVar.j, v.k, bVar6);
                Q0.b bVar7 = Q0.b.f8598c;
                Object a19 = v.a(xVar.k, v.f5980s, bVar6);
                Object a20 = v.a(new j0.n(xVar.f5994l), uVar, bVar6);
                Object a21 = v.a(xVar.f5995m, v.j, bVar6);
                j0.C c11 = j0.C.f18511d;
                return u0.f(a13, a14, a15, xVar.f5989d, xVar.f5990e, -1, xVar.g, a16, a17, a18, a19, a20, a21, v.a(xVar.f5996n, v.f5976o, bVar6));
            case 15:
                return Integer.valueOf(((U0.l) obj2).f9434a);
            case 16:
                U0.q qVar = (U0.q) obj2;
                return u0.f(Float.valueOf(qVar.f9440a), Float.valueOf(qVar.f9441b));
            case 17:
                Z.b bVar8 = (Z.b) obj;
                U0.r rVar2 = (U0.r) obj2;
                V0.n nVar3 = new V0.n(rVar2.f9443a);
                u uVar3 = v.f5978q;
                return u0.f(v.a(nVar3, uVar3, bVar8), v.a(new V0.n(rVar2.f9444b), uVar3, bVar8));
            case 18:
                Z.b bVar9 = (Z.b) obj;
                D d10 = (D) obj2;
                x xVar2 = d10.f5847a;
                q3.s sVar5 = v.f5971h;
                return u0.f(v.a(xVar2, sVar5, bVar9), v.a(d10.f5848b, sVar5, bVar9), v.a(d10.f5849c, sVar5, bVar9), v.a(d10.f5850d, sVar5, bVar9));
            case 19:
                long j11 = ((E) obj2).f5853a;
                int i10 = E.f5852c;
                Integer valueOf2 = Integer.valueOf((int) (j11 >> 32));
                q3.s sVar6 = v.f5965a;
                return u0.f(valueOf2, Integer.valueOf((int) (4294967295L & j11)));
            case 20:
                long j12 = ((V0.n) obj2).f9988a;
                if (V0.n.a(j12, V0.n.f9987c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(V0.n.c(j12));
                q3.s sVar7 = v.f5965a;
                return u0.f(valueOf3, new V0.o(V0.n.b(j12)));
            case 21:
                String str = ((G) obj2).f5858a;
                q3.s sVar8 = v.f5965a;
                return str;
            case 22:
                String str2 = ((H) obj2).f5859a;
                q3.s sVar9 = v.f5965a;
                return str2;
            case 23:
                return Integer.valueOf(((U0.e) obj2).f9419a);
            case 24:
                Boolean valueOf4 = Boolean.valueOf(((r) obj2).f5935a);
                q3.s sVar10 = v.f5965a;
                return u0.f(valueOf4, new Object());
            default:
                U0.t tVar = (U0.t) obj2;
                U0.s sVar11 = new U0.s(tVar.f9448a);
                q3.s sVar12 = v.f5965a;
                return u0.f(sVar11, Boolean.valueOf(tVar.f9449b));
        }
    }
}
