package w;

import x.i0;

/* renamed from: w.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2190q extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f25605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2190q(i0 i0Var, int i7) {
        super(0);
        this.f25604a = i7;
        this.f25605b = i0Var;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25604a) {
            case 0:
                i0 i0Var = this.f25605b;
                Object l10 = i0Var.f26099a.l();
                x xVar = x.f25627c;
                return Boolean.valueOf(l10 == xVar && i0Var.f26102d.getValue() == xVar);
            default:
                return Long.valueOf(this.f25605b.b());
        }
    }
}
