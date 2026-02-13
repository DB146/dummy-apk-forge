package E;

import Q.W;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f3420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(W w10, int i7) {
        super(0);
        this.f3419a = i7;
        this.f3420b = w10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f3419a) {
            case 0:
                return new h((Rb.c) this.f3420b.getValue());
            case 1:
                return (j) ((Rb.a) this.f3420b.getValue()).invoke();
            default:
                return (M.f) this.f3420b.getValue();
        }
    }
}
