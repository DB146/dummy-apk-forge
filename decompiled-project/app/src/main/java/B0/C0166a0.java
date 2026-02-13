package B0;

import Q.C0480b;
import Q.C0506o;

/* renamed from: B0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166a0 extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0166a0(Object obj, Object obj2, Db.c cVar, int i7, int i10) {
        super(2);
        this.f1844a = i10;
        this.f1847d = obj;
        this.f1845b = obj2;
        this.f1846c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0166a0(Object obj, Object obj2, Object obj3, int i7) {
        super(2);
        this.f1844a = i7;
        this.f1847d = obj;
        this.f1845b = obj2;
        this.f1846c = obj3;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1844a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC0207v0.a((D) this.f1847d, (C0188l0) this.f1845b, (Y.e) this.f1846c, c0506o, 0);
                } else {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0207v0.a((A0.t0) this.f1847d, (C0188l0) this.f1845b, (Y.e) this.f1846c, (C0506o) obj, C0480b.u(1));
                return Db.q.f3365a;
            case 2:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.a((Rb.c) this.f1847d, (c0.m) this.f1845b, (Rb.c) this.f1846c, (C0506o) obj, C0480b.u(49));
                return Db.q.f3365a;
            case 3:
                ((Number) obj2).intValue();
                tc.b.d((Rb.a) this.f1847d, (Z0.j) this.f1845b, (Y.e) this.f1846c, (C0506o) obj, C0480b.u(385));
                return Db.q.f3365a;
            default:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.f1847d;
                float f4 = floatValue - sVar.f19131a;
                z.w0 w0Var = (z.w0) this.f1845b;
                long g = w0Var.g(w0Var.c(f4));
                z.w0 w0Var2 = ((z.t0) this.f1846c).f28085a;
                sVar.f19131a += w0Var.c(w0Var.f(z.w0.a(w0Var2, w0Var2.j, g, 1)));
                return Db.q.f3365a;
        }
    }
}
