package w;

import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import a0.C0691r;
import u.C2046I;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178e extends kotlin.jvm.internal.m implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0691r f25565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2187n f25567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y.e f25568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178e(C0691r c0691r, Object obj, C2187n c2187n, Y.e eVar) {
        super(3);
        this.f25565a = c0691r;
        this.f25566b = obj;
        this.f25567c = c2187n;
        this.f25568d = eVar;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        InterfaceC2192t interfaceC2192t = (InterfaceC2192t) obj;
        C0506o c0506o = (C0506o) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? c0506o.g(interfaceC2192t) : c0506o.i(interfaceC2192t) ? 4 : 2;
        }
        if (c0506o.K(intValue & 1, (intValue & 19) != 18)) {
            C0691r c0691r = this.f25565a;
            boolean g = c0506o.g(c0691r);
            Object obj4 = this.f25566b;
            boolean i7 = g | c0506o.i(obj4);
            C2187n c2187n = this.f25567c;
            boolean i10 = i7 | c0506o.i(c2187n);
            Object H10 = c0506o.H();
            Q.S s3 = C0498k.f8409a;
            if (i10 || H10 == s3) {
                H10 = new C.D(c0691r, obj4, c2187n, 6);
                c0506o.d0(H10);
            }
            C0480b.c(interfaceC2192t, (Rb.c) H10, c0506o);
            C2046I c2046i = c2187n.f25593d;
            kotlin.jvm.internal.l.c(interfaceC2192t, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c2046i.l(obj4, ((C2193u) interfaceC2192t).f25617a);
            Object H11 = c0506o.H();
            if (H11 == s3) {
                H11 = new Object();
                c0506o.d0(H11);
            }
            this.f25568d.f((C2182i) H11, obj4, c0506o, 0);
        } else {
            c0506o.N();
        }
        return Db.q.f3365a;
    }
}
