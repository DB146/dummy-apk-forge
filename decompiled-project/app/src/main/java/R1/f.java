package R1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f8826a;

    /* renamed from: b, reason: collision with root package name */
    public double f8827b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8828c;

    /* renamed from: d, reason: collision with root package name */
    public double f8829d;

    /* renamed from: e, reason: collision with root package name */
    public double f8830e;

    /* renamed from: f, reason: collision with root package name */
    public double f8831f;
    public double g;

    /* renamed from: h, reason: collision with root package name */
    public double f8832h;

    /* renamed from: i, reason: collision with root package name */
    public double f8833i;
    public final d j;

    /* JADX WARN: Type inference failed for: r0v5, types: [R1.d, java.lang.Object] */
    public f() {
        this.f8826a = Math.sqrt(1500.0d);
        this.f8827b = 0.5d;
        this.f8828c = false;
        this.f8833i = Double.MAX_VALUE;
        this.j = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [R1.d, java.lang.Object] */
    public f(float f4) {
        this.f8826a = Math.sqrt(1500.0d);
        this.f8827b = 0.5d;
        this.f8828c = false;
        this.j = new Object();
        this.f8833i = f4;
    }

    public final d a(double d10, double d11, long j) {
        double cos;
        double d12;
        if (!this.f8828c) {
            if (this.f8833i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d13 = this.f8827b;
            if (d13 > 1.0d) {
                double d14 = this.f8826a;
                this.f8831f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                double d15 = this.f8827b;
                double d16 = this.f8826a;
                this.g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
            } else if (d13 >= 0.0d && d13 < 1.0d) {
                this.f8832h = Math.sqrt(1.0d - (d13 * d13)) * this.f8826a;
            }
            this.f8828c = true;
        }
        double d17 = j / 1000.0d;
        double d18 = d10 - this.f8833i;
        double d19 = this.f8827b;
        if (d19 > 1.0d) {
            double d20 = this.g;
            double d21 = ((d20 * d18) - d11) / (d20 - this.f8831f);
            double d22 = d18 - d21;
            d12 = (Math.pow(2.718281828459045d, this.f8831f * d17) * d21) + (Math.pow(2.718281828459045d, d20 * d17) * d22);
            double d23 = this.g;
            double pow = Math.pow(2.718281828459045d, d23 * d17) * d22 * d23;
            double d24 = this.f8831f;
            cos = (Math.pow(2.718281828459045d, d24 * d17) * d21 * d24) + pow;
        } else if (d19 == 1.0d) {
            double d25 = this.f8826a;
            double d26 = (d25 * d18) + d11;
            double d27 = (d26 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d25) * d17) * d27;
            double pow3 = Math.pow(2.718281828459045d, (-this.f8826a) * d17) * d27;
            double d28 = -this.f8826a;
            cos = (Math.pow(2.718281828459045d, d28 * d17) * d26) + (pow3 * d28);
            d12 = pow2;
        } else {
            double d29 = 1.0d / this.f8832h;
            double d30 = this.f8826a;
            double d31 = ((d19 * d30 * d18) + d11) * d29;
            double sin = ((Math.sin(this.f8832h * d17) * d31) + (Math.cos(this.f8832h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d30 * d17);
            double d32 = this.f8826a;
            double d33 = this.f8827b;
            double d34 = (-d32) * sin * d33;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d17);
            double d35 = this.f8832h;
            double sin2 = Math.sin(d35 * d17) * (-d35) * d18;
            double d36 = this.f8832h;
            cos = (((Math.cos(d36 * d17) * d31 * d36) + sin2) * pow4) + d34;
            d12 = sin;
        }
        float f4 = (float) (d12 + this.f8833i);
        d dVar = this.j;
        dVar.f8814a = f4;
        dVar.f8815b = (float) cos;
        return dVar;
    }
}
