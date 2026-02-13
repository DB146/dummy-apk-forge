package Y5;

/* renamed from: Y5.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0659x0 extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11992b;

    public AbstractC0659x0(C0646q0 c0646q0) {
        super(c0646q0);
        ((C0646q0) this.f3094a).f11903O++;
    }

    public abstract boolean K();

    public final void L() {
        if (!this.f11992b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void M() {
        if (this.f11992b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (K()) {
            return;
        }
        ((C0646q0) this.f3094a).f11905Q.incrementAndGet();
        this.f11992b = true;
    }
}
