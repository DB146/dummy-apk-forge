package B0;

/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3.s f1564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(boolean z8, q3.s sVar, String str) {
        super(0);
        this.f1563a = z8;
        this.f1564b = sVar;
        this.f1565c = str;
    }

    @Override // Rb.a
    public final Object invoke() {
        if (this.f1563a) {
            q3.s sVar = this.f1564b;
            String str = this.f1565c;
            S2.b bVar = (S2.b) sVar.f23438b;
            synchronized (((U9.j) bVar.f8988f)) {
            }
        }
        return Db.q.f3365a;
    }
}
