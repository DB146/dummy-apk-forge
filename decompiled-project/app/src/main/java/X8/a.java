package X8;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f11003h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f11004i = new a(1033, 1024, 1);
    public static final a j;
    public static final a k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f11005l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f11006m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f11007n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f11008o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11009a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11010b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11011c;

    /* renamed from: d, reason: collision with root package name */
    public final b f11012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11013e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11014f;
    public final int g;

    static {
        a aVar = new a(67, 64, 1);
        j = aVar;
        k = new a(19, 16, 1);
        f11005l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f11006m = aVar2;
        f11007n = aVar2;
        f11008o = aVar;
    }

    public a(int i7, int i10, int i11) {
        this.f11014f = i7;
        this.f11013e = i10;
        this.g = i11;
        this.f11009a = new int[i10];
        this.f11010b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f11009a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f11010b[this.f11009a[i14]] = i14;
        }
        this.f11011c = new b(this, new int[]{0});
        this.f11012d = new b(this, new int[]{1});
    }

    public final b a(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f11011c;
        }
        int[] iArr = new int[i7 + 1];
        iArr[0] = i10;
        return new b(this, iArr);
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f11009a[(this.f11013e - this.f11010b[i7]) - 1];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f11010b;
        return this.f11009a[(iArr[i7] + iArr[i10]) % (this.f11013e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f11014f));
        sb2.append(',');
        return X.c.k(sb2, this.f11013e, ')');
    }
}
