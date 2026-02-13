package x;

import Q.C0480b;
import Q.C0487e0;
import ea.C1111f;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1111f f26053a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f26054b = C0480b.o(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f26055c;

    public b0(i0 i0Var, C1111f c1111f, String str) {
        this.f26055c = i0Var;
        this.f26053a = c1111f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a0 a(Rb.c cVar, Rb.c cVar2) {
        C0487e0 c0487e0 = this.f26054b;
        a0 a0Var = (a0) c0487e0.getValue();
        i0 i0Var = this.f26055c;
        if (a0Var == null) {
            Object invoke = cVar2.invoke(i0Var.f26099a.l());
            Object invoke2 = cVar2.invoke(i0Var.f26099a.l());
            C1111f c1111f = this.f26053a;
            AbstractC2243m abstractC2243m = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(invoke2);
            abstractC2243m.d();
            e0 e0Var = new e0(i0Var, invoke, abstractC2243m, c1111f);
            a0Var = new a0(this, e0Var, cVar, cVar2);
            c0487e0.setValue(a0Var);
            i0Var.f26106i.add(e0Var);
        }
        a0Var.f26043c = (kotlin.jvm.internal.m) cVar2;
        a0Var.f26042b = (kotlin.jvm.internal.m) cVar;
        a0Var.b(i0Var.f());
        return a0Var;
    }
}
