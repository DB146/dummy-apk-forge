package j9;

import ha.g;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1388a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1388a f18670e = new C1388a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18671a = new int[929];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18672b = new int[929];

    /* renamed from: c, reason: collision with root package name */
    public final g f18673c;

    /* renamed from: d, reason: collision with root package name */
    public final g f18674d;

    public C1388a() {
        int i7 = 1;
        for (int i10 = 0; i10 < 929; i10++) {
            this.f18671a[i10] = i7;
            i7 = (i7 * 3) % 929;
        }
        for (int i11 = 0; i11 < 928; i11++) {
            this.f18672b[this.f18671a[i11]] = i11;
        }
        this.f18673c = new g(this, new int[]{0});
        this.f18674d = new g(this, new int[]{1});
    }

    public final int a(int i7, int i10) {
        return (i7 + i10) % 929;
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f18671a[928 - this.f18672b[i7]];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f18672b;
        return this.f18671a[(iArr[i7] + iArr[i10]) % 928];
    }
}
