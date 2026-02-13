package r4;

/* renamed from: r4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1939k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1941m f23767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23768c;

    public /* synthetic */ RunnableC1939k(C1941m c1941m, n nVar, int i7) {
        this.f23766a = i7;
        this.f23767b = c1941m;
        this.f23768c = nVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [r4.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [r4.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r4.n, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23766a) {
            case 0:
                C1941m c1941m = this.f23767b;
                this.f23768c.f(c1941m.f23771a, c1941m.f23772b);
                return;
            case 1:
                C1941m c1941m2 = this.f23767b;
                this.f23768c.C(c1941m2.f23771a, c1941m2.f23772b);
                return;
            default:
                C1941m c1941m3 = this.f23767b;
                this.f23768c.s(c1941m3.f23771a, c1941m3.f23772b);
                return;
        }
    }
}
