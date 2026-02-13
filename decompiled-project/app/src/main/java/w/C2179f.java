package w;

import B0.C0165a;
import Q.C0487e0;
import Q.C0498k;
import Q.C0506o;
import a0.C0691r;
import x.i0;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2179f extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f25569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.c f25571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2187n f25572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0691r f25573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y.e f25574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2179f(i0 i0Var, Object obj, Rb.c cVar, C2187n c2187n, C0691r c0691r, Y.e eVar) {
        super(2);
        this.f25569a = i0Var;
        this.f25570b = obj;
        this.f25571c = cVar;
        this.f25572d = c2187n;
        this.f25573e = c0691r;
        this.f25574f = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
            Object H10 = c0506o.H();
            Object obj3 = C0498k.f8409a;
            Rb.c cVar = this.f25571c;
            C2187n c2187n = this.f25572d;
            if (H10 == obj3) {
                H10 = (w) cVar.invoke(c2187n);
                c0506o.d0(H10);
            }
            w wVar = (w) H10;
            i0 i0Var = this.f25569a;
            Object c10 = i0Var.f().c();
            Object obj4 = this.f25570b;
            boolean h10 = c0506o.h(kotlin.jvm.internal.l.a(c10, obj4));
            Object H11 = c0506o.H();
            if (h10 || H11 == obj3) {
                H11 = kotlin.jvm.internal.l.a(i0Var.f().c(), obj4) ? I.f25511b : ((w) cVar.invoke(c2187n)).f25622b;
                c0506o.d0(H11);
            }
            I i7 = (I) H11;
            Object H12 = c0506o.H();
            C0487e0 c0487e0 = i0Var.f26102d;
            if (H12 == obj3) {
                H12 = new C2183j(kotlin.jvm.internal.l.a(obj4, c0487e0.getValue()));
                c0506o.d0(H12);
            }
            C2183j c2183j = (C2183j) H12;
            H h11 = wVar.f25621a;
            boolean i10 = c0506o.i(wVar);
            Object H13 = c0506o.H();
            if (i10 || H13 == obj3) {
                H13 = new C.S(wVar, 1);
                c0506o.d0(H13);
            }
            c0.m a9 = androidx.compose.ui.layout.a.a((Rb.f) H13);
            c2183j.f25579a.setValue(Boolean.valueOf(kotlin.jvm.internal.l.a(obj4, c0487e0.getValue())));
            c0.m c11 = a9.c(c2183j);
            boolean i11 = c0506o.i(obj4);
            Object H14 = c0506o.H();
            if (i11 || H14 == obj3) {
                H14 = new E.f(obj4, 1);
                c0506o.d0(H14);
            }
            Rb.c cVar2 = (Rb.c) H14;
            boolean g = c0506o.g(i7);
            Object H15 = c0506o.H();
            if (g || H15 == obj3) {
                H15 = new C0165a(i7, 9);
                c0506o.d0(H15);
            }
            androidx.compose.animation.b.a(this.f25569a, cVar2, c11, h11, i7, (Rb.e) H15, Y.f.d(-616195562, new C2178e(this.f25573e, obj4, c2187n, this.f25574f), c0506o), c0506o, 12582912);
        } else {
            c0506o.N();
        }
        return Db.q.f3365a;
    }
}
