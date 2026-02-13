package b1;

import Q7.h;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f13771b;

    /* renamed from: c, reason: collision with root package name */
    public final h f13772c;

    /* renamed from: a, reason: collision with root package name */
    public int f13770a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f13773d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13774e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f13775f = new int[8];
    public float[] g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f13776h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f13777i = -1;
    public boolean j = false;

    public a(b bVar, h hVar) {
        this.f13771b = bVar;
        this.f13772c = hVar;
    }

    public final void a(f fVar, float f4, boolean z8) {
        if (f4 <= -0.001f || f4 >= 0.001f) {
            int i7 = this.f13776h;
            b bVar = this.f13771b;
            if (i7 == -1) {
                this.f13776h = 0;
                this.g[0] = f4;
                this.f13774e[0] = fVar.f13803b;
                this.f13775f[0] = -1;
                fVar.f13812y++;
                fVar.a(bVar);
                this.f13770a++;
                if (this.j) {
                    return;
                }
                int i10 = this.f13777i + 1;
                this.f13777i = i10;
                int[] iArr = this.f13774e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f13777i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i7 != -1 && i12 < this.f13770a; i12++) {
                int i13 = this.f13774e[i7];
                int i14 = fVar.f13803b;
                if (i13 == i14) {
                    float[] fArr = this.g;
                    float f10 = fArr[i7] + f4;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i7] = f10;
                    if (f10 == 0.0f) {
                        if (i7 == this.f13776h) {
                            this.f13776h = this.f13775f[i7];
                        } else {
                            int[] iArr2 = this.f13775f;
                            iArr2[i11] = iArr2[i7];
                        }
                        if (z8) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f13777i = i7;
                        }
                        fVar.f13812y--;
                        this.f13770a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i7;
                }
                i7 = this.f13775f[i7];
            }
            int i15 = this.f13777i;
            int i16 = i15 + 1;
            if (this.j) {
                int[] iArr3 = this.f13774e;
                if (iArr3[i15] != -1) {
                    i15 = iArr3.length;
                }
            } else {
                i15 = i16;
            }
            int[] iArr4 = this.f13774e;
            if (i15 >= iArr4.length && this.f13770a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f13774e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        i15 = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f13774e;
            if (i15 >= iArr6.length) {
                i15 = iArr6.length;
                int i18 = this.f13773d * 2;
                this.f13773d = i18;
                this.j = false;
                this.f13777i = i15 - 1;
                this.g = Arrays.copyOf(this.g, i18);
                this.f13774e = Arrays.copyOf(this.f13774e, this.f13773d);
                this.f13775f = Arrays.copyOf(this.f13775f, this.f13773d);
            }
            this.f13774e[i15] = fVar.f13803b;
            this.g[i15] = f4;
            if (i11 != -1) {
                int[] iArr7 = this.f13775f;
                iArr7[i15] = iArr7[i11];
                iArr7[i11] = i15;
            } else {
                this.f13775f[i15] = this.f13776h;
                this.f13776h = i15;
            }
            fVar.f13812y++;
            fVar.a(bVar);
            this.f13770a++;
            if (!this.j) {
                this.f13777i++;
            }
            int i19 = this.f13777i;
            int[] iArr8 = this.f13774e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f13777i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i7 = this.f13776h;
        for (int i10 = 0; i7 != -1 && i10 < this.f13770a; i10++) {
            f fVar = ((f[]) this.f13772c.f8697d)[this.f13774e[i7]];
            if (fVar != null) {
                fVar.b(this.f13771b);
            }
            i7 = this.f13775f[i7];
        }
        this.f13776h = -1;
        this.f13777i = -1;
        this.j = false;
        this.f13770a = 0;
    }

    public final float c(f fVar) {
        int i7 = this.f13776h;
        for (int i10 = 0; i7 != -1 && i10 < this.f13770a; i10++) {
            if (this.f13774e[i7] == fVar.f13803b) {
                return this.g[i7];
            }
            i7 = this.f13775f[i7];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f13770a;
    }

    public final f e(int i7) {
        int i10 = this.f13776h;
        for (int i11 = 0; i10 != -1 && i11 < this.f13770a; i11++) {
            if (i11 == i7) {
                return ((f[]) this.f13772c.f8697d)[this.f13774e[i10]];
            }
            i10 = this.f13775f[i10];
        }
        return null;
    }

    public final float f(int i7) {
        int i10 = this.f13776h;
        for (int i11 = 0; i10 != -1 && i11 < this.f13770a; i11++) {
            if (i11 == i7) {
                return this.g[i10];
            }
            i10 = this.f13775f[i10];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f4) {
        if (f4 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i7 = this.f13776h;
        b bVar = this.f13771b;
        if (i7 == -1) {
            this.f13776h = 0;
            this.g[0] = f4;
            this.f13774e[0] = fVar.f13803b;
            this.f13775f[0] = -1;
            fVar.f13812y++;
            fVar.a(bVar);
            this.f13770a++;
            if (this.j) {
                return;
            }
            int i10 = this.f13777i + 1;
            this.f13777i = i10;
            int[] iArr = this.f13774e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f13777i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i7 != -1 && i12 < this.f13770a; i12++) {
            int i13 = this.f13774e[i7];
            int i14 = fVar.f13803b;
            if (i13 == i14) {
                this.g[i7] = f4;
                return;
            }
            if (i13 < i14) {
                i11 = i7;
            }
            i7 = this.f13775f[i7];
        }
        int i15 = this.f13777i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr2 = this.f13774e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f13774e;
        if (i15 >= iArr3.length && this.f13770a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f13774e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f13774e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f13773d * 2;
            this.f13773d = i18;
            this.j = false;
            this.f13777i = i15 - 1;
            this.g = Arrays.copyOf(this.g, i18);
            this.f13774e = Arrays.copyOf(this.f13774e, this.f13773d);
            this.f13775f = Arrays.copyOf(this.f13775f, this.f13773d);
        }
        this.f13774e[i15] = fVar.f13803b;
        this.g[i15] = f4;
        if (i11 != -1) {
            int[] iArr6 = this.f13775f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f13775f[i15] = this.f13776h;
            this.f13776h = i15;
        }
        fVar.f13812y++;
        fVar.a(bVar);
        int i19 = this.f13770a + 1;
        this.f13770a = i19;
        if (!this.j) {
            this.f13777i++;
        }
        int[] iArr7 = this.f13774e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f13777i >= iArr7.length) {
            this.j = true;
            this.f13777i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z8) {
        int i7 = this.f13776h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i7 != -1 && i10 < this.f13770a) {
            if (this.f13774e[i7] == fVar.f13803b) {
                if (i7 == this.f13776h) {
                    this.f13776h = this.f13775f[i7];
                } else {
                    int[] iArr = this.f13775f;
                    iArr[i11] = iArr[i7];
                }
                if (z8) {
                    fVar.b(this.f13771b);
                }
                fVar.f13812y--;
                this.f13770a--;
                this.f13774e[i7] = -1;
                if (this.j) {
                    this.f13777i = i7;
                }
                return this.g[i7];
            }
            i10++;
            i11 = i7;
            i7 = this.f13775f[i7];
        }
        return 0.0f;
    }

    public final String toString() {
        int i7 = this.f13776h;
        String str = "";
        for (int i10 = 0; i7 != -1 && i10 < this.f13770a; i10++) {
            StringBuilder m10 = X.c.m(X.c.h(str, " -> "));
            m10.append(this.g[i7]);
            m10.append(" : ");
            StringBuilder m11 = X.c.m(m10.toString());
            m11.append(((f[]) this.f13772c.f8697d)[this.f13774e[i7]]);
            str = m11.toString();
            i7 = this.f13775f[i7];
        }
        return str;
    }
}
