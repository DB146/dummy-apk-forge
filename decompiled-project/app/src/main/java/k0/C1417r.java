package k0;

/* renamed from: k0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417r {

    /* renamed from: a, reason: collision with root package name */
    public final double f18750a;

    /* renamed from: b, reason: collision with root package name */
    public final double f18751b;

    /* renamed from: c, reason: collision with root package name */
    public final double f18752c;

    /* renamed from: d, reason: collision with root package name */
    public final double f18753d;

    /* renamed from: e, reason: collision with root package name */
    public final double f18754e;

    /* renamed from: f, reason: collision with root package name */
    public final double f18755f;
    public final double g;

    public /* synthetic */ C1417r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public C1417r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f18750a = d10;
        this.f18751b = d11;
        this.f18752c = d12;
        this.f18753d = d13;
        this.f18754e = d14;
        this.f18755f = d15;
        this.g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417r)) {
            return false;
        }
        C1417r c1417r = (C1417r) obj;
        return Double.compare(this.f18750a, c1417r.f18750a) == 0 && Double.compare(this.f18751b, c1417r.f18751b) == 0 && Double.compare(this.f18752c, c1417r.f18752c) == 0 && Double.compare(this.f18753d, c1417r.f18753d) == 0 && Double.compare(this.f18754e, c1417r.f18754e) == 0 && Double.compare(this.f18755f, c1417r.f18755f) == 0 && Double.compare(this.g, c1417r.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((Double.hashCode(this.f18755f) + ((Double.hashCode(this.f18754e) + ((Double.hashCode(this.f18753d) + ((Double.hashCode(this.f18752c) + ((Double.hashCode(this.f18751b) + (Double.hashCode(this.f18750a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f18750a + ", a=" + this.f18751b + ", b=" + this.f18752c + ", c=" + this.f18753d + ", d=" + this.f18754e + ", e=" + this.f18755f + ", f=" + this.g + ')';
    }
}
