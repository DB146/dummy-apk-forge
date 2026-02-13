package va;

import l2.a0;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f25354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i7) {
        super(0);
        this.f25353a = i7;
        this.f25354b = uVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25353a) {
            case 0:
                return this.f25354b.g0().s();
            case 1:
                return this.f25354b.g0().o();
            default:
                a0 n6 = this.f25354b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
