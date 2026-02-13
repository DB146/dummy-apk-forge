package Y5;

/* loaded from: classes.dex */
public abstract class H extends C {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11371b;

    public H(C0646q0 c0646q0) {
        super(c0646q0);
        ((C0646q0) this.f3094a).f11903O++;
    }

    public final void K() {
        if (!this.f11371b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void L() {
        if (this.f11371b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (M()) {
            return;
        }
        ((C0646q0) this.f3094a).f11905Q.incrementAndGet();
        this.f11371b = true;
    }

    public abstract boolean M();
}
