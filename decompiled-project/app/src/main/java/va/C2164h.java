package va;

import l2.a0;

/* renamed from: va.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2164h extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2165i f25331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2164h(C2165i c2165i, int i7) {
        super(0);
        this.f25330a = i7;
        this.f25331b = c2165i;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25330a) {
            case 0:
                return this.f25331b.g0().s();
            case 1:
                return this.f25331b.g0().o();
            default:
                a0 n6 = this.f25331b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
