package A9;

/* loaded from: classes2.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f974a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f975b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f976c;

    public V(W w10) {
        this.f976c = w10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f974a;
        W w10 = this.f976c;
        if (i7 != -1) {
            w10.f1018f1 = i7;
            if (w10.f999M0 != null) {
                w10.f1010X0.i(i7, true);
                w10.D0(i7);
                T t5 = w10.f1001O0;
                if (t5 != null) {
                    ((A2) t5.f964a).A0(i7, false);
                }
                w10.N0();
            }
        }
        this.f974a = -1;
        this.f975b = -1;
    }
}
