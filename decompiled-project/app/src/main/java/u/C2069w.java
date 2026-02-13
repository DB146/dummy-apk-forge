package u;

import java.util.Arrays;
import v.AbstractC2121a;

/* renamed from: u.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2069w {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24727a;

    /* renamed from: b, reason: collision with root package name */
    public int f24728b;

    public /* synthetic */ C2069w() {
        this(16);
    }

    public C2069w(int i7) {
        this.f24727a = i7 == 0 ? AbstractC2061n.f24697a : new int[i7];
    }

    public final void a(int i7) {
        int i10 = this.f24728b + 1;
        int[] iArr = this.f24727a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            this.f24727a = copyOf;
        }
        int[] iArr2 = this.f24727a;
        int i11 = this.f24728b;
        iArr2[i11] = i7;
        this.f24728b = i11 + 1;
    }

    public final int b(int i7) {
        if (i7 >= 0 && i7 < this.f24728b) {
            return this.f24727a[i7];
        }
        AbstractC2121a.d("Index must be between 0 and size");
        throw null;
    }

    public final int c(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f24728b)) {
            AbstractC2121a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f24727a;
        int i11 = iArr[i7];
        if (i7 != i10 - 1) {
            Eb.n.M(i7, i7 + 1, i10, iArr, iArr);
        }
        this.f24728b--;
        return i11;
    }

    public final void d(int i7, int i10) {
        if (i7 < 0 || i7 >= this.f24728b) {
            AbstractC2121a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f24727a;
        int i11 = iArr[i7];
        iArr[i7] = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2069w) {
            C2069w c2069w = (C2069w) obj;
            int i7 = c2069w.f24728b;
            int i10 = this.f24728b;
            if (i7 == i10) {
                int[] iArr = this.f24727a;
                int[] iArr2 = c2069w.f24727a;
                Xb.g I6 = h3.H.I(0, i10);
                int i11 = I6.f11025a;
                int i12 = I6.f11026b;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
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
        int[] iArr = this.f24727a;
        int i7 = this.f24728b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += Integer.hashCode(iArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f24727a;
        int i7 = this.f24728b;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
