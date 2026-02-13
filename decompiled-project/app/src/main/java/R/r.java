package R;

import H2.C0305t;
import Q.C0;
import Q.C0478a;
import Q.C0505n0;
import Q.InterfaceC0482c;
import Q.w0;

/* loaded from: classes.dex */
public final class r extends P8.h {

    /* renamed from: f, reason: collision with root package name */
    public static final r f8771f;

    /* renamed from: h, reason: collision with root package name */
    public static final r f8772h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8773d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f8770e = new r(1, 2, 0);
    public static final r g = new r(1, 2, 2);

    static {
        int i7 = 1;
        f8771f = new r(i7, i7, 1);
        int i10 = 1;
        f8772h = new r(i10, i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i10, int i11) {
        super(i7, i10, 1, (byte) 0);
        this.f8773d = i11;
    }

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        int i7;
        int i10;
        switch (this.f8773d) {
            case 0:
                Object invoke = ((Rb.a) c0305t.e(0)).invoke();
                C0478a c0478a = (C0478a) c0305t.e(1);
                int d10 = c0305t.d(0);
                c0478a.getClass();
                c02.T(c02.c(c0478a), invoke);
                interfaceC0482c.j(d10, invoke);
                interfaceC0482c.f(invoke);
                return;
            case 1:
                C0478a c0478a2 = (C0478a) c0305t.e(0);
                int d11 = c0305t.d(0);
                interfaceC0482c.A();
                c0478a2.getClass();
                interfaceC0482c.e(d11, c02.B(c02.c(c0478a2)));
                return;
            case 2:
                Object e2 = c0305t.e(0);
                C0478a c0478a3 = (C0478a) c0305t.e(1);
                int d12 = c0305t.d(0);
                if (e2 instanceof w0) {
                    ((S.e) kVar.f11056c).b((w0) e2);
                }
                int c10 = c02.c(c0478a3);
                int g2 = c02.g(c02.L(c10, d12));
                Object[] objArr = c02.f8279c;
                Object obj = objArr[g2];
                objArr[g2] = e2;
                if (!(obj instanceof w0)) {
                    if (obj instanceof C0505n0) {
                        ((C0505n0) obj).d();
                        return;
                    }
                    return;
                }
                int o10 = c02.o() - c02.L(c10, d12);
                w0 w0Var = (w0) obj;
                C0478a c0478a4 = w0Var.f8566b;
                if (c0478a4 == null || !c0478a4.a()) {
                    i7 = -1;
                    i10 = -1;
                } else {
                    i7 = c02.c(c0478a4);
                    i10 = c02.o() - c02.M(i7);
                }
                kVar.i(w0Var, o10, i7, i10);
                return;
            default:
                Object e10 = c0305t.e(0);
                int d13 = c0305t.d(0);
                if (e10 instanceof w0) {
                    ((S.e) kVar.f11056c).b((w0) e10);
                }
                int g10 = c02.g(c02.L(c02.f8293t, d13));
                Object[] objArr2 = c02.f8279c;
                Object obj2 = objArr2[g10];
                objArr2[g10] = e10;
                if (obj2 instanceof w0) {
                    kVar.i((w0) obj2, c02.o() - c02.L(c02.f8293t, d13), -1, -1);
                    return;
                } else {
                    if (obj2 instanceof C0505n0) {
                        ((C0505n0) obj2).d();
                        return;
                    }
                    return;
                }
        }
    }
}
