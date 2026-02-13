package b1;

import H2.C0297k;
import java.util.Arrays;
import q3.s;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f13799f;
    public f[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f13800h;

    /* renamed from: i, reason: collision with root package name */
    public s f13801i;

    @Override // b1.b
    public final f d(boolean[] zArr) {
        int i7 = -1;
        for (int i10 = 0; i10 < this.f13800h; i10++) {
            f[] fVarArr = this.f13799f;
            f fVar = fVarArr[i10];
            if (!zArr[fVar.f13803b]) {
                s sVar = this.f13801i;
                sVar.f23438b = fVar;
                int i11 = 8;
                if (i7 == -1) {
                    while (i11 >= 0) {
                        float f4 = ((f) sVar.f23438b).f13809v[i11];
                        if (f4 <= 0.0f) {
                            if (f4 < 0.0f) {
                                i7 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i7];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = fVar2.f13809v[i11];
                            float f11 = ((f) sVar.f23438b).f13809v[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f13799f[i7];
    }

    @Override // b1.b
    public final boolean e() {
        return this.f13800h == 0;
    }

    @Override // b1.b
    public final void i(c cVar, b bVar, boolean z8) {
        f fVar = bVar.f13778a;
        if (fVar == null) {
            return;
        }
        a aVar = bVar.f13781d;
        int d10 = aVar.d();
        for (int i7 = 0; i7 < d10; i7++) {
            f e2 = aVar.e(i7);
            float f4 = aVar.f(i7);
            s sVar = this.f13801i;
            sVar.f23438b = e2;
            boolean z10 = e2.f13802a;
            float[] fArr = fVar.f13809v;
            if (z10) {
                boolean z11 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((f) sVar.f23438b).f13809v;
                    float f10 = (fArr[i10] * f4) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((f) sVar.f23438b).f13809v[i10] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((e) sVar.f23439c).k((f) sVar.f23438b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f4;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((f) sVar.f23438b).f13809v[i11] = f12;
                    } else {
                        ((f) sVar.f23438b).f13809v[i11] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f13779b = (bVar.f13779b * f4) + this.f13779b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i7;
        int i10 = this.f13800h + 1;
        f[] fVarArr = this.f13799f;
        if (i10 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f13799f = fVarArr2;
            this.g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f13799f;
        int i11 = this.f13800h;
        fVarArr3[i11] = fVar;
        int i12 = i11 + 1;
        this.f13800h = i12;
        if (i12 > 1 && fVarArr3[i11].f13803b > fVar.f13803b) {
            int i13 = 0;
            while (true) {
                i7 = this.f13800h;
                if (i13 >= i7) {
                    break;
                }
                this.g[i13] = this.f13799f[i13];
                i13++;
            }
            Arrays.sort(this.g, 0, i7, new C0297k(11));
            for (int i14 = 0; i14 < this.f13800h; i14++) {
                this.f13799f[i14] = this.g[i14];
            }
        }
        fVar.f13802a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i7 = 0;
        while (i7 < this.f13800h) {
            if (this.f13799f[i7] == fVar) {
                while (true) {
                    int i10 = this.f13800h;
                    if (i7 >= i10 - 1) {
                        this.f13800h = i10 - 1;
                        fVar.f13802a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f13799f;
                        int i11 = i7 + 1;
                        fVarArr[i7] = fVarArr[i11];
                        i7 = i11;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // b1.b
    public final String toString() {
        String str = " goal -> (" + this.f13779b + ") : ";
        for (int i7 = 0; i7 < this.f13800h; i7++) {
            f fVar = this.f13799f[i7];
            s sVar = this.f13801i;
            sVar.f23438b = fVar;
            str = str + sVar + " ";
        }
        return str;
    }
}
