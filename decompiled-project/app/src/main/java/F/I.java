package F;

/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f3912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(L l10, int i7) {
        super(0);
        this.f3911a = i7;
        this.f3912b = l10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f3911a) {
            case 0:
                L l10 = this.f3912b;
                E.A a9 = l10.f3919D.f3404a;
                int e2 = (int) (a9.d().f3480o == z.V.f27943a ? a9.d().e() & 4294967295L : a9.d().e() >> 32);
                E.A a10 = l10.f3919D.f3404a;
                return Float.valueOf(e2 - ((-a10.d().f3477l) + a10.d().f3481p));
            case 1:
                E.A a11 = this.f3912b.f3919D.f3404a;
                return Float.valueOf((a11.f3372d.b() * 500) + a11.f3372d.c());
            default:
                E.A a12 = this.f3912b.f3919D.f3404a;
                int b2 = a12.f3372d.b();
                int c10 = a12.f3372d.c();
                return Float.valueOf(a12.c() ? (b2 * 500) + c10 + 100 : (b2 * 500) + c10);
        }
    }
}
