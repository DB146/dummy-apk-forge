package j0;

import h3.H;
import k0.AbstractC1402c;
import k0.AbstractC1407h;
import k0.AbstractC1409j;
import k0.C1403d;
import k0.C1406g;
import u.C2070x;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final long f18548b = AbstractC1362A.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f18549c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f18550d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f18551e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f18552f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f18553h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f18554a;

    static {
        AbstractC1362A.c(4282664004L);
        AbstractC1362A.c(4287137928L);
        AbstractC1362A.c(4291611852L);
        f18549c = AbstractC1362A.c(4294967295L);
        f18550d = AbstractC1362A.c(4294901760L);
        AbstractC1362A.c(4278255360L);
        f18551e = AbstractC1362A.c(4278190335L);
        AbstractC1362A.c(4294967040L);
        AbstractC1362A.c(4278255615L);
        AbstractC1362A.c(4294902015L);
        f18552f = AbstractC1362A.b(0);
        g = AbstractC1362A.a(0.0f, 0.0f, 0.0f, 0.0f, C1403d.f18709u);
    }

    public /* synthetic */ n(long j) {
        this.f18554a = j;
    }

    public static final long a(long j, AbstractC1402c abstractC1402c) {
        C1406g c1406g;
        AbstractC1402c f4 = f(j);
        int i7 = f4.f18691c;
        int i10 = abstractC1402c.f18691c;
        if ((i7 | i10) < 0) {
            c1406g = AbstractC1409j.e(f4, abstractC1402c);
        } else {
            C2070x c2070x = AbstractC1407h.f18720a;
            int i11 = i7 | (i10 << 6);
            Object b2 = c2070x.b(i11);
            if (b2 == null) {
                b2 = AbstractC1409j.e(f4, abstractC1402c);
                c2070x.g(i11, b2);
            }
            c1406g = (C1406g) b2;
        }
        return c1406g.a(j);
    }

    public static long b(long j, float f4) {
        return AbstractC1362A.a(h(j), g(j), e(j), f4, f(j));
    }

    public static final boolean c(long j, long j10) {
        return j == j10;
    }

    public static final float d(long j) {
        float H10;
        float f4;
        if ((63 & j) == 0) {
            H10 = (float) H.H((j >>> 56) & 255);
            f4 = 255.0f;
        } else {
            H10 = (float) H.H((j >>> 6) & 1023);
            f4 = 1023.0f;
        }
        return H10 / f4;
    }

    public static final float e(long j) {
        int i7;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) H.H((j >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 16) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i7 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i7 = i13 + 112;
            }
            int i16 = i7;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - r.f18557a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final AbstractC1402c f(long j) {
        float[] fArr = C1403d.f18692a;
        return C1403d.f18713y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i7;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) H.H((j >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 32) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i7 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i7 = i13 + 112;
            }
            int i16 = i7;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - r.f18557a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float h(long j) {
        int i7;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) H.H((j >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 48) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i7 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i7 = i13 + 112;
            }
            int i16 = i7;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - r.f18557a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static String i(long j) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j));
        sb2.append(", ");
        sb2.append(g(j));
        sb2.append(", ");
        sb2.append(e(j));
        sb2.append(", ");
        sb2.append(d(j));
        sb2.append(", ");
        return A3.c.l(sb2, f(j).f18689a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f18554a == ((n) obj).f18554a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18554a);
    }

    public final String toString() {
        return i(this.f18554a);
    }
}
