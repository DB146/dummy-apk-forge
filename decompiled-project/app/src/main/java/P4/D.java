package P4;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.s f7846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f7848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0474w f7849e;

    public /* synthetic */ D(A4.s sVar, I i7, r rVar, C0474w c0474w, int i10) {
        this.f7845a = i10;
        this.f7846b = sVar;
        this.f7847c = i7;
        this.f7848d = rVar;
        this.f7849e = c0474w;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, P4.I] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, P4.I] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, P4.I] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7845a) {
            case 0:
                A4.s sVar = this.f7846b;
                int i7 = sVar.f470a;
                this.f7847c.F(i7, (B) sVar.f471b, this.f7848d, this.f7849e);
                return;
            case 1:
                A4.s sVar2 = this.f7846b;
                int i10 = sVar2.f470a;
                this.f7847c.B(i10, (B) sVar2.f471b, this.f7848d, this.f7849e);
                return;
            default:
                A4.s sVar3 = this.f7846b;
                int i11 = sVar3.f470a;
                this.f7847c.E(i11, (B) sVar3.f471b, this.f7848d, this.f7849e);
                return;
        }
    }
}
