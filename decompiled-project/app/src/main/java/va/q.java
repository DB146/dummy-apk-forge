package va;

import l2.a0;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i7) {
        super(0);
        this.f25346a = i7;
        this.f25347b = rVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25346a) {
            case 0:
                return this.f25347b.g0().s();
            case 1:
                return this.f25347b.g0().o();
            case 2:
                a0 n6 = this.f25347b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f25347b.g0().s();
            case 4:
                return this.f25347b.g0().o();
            default:
                a0 n8 = this.f25347b.g0().n();
                kotlin.jvm.internal.l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
        }
    }
}
