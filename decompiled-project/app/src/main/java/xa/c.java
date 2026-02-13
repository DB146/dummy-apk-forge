package xa;

import l2.a0;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f26286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i7) {
        super(0);
        this.f26285a = i7;
        this.f26286b = dVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f26285a) {
            case 0:
                return this.f26286b.g0().s();
            case 1:
                return this.f26286b.g0().o();
            default:
                a0 n6 = this.f26286b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
