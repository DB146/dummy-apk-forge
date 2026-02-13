package o5;

import java.util.Arrays;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808c {

    /* renamed from: a, reason: collision with root package name */
    public long f21946a;

    /* renamed from: b, reason: collision with root package name */
    public long f21947b;

    /* renamed from: c, reason: collision with root package name */
    public long f21948c;

    /* renamed from: d, reason: collision with root package name */
    public long f21949d;

    /* renamed from: e, reason: collision with root package name */
    public long f21950e;

    /* renamed from: f, reason: collision with root package name */
    public long f21951f;
    public final boolean[] g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f21952h;

    public final boolean a() {
        return this.f21949d > 15 && this.f21952h == 0;
    }

    public final void b(long j) {
        long j10 = this.f21949d;
        if (j10 == 0) {
            this.f21946a = j;
        } else if (j10 == 1) {
            long j11 = j - this.f21946a;
            this.f21947b = j11;
            this.f21951f = j11;
            this.f21950e = 1L;
        } else {
            long j12 = j - this.f21948c;
            int i7 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f21947b);
            boolean[] zArr = this.g;
            if (abs <= 1000000) {
                this.f21950e++;
                this.f21951f += j12;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f21952h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f21952h++;
            }
        }
        this.f21949d++;
        this.f21948c = j;
    }

    public final void c() {
        this.f21949d = 0L;
        this.f21950e = 0L;
        this.f21951f = 0L;
        this.f21952h = 0;
        Arrays.fill(this.g, false);
    }
}
