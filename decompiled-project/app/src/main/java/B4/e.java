package B4;

import java.io.EOFException;
import n5.AbstractC1705a;
import n5.v;
import s4.C1979g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2063a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final v f2064b = new v(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f2065c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2067e;

    public final int a(int i7) {
        int i10;
        int i11 = 0;
        this.f2066d = 0;
        do {
            int i12 = this.f2066d;
            int i13 = i7 + i12;
            f fVar = this.f2063a;
            if (i13 >= fVar.f2070c) {
                break;
            }
            int[] iArr = fVar.f2073f;
            this.f2066d = i12 + 1;
            i10 = iArr[i12 + i7];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(C1979g c1979g) {
        int i7;
        AbstractC1705a.m(c1979g != null);
        boolean z8 = this.f2067e;
        v vVar = this.f2064b;
        if (z8) {
            this.f2067e = false;
            vVar.D(0);
        }
        while (!this.f2067e) {
            int i10 = this.f2065c;
            f fVar = this.f2063a;
            if (i10 < 0) {
                if (fVar.b(c1979g, -1L) && fVar.a(c1979g, true)) {
                    int i11 = fVar.f2071d;
                    if ((fVar.f2068a & 1) == 1 && vVar.f21231c == 0) {
                        i11 += a(0);
                        i7 = this.f2066d;
                    } else {
                        i7 = 0;
                    }
                    try {
                        c1979g.r(i11);
                        this.f2065c = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a9 = a(this.f2065c);
            int i12 = this.f2065c + this.f2066d;
            if (a9 > 0) {
                vVar.b(vVar.f21231c + a9);
                try {
                    c1979g.h(vVar.f21229a, vVar.f21231c, a9, false);
                    vVar.F(vVar.f21231c + a9);
                    this.f2067e = fVar.f2073f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f2070c) {
                i12 = -1;
            }
            this.f2065c = i12;
        }
        return true;
    }
}
