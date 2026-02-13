package ua;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import l2.a0;

/* loaded from: classes2.dex */
public final class d extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f24911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7) {
        super(0);
        this.f24910a = i7;
        this.f24911b = eVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f24910a) {
            case 0:
                return this.f24911b.g0().s();
            case 1:
                return this.f24911b.g0().o();
            default:
                a0 n6 = this.f24911b.g0().n();
                l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
