package R1;

import w.AbstractC2175b;
import w.K;
import w.L;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f8814a;

    /* renamed from: b, reason: collision with root package name */
    public float f8815b;

    public K a(float f4) {
        double b2 = b(f4);
        double d10 = L.f25518a;
        double d11 = d10 - 1.0d;
        return new K(f4, (float) (Math.exp((d10 / d11) * b2) * this.f8814a * this.f8815b), (long) (Math.exp(b2 / d11) * 1000.0d));
    }

    public double b(float f4) {
        float[] fArr = AbstractC2175b.f25547a;
        return Math.log((Math.abs(f4) * 0.35f) / (this.f8814a * this.f8815b));
    }
}
