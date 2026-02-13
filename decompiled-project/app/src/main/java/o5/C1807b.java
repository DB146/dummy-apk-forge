package o5;

import java.util.Arrays;
import m4.InterfaceC1569g;
import n5.D;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1807b implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final C1807b f21935f = new C1807b(1, null, 2, 3);

    /* renamed from: u, reason: collision with root package name */
    public static final String f21936u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f21937v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f21938w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f21939x;

    /* renamed from: y, reason: collision with root package name */
    public static final n4.c f21940y;

    /* renamed from: a, reason: collision with root package name */
    public final int f21941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21943c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21944d;

    /* renamed from: e, reason: collision with root package name */
    public int f21945e;

    static {
        int i7 = D.f21141a;
        f21936u = Integer.toString(0, 36);
        f21937v = Integer.toString(1, 36);
        f21938w = Integer.toString(2, 36);
        f21939x = Integer.toString(3, 36);
        f21940y = new n4.c(22);
    }

    public C1807b(int i7, byte[] bArr, int i10, int i11) {
        this.f21941a = i7;
        this.f21942b = i10;
        this.f21943c = i11;
        this.f21944d = bArr;
    }

    public static String a(int i7) {
        return i7 != -1 ? i7 != 10 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 6 ? i7 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1807b.class != obj.getClass()) {
            return false;
        }
        C1807b c1807b = (C1807b) obj;
        return this.f21941a == c1807b.f21941a && this.f21942b == c1807b.f21942b && this.f21943c == c1807b.f21943c && Arrays.equals(this.f21944d, c1807b.f21944d);
    }

    public final int hashCode() {
        if (this.f21945e == 0) {
            this.f21945e = Arrays.hashCode(this.f21944d) + ((((((527 + this.f21941a) * 31) + this.f21942b) * 31) + this.f21943c) * 31);
        }
        return this.f21945e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        int i7 = this.f21941a;
        sb2.append(i7 != -1 ? i7 != 6 ? i7 != 1 ? i7 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space");
        sb2.append(", ");
        int i10 = this.f21942b;
        sb2.append(i10 != -1 ? i10 != 1 ? i10 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range");
        sb2.append(", ");
        sb2.append(a(this.f21943c));
        sb2.append(", ");
        sb2.append(this.f21944d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
