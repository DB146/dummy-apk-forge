package va;

import l2.a0;

/* renamed from: va.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2158b extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2159c f25306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2158b(C2159c c2159c, int i7) {
        super(0);
        this.f25305a = i7;
        this.f25306b = c2159c;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25305a) {
            case 0:
                return this.f25306b.g0().s();
            case 1:
                return this.f25306b.g0().o();
            case 2:
                a0 n6 = this.f25306b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f25306b.g0().s();
            case 4:
                return this.f25306b.g0().o();
            default:
                a0 n8 = this.f25306b.g0().n();
                kotlin.jvm.internal.l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
        }
    }
}
