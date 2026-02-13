package x;

import B0.C0170c0;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import ea.C1111f;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f26126a = android.support.v4.media.session.b.y(Db.h.f3352a, j0.f26110a);

    /* JADX WARN: Type inference failed for: r2v4, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v3, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Rb.c, kotlin.jvm.internal.m] */
    public static final b0 a(i0 i0Var, C1111f c1111f, String str, C0506o c0506o, int i7, int i10) {
        a0 a0Var;
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean g = c0506o.g(i0Var);
        Object H10 = c0506o.H();
        Object obj = C0498k.f8409a;
        if (g || H10 == obj) {
            H10 = new b0(i0Var, c1111f, str);
            c0506o.d0(H10);
        }
        b0 b0Var = (b0) H10;
        boolean g2 = c0506o.g(i0Var) | c0506o.i(b0Var);
        Object H11 = c0506o.H();
        if (g2 || H11 == obj) {
            H11 = new C0170c0(29, i0Var, b0Var);
            c0506o.d0(H11);
        }
        C0480b.c(b0Var, (Rb.c) H11, c0506o);
        if (i0Var.g() && (a0Var = (a0) b0Var.f26054b.getValue()) != null) {
            ?? r22 = a0Var.f26043c;
            i0 i0Var2 = b0Var.f26055c;
            a0Var.f26041a.f(r22.invoke(i0Var2.f().a()), a0Var.f26043c.invoke(i0Var2.f().c()), (InterfaceC2249t) a0Var.f26042b.invoke(i0Var2.f()));
        }
        return b0Var;
    }

    public static final i0 b(Boolean bool, String str, C0506o c0506o, int i7) {
        Object H10 = c0506o.H();
        Q.S s3 = C0498k.f8409a;
        if (H10 == s3) {
            H10 = new i0(new C2253x(bool), null, str);
            c0506o.d0(H10);
        }
        i0 i0Var = (i0) H10;
        i0Var.a(bool, c0506o, (i7 & 8) | 48 | (i7 & 14));
        Object H11 = c0506o.H();
        if (H11 == s3) {
            H11 = new m0(i0Var, 1);
            c0506o.d0(H11);
        }
        C0480b.c(i0Var, (Rb.c) H11, c0506o);
        return i0Var;
    }
}
