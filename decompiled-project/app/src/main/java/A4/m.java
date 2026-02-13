package A4;

import n5.D;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final s4.v f401a;

    /* renamed from: d, reason: collision with root package name */
    public y f404d;

    /* renamed from: e, reason: collision with root package name */
    public k f405e;

    /* renamed from: f, reason: collision with root package name */
    public int f406f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f407h;

    /* renamed from: i, reason: collision with root package name */
    public int f408i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f409l;

    /* renamed from: b, reason: collision with root package name */
    public final x f402b = new x();

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f403c = new n5.v();
    public final n5.v j = new n5.v(1);
    public final n5.v k = new n5.v();

    public m(s4.v vVar, y yVar, k kVar) {
        this.f401a = vVar;
        this.f404d = yVar;
        this.f405e = kVar;
        this.f404d = yVar;
        this.f405e = kVar;
        vVar.a(yVar.f507a.f485f);
        d();
    }

    public final w a() {
        if (!this.f409l) {
            return null;
        }
        x xVar = this.f402b;
        k kVar = xVar.f493a;
        int i7 = D.f21141a;
        int i10 = kVar.f394a;
        w wVar = xVar.f502m;
        if (wVar == null) {
            w[] wVarArr = this.f404d.f507a.k;
            wVar = wVarArr == null ? null : wVarArr[i10];
        }
        if (wVar == null || !wVar.f488a) {
            return null;
        }
        return wVar;
    }

    public final boolean b() {
        this.f406f++;
        if (!this.f409l) {
            return false;
        }
        int i7 = this.g + 1;
        this.g = i7;
        int[] iArr = this.f402b.g;
        int i10 = this.f407h;
        if (i7 != iArr[i10]) {
            return true;
        }
        this.f407h = i10 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i7, int i10) {
        n5.v vVar;
        w a9 = a();
        if (a9 == null) {
            return 0;
        }
        x xVar = this.f402b;
        int i11 = a9.f491d;
        if (i11 != 0) {
            vVar = xVar.f503n;
        } else {
            int i12 = D.f21141a;
            byte[] bArr = a9.f492e;
            int length = bArr.length;
            n5.v vVar2 = this.k;
            vVar2.E(length, bArr);
            i11 = bArr.length;
            vVar = vVar2;
        }
        boolean z8 = xVar.k && xVar.f501l[this.f406f];
        boolean z10 = z8 || i10 != 0;
        n5.v vVar3 = this.j;
        vVar3.f21229a[0] = (byte) ((z10 ? 128 : 0) | i11);
        vVar3.G(0);
        s4.v vVar4 = this.f401a;
        vVar4.c(1, vVar3);
        vVar4.c(i11, vVar);
        if (!z10) {
            return i11 + 1;
        }
        n5.v vVar5 = this.f403c;
        if (!z8) {
            vVar5.D(8);
            byte[] bArr2 = vVar5.f21229a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i7 >> 24) & 255);
            bArr2[5] = (byte) ((i7 >> 16) & 255);
            bArr2[6] = (byte) ((i7 >> 8) & 255);
            bArr2[7] = (byte) (i7 & 255);
            vVar4.c(8, vVar5);
            return i11 + 9;
        }
        n5.v vVar6 = xVar.f503n;
        int A10 = vVar6.A();
        vVar6.H(-2);
        int i13 = (A10 * 6) + 2;
        if (i10 != 0) {
            vVar5.D(i13);
            byte[] bArr3 = vVar5.f21229a;
            vVar6.f(0, bArr3, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            vVar5 = vVar6;
        }
        vVar4.c(i13, vVar5);
        return i11 + 1 + i13;
    }

    public final void d() {
        x xVar = this.f402b;
        xVar.f496d = 0;
        xVar.f505p = 0L;
        xVar.f506q = false;
        xVar.k = false;
        xVar.f504o = false;
        xVar.f502m = null;
        this.f406f = 0;
        this.f407h = 0;
        this.g = 0;
        this.f408i = 0;
        this.f409l = false;
    }
}
