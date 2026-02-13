package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24735a;

    /* renamed from: b, reason: collision with root package name */
    public int f24736b;

    public z(int i7) {
        this.f24735a = i7 == 0 ? AbstractC2064q.f24709a : new long[i7];
    }

    public final void a(long j) {
        int i7 = this.f24736b + 1;
        long[] jArr = this.f24735a;
        if (jArr.length < i7) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i7, (jArr.length * 3) / 2));
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24735a = copyOf;
        }
        long[] jArr2 = this.f24735a;
        int i10 = this.f24736b;
        jArr2[i10] = j;
        this.f24736b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i7 = zVar.f24736b;
            int i10 = this.f24736b;
            if (i7 == i10) {
                long[] jArr = this.f24735a;
                long[] jArr2 = zVar.f24735a;
                Xb.g I6 = h3.H.I(0, i10);
                int i11 = I6.f11025a;
                int i12 = I6.f11026b;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f24735a;
        int i7 = this.f24736b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += Long.hashCode(jArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f24735a;
        int i7 = this.f24736b;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
            i10++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
