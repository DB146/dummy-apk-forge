package y1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class Y extends Z {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f26672e;

    public Y(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f26672e = windowInsetsAnimation;
    }

    @Override // y1.Z
    public final long a() {
        long durationMillis;
        durationMillis = this.f26672e.getDurationMillis();
        return durationMillis;
    }

    @Override // y1.Z
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f26672e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // y1.Z
    public final int c() {
        int typeMask;
        typeMask = this.f26672e.getTypeMask();
        return typeMask;
    }

    @Override // y1.Z
    public final void d(float f4) {
        this.f26672e.setFraction(f4);
    }
}
