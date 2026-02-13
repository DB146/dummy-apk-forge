package A9;

/* loaded from: classes2.dex */
public final class v3 {

    /* renamed from: c, reason: collision with root package name */
    public int f1442c;

    /* renamed from: d, reason: collision with root package name */
    public int f1443d;

    /* renamed from: i, reason: collision with root package name */
    public int f1447i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1448l;

    /* renamed from: e, reason: collision with root package name */
    public int f1444e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f1445f = 3;
    public int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f1446h = 50.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f1441b = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public int f1440a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public final int a() {
        if (this.f1448l) {
            int i7 = this.g;
            int i10 = i7 >= 0 ? this.f1447i - i7 : -i7;
            float f4 = this.f1446h;
            return f4 != -1.0f ? i10 - ((int) ((this.f1447i * f4) / 100.0f)) : i10;
        }
        int i11 = this.g;
        if (i11 < 0) {
            i11 += this.f1447i;
        }
        float f10 = this.f1446h;
        return f10 != -1.0f ? i11 + ((int) ((this.f1447i * f10) / 100.0f)) : i11;
    }

    public final int b(int i7) {
        int i10;
        int i11;
        int i12 = this.f1447i;
        int a9 = a();
        int i13 = this.f1441b;
        boolean z8 = i13 == Integer.MIN_VALUE;
        int i14 = this.f1440a;
        boolean z10 = i14 == Integer.MAX_VALUE;
        if (!z8) {
            int i15 = this.j;
            int i16 = a9 - i15;
            if (this.f1448l ? (this.f1445f & 2) != 0 : (this.f1445f & 1) != 0) {
                if (i7 - i13 <= i16) {
                    int i17 = i13 - i15;
                    return (z10 || i17 <= (i11 = this.f1442c)) ? i17 : i11;
                }
            }
        }
        if (!z10) {
            int i18 = this.k;
            int i19 = (i12 - a9) - i18;
            if (this.f1448l ? (1 & this.f1445f) != 0 : (this.f1445f & 2) != 0) {
                if (i14 - i7 <= i19) {
                    int i20 = i14 - (i12 - i18);
                    return (z8 || i20 >= (i10 = this.f1443d)) ? i20 : i10;
                }
            }
        }
        return i7 - a9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r6.f1443d = r0 - r6.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6.f1442c = (r4 - r6.j) - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, int i10, int i11, int i12) {
        this.f1441b = i7;
        this.f1440a = i10;
        int i13 = (this.f1447i - this.j) - this.k;
        int a9 = a();
        int i14 = this.f1441b;
        boolean z8 = i14 == Integer.MIN_VALUE;
        int i15 = this.f1440a;
        boolean z10 = i15 == Integer.MAX_VALUE;
        if (!z8) {
            if (this.f1448l) {
                this.f1443d = i11 - a9;
            } else {
                this.f1443d = i11 - a9;
            }
        }
        if (!z10) {
            if (this.f1448l) {
                this.f1442c = i12 - a9;
            } else {
                this.f1442c = i12 - a9;
            }
        }
        if (z10 || z8) {
            return;
        }
        if (this.f1448l) {
            int i16 = this.f1445f;
            if ((i16 & 1) != 0) {
                if ((this.f1444e & 1) != 0) {
                    this.f1442c = Math.max(this.f1442c, i11 - a9);
                }
                this.f1443d = Math.min(this.f1443d, this.f1442c);
                return;
            } else {
                if ((i16 & 2) != 0) {
                    if ((this.f1444e & 2) != 0) {
                        this.f1443d = Math.min(this.f1443d, i12 - a9);
                    }
                    this.f1442c = Math.max(this.f1443d, this.f1442c);
                    return;
                }
                return;
            }
        }
        int i17 = this.f1445f;
        if ((i17 & 1) != 0) {
            if ((this.f1444e & 1) != 0) {
                this.f1443d = Math.min(this.f1443d, i12 - a9);
            }
            this.f1442c = Math.max(this.f1443d, this.f1442c);
        } else if ((i17 & 2) != 0) {
            if ((this.f1444e & 2) != 0) {
                this.f1442c = Math.max(this.f1442c, i11 - a9);
            }
            this.f1443d = Math.min(this.f1443d, this.f1442c);
        }
    }

    public final String toString() {
        return " min:" + this.f1441b + " " + this.f1443d + " max:" + this.f1440a + " " + this.f1442c;
    }
}
