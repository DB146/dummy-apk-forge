package k3;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f18822b;

    public /* synthetic */ e(f fVar, int i7) {
        this.f18821a = i7;
        this.f18822b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18821a) {
            case 0:
                f.a(this.f18822b);
                return;
            default:
                f.b(this.f18822b);
                return;
        }
    }
}
