package za;

/* renamed from: za.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2602a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2606e f28336b;

    public /* synthetic */ RunnableC2602a(C2606e c2606e, int i7) {
        this.f28335a = i7;
        this.f28336b = c2606e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2606e c2606e = this.f28336b;
        switch (this.f28335a) {
            case 0:
                c2606e.f28351I1 = false;
                return;
            default:
                boolean z8 = C2606e.f28342J1;
                c2606e.f1010X0.g();
                return;
        }
    }
}
