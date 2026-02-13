package Q4;

import P4.Y;
import android.net.Uri;
import java.util.Arrays;
import m4.InterfaceC1569g;
import n5.D;

/* loaded from: classes.dex */
public final class b implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final b f8638f = new b(new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: u, reason: collision with root package name */
    public static final a f8639u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f8640v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f8641w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f8642x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f8643y;

    /* renamed from: z, reason: collision with root package name */
    public static final Y f8644z;

    /* renamed from: a, reason: collision with root package name */
    public final int f8645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8646b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8647c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8648d;

    /* renamed from: e, reason: collision with root package name */
    public final a[] f8649e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f8634e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f8635f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f8639u = new a(aVar.f8630a, 0, aVar.f8632c, copyOf, (Uri[]) Arrays.copyOf(aVar.f8633d, 0), copyOf2, aVar.f8636u, aVar.f8637v);
        int i7 = D.f21141a;
        f8640v = Integer.toString(1, 36);
        f8641w = Integer.toString(2, 36);
        f8642x = Integer.toString(3, 36);
        f8643y = Integer.toString(4, 36);
        f8644z = new Y(3);
    }

    public b(a[] aVarArr, long j, long j10, int i7) {
        this.f8646b = j;
        this.f8647c = j10;
        this.f8645a = aVarArr.length + i7;
        this.f8649e = aVarArr;
        this.f8648d = i7;
    }

    public final a a(int i7) {
        int i10 = this.f8648d;
        return i7 < i10 ? f8639u : this.f8649e[i7 - i10];
    }

    public final boolean b(int i7) {
        if (i7 == this.f8645a - 1) {
            a a9 = a(i7);
            if (a9.f8637v && a9.f8630a == Long.MIN_VALUE && a9.f8631b == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return D.a(null, null) && this.f8645a == bVar.f8645a && this.f8646b == bVar.f8646b && this.f8647c == bVar.f8647c && this.f8648d == bVar.f8648d && Arrays.equals(this.f8649e, bVar.f8649e);
    }

    public final int hashCode() {
        return (((((((this.f8645a * 961) + ((int) this.f8646b)) * 31) + ((int) this.f8647c)) * 31) + this.f8648d) * 31) + Arrays.hashCode(this.f8649e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f8646b);
        sb2.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f8649e;
            if (i7 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i7].f8630a);
            sb2.append(", ads=[");
            for (int i10 = 0; i10 < aVarArr[i7].f8634e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = aVarArr[i7].f8634e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i7].f8635f[i10]);
                sb2.append(')');
                if (i10 < aVarArr[i7].f8634e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i7 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i7++;
        }
    }
}
