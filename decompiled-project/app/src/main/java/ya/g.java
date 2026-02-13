package ya;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import l2.a0;

/* loaded from: classes2.dex */
public final class g extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f27562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, j jVar) {
        super(0);
        this.f27561a = i7;
        this.f27562b = jVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f27561a) {
            case 0:
                return this.f27562b.g0().s();
            case 1:
                return this.f27562b.g0().o();
            default:
                a0 n6 = this.f27562b.g0().n();
                l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
        }
    }
}
