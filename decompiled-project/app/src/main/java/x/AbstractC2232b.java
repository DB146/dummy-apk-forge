package x;

import B0.F0;
import B0.R0;
import Q.C0480b;
import a0.C0687n;
import ea.C1111f;
import java.util.concurrent.CancellationException;
import r7.C1948d;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2232b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2239i f26045a = new C2239i(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C2240j f26046b = new C2240j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C2241k f26047c = new C2241k(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C2242l f26048d = new C2242l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C2239i f26049e = new C2239i(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C2240j f26050f = new C2240j(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C2241k g = new C2241k(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C2242l f26051h = new C2242l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f26052i = new float[91];

    public static C2238h a(int i7, float f4) {
        if ((i7 & 2) != 0) {
            f4 = 0.0f;
        }
        return new C2238h(p0.f26141a, Float.valueOf(0.0f), new C2239i(f4), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00d2, B:18:0x00e7), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C2238h c2238h, InterfaceC2233c interfaceC2233c, long j, Rb.c cVar, Jb.c cVar2) {
        Jb.c cVar3;
        U u3;
        Ib.a aVar;
        int i7;
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.v vVar2;
        Rb.c cVar4;
        C2238h c2238h2;
        C2236f c2236f;
        C2236f c2236f2;
        Object obj;
        X x2;
        Rb.c cVar5;
        InterfaceC2233c interfaceC2233c2;
        C2238h c2238h3 = c2238h;
        InterfaceC2233c interfaceC2233c3 = interfaceC2233c;
        if (cVar2 instanceof U) {
            U u10 = (U) cVar2;
            int i10 = u10.f25988f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u10.f25988f = i10 - Integer.MIN_VALUE;
                cVar3 = u10;
                u3 = cVar3;
                Object obj2 = u3.f25987e;
                aVar = Ib.a.f5345a;
                i7 = u3.f25988f;
                if (i7 == 0) {
                    if (i7 == 1) {
                        vVar2 = u3.f25986d;
                        cVar5 = u3.f25985c;
                        interfaceC2233c2 = u3.f25984b;
                        c2238h2 = u3.f25983a;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = u3.f25986d;
                        cVar5 = u3.f25985c;
                        interfaceC2233c2 = u3.f25984b;
                        c2238h2 = u3.f25983a;
                    }
                    try {
                        com.bumptech.glide.c.c0(obj2);
                        cVar4 = cVar5;
                        interfaceC2233c3 = interfaceC2233c2;
                    } catch (CancellationException e2) {
                        e = e2;
                        c2238h3 = c2238h2;
                        c2236f = (C2236f) vVar2.f19134a;
                        if (c2236f != null) {
                            c2236f.f26085i.setValue(Boolean.FALSE);
                        }
                        c2236f2 = (C2236f) vVar2.f19134a;
                        if (c2236f2 != null && c2236f2.g == c2238h3.f26095d) {
                            c2238h3.f26097f = false;
                        }
                        throw e;
                    }
                } else {
                    com.bumptech.glide.c.c0(obj2);
                    Object c10 = interfaceC2233c3.c(0L);
                    AbstractC2243m g2 = interfaceC2233c3.g(0L);
                    ?? obj3 = new Object();
                    try {
                        if (j == Long.MIN_VALUE) {
                            W w10 = new W(obj3, c10, interfaceC2233c, g2, c2238h, i(u3.getContext()), cVar);
                            u3.f25983a = c2238h3;
                            u3.f25984b = interfaceC2233c3;
                            cVar4 = cVar;
                            u3.f25985c = cVar4;
                            u3.f25986d = obj3;
                            u3.f25988f = 1;
                            obj3 = obj3;
                            if (e(interfaceC2233c3, w10, u3) == aVar) {
                                return aVar;
                            }
                        } else {
                            cVar4 = cVar;
                            try {
                                C2236f c2236f3 = new C2236f(c10, interfaceC2233c.e(), g2, j, interfaceC2233c.f(), j, new V(c2238h3, 1));
                                kotlin.jvm.internal.v vVar3 = obj3;
                                h(c2236f3, j, i(u3.getContext()), interfaceC2233c, c2238h, cVar);
                                vVar3.f19134a = c2236f3;
                                obj3 = vVar3;
                            } catch (CancellationException e10) {
                                e = e10;
                                vVar = obj3;
                                vVar2 = vVar;
                                c2236f = (C2236f) vVar2.f19134a;
                                if (c2236f != null) {
                                }
                                c2236f2 = (C2236f) vVar2.f19134a;
                                if (c2236f2 != null) {
                                    c2238h3.f26097f = false;
                                }
                                throw e;
                            }
                        }
                        c2238h2 = c2238h3;
                        vVar2 = obj3;
                    } catch (CancellationException e11) {
                        e = e11;
                        vVar = obj3;
                    }
                }
                do {
                    obj = vVar2.f19134a;
                    kotlin.jvm.internal.l.b(obj);
                    if (((Boolean) ((C2236f) obj).f26085i.getValue()).booleanValue()) {
                        return Db.q.f3365a;
                    }
                    x2 = new X(vVar2, i(u3.getContext()), interfaceC2233c3, c2238h2, cVar4);
                    u3.f25983a = c2238h2;
                    u3.f25984b = interfaceC2233c3;
                    u3.f25985c = cVar4;
                    u3.f25986d = vVar2;
                    u3.f25988f = 2;
                } while (e(interfaceC2233c3, x2, u3) != aVar);
                return aVar;
            }
        }
        cVar3 = new Jb.c(cVar2);
        u3 = cVar3;
        Object obj22 = u3.f25987e;
        aVar = Ib.a.f5345a;
        i7 = u3.f25988f;
        if (i7 == 0) {
        }
        do {
            obj = vVar2.f19134a;
            kotlin.jvm.internal.l.b(obj);
            if (((Boolean) ((C2236f) obj).f26085i.getValue()).booleanValue()) {
            }
        } while (e(interfaceC2233c3, x2, u3) != aVar);
        return aVar;
    }

    public static Object c(float f4, float f10, o0 o0Var, Rb.e eVar, Jb.i iVar, int i7) {
        InterfaceC2237g j = (i7 & 8) != 0 ? j(7, null) : o0Var;
        C1111f c1111f = p0.f26141a;
        Float f11 = new Float(f4);
        Float f12 = new Float(f10);
        C2239i c2239i = new C2239i(new Float(0.0f).floatValue());
        Object b2 = b(new C2238h(c1111f, f11, c2239i, 56), new Z(j, c1111f, f11, f12, c2239i), Long.MIN_VALUE, new R0(eVar, 1), iVar);
        Ib.a aVar = Ib.a.f5345a;
        Db.q qVar = Db.q.f3365a;
        if (b2 != aVar) {
            b2 = qVar;
        }
        return b2 == aVar ? b2 : qVar;
    }

    public static final Object d(C2238h c2238h, Float f4, InterfaceC2249t interfaceC2249t, Rb.c cVar, Jb.i iVar) {
        Object b2 = b(c2238h, new Z(interfaceC2249t, c2238h.f26092a, c2238h.f26093b.getValue(), f4, c2238h.f26094c), c2238h.f26095d, cVar, iVar);
        return b2 == Ib.a.f5345a ? b2 : Db.q.f3365a;
    }

    public static final Object e(InterfaceC2233c interfaceC2233c, Rb.c cVar, U u3) {
        if (!interfaceC2233c.b()) {
            return C0480b.m(u3.getContext()).n(new C0687n(cVar, 1), u3);
        }
        if (u3.getContext().get(F0.f1677a) == null) {
            return C0480b.m(u3.getContext()).n(cVar, u3);
        }
        throw new ClassCastException();
    }

    public static final AbstractC2243m f(AbstractC2243m abstractC2243m) {
        AbstractC2243m c10 = abstractC2243m.c();
        int b2 = c10.b();
        for (int i7 = 0; i7 < b2; i7++) {
            c10.e(i7, abstractC2243m.a(i7));
        }
        return c10;
    }

    public static C2238h g(C2238h c2238h, float f4) {
        float f10 = ((C2239i) c2238h.f26094c).f26098a;
        return new C2238h(c2238h.f26092a, Float.valueOf(f4), new C2239i(f10), c2238h.f26095d, c2238h.f26096e, c2238h.f26097f);
    }

    public static final void h(C2236f c2236f, long j, float f4, InterfaceC2233c interfaceC2233c, C2238h c2238h, Rb.c cVar) {
        long d10 = f4 == 0.0f ? interfaceC2233c.d() : ((float) (j - c2236f.f26080c)) / f4;
        c2236f.g = j;
        c2236f.f26082e.setValue(interfaceC2233c.c(d10));
        c2236f.f26083f = interfaceC2233c.g(d10);
        if (interfaceC2233c.h(d10)) {
            c2236f.f26084h = c2236f.g;
            c2236f.f26085i.setValue(Boolean.FALSE);
        }
        l(c2236f, c2238h);
        cVar.invoke(c2236f);
    }

    public static final float i(Hb.i iVar) {
        c0.p pVar = (c0.p) iVar.get(c0.b.f14088A);
        float F10 = pVar != null ? pVar.F() : 1.0f;
        if (F10 < 0.0f) {
            AbstractC2230C.b("negative scale factor");
        }
        return F10;
    }

    public static Q j(int i7, Object obj) {
        float f4 = (i7 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new Q(f4, obj);
    }

    public static o0 k(int i7, C1948d c1948d, int i10) {
        int i11 = (i10 & 2) != 0 ? 0 : 90;
        r rVar = c1948d;
        if ((i10 & 4) != 0) {
            rVar = AbstractC2248s.f26151a;
        }
        return new o0(i7, i11, rVar);
    }

    public static final void l(C2236f c2236f, C2238h c2238h) {
        c2238h.f26093b.setValue(c2236f.f26082e.getValue());
        AbstractC2243m abstractC2243m = c2238h.f26094c;
        AbstractC2243m abstractC2243m2 = c2236f.f26083f;
        int b2 = abstractC2243m.b();
        for (int i7 = 0; i7 < b2; i7++) {
            abstractC2243m.e(i7, abstractC2243m2.a(i7));
        }
        c2238h.f26096e = c2236f.f26084h;
        c2238h.f26095d = c2236f.g;
        c2238h.f26097f = ((Boolean) c2236f.f26085i.getValue()).booleanValue();
    }
}
