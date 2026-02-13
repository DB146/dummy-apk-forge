package x;

import Q.C0483c0;
import Q.C0487e0;
import Q.F0;
import a0.AbstractC0688o;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, float f4) {
        super(1);
        this.f26086a = i0Var;
        this.f26087b = f4;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        i0 i0Var = this.f26086a;
        if (!i0Var.g()) {
            C0483c0 c0483c0 = i0Var.g;
            if (((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c == Long.MIN_VALUE) {
                c0483c0.e(longValue);
                ((C0487e0) i0Var.f26099a.f3094a).setValue(Boolean.TRUE);
            }
            long j = longValue - ((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c;
            float f4 = this.f26087b;
            if (f4 != 0.0f) {
                j = Tb.a.G(j / f4);
            }
            i0Var.n(j);
            i0Var.h(j, f4 == 0.0f);
        }
        return Db.q.f3365a;
    }
}
