package z;

import android.widget.EdgeEffect;
import i0.C1289b;
import y.AbstractC2307o;
import y.C2283E;
import y.C2305m;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f28085a;

    public t0(w0 w0Var) {
        this.f28085a = w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i7, long j) {
        y.y yVar;
        u0.w wVar;
        float f4;
        float f10;
        float g;
        C2305m c2305m;
        y.y yVar2;
        C2305m c2305m2;
        y.y yVar3;
        C2305m c2305m3;
        boolean z8;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        w0 w0Var = this.f28085a;
        w0Var.f28128i = i7;
        C2305m c2305m4 = w0Var.f28122b;
        if (c2305m4 == null || !(w0Var.f28121a.c() || w0Var.f28121a.b())) {
            return w0.a(w0Var, w0Var.j, j, i7);
        }
        int i11 = w0Var.f28128i;
        boolean d10 = i0.e.d(c2305m4.g);
        u0.w wVar2 = w0Var.f28129l;
        if (d10) {
            wVar2.getClass();
            w0 w0Var2 = (w0) wVar2.f24808b;
            return new C1289b(w0.a(w0Var2, w0Var2.j, j, w0Var2.f28128i)).f18172a;
        }
        boolean z13 = c2305m4.f26491f;
        y.y yVar4 = c2305m4.f26488c;
        if (!z13) {
            if (y.y.g(yVar4.f26542f)) {
                c2305m4.f(0L);
            }
            if (y.y.g(yVar4.g)) {
                c2305m4.g(0L);
            }
            if (y.y.g(yVar4.f26540d)) {
                c2305m4.h(0L);
            }
            if (y.y.g(yVar4.f26541e)) {
                c2305m4.e(0L);
            }
            c2305m4.f26491f = true;
        }
        int i12 = AbstractC2307o.f26498a;
        float f11 = i11 == 2 ? 4.0f : 1.0f;
        long f12 = C1289b.f(j, f11);
        int i13 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i13) == 0.0f) {
            f4 = 0.0f;
            yVar = yVar4;
            wVar = wVar2;
        } else if (!y.y.g(yVar4.f26540d) || Float.intBitsToFloat(i13) >= 0.0f) {
            yVar = yVar4;
            if (!y.y.g(yVar.f26541e) || Float.intBitsToFloat(i13) <= 0.0f) {
                wVar = wVar2;
                f4 = 0.0f;
            } else {
                float e2 = c2305m4.e(f12);
                if (!y.y.g(yVar.f26541e)) {
                    yVar.b().finish();
                }
                wVar = wVar2;
                f4 = e2 == Float.intBitsToFloat((int) (f12 & 4294967295L)) ? Float.intBitsToFloat(i13) : e2 / f11;
            }
        } else {
            float h10 = c2305m4.h(f12);
            if (!y.y.g(yVar4.f26540d)) {
                yVar4.e().finish();
            }
            wVar = wVar2;
            f4 = h10 == Float.intBitsToFloat((int) (f12 & 4294967295L)) ? Float.intBitsToFloat(i13) : h10 / f11;
            yVar = yVar4;
        }
        char c10 = ' ';
        int i14 = (int) (j >> 32);
        if (Float.intBitsToFloat(i14) == 0.0f) {
            f10 = 0.0f;
        } else if (y.y.g(yVar.f26542f) && Float.intBitsToFloat(i14) < 0.0f) {
            g = c2305m4.f(f12);
            if (!y.y.g(yVar.f26542f)) {
                yVar.c().finish();
            }
            if (g == Float.intBitsToFloat((int) (f12 >> 32))) {
                f10 = Float.intBitsToFloat(i14);
            }
            f10 = g / f11;
        } else if (!y.y.g(yVar.g) || Float.intBitsToFloat(i14) <= 0.0f) {
            f10 = 0.0f;
        } else {
            g = c2305m4.g(f12);
            if (!y.y.g(yVar.g)) {
                yVar.d().finish();
            }
            if (g == Float.intBitsToFloat((int) (f12 >> 32))) {
                f10 = Float.intBitsToFloat(i14);
            }
            f10 = g / f11;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        if (!C1289b.b(floatToRawIntBits, 0L)) {
            c2305m4.d();
        }
        long d11 = C1289b.d(j, floatToRawIntBits);
        wVar.getClass();
        w0 w0Var3 = (w0) wVar.f24808b;
        long j10 = new C1289b(w0.a(w0Var3, w0Var3.j, d11, w0Var3.f28128i)).f18172a;
        long d12 = C1289b.d(d11, j10);
        if (Float.intBitsToFloat((int) (d11 >> 32)) == 0.0f) {
            c2305m = c2305m4;
            if (Float.intBitsToFloat((int) (d11 & 4294967295L)) == 0.0f) {
                c2305m2 = c2305m;
                yVar3 = yVar;
                if (!(i11 != 1)) {
                    int i15 = (int) (d12 >> 32);
                    if (Float.intBitsToFloat(i15) > 0.5f) {
                        c2305m3 = c2305m2;
                        c2305m3.f(d12);
                    } else {
                        c2305m3 = c2305m2;
                        if (Float.intBitsToFloat(i15) >= -0.5f) {
                            z11 = false;
                            i10 = (int) (d12 & 4294967295L);
                            if (Float.intBitsToFloat(i10) <= 0.5f) {
                                c2305m3.h(d12);
                            } else if (Float.intBitsToFloat(i10) < -0.5f) {
                                c2305m3.e(d12);
                            } else {
                                z12 = false;
                                if (!z11 || z12) {
                                    z8 = true;
                                    if (!C1289b.b(d11, 0L)) {
                                        if (!y.y.f(yVar3.f26542f) || Float.intBitsToFloat(i14) >= 0.0f) {
                                            z10 = false;
                                        } else {
                                            EdgeEffect c11 = yVar3.c();
                                            float intBitsToFloat = Float.intBitsToFloat(i14);
                                            if (c11 instanceof C2283E) {
                                                C2283E c2283e = (C2283E) c11;
                                                float f13 = c2283e.f26402b + intBitsToFloat;
                                                c2283e.f26402b = f13;
                                                if (Math.abs(f13) > c2283e.f26401a) {
                                                    c2283e.onRelease();
                                                }
                                            } else {
                                                c11.onRelease();
                                            }
                                            z10 = y.y.f(yVar3.f26542f);
                                        }
                                        if (y.y.f(yVar3.g) && Float.intBitsToFloat(i14) > 0.0f) {
                                            EdgeEffect d13 = yVar3.d();
                                            float intBitsToFloat2 = Float.intBitsToFloat(i14);
                                            if (d13 instanceof C2283E) {
                                                C2283E c2283e2 = (C2283E) d13;
                                                float f14 = c2283e2.f26402b + intBitsToFloat2;
                                                c2283e2.f26402b = f14;
                                                if (Math.abs(f14) > c2283e2.f26401a) {
                                                    c2283e2.onRelease();
                                                }
                                            } else {
                                                d13.onRelease();
                                            }
                                            z10 = z10 || y.y.f(yVar3.g);
                                        }
                                        if (y.y.f(yVar3.f26540d) && Float.intBitsToFloat(i13) < 0.0f) {
                                            EdgeEffect e10 = yVar3.e();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i13);
                                            if (e10 instanceof C2283E) {
                                                C2283E c2283e3 = (C2283E) e10;
                                                float f15 = c2283e3.f26402b + intBitsToFloat3;
                                                c2283e3.f26402b = f15;
                                                if (Math.abs(f15) > c2283e3.f26401a) {
                                                    c2283e3.onRelease();
                                                }
                                            } else {
                                                e10.onRelease();
                                            }
                                            z10 = z10 || y.y.f(yVar3.f26540d);
                                        }
                                        if (y.y.f(yVar3.f26541e) && Float.intBitsToFloat(i13) > 0.0f) {
                                            EdgeEffect b2 = yVar3.b();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i13);
                                            if (b2 instanceof C2283E) {
                                                C2283E c2283e4 = (C2283E) b2;
                                                float f16 = c2283e4.f26402b + intBitsToFloat4;
                                                c2283e4.f26402b = f16;
                                                if (Math.abs(f16) > c2283e4.f26401a) {
                                                    c2283e4.onRelease();
                                                }
                                            } else {
                                                b2.onRelease();
                                            }
                                            z10 = z10 || y.y.f(yVar3.f26541e);
                                        }
                                        z8 = z10 || z8;
                                    }
                                    if (z8) {
                                        c2305m3.d();
                                    }
                                    return C1289b.e(floatToRawIntBits, j10);
                                }
                            }
                            z12 = true;
                            if (!z11) {
                            }
                            z8 = true;
                            if (!C1289b.b(d11, 0L)) {
                            }
                            if (z8) {
                            }
                            return C1289b.e(floatToRawIntBits, j10);
                        }
                        c2305m3.g(d12);
                    }
                    z11 = true;
                    i10 = (int) (d12 & 4294967295L);
                    if (Float.intBitsToFloat(i10) <= 0.5f) {
                    }
                    z12 = true;
                    if (!z11) {
                    }
                    z8 = true;
                    if (!C1289b.b(d11, 0L)) {
                    }
                    if (z8) {
                    }
                    return C1289b.e(floatToRawIntBits, j10);
                }
                c2305m3 = c2305m2;
                z8 = false;
                if (!C1289b.b(d11, 0L)) {
                }
                if (z8) {
                }
                return C1289b.e(floatToRawIntBits, j10);
            }
            yVar2 = yVar;
            c10 = ' ';
        } else {
            c2305m = c2305m4;
            yVar2 = yVar;
        }
        c2305m2 = c2305m;
        if (Float.intBitsToFloat((int) (j10 >> c10)) == 0.0f && Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) {
            yVar3 = yVar2;
        } else {
            yVar3 = yVar2;
            if (y.y.g(yVar3.f26542f) || y.y.g(yVar3.f26540d) || y.y.g(yVar3.g) || y.y.g(yVar3.f26541e)) {
                c2305m2.a();
            }
        }
        if (!(i11 != 1)) {
        }
        z8 = false;
        if (!C1289b.b(d11, 0L)) {
        }
        if (z8) {
        }
        return C1289b.e(floatToRawIntBits, j10);
    }
}
