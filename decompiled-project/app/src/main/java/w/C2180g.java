package w;

import x.AbstractC2232b;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2180g extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C2180g f25575b = new C2180g(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2180g f25576c = new C2180g(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25577a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2180g(int i7, int i10) {
        super(i7);
        this.f25577a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25577a) {
            case 0:
                long j = ((V0.k) obj).f9981a;
                long j10 = ((V0.k) obj2).f9981a;
                long j11 = 1;
                return AbstractC2232b.j(1, new V0.k((j11 & 4294967295L) | (j11 << 32)));
            default:
                x xVar = (x) obj2;
                return Boolean.valueOf(((x) obj) == xVar && xVar == x.f25627c);
        }
    }
}
