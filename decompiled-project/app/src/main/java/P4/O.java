package P4;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f7893b;

    public /* synthetic */ O(T t5, int i7) {
        this.f7892a = i7;
        this.f7893b = t5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7892a) {
            case 0:
                this.f7893b.z();
                return;
            case 1:
                T t5 = this.f7893b;
                if (t5.f7937Z) {
                    return;
                }
                InterfaceC0475x interfaceC0475x = t5.f7917E;
                interfaceC0475x.getClass();
                interfaceC0475x.i(t5);
                return;
            default:
                this.f7893b.f7931T = true;
                return;
        }
    }
}
