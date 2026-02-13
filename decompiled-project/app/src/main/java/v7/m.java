package v7;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D7.d f25144c;

    public /* synthetic */ m(p pVar, D7.d dVar, int i7) {
        this.f25142a = i7;
        this.f25143b = pVar;
        this.f25144c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25142a) {
            case 0:
                this.f25143b.a(this.f25144c);
                return;
            default:
                this.f25143b.a(this.f25144c);
                return;
        }
    }
}
