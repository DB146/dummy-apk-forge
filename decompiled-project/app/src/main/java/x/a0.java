package x;

import Q.C0479a0;
import Q.C0487e0;
import Q.R0;

/* loaded from: classes.dex */
public final class a0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f26041a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.m f26042b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f26043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f26044d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(b0 b0Var, e0 e0Var, Rb.c cVar, Rb.c cVar2) {
        this.f26044d = b0Var;
        this.f26041a = e0Var;
        this.f26042b = (kotlin.jvm.internal.m) cVar;
        this.f26043c = (kotlin.jvm.internal.m) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v16, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Rb.c, kotlin.jvm.internal.m] */
    public final void b(c0 c0Var) {
        Object invoke = this.f26043c.invoke(c0Var.c());
        boolean g = this.f26044d.f26055c.g();
        e0 e0Var = this.f26041a;
        if (g) {
            e0Var.f(this.f26043c.invoke(c0Var.a()), invoke, (InterfaceC2249t) this.f26042b.invoke(c0Var));
            return;
        }
        InterfaceC2249t interfaceC2249t = (InterfaceC2249t) this.f26042b.invoke(c0Var);
        if (e0Var.f26074w) {
            Z z8 = e0Var.f26071f;
            if (kotlin.jvm.internal.l.a(invoke, z8 != null ? z8.f26027c : null)) {
                return;
            }
        }
        C0487e0 c0487e0 = e0Var.f26067b;
        boolean a9 = kotlin.jvm.internal.l.a(c0487e0.getValue(), invoke);
        C0479a0 c0479a0 = e0Var.f26073v;
        if (a9 && c0479a0.e() == -1.0f) {
            return;
        }
        c0487e0.setValue(invoke);
        e0Var.f26068c.setValue(interfaceC2249t);
        Object value = c0479a0.e() == -3.0f ? invoke : e0Var.f26075x.getValue();
        C0487e0 c0487e02 = e0Var.f26072u;
        e0Var.e(value, !((Boolean) c0487e02.getValue()).booleanValue());
        c0487e02.setValue(Boolean.valueOf(c0479a0.e() == -3.0f));
        if (c0479a0.e() >= 0.0f) {
            e0Var.d(e0Var.b().c(c0479a0.e() * ((float) e0Var.b().d())));
        } else if (c0479a0.e() == -3.0f) {
            e0Var.d(invoke);
        }
        e0Var.f26074w = false;
        c0479a0.f(-1.0f);
    }

    @Override // Q.R0
    public final Object getValue() {
        b(this.f26044d.f26055c.f());
        return this.f26041a.f26075x.getValue();
    }
}
