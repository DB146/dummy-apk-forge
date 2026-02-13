package F;

import A0.G0;
import B0.Z;
import Q.C0487e0;
import ea.C1111f;
import o4.C1798l;
import x.AbstractC2232b;
import x.AbstractC2243m;
import x.C2236f;
import x.C2238h;
import y0.C2331P;
import z.AbstractC2536H;
import z.C2541M;
import z.C2565l;
import z.r0;
import z.t0;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276u extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0276u(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(1);
        this.f4009a = i7;
        this.f4010b = obj;
        this.f4011c = obj2;
        this.f4012d = obj3;
        this.f4013e = obj4;
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r13v6, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v18, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f4009a) {
            case 0:
                G0 g02 = new G0((r) this.f4011c, (C2331P) this.f4012d, (T) this.f4013e, 15);
                D d10 = (D) this.f4010b;
                d10.f3903c = g02;
                return new Z(d10, 2);
            case 1:
                C2236f c2236f = (C2236f) obj;
                Y.k kVar = (Y.k) this.f4010b;
                AbstractC2232b.l(c2236f, (C2238h) kVar.f11056c);
                C0487e0 c0487e0 = c2236f.f26082e;
                Object value = c0487e0.getValue();
                AbstractC2243m abstractC2243m = (AbstractC2243m) kVar.g;
                AbstractC2243m abstractC2243m2 = (AbstractC2243m) kVar.f11061i;
                boolean a9 = kotlin.jvm.internal.l.a(abstractC2243m2, abstractC2243m);
                AbstractC2243m abstractC2243m3 = (AbstractC2243m) kVar.j;
                if (!a9 || !kotlin.jvm.internal.l.a(abstractC2243m3, (AbstractC2243m) kVar.f11060h)) {
                    C1111f c1111f = (C1111f) kVar.f11054a;
                    AbstractC2243m abstractC2243m4 = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(value);
                    int b2 = abstractC2243m4.b();
                    boolean z8 = false;
                    for (int i7 = 0; i7 < b2; i7++) {
                        if (abstractC2243m4.a(i7) < abstractC2243m2.a(i7) || abstractC2243m4.a(i7) > abstractC2243m3.a(i7)) {
                            abstractC2243m4.e(i7, h3.H.j(abstractC2243m4.a(i7), abstractC2243m2.a(i7), abstractC2243m3.a(i7)));
                            z8 = true;
                        }
                    }
                    if (z8) {
                        value = ((Rb.c) c1111f.f16838c).invoke(abstractC2243m4);
                    }
                }
                boolean a10 = kotlin.jvm.internal.l.a(value, c0487e0.getValue());
                Rb.c cVar = (Rb.c) this.f4012d;
                if (!a10) {
                    ((C2238h) kVar.f11056c).f26093b.setValue(value);
                    ((C2238h) this.f4011c).f26093b.setValue(value);
                    if (cVar != null) {
                        cVar.invoke(kVar);
                    }
                    c2236f.f26085i.setValue(Boolean.FALSE);
                    c2236f.f26081d.invoke();
                    ((kotlin.jvm.internal.r) this.f4013e).f19130a = true;
                } else if (cVar != null) {
                    cVar.invoke(kVar);
                }
                return Db.q.f3365a;
            case 2:
                C2236f c2236f2 = (C2236f) obj;
                float floatValue = ((Number) c2236f2.f26082e.getValue()).floatValue();
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.f4010b;
                float f4 = floatValue - sVar.f19131a;
                float a11 = ((r0) this.f4011c).a(f4);
                sVar.f19131a = ((Number) c2236f2.f26082e.getValue()).floatValue();
                ((kotlin.jvm.internal.s) this.f4012d).f19131a = ((Number) ((Rb.c) c2236f2.f26078a.f16838c).invoke(c2236f2.f26083f)).floatValue();
                if (Math.abs(f4 - a11) > 0.5f) {
                    c2236f2.f26085i.setValue(Boolean.FALSE);
                    c2236f2.f26081d.invoke();
                }
                ((C2565l) this.f4013e).getClass();
                return Db.q.f3365a;
            default:
                C2236f c2236f3 = (C2236f) obj;
                float floatValue2 = ((Number) c2236f3.f26082e.getValue()).floatValue();
                kotlin.jvm.internal.s sVar2 = (kotlin.jvm.internal.s) this.f4010b;
                float f10 = floatValue2 - sVar2.f19131a;
                boolean a12 = AbstractC2536H.a(f10);
                ?? r32 = c2236f3.f26081d;
                C0487e0 c0487e02 = c2236f3.f26085i;
                if (!a12) {
                    if (!AbstractC2536H.a(f10 - C1798l.b((C1798l) this.f4011c, (t0) this.f4012d, f10))) {
                        c0487e02.setValue(Boolean.FALSE);
                        r32.invoke();
                        return Db.q.f3365a;
                    }
                    sVar2.f19131a += f10;
                }
                if (((Boolean) ((C2541M) this.f4013e).invoke(Float.valueOf(sVar2.f19131a))).booleanValue()) {
                    c0487e02.setValue(Boolean.FALSE);
                    r32.invoke();
                }
                return Db.q.f3365a;
        }
    }
}
