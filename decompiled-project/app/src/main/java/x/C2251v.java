package x;

/* renamed from: x.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2251v implements InterfaceC2250u {

    /* renamed from: a, reason: collision with root package name */
    public final float f26154a;

    /* renamed from: b, reason: collision with root package name */
    public final P f26155b;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, x.P] */
    public C2251v(float f4, float f10) {
        this.f26154a = f10;
        ?? obj = new Object();
        obj.f25975a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.f25976b = sqrt;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            AbstractC2230C.a("Spring stiffness constant must be positive.");
        }
        obj.f25976b = Math.sqrt(f4);
        this.f26155b = obj;
    }

    @Override // x.InterfaceC2250u
    public final float b(long j, float f4, float f10, float f11) {
        P p10 = this.f26155b;
        p10.f25975a = f10;
        return Float.intBitsToFloat((int) (p10.a(f4, f11, j / 1000000) >> 32));
    }

    @Override // x.InterfaceC2250u
    public final float c(long j, float f4, float f10, float f11) {
        P p10 = this.f26155b;
        p10.f25975a = f10;
        return Float.intBitsToFloat((int) (p10.a(f4, f11, j / 1000000) & 4294967295L));
    }

    @Override // x.InterfaceC2250u
    public final long d(float f4, float f10, float f11) {
        double d10;
        double d11;
        long j;
        double d12;
        double d13 = this.f26155b.f25976b;
        float f12 = this.f26154a;
        double d14 = (float) (d13 * d13);
        double d15 = 1.0f;
        double d16 = f11 / f12;
        double d17 = (f4 - f10) / f12;
        double sqrt = Math.sqrt(d14) * d15 * 2.0d;
        double d18 = (sqrt * sqrt) - (d14 * 4.0d);
        double sqrt2 = d18 < 0.0d ? 0.0d : Math.sqrt(d18);
        double d19 = -sqrt;
        double d20 = (d19 + sqrt2) * 0.5d;
        double sqrt3 = (d18 < 0.0d ? Math.sqrt(Math.abs(d18)) : 0.0d) * 0.5d;
        double d21 = (d19 - sqrt2) * 0.5d;
        if (d17 == 0.0d && d16 == 0.0d) {
            j = 0;
        } else {
            if (d17 < 0.0d) {
                d16 = -d16;
            }
            double abs = Math.abs(d17);
            double d22 = Double.MAX_VALUE;
            if (d15 > 1.0d) {
                double d23 = (d20 * abs) - d16;
                double d24 = d20 - d21;
                double d25 = d23 / d24;
                double d26 = abs - d25;
                d11 = Math.log(Math.abs(d15 / d26)) / d20;
                double log = Math.log(Math.abs(d15 / d25)) / d21;
                if ((Double.doubleToRawLongBits(d11) & Long.MAX_VALUE) >= 9218868437227405312L) {
                    d11 = log;
                } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                    d11 = Math.max(d11, log);
                }
                double d27 = d26 * d20;
                double log2 = Math.log(d27 / ((-d25) * d21)) / (d21 - d20);
                if (Double.isNaN(log2) || log2 <= 0.0d) {
                    d12 = -d15;
                } else {
                    if (log2 > 0.0d) {
                        if ((-((Math.exp(log2 * d21) * d25) + (Math.exp(d20 * log2) * d26))) < d15) {
                            d12 = -d15;
                            d11 = (d25 <= 0.0d || d26 >= 0.0d) ? d11 : 0.0d;
                        }
                    }
                    d12 = d15;
                    d11 = Math.log((-((d25 * d21) * d21)) / (d27 * d20)) / d24;
                }
                double d28 = d25 * d21;
                if (Math.abs((Math.exp(d21 * d11) * d28) + (Math.exp(d20 * d11) * d27)) >= 1.0E-4d) {
                    int i7 = 0;
                    while (d22 > 0.001d && i7 < 100) {
                        i7++;
                        double d29 = d20 * d11;
                        double d30 = d21 * d11;
                        double exp = d11 - ((((Math.exp(d30) * d25) + (Math.exp(d29) * d26)) + d12) / ((Math.exp(d30) * d28) + (Math.exp(d29) * d27)));
                        double abs2 = Math.abs(d11 - exp);
                        d11 = exp;
                        d22 = abs2;
                    }
                }
            } else if (d15 < 1.0d) {
                double d31 = (d16 - (d20 * abs)) / sqrt3;
                d11 = Math.log(d15 / Math.sqrt((d31 * d31) + (abs * abs))) / d20;
            } else {
                double d32 = d20 * abs;
                double d33 = d16 - d32;
                double log3 = Math.log(Math.abs(d15 / abs)) / d20;
                double log4 = Math.log(Math.abs(d15 / d33));
                double d34 = log4;
                for (int i10 = 0; i10 < 6; i10++) {
                    d34 = log4 - Math.log(Math.abs(d34 / d20));
                }
                double d35 = d34 / d20;
                if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                    log3 = d35;
                } else if ((Double.doubleToRawLongBits(d35) & Long.MAX_VALUE) < 9218868437227405312L) {
                    log3 = Math.max(log3, d35);
                }
                double d36 = (-(d32 + d33)) / (d20 * d33);
                double d37 = d20 * d36;
                double exp2 = (Math.exp(d37) * d33 * d36) + (Math.exp(d37) * abs);
                if (Double.isNaN(d36) || d36 <= 0.0d) {
                    d10 = -d15;
                } else if (d36 <= 0.0d || (-exp2) >= d15) {
                    log3 = (-(2.0d / d20)) - (abs / d33);
                    d10 = d15;
                } else {
                    d10 = -d15;
                    log3 = (d33 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                }
                int i11 = 0;
                while (d22 > 0.001d && i11 < 100) {
                    i11++;
                    double d38 = d20 * log3;
                    double exp3 = log3 - (((Math.exp(d38) * ((d33 * log3) + abs)) + d10) / (Math.exp(d38) * (((d38 + 1) * d33) + d32)));
                    d22 = Math.abs(log3 - exp3);
                    log3 = exp3;
                }
                d11 = log3;
            }
            j = (long) (d11 * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // x.InterfaceC2250u
    public final float e(float f4, float f10, float f11) {
        return 0.0f;
    }
}
