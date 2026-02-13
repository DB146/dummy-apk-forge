package B4;

import java.io.EOFException;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.v;
import s4.C1979g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2068a;

    /* renamed from: b, reason: collision with root package name */
    public long f2069b;

    /* renamed from: c, reason: collision with root package name */
    public int f2070c;

    /* renamed from: d, reason: collision with root package name */
    public int f2071d;

    /* renamed from: e, reason: collision with root package name */
    public int f2072e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2073f = new int[255];
    public final v g = new v(255);

    public final boolean a(C1979g c1979g, boolean z8) {
        boolean z10;
        boolean z11;
        this.f2068a = 0;
        this.f2069b = 0L;
        this.f2070c = 0;
        this.f2071d = 0;
        this.f2072e = 0;
        v vVar = this.g;
        vVar.D(27);
        try {
            z10 = c1979g.x(vVar.f21229a, 0, 27, z8);
        } catch (EOFException e2) {
            if (!z8) {
                throw e2;
            }
            z10 = false;
        }
        if (!z10 || vVar.w() != 1332176723) {
            return false;
        }
        if (vVar.v() != 0) {
            if (z8) {
                return false;
            }
            throw C1586o0.c("unsupported bit stream revision");
        }
        this.f2068a = vVar.v();
        this.f2069b = vVar.k();
        vVar.m();
        vVar.m();
        vVar.m();
        int v10 = vVar.v();
        this.f2070c = v10;
        this.f2071d = v10 + 27;
        vVar.D(v10);
        try {
            z11 = c1979g.x(vVar.f21229a, 0, this.f2070c, z8);
        } catch (EOFException e10) {
            if (!z8) {
                throw e10;
            }
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        for (int i7 = 0; i7 < this.f2070c; i7++) {
            int v11 = vVar.v();
            this.f2073f[i7] = v11;
            this.f2072e += v11;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r13 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r12.f24055d >= r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r0 = java.lang.Math.min(r12.f24058u, 1);
        r12.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r0 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r6 = r12.f24052a;
        r0 = r12.g(r6, 0, java.lang.Math.min(1, r6.length), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r0 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r12.f24055d += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0 == (-1)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(C1979g c1979g, long j) {
        boolean z8;
        AbstractC1705a.h(c1979g.f24055d == c1979g.A());
        v vVar = this.g;
        vVar.D(4);
        while (true) {
            if (j != -1 && c1979g.f24055d + 4 >= j) {
                break;
            }
            try {
                z8 = c1979g.x(vVar.f21229a, 0, 4, true);
            } catch (EOFException unused) {
                z8 = false;
            }
            if (!z8) {
                break;
            }
            vVar.G(0);
            if (vVar.w() == 1332176723) {
                c1979g.f24057f = 0;
                return true;
            }
            c1979g.r(1);
        }
    }
}
