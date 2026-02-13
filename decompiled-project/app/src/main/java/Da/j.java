package Da;

import l2.a0;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i7) {
        super(0);
        this.f3323a = i7;
        this.f3324b = kVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f3323a) {
            case 0:
                return this.f3324b.g0().s();
            case 1:
                return this.f3324b.g0().o();
            default:
                a0 n6 = this.f3324b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
