package l2;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1481z f19190a;

    /* renamed from: b, reason: collision with root package name */
    public final r f19191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19192c;

    public W(C1481z registry, r event) {
        kotlin.jvm.internal.l.e(registry, "registry");
        kotlin.jvm.internal.l.e(event, "event");
        this.f19190a = registry;
        this.f19191b = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19192c) {
            return;
        }
        this.f19190a.d(this.f19191b);
        this.f19192c = true;
    }
}
