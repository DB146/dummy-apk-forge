package Da;

import l2.a0;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i7) {
        super(0);
        this.f3312a = i7;
        this.f3313b = fVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f3312a) {
            case 0:
                return this.f3313b.g0().s();
            case 1:
                return this.f3313b.g0().o();
            default:
                a0 n6 = this.f3313b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
