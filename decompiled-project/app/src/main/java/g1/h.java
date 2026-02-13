package g1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17314a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f17315b;

    /* renamed from: c, reason: collision with root package name */
    public int f17316c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f17317d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f17318e;

    /* renamed from: f, reason: collision with root package name */
    public int f17319f;
    public int[] g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f17320h;

    /* renamed from: i, reason: collision with root package name */
    public int f17321i;
    public int[] j;
    public boolean[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f17322l;

    public final void a(int i7, float f4) {
        int i10 = this.f17319f;
        int[] iArr = this.f17317d;
        if (i10 >= iArr.length) {
            this.f17317d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17318e;
            this.f17318e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17317d;
        int i11 = this.f17319f;
        iArr2[i11] = i7;
        float[] fArr2 = this.f17318e;
        this.f17319f = i11 + 1;
        fArr2[i11] = f4;
    }

    public final void b(int i7, int i10) {
        int i11 = this.f17316c;
        int[] iArr = this.f17314a;
        if (i11 >= iArr.length) {
            this.f17314a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f17315b;
            this.f17315b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f17314a;
        int i12 = this.f17316c;
        iArr3[i12] = i7;
        int[] iArr4 = this.f17315b;
        this.f17316c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i7, String str) {
        int i10 = this.f17321i;
        int[] iArr = this.g;
        if (i10 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17320h;
            this.f17320h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i11 = this.f17321i;
        iArr2[i11] = i7;
        String[] strArr2 = this.f17320h;
        this.f17321i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i7, boolean z8) {
        int i10 = this.f17322l;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i11 = this.f17322l;
        iArr2[i11] = i7;
        boolean[] zArr2 = this.k;
        this.f17322l = i11 + 1;
        zArr2[i11] = z8;
    }
}
