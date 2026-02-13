package xa;

import l2.a0;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f26296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i7) {
        super(0);
        this.f26295a = i7;
        this.f26296b = iVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f26295a) {
            case 0:
                return this.f26296b.g0().s();
            case 1:
                return this.f26296b.g0().o();
            default:
                a0 n6 = this.f26296b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
