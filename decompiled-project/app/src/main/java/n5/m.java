package n5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21190a;

    /* renamed from: b, reason: collision with root package name */
    public int f21191b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f21192c;

    public m(int i7) {
        this.f21190a = i7;
        switch (i7) {
            case 1:
                return;
            default:
                this.f21192c = new long[32];
                return;
        }
    }

    public final void a(long j) {
        switch (this.f21190a) {
            case 0:
                int i7 = this.f21191b;
                long[] jArr = this.f21192c;
                if (i7 == jArr.length) {
                    this.f21192c = Arrays.copyOf(jArr, i7 * 2);
                }
                long[] jArr2 = this.f21192c;
                int i10 = this.f21191b;
                this.f21191b = i10 + 1;
                jArr2[i10] = j;
                return;
            default:
                if (b(j)) {
                    return;
                }
                int i11 = this.f21191b;
                long[] jArr3 = this.f21192c;
                if (i11 >= jArr3.length) {
                    jArr3 = Arrays.copyOf(jArr3, Math.max(i11 + 1, jArr3.length * 2));
                    kotlin.jvm.internal.l.d(jArr3, "copyOf(...)");
                    this.f21192c = jArr3;
                }
                jArr3[i11] = j;
                if (i11 >= this.f21191b) {
                    this.f21191b = i11 + 1;
                    return;
                }
                return;
        }
    }

    public boolean b(long j) {
        int i7 = this.f21191b;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f21192c[i10] == j) {
                return true;
            }
        }
        return false;
    }

    public long c(int i7) {
        if (i7 >= 0 && i7 < this.f21191b) {
            return this.f21192c[i7];
        }
        StringBuilder r10 = h3.o.r(i7, "Invalid index ", ", size is ");
        r10.append(this.f21191b);
        throw new IndexOutOfBoundsException(r10.toString());
    }

    public void d(long j) {
        int i7 = this.f21191b;
        int i10 = 0;
        while (i10 < i7) {
            if (j == this.f21192c[i10]) {
                int i11 = this.f21191b - 1;
                while (i10 < i11) {
                    long[] jArr = this.f21192c;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f21191b--;
                return;
            }
            i10++;
        }
    }
}
