package k0;

import h3.H;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415p extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1416q f18737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1415p(C1416q c1416q, int i7) {
        super(1);
        this.f18736a = i7;
        this.f18737b = c1416q;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f18736a) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f18737b.f18746n.a(H.i(doubleValue, r10.f18740e, r10.f18741f)));
            default:
                return Double.valueOf(H.i(this.f18737b.k.a(((Number) obj).doubleValue()), r10.f18740e, r10.f18741f));
        }
    }
}
