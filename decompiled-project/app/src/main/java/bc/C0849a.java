package bc;

import ac.g;
import h3.H;
import kotlin.jvm.internal.l;

/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0849a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f13992b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f13993c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13994d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f13995a;

    static {
        int i7 = AbstractC0850b.f13996a;
        f13992b = Tb.a.j(4611686018427387903L);
        f13993c = Tb.a.j(-4611686018427387903L);
    }

    public static final long a(long j, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return Tb.a.j(H.l(j13, -4611686018427387903L, 4611686018427387903L));
        }
        long j14 = ((j13 * j11) + (j10 - (j12 * j11))) << 1;
        int i7 = AbstractC0850b.f13996a;
        return j14;
    }

    public static final void b(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z8) {
        sb2.append(i7);
        if (i10 != 0) {
            sb2.append('.');
            String l02 = g.l0(i11, String.valueOf(i10));
            int i12 = -1;
            int length = l02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (l02.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z8 || i14 >= 3) {
                sb2.append((CharSequence) l02, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) l02, 0, i14);
            }
        }
        sb2.append(str);
    }

    public static int d(long j, long j10) {
        long j11 = j ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i7 = (((int) j) & 1) - (((int) j10) & 1);
            return j < 0 ? -i7 : i7;
        }
        if (j < j10) {
            return -1;
        }
        return j == j10 ? 0 : 1;
    }

    public static final boolean f(long j) {
        return j == f13992b || j == f13993c;
    }

    public static final long g(long j, EnumC0851c unit) {
        l.e(unit, "unit");
        if (j == f13992b) {
            return Long.MAX_VALUE;
        }
        if (j == f13993c) {
            return Long.MIN_VALUE;
        }
        return Y6.b.h(j >> 1, (((int) j) & 1) == 0 ? EnumC0851c.f13997b : EnumC0851c.f13998c, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d(this.f13995a, ((C0849a) obj).f13995a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0849a) {
            return this.f13995a == ((C0849a) obj).f13995a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13995a);
    }

    public final String toString() {
        int i7;
        long j;
        int i10;
        StringBuilder sb2;
        int i11;
        long j10 = this.f13995a;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f13992b) {
            return "Infinity";
        }
        if (j10 == f13993c) {
            return "-Infinity";
        }
        boolean z8 = j10 < 0;
        StringBuilder sb3 = new StringBuilder();
        if (z8) {
            sb3.append('-');
        }
        if (j10 < 0) {
            j10 = (((int) j10) & 1) + ((-(j10 >> 1)) << 1);
            int i12 = AbstractC0850b.f13996a;
        }
        long g = g(j10, EnumC0851c.f14002u);
        int g2 = f(j10) ? 0 : (int) (g(j10, EnumC0851c.f14001f) % 24);
        int g10 = f(j10) ? 0 : (int) (g(j10, EnumC0851c.f14000e) % 60);
        int g11 = f(j10) ? 0 : (int) (g(j10, EnumC0851c.f13999d) % 60);
        if (f(j10)) {
            j = 0;
            i7 = 0;
        } else {
            i7 = (int) ((((int) j10) & 1) == 1 ? ((j10 >> 1) % 1000) * 1000000 : (j10 >> 1) % 1000000000);
            j = 0;
        }
        boolean z10 = g != j;
        boolean z11 = g2 != 0;
        boolean z12 = g10 != 0;
        boolean z13 = (g11 == 0 && i7 == 0) ? false : true;
        if (z10) {
            sb3.append(g);
            sb3.append('d');
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb3.append(' ');
            }
            sb3.append(g2);
            sb3.append('h');
            i10 = i13;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i14 = i10 + 1;
            if (i10 > 0) {
                sb3.append(' ');
            }
            sb3.append(g10);
            sb3.append('m');
            i10 = i14;
        }
        if (z13) {
            i11 = i10 + 1;
            if (i10 > 0) {
                sb3.append(' ');
            }
            if (g11 != 0 || z10 || z11 || z12) {
                sb2 = sb3;
                b(sb2, g11, i7, 9, "s", false);
            } else if (i7 >= 1000000) {
                sb2 = sb3;
                b(sb3, i7 / 1000000, i7 % 1000000, 6, "ms", false);
            } else {
                sb2 = sb3;
                if (i7 >= 1000) {
                    b(sb2, i7 / 1000, i7 % 1000, 3, "us", false);
                } else {
                    sb2.append(i7);
                    sb2.append("ns");
                }
            }
        } else {
            sb2 = sb3;
            i11 = i10;
        }
        if (z8 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
