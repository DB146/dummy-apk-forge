package x;

import j0.AbstractC1362A;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2245o implements r {

    /* renamed from: a, reason: collision with root package name */
    public final float f26127a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26128b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26129c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26130d;

    public C2245o(float f4, float f10) {
        int D10;
        this.f26127a = f4;
        this.f26128b = f10;
        if (Float.isNaN(f4) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) {
            AbstractC2230C.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f4 + ", 0.0, " + f10 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d10 = 0.0f;
        double d11 = 3.0f;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            D10 = d11 == d12 ? 0 : AbstractC1362A.D((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int D11 = AbstractC1362A.D((float) ((-(d15 + d16)) / d14), fArr, 0);
            D10 = AbstractC1362A.D((float) ((d15 - d16) / d14), fArr, D11) + D11;
            if (D10 > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    D10--;
                }
            }
        }
        int D12 = AbstractC1362A.D(0.5f, fArr, D10) + D10;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i7 = 0; i7 < D12; i7++) {
            float f13 = fArr[i7];
            float f14 = ((((((-2.0f) * f13) + 3.0f) * f13) + 0.0f) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f26129c = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f26130d = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0219, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024c, code lost:
    
        if (java.lang.Math.abs(r4 - r3) > 1.05E-6f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c9, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L134;
     */
    @Override // x.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float d(float f4) {
        float f10;
        float f11;
        float f12;
        if (f4 <= 0.0f || f4 >= 1.0f) {
            return f4;
        }
        float max = Math.max(f4, 1.1920929E-7f);
        float f13 = this.f26127a;
        float f14 = this.f26128b;
        float f15 = f14 - max;
        double d10 = 0.0f - max;
        double d11 = ((d10 - ((f13 - max) * 2.0d)) + f15) * 3.0d;
        double d12 = (r7 - r5) * 3.0d;
        double d13 = ((r7 - f15) * 3.0d) + (-r5) + (1.0f - max);
        float f16 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d17 = (((d10 / d13) * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d18 = d16 * d16 * d16;
            double d19 = (d17 * d17) + d18;
            double d20 = d14 / 3.0d;
            if (d19 < 0.0d) {
                double sqrt = Math.sqrt(-d18);
                double d21 = (-d17) / sqrt;
                if (d21 < -1.0d) {
                    d21 = -1.0d;
                }
                if (d21 > 1.0d) {
                    d21 = 1.0d;
                }
                double acos = Math.acos(d21);
                double k = Y6.b.k((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * k) - d20);
                f12 = cos < 0.0f ? 0.0f : cos;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - cos) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (Float.isNaN(f12)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * k) - d20);
                    f12 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (Math.abs(f12 - cos2) > 1.05E-6f) {
                        f12 = Float.NaN;
                    }
                    if (Float.isNaN(f12)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * k) - d20);
                        f11 = cos3 < 0.0f ? 0.0f : cos3;
                        if (f11 > 1.0f) {
                            f11 = 1.0f;
                        }
                    }
                }
                f16 = f12;
            } else if (d19 == 0.0d) {
                float f17 = -Y6.b.k((float) d17);
                float f18 = (float) d20;
                float f19 = (2.0f * f17) - f18;
                f10 = f19 < 0.0f ? 0.0f : f19;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - f19) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float f20 = (-f17) - f18;
                    f11 = f20 < 0.0f ? 0.0f : f20;
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                }
                f16 = f10;
            } else {
                double sqrt2 = Math.sqrt(d19);
                float k7 = (float) ((Y6.b.k((float) ((-d17) + sqrt2)) - Y6.b.k((float) (d17 + sqrt2))) - d20);
                float f21 = k7 < 0.0f ? 0.0f : k7;
                f10 = f21 > 1.0f ? 1.0f : f21;
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double sqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d22 = d11 * 2.0d;
            float f22 = (float) ((sqrt3 - d12) / d22);
            f12 = f22 < 0.0f ? 0.0f : f22;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            if (Math.abs(f12 - f22) > 1.05E-6f) {
                f12 = Float.NaN;
            }
            if (Float.isNaN(f12)) {
                float f23 = (float) (((-d12) - sqrt3) / d22);
                f11 = f23 < 0.0f ? 0.0f : f23;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
            }
            f16 = f12;
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f24 = (float) ((-d10) / d12);
            f11 = f24 < 0.0f ? 0.0f : f24;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
        }
        if (!Float.isNaN(f16)) {
            float f25 = (((((-0.6666666f) * f16) + 1.0f) * f16) + 0.0f) * 3.0f * f16;
            float f26 = this.f26129c;
            if (f25 < f26) {
                f25 = f26;
            }
            float f27 = this.f26130d;
            return f25 > f27 ? f27 : f25;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f13 + ", 0.0, " + f14 + ", 1.0) has no solution at " + f4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2245o) {
            C2245o c2245o = (C2245o) obj;
            if (this.f26127a == c2245o.f26127a && this.f26128b == c2245o.f26128b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + h3.o.e(this.f26128b, h3.o.e(0.0f, Float.hashCode(this.f26127a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f26127a + ", b=0.0, c=" + this.f26128b + ", d=1.0)";
    }
}
