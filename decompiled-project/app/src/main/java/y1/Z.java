package y1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f26673a;

    /* renamed from: b, reason: collision with root package name */
    public float f26674b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f26675c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26676d;

    public Z(int i7, Interpolator interpolator, long j) {
        this.f26673a = i7;
        this.f26675c = interpolator;
        this.f26676d = j;
    }

    public long a() {
        return this.f26676d;
    }

    public float b() {
        Interpolator interpolator = this.f26675c;
        return interpolator != null ? interpolator.getInterpolation(this.f26674b) : this.f26674b;
    }

    public int c() {
        return this.f26673a;
    }

    public void d(float f4) {
        this.f26674b = f4;
    }
}
