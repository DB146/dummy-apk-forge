package Aa;

import l2.a0;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i7) {
        super(0);
        this.f1544a = i7;
        this.f1545b = wVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f1544a) {
            case 0:
                return this.f1545b.g0().s();
            case 1:
                return this.f1545b.g0().o();
            case 2:
                a0 n6 = this.f1545b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f1545b.g0().s();
            case 4:
                return this.f1545b.g0().o();
            default:
                a0 n8 = this.f1545b.g0().n();
                kotlin.jvm.internal.l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
        }
    }
}
