package U0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i7) {
        super(0);
        this.f9437a = i7;
        this.f9438b = pVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f9437a) {
            case 0:
                return Float.valueOf(this.f9438b.a());
            default:
                return this.f9438b;
        }
    }
}
