package Y5;

/* loaded from: classes.dex */
public abstract class D1 extends z1 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f11243c;

    public D1(I1 i12) {
        super(i12);
        this.f12021b.f11385F++;
    }

    public final void K() {
        if (!this.f11243c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void L() {
        if (this.f11243c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        M();
        this.f12021b.f11386G++;
        this.f11243c = true;
    }

    public abstract void M();
}
