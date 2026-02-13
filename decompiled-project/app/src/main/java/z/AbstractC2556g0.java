package z;

import B0.AbstractC0207v0;
import Q.C0498k;
import Q.C0506o;
import cc.C0944m;
import i0.C1289b;
import i1.C1290a;
import u0.C2075e;
import u0.C2080j;
import u0.EnumC2076f;
import u0.InterfaceC2083m;
import x.C2247q;
import y.EnumC2292N;

/* renamed from: z.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2556g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2548c0 f27981a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C2546b0 f27982b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C2550d0 f27983c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f27984d = new StackTraceElement[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w0 w0Var, long j, Jb.c cVar) {
        C2552e0 c2552e0;
        int i7;
        kotlin.jvm.internal.s sVar;
        w0 w0Var2;
        if (cVar instanceof C2552e0) {
            C2552e0 c2552e02 = (C2552e0) cVar;
            int i10 = c2552e02.f27971d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2552e02.f27971d = i10 - Integer.MIN_VALUE;
                c2552e0 = c2552e02;
                Object obj = c2552e0.f27970c;
                Object obj2 = Ib.a.f5345a;
                i7 = c2552e0.f27971d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ?? obj3 = new Object();
                    EnumC2292N enumC2292N = EnumC2292N.f26416a;
                    Rb.e c2554f0 = new C2554f0(w0Var, j, obj3, null);
                    c2552e0.f27968a = w0Var;
                    c2552e0.f27969b = obj3;
                    c2552e0.f27971d = 1;
                    Object e2 = w0Var.e(enumC2292N, c2554f0, c2552e0);
                    w0Var2 = w0Var;
                    sVar = obj3;
                    if (e2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.s sVar2 = c2552e0.f27969b;
                    w0 w0Var3 = c2552e0.f27968a;
                    com.bumptech.glide.c.c0(obj);
                    sVar = sVar2;
                    w0Var2 = w0Var3;
                }
                return new C1289b(w0Var2.g(sVar.f19131a));
            }
        }
        c2552e0 = new Jb.c(cVar);
        Object obj4 = c2552e0.f27970c;
        Object obj22 = Ib.a.f5345a;
        i7 = c2552e0.f27971d;
        if (i7 != 0) {
        }
        return new C1289b(w0Var2.g(sVar.f19131a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(u0.v vVar, EnumC2076f enumC2076f, Jb.a aVar) {
        C2534F c2534f;
        int i7;
        int size;
        int i10;
        if (aVar instanceof C2534F) {
            C2534F c2534f2 = (C2534F) aVar;
            int i11 = c2534f2.f27860d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2534f2.f27860d = i11 - Integer.MIN_VALUE;
                c2534f = c2534f2;
                Object obj = c2534f.f27859c;
                Object obj2 = Ib.a.f5345a;
                i7 = c2534f.f27860d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ?? r10 = vVar.f24806f.f24815G.f24754a;
                    int size2 = r10.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        if (((C2080j) r10.get(i12)).f24766d) {
                            c2534f.f27857a = vVar;
                            c2534f.f27858b = enumC2076f;
                            c2534f.f27860d = 1;
                            obj = vVar.a(enumC2076f, c2534f);
                            vVar = vVar;
                            if (obj == obj2) {
                            }
                            ?? r102 = ((C2075e) obj).f24754a;
                            size = r102.size();
                            i10 = 0;
                            while (i10 < size) {
                            }
                            return Db.q.f3365a;
                        }
                    }
                    return Db.q.f3365a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                EnumC2076f enumC2076f2 = c2534f.f27858b;
                u0.v vVar2 = c2534f.f27857a;
                com.bumptech.glide.c.c0(obj);
                enumC2076f = enumC2076f2;
                vVar = vVar2;
                ?? r1022 = ((C2075e) obj).f24754a;
                size = r1022.size();
                i10 = 0;
                while (i10 < size) {
                    if (((C2080j) r1022.get(i10)).f24766d) {
                        c2534f.f27857a = vVar;
                        c2534f.f27858b = enumC2076f;
                        c2534f.f27860d = 1;
                        obj = vVar.a(enumC2076f, c2534f);
                        vVar = vVar;
                        if (obj == obj2) {
                            return obj2;
                        }
                        ?? r10222 = ((C2075e) obj).f24754a;
                        size = r10222.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                    } else {
                        i10++;
                    }
                }
                return Db.q.f3365a;
            }
        }
        c2534f = new Jb.c(aVar);
        Object obj3 = c2534f.f27859c;
        Object obj22 = Ib.a.f5345a;
        i7 = c2534f.f27860d;
        if (i7 != 0) {
        }
    }

    public static final Object c(InterfaceC2083m interfaceC2083m, Rb.e eVar, Hb.d dVar) {
        Ib.a aVar;
        Db.q qVar;
        C2535G c2535g = new C2535G(dVar.getContext(), eVar, null);
        u0.y yVar = (u0.y) interfaceC2083m;
        yVar.getClass();
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        u0.v vVar = new u0.v(yVar, c0944m);
        synchronized (yVar.f24817I) {
            yVar.f24816H.b(vVar);
            Hb.d F10 = com.bumptech.glide.c.F(com.bumptech.glide.c.m(vVar, vVar, c2535g));
            aVar = Ib.a.f5345a;
            Hb.k kVar = new Hb.k(F10);
            qVar = Db.q.f3365a;
            kVar.resumeWith(qVar);
        }
        c0944m.u(new u0.w(vVar, 0));
        Object r10 = c0944m.r();
        return r10 == aVar ? r10 : qVar;
    }

    public static C2565l d(C0506o c0506o) {
        float f4 = w.U.f25539a;
        V0.c cVar = (V0.c) c0506o.k(AbstractC0207v0.f1993h);
        boolean d10 = c0506o.d(cVar.k());
        Object H10 = c0506o.H();
        Object obj = C0498k.f8409a;
        if (d10 || H10 == obj) {
            H10 = new C2247q(new C1290a(cVar));
            c0506o.d0(H10);
        }
        C2247q c2247q = (C2247q) H10;
        boolean g = c0506o.g(c2247q);
        Object H11 = c0506o.H();
        if (g || H11 == obj) {
            H11 = new C2565l(c2247q);
            c0506o.d0(H11);
        }
        return (C2565l) H11;
    }
}
