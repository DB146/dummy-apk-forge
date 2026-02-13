package k0;

import ha.C1265a;
import j0.AbstractC1362A;
import java.util.Arrays;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416q extends AbstractC1402c {

    /* renamed from: r, reason: collision with root package name */
    public static final C1265a f18738r = new C1265a(8);

    /* renamed from: d, reason: collision with root package name */
    public final C1418s f18739d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18740e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18741f;
    public final C1417r g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f18742h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f18743i;
    public final float[] j;
    public final InterfaceC1408i k;

    /* renamed from: l, reason: collision with root package name */
    public final C1415p f18744l;

    /* renamed from: m, reason: collision with root package name */
    public final C1412m f18745m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1408i f18746n;

    /* renamed from: o, reason: collision with root package name */
    public final C1415p f18747o;

    /* renamed from: p, reason: collision with root package name */
    public final C1412m f18748p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18749q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1416q(String str, float[] fArr, C1418s c1418s, final double d10, float f4, float f10, int i7) {
        this(str, fArr, c1418s, null, r11, r3, f4, f10, new C1417r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i7);
        InterfaceC1408i interfaceC1408i;
        InterfaceC1408i interfaceC1408i2 = f18738r;
        if (d10 == 1.0d) {
            interfaceC1408i = interfaceC1408i2;
        } else {
            final int i10 = 0;
            interfaceC1408i = new InterfaceC1408i() { // from class: k0.n
                @Override // k0.InterfaceC1408i
                public final double a(double d11) {
                    switch (i10) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i11 = 1;
            interfaceC1408i2 = new InterfaceC1408i() { // from class: k0.n
                @Override // k0.InterfaceC1408i
                public final double a(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1416q(String str, float[] fArr, C1418s c1418s, final C1417r c1417r, int i7) {
        this(str, fArr, c1418s, null, r14, r0, 0.0f, 1.0f, c1417r, i7);
        InterfaceC1408i interfaceC1408i;
        InterfaceC1408i interfaceC1408i2;
        double d10 = c1417r.f18750a;
        boolean z8 = d10 == -3.0d;
        double d11 = c1417r.g;
        double d12 = c1417r.f18755f;
        if (z8) {
            final int i10 = 4;
            interfaceC1408i = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i11 = 5;
            interfaceC1408i = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i12 = 6;
            interfaceC1408i = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else {
            final int i13 = 7;
            interfaceC1408i = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        }
        InterfaceC1408i interfaceC1408i3 = interfaceC1408i;
        if (d10 == -3.0d) {
            final int i14 = 0;
            interfaceC1408i2 = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i15 = 1;
            interfaceC1408i2 = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i16 = 2;
            interfaceC1408i2 = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        } else {
            final int i17 = 3;
            interfaceC1408i2 = new InterfaceC1408i() { // from class: k0.o
                @Override // k0.InterfaceC1408i
                public final double a(double d13) {
                    C1417r c1417r2 = c1417r;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = C1403d.f18692a;
                            return C1403d.a(c1417r2, d13);
                        case 1:
                            float[] fArr3 = C1403d.f18692a;
                            return C1403d.c(c1417r2, d13);
                        case 2:
                            return d13 >= c1417r2.f18754e ? Math.pow((c1417r2.f18751b * d13) + c1417r2.f18752c, c1417r2.f18750a) : d13 * c1417r2.f18753d;
                        case 3:
                            double d14 = c1417r2.f18751b;
                            if (d13 >= c1417r2.f18754e) {
                                return Math.pow((d14 * d13) + c1417r2.f18752c, c1417r2.f18750a) + c1417r2.f18755f;
                            }
                            return c1417r2.g + (c1417r2.f18753d * d13);
                        case 4:
                            float[] fArr4 = C1403d.f18692a;
                            return C1403d.b(c1417r2, d13);
                        case 5:
                            float[] fArr5 = C1403d.f18692a;
                            return C1403d.d(c1417r2, d13);
                        case 6:
                            double d15 = c1417r2.f18754e;
                            double d16 = c1417r2.f18753d;
                            return d13 >= d15 * d16 ? (Math.pow(d13, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / c1417r2.f18751b : d13 / d16;
                        default:
                            double d17 = c1417r2.f18751b;
                            double d18 = c1417r2.f18754e;
                            double d19 = c1417r2.f18753d;
                            return d13 >= d18 * d19 ? (Math.pow(d13 - c1417r2.f18755f, 1.0d / c1417r2.f18750a) - c1417r2.f18752c) / d17 : (d13 - c1417r2.g) / d19;
                    }
                }
            };
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ef, code lost:
    
        if ((((r25 - r13) * r9) - ((r3 - r16) * r11)) >= 0.0f) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1416q(String str, float[] fArr, C1418s c1418s, float[] fArr2, InterfaceC1408i interfaceC1408i, InterfaceC1408i interfaceC1408i2, float f4, float f10, C1417r c1417r, int i7) {
        super(str, AbstractC1401b.f18684a, i7);
        boolean z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        int i10 = 1;
        this.f18739d = c1418s;
        this.f18740e = f4;
        this.f18741f = f10;
        this.g = c1417r;
        this.k = interfaceC1408i;
        this.f18744l = new C1415p(this, i10);
        this.f18745m = new C1412m(this, z8 ? 1 : 0);
        this.f18746n = interfaceC1408i2;
        this.f18747o = new C1415p(this, z8 ? 1 : 0);
        this.f18748p = new C1412m(this, i10);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f4 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f4 + ", max=" + f10 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = f11 + f12 + fArr[2];
            fArr3[0] = f11 / f13;
            fArr3[1] = f12 / f13;
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = f14 + f15 + fArr[5];
            fArr3[2] = f14 / f16;
            fArr3[3] = f15 / f16;
            float f17 = fArr[6];
            float f18 = fArr[7];
            float f19 = f17 + f18 + fArr[8];
            fArr3[4] = f17 / f19;
            fArr3[5] = f18 / f19;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f18742h = fArr3;
        if (fArr2 == null) {
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr3[2];
            float f23 = fArr3[3];
            float f24 = fArr3[4];
            float f25 = fArr3[5];
            float f26 = 1;
            float f27 = (f26 - f20) / f21;
            float f28 = (f26 - f22) / f23;
            float f29 = (f26 - f24) / f25;
            float f30 = c1418s.f18756a;
            float f31 = c1418s.f18757b;
            float f32 = (f26 - f30) / f31;
            float f33 = f20 / f21;
            float f34 = (f22 / f23) - f33;
            float f35 = (f30 / f31) - f33;
            float f36 = f28 - f27;
            float f37 = (f24 / f25) - f33;
            float f38 = (((f32 - f27) * f34) - (f35 * f36)) / (((f29 - f27) * f34) - (f36 * f37));
            float f39 = (f35 - (f37 * f38)) / f34;
            float f40 = (1.0f - f39) - f38;
            float f41 = f40 / f21;
            float f42 = f39 / f23;
            float f43 = f38 / f25;
            this.f18743i = new float[]{f41 * f20, f40, ((1.0f - f20) - f21) * f41, f42 * f22, f39, ((1.0f - f22) - f23) * f42, f43 * f24, f38, ((1.0f - f24) - f25) * f43};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f18743i = fArr2;
        }
        this.j = AbstractC1409j.f(this.f18743i);
        float b2 = AbstractC1409j.b(fArr3);
        float[] fArr4 = C1403d.f18692a;
        if (b2 / AbstractC1409j.b(C1403d.f18693b) > 0.9f) {
            float[] fArr5 = C1403d.f18692a;
            float f44 = fArr3[0];
            float f45 = fArr5[0];
            float f46 = fArr3[1];
            float f47 = fArr5[1];
            float f48 = fArr3[2];
            float f49 = fArr5[2];
            float f50 = fArr3[3];
            float f51 = fArr5[3];
            float f52 = fArr3[4];
            float f53 = fArr5[4];
            float f54 = fArr3[5];
            float f55 = fArr5[5];
            float[] fArr6 = {f44 - f45, f46 - f47, f48 - f49, f50 - f51, f52 - f53, f54 - f55};
            float f56 = fArr6[0];
            float f57 = fArr6[1];
            if (((f47 - f55) * f56) - ((f45 - f53) * f57) >= 0.0f && ((f45 - f49) * f57) - ((f47 - f51) * f56) >= 0.0f) {
                float f58 = fArr6[2];
                float f59 = fArr6[3];
                if (((f51 - f47) * f58) - ((f49 - f45) * f59) >= 0.0f && ((f49 - f53) * f59) - ((f51 - f55) * f58) >= 0.0f) {
                    float f60 = fArr6[4];
                    float f61 = fArr6[5];
                    if (((f55 - f51) * f60) - ((f53 - f49) * f61) >= 0.0f) {
                    }
                }
            }
        }
        int i11 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i7 == 0) {
            z8 = true;
        } else {
            float[] fArr7 = C1403d.f18692a;
            if (fArr3 != fArr7) {
                for (int i12 = 0; i12 < 6; i12++) {
                    if (Float.compare(fArr3[i12], fArr7[i12]) != 0 && Math.abs(fArr3[i12] - fArr7[i12]) > 0.001f) {
                        break;
                    }
                }
            }
            if (AbstractC1409j.d(c1418s, AbstractC1409j.f18724d) && f4 == 0.0f && f10 == 1.0f) {
                float[] fArr8 = C1403d.f18692a;
                C1416q c1416q = C1403d.f18696e;
                double d10 = 0.0d;
                while (true) {
                    if (d10 > 1.0d) {
                        z8 = true;
                        break;
                    } else if (Math.abs(interfaceC1408i.a(d10) - c1416q.k.a(d10)) > 0.001d || Math.abs(interfaceC1408i2.a(d10) - c1416q.f18746n.a(d10)) > 0.001d) {
                        break;
                    } else {
                        d10 += 0.00392156862745098d;
                    }
                }
            }
        }
        this.f18749q = z8;
    }

    @Override // k0.AbstractC1402c
    public final float a(int i7) {
        return this.f18741f;
    }

    @Override // k0.AbstractC1402c
    public final float b(int i7) {
        return this.f18740e;
    }

    @Override // k0.AbstractC1402c
    public final boolean c() {
        return this.f18749q;
    }

    @Override // k0.AbstractC1402c
    public final long d(float f4, float f10, float f11) {
        double d10 = f4;
        C1412m c1412m = this.f18748p;
        float a9 = (float) c1412m.a(d10);
        float a10 = (float) c1412m.a(f10);
        float a11 = (float) c1412m.a(f11);
        float[] fArr = this.f18743i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * a11) + (fArr[3] * a10) + (fArr[0] * a9);
        float f13 = (fArr[7] * a11) + (fArr[4] * a10) + (fArr[1] * a9);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // k0.AbstractC1402c
    public final float e(float f4, float f10, float f11) {
        double d10 = f4;
        C1412m c1412m = this.f18748p;
        float a9 = (float) c1412m.a(d10);
        float a10 = (float) c1412m.a(f10);
        float a11 = (float) c1412m.a(f11);
        float[] fArr = this.f18743i;
        return (fArr[8] * a11) + (fArr[5] * a10) + (fArr[2] * a9);
    }

    @Override // k0.AbstractC1402c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1416q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1416q c1416q = (C1416q) obj;
        if (Float.compare(c1416q.f18740e, this.f18740e) != 0 || Float.compare(c1416q.f18741f, this.f18741f) != 0 || !kotlin.jvm.internal.l.a(this.f18739d, c1416q.f18739d) || !Arrays.equals(this.f18742h, c1416q.f18742h)) {
            return false;
        }
        C1417r c1417r = c1416q.g;
        C1417r c1417r2 = this.g;
        if (c1417r2 != null) {
            return kotlin.jvm.internal.l.a(c1417r2, c1417r);
        }
        if (c1417r == null) {
            return true;
        }
        if (kotlin.jvm.internal.l.a(this.k, c1416q.k)) {
            return kotlin.jvm.internal.l.a(this.f18746n, c1416q.f18746n);
        }
        return false;
    }

    @Override // k0.AbstractC1402c
    public final long f(float f4, float f10, float f11, float f12, AbstractC1402c abstractC1402c) {
        float[] fArr = this.j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f4);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f4);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f4);
        C1412m c1412m = this.f18745m;
        return AbstractC1362A.a((float) c1412m.a(f13), (float) c1412m.a(f14), (float) c1412m.a(f15), f12, abstractC1402c);
    }

    @Override // k0.AbstractC1402c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f18742h) + ((this.f18739d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f4 = this.f18740e;
        int floatToIntBits = (hashCode + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        float f10 = this.f18741f;
        int floatToIntBits2 = (floatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        C1417r c1417r = this.g;
        int hashCode2 = floatToIntBits2 + (c1417r != null ? c1417r.hashCode() : 0);
        if (c1417r == null) {
            return this.f18746n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }
}
