package Q4;

import P4.Y;
import android.net.Uri;
import java.util.Arrays;
import m4.InterfaceC1569g;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class a implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public static final String f8621A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f8622B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f8623C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f8624D;

    /* renamed from: E, reason: collision with root package name */
    public static final Y f8625E;

    /* renamed from: w, reason: collision with root package name */
    public static final String f8626w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f8627x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f8628y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f8629z;

    /* renamed from: a, reason: collision with root package name */
    public final long f8630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8632c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f8633d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f8634e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f8635f;

    /* renamed from: u, reason: collision with root package name */
    public final long f8636u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8637v;

    static {
        int i7 = D.f21141a;
        f8626w = Integer.toString(0, 36);
        f8627x = Integer.toString(1, 36);
        f8628y = Integer.toString(2, 36);
        f8629z = Integer.toString(3, 36);
        f8621A = Integer.toString(4, 36);
        f8622B = Integer.toString(5, 36);
        f8623C = Integer.toString(6, 36);
        f8624D = Integer.toString(7, 36);
        f8625E = new Y(4);
    }

    public a(long j, int i7, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z8) {
        AbstractC1705a.h(iArr.length == uriArr.length);
        this.f8630a = j;
        this.f8631b = i7;
        this.f8632c = i10;
        this.f8634e = iArr;
        this.f8633d = uriArr;
        this.f8635f = jArr;
        this.f8636u = j10;
        this.f8637v = z8;
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f8634e;
            if (i11 >= iArr.length || this.f8637v || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8630a == aVar.f8630a && this.f8631b == aVar.f8631b && this.f8632c == aVar.f8632c && Arrays.equals(this.f8633d, aVar.f8633d) && Arrays.equals(this.f8634e, aVar.f8634e) && Arrays.equals(this.f8635f, aVar.f8635f) && this.f8636u == aVar.f8636u && this.f8637v == aVar.f8637v;
    }

    public final int hashCode() {
        int i7 = ((this.f8631b * 31) + this.f8632c) * 31;
        long j = this.f8630a;
        int hashCode = (Arrays.hashCode(this.f8635f) + ((Arrays.hashCode(this.f8634e) + ((((i7 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f8633d)) * 31)) * 31)) * 31;
        long j10 = this.f8636u;
        return ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f8637v ? 1 : 0);
    }
}
