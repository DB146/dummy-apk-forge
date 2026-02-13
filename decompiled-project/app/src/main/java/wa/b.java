package wa;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import l2.a0;

/* loaded from: classes2.dex */
public final class b extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f25830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i7) {
        super(0);
        this.f25829a = i7;
        this.f25830b = cVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25829a) {
            case 0:
                return this.f25830b.g0().s();
            case 1:
                return this.f25830b.g0().o();
            case 2:
                a0 n6 = this.f25830b.g0().n();
                l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f25830b.g0().s();
            case 4:
                return this.f25830b.g0().o();
            default:
                a0 n8 = this.f25830b.g0().n();
                l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
        }
    }
}
