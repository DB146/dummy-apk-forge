package za;

import kotlin.jvm.internal.m;
import l2.a0;

/* renamed from: za.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2605d extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2606e f28341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2605d(C2606e c2606e, int i7) {
        super(0);
        this.f28340a = i7;
        this.f28341b = c2606e;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f28340a) {
            case 0:
                return this.f28341b.g0().s();
            case 1:
                return this.f28341b.g0().o();
            case 2:
                a0 n6 = this.f28341b.g0().n();
                kotlin.jvm.internal.l.d(n6, "requireActivity().defaultViewModelProviderFactory");
                return n6;
            case 3:
                return this.f28341b.g0().s();
            case 4:
                return this.f28341b.g0().o();
            case 5:
                a0 n8 = this.f28341b.g0().n();
                kotlin.jvm.internal.l.d(n8, "requireActivity().defaultViewModelProviderFactory");
                return n8;
            case 6:
                return this.f28341b.g0().s();
            case 7:
                return this.f28341b.g0().o();
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                a0 n10 = this.f28341b.g0().n();
                kotlin.jvm.internal.l.d(n10, "requireActivity().defaultViewModelProviderFactory");
                return n10;
            case 9:
                return this.f28341b.g0().s();
            case 10:
                return this.f28341b.g0().o();
            default:
                a0 n11 = this.f28341b.g0().n();
                kotlin.jvm.internal.l.d(n11, "requireActivity().defaultViewModelProviderFactory");
                return n11;
        }
    }
}
