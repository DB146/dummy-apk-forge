package E;

import F.C0278w;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0278w f3436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0278w c0278w, long j, int i7, int i10) {
        super(3);
        this.f3436a = c0278w;
        this.f3437b = j;
        this.f3438c = i7;
        this.f3439d = i10;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i7 = intValue + this.f3438c;
        long j = this.f3437b;
        int f4 = V0.b.f(i7, j);
        int e2 = V0.b.e(intValue2 + this.f3439d, j);
        Eb.w wVar = Eb.w.f3892a;
        return this.f3436a.f4019b.Q(f4, e2, wVar, (Rb.c) obj3);
    }
}
