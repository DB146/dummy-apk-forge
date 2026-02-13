package b1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13802a;

    /* renamed from: e, reason: collision with root package name */
    public float f13806e;

    /* renamed from: z, reason: collision with root package name */
    public int f13813z;

    /* renamed from: b, reason: collision with root package name */
    public int f13803b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f13804c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f13805d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13807f = false;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f13808u = new float[9];

    /* renamed from: v, reason: collision with root package name */
    public final float[] f13809v = new float[9];

    /* renamed from: w, reason: collision with root package name */
    public b[] f13810w = new b[16];

    /* renamed from: x, reason: collision with root package name */
    public int f13811x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f13812y = 0;

    public f(int i7) {
        this.f13813z = i7;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int i10 = this.f13811x;
            if (i7 >= i10) {
                b[] bVarArr = this.f13810w;
                if (i10 >= bVarArr.length) {
                    this.f13810w = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f13810w;
                int i11 = this.f13811x;
                bVarArr2[i11] = bVar;
                this.f13811x = i11 + 1;
                return;
            }
            if (this.f13810w[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void b(b bVar) {
        int i7 = this.f13811x;
        int i10 = 0;
        while (i10 < i7) {
            if (this.f13810w[i10] == bVar) {
                while (i10 < i7 - 1) {
                    b[] bVarArr = this.f13810w;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f13811x--;
                return;
            }
            i10++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13803b - ((f) obj).f13803b;
    }

    public final void d() {
        this.f13813z = 5;
        this.f13805d = 0;
        this.f13803b = -1;
        this.f13804c = -1;
        this.f13806e = 0.0f;
        this.f13807f = false;
        int i7 = this.f13811x;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f13810w[i10] = null;
        }
        this.f13811x = 0;
        this.f13812y = 0;
        this.f13802a = false;
        Arrays.fill(this.f13809v, 0.0f);
    }

    public final void f(c cVar, float f4) {
        this.f13806e = f4;
        this.f13807f = true;
        int i7 = this.f13811x;
        this.f13804c = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f13810w[i10].h(cVar, this, false);
        }
        this.f13811x = 0;
    }

    public final void g(c cVar, b bVar) {
        int i7 = this.f13811x;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f13810w[i10].i(cVar, bVar, false);
        }
        this.f13811x = 0;
    }

    public final String toString() {
        return "" + this.f13803b;
    }
}
