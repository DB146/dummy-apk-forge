package Aa;

import l2.a0;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i7) {
        super(0);
        this.f1501a = i7;
        this.f1502b = dVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f1501a) {
            case 0:
                return this.f1502b.g0().s();
            case 1:
                return this.f1502b.g0().o();
            case 2:
                a0 n6 = this.f1502b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f1502b.g0().s();
            case 4:
                return this.f1502b.g0().o();
            default:
                a0 n8 = this.f1502b.g0().n();
                kotlin.jvm.internal.l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
        }
    }
}
