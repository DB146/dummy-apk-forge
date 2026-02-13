package b1;

import Q7.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f13781d;

    /* renamed from: a, reason: collision with root package name */
    public f f13778a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f13779b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13780c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f13782e = false;

    public b(h hVar) {
        this.f13781d = new a(this, hVar);
    }

    public final void a(c cVar, int i7) {
        this.f13781d.g(cVar.j(i7), 1.0f);
        this.f13781d.g(cVar.j(i7), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i7) {
        boolean z8 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z8 = true;
            }
            this.f13779b = i7;
        }
        if (z8) {
            this.f13781d.g(fVar, 1.0f);
            this.f13781d.g(fVar2, -1.0f);
            this.f13781d.g(fVar3, -1.0f);
        } else {
            this.f13781d.g(fVar, -1.0f);
            this.f13781d.g(fVar2, 1.0f);
            this.f13781d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i7) {
        boolean z8 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z8 = true;
            }
            this.f13779b = i7;
        }
        if (z8) {
            this.f13781d.g(fVar, 1.0f);
            this.f13781d.g(fVar2, -1.0f);
            this.f13781d.g(fVar3, 1.0f);
        } else {
            this.f13781d.g(fVar, -1.0f);
            this.f13781d.g(fVar2, 1.0f);
            this.f13781d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f13778a == null && this.f13779b == 0.0f && this.f13781d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i7;
        int d10 = this.f13781d.d();
        f fVar2 = null;
        float f4 = 0.0f;
        for (int i10 = 0; i10 < d10; i10++) {
            float f10 = this.f13781d.f(i10);
            if (f10 < 0.0f) {
                f e2 = this.f13781d.e(i10);
                if ((zArr == null || !zArr[e2.f13803b]) && e2 != fVar && (((i7 = e2.f13813z) == 3 || i7 == 4) && f10 < f4)) {
                    f4 = f10;
                    fVar2 = e2;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f13778a;
        if (fVar2 != null) {
            this.f13781d.g(fVar2, -1.0f);
            this.f13778a.f13804c = -1;
            this.f13778a = null;
        }
        float h10 = this.f13781d.h(fVar, true) * (-1.0f);
        this.f13778a = fVar;
        if (h10 == 1.0f) {
            return;
        }
        this.f13779b /= h10;
        a aVar = this.f13781d;
        int i7 = aVar.f13776h;
        for (int i10 = 0; i7 != -1 && i10 < aVar.f13770a; i10++) {
            float[] fArr = aVar.g;
            fArr[i7] = fArr[i7] / h10;
            i7 = aVar.f13775f[i7];
        }
    }

    public final void h(c cVar, f fVar, boolean z8) {
        if (fVar == null || !fVar.f13807f) {
            return;
        }
        float c10 = this.f13781d.c(fVar);
        this.f13779b = (fVar.f13806e * c10) + this.f13779b;
        this.f13781d.h(fVar, z8);
        if (z8) {
            fVar.b(this);
        }
        if (this.f13781d.d() == 0) {
            this.f13782e = true;
            cVar.f13785b = true;
        }
    }

    public void i(c cVar, b bVar, boolean z8) {
        a aVar = this.f13781d;
        aVar.getClass();
        float c10 = aVar.c(bVar.f13778a);
        aVar.h(bVar.f13778a, z8);
        a aVar2 = bVar.f13781d;
        int d10 = aVar2.d();
        for (int i7 = 0; i7 < d10; i7++) {
            f e2 = aVar2.e(i7);
            aVar.a(e2, aVar2.c(e2) * c10, z8);
        }
        this.f13779b = (bVar.f13779b * c10) + this.f13779b;
        if (z8) {
            bVar.f13778a.b(this);
        }
        if (this.f13778a == null || this.f13781d.d() != 0) {
            return;
        }
        this.f13782e = true;
        cVar.f13785b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z8;
        String h10 = X.c.h(this.f13778a == null ? "0" : "" + this.f13778a, " = ");
        if (this.f13779b != 0.0f) {
            StringBuilder m10 = X.c.m(h10);
            m10.append(this.f13779b);
            h10 = m10.toString();
            z8 = true;
        } else {
            z8 = false;
        }
        int d10 = this.f13781d.d();
        for (int i7 = 0; i7 < d10; i7++) {
            f e2 = this.f13781d.e(i7);
            if (e2 != null) {
                float f4 = this.f13781d.f(i7);
                if (f4 != 0.0f) {
                    String fVar = e2.toString();
                    if (!z8) {
                        if (f4 < 0.0f) {
                            h10 = X.c.h(h10, "- ");
                            f4 *= -1.0f;
                        }
                        h10 = f4 == 1.0f ? X.c.h(h10, fVar) : h10 + f4 + " " + fVar;
                        z8 = true;
                    } else if (f4 > 0.0f) {
                        h10 = X.c.h(h10, " + ");
                        if (f4 == 1.0f) {
                        }
                        z8 = true;
                    } else {
                        h10 = X.c.h(h10, " - ");
                        f4 *= -1.0f;
                        if (f4 == 1.0f) {
                        }
                        z8 = true;
                    }
                }
            }
        }
        return !z8 ? X.c.h(h10, "0.0") : h10;
    }
}
