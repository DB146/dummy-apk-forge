package B0;

import A0.AbstractC0017g;
import h0.C1216c;
import h0.EnumC1228o;
import h0.InterfaceC1227n;
import y.C2280B;
import y.C2281C;
import y.C2282D;

/* renamed from: B0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0206v extends kotlin.jvm.internal.j implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0206v(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, i10, cls, obj, str, str2);
        this.f1986a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [A.d, java.lang.Object, A.h] */
    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        boolean a9;
        C2282D t02;
        switch (this.f1986a) {
            case 0:
                return Boolean.valueOf(D.f((D) this.receiver, (C1216c) obj, (i0.c) obj2));
            default:
                InterfaceC1227n interfaceC1227n = (InterfaceC1227n) obj;
                InterfaceC1227n interfaceC1227n2 = (InterfaceC1227n) obj2;
                C2281C c2281c = (C2281C) this.receiver;
                if (c2281c.f14112B && (a9 = ((EnumC1228o) interfaceC1227n2).a()) != ((EnumC1228o) interfaceC1227n).a()) {
                    C0204u c0204u = c2281c.f26393F;
                    if (c0204u != null) {
                        c0204u.invoke(Boolean.valueOf(a9));
                    }
                    if (a9) {
                        cc.F.B(c2281c.d0(), null, 0, new C2280B(c2281c, null), 3);
                        ?? obj3 = new Object();
                        AbstractC0017g.q(c2281c, new A0.K((kotlin.jvm.internal.v) obj3, c2281c, 17));
                        F.z zVar = (F.z) obj3.f19134a;
                        if (zVar != null) {
                            zVar.a();
                        } else {
                            zVar = null;
                        }
                        c2281c.f26395H = zVar;
                        A0.n0 n0Var = c2281c.f26396I;
                        if (n0Var != null && n0Var.t0().f14112B && (t02 = c2281c.t0()) != null) {
                            t02.p0(c2281c.f26396I);
                        }
                    } else {
                        F.z zVar2 = c2281c.f26395H;
                        if (zVar2 != null) {
                            zVar2.b();
                        }
                        c2281c.f26395H = null;
                        C2282D t03 = c2281c.t0();
                        if (t03 != null) {
                            t03.p0(null);
                        }
                    }
                    AbstractC0017g.m(c2281c);
                    A.i iVar = c2281c.f26392E;
                    if (iVar != null) {
                        if (a9) {
                            A.d dVar = c2281c.f26394G;
                            if (dVar != null) {
                                c2281c.s0(iVar, new A.e(dVar));
                                c2281c.f26394G = null;
                            }
                            ?? obj4 = new Object();
                            c2281c.s0(iVar, obj4);
                            c2281c.f26394G = obj4;
                        } else {
                            A.d dVar2 = c2281c.f26394G;
                            if (dVar2 != null) {
                                c2281c.s0(iVar, new A.e(dVar2));
                                c2281c.f26394G = null;
                            }
                        }
                    }
                }
                return Db.q.f3365a;
        }
    }
}
