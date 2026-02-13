package v4;

import F.C0257a;
import n5.v;
import s4.C1976d;
import s4.C1979g;
import s4.C1987o;
import s4.InterfaceC1977e;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2140a implements InterfaceC1977e {

    /* renamed from: a, reason: collision with root package name */
    public final C1987o f25048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25049b;

    /* renamed from: c, reason: collision with root package name */
    public final C0257a f25050c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [F.a, java.lang.Object] */
    public C2140a(C1987o c1987o, int i7) {
        this.f25048a = c1987o;
        this.f25049b = i7;
    }

    public final long a(C1979g c1979g) {
        long j;
        C0257a c0257a;
        C1987o c1987o;
        boolean m10;
        int f4;
        while (true) {
            long A10 = c1979g.A();
            j = c1979g.f24054c;
            long j10 = j - 6;
            c0257a = this.f25050c;
            c1987o = this.f25048a;
            if (A10 >= j10) {
                break;
            }
            long A11 = c1979g.A();
            byte[] bArr = new byte[2];
            c1979g.x(bArr, 0, 2, false);
            int i7 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i10 = this.f25049b;
            if (i7 != i10) {
                c1979g.f24057f = 0;
                c1979g.b((int) (A11 - c1979g.f24055d), false);
                m10 = false;
            } else {
                v vVar = new v(16);
                System.arraycopy(bArr, 0, vVar.f21229a, 0, 2);
                byte[] bArr2 = vVar.f21229a;
                int i11 = 0;
                for (int i12 = 2; i11 < 14 && (f4 = c1979g.f(i12 + i11, bArr2, 14 - i11)) != -1; i12 = 2) {
                    i11 += f4;
                }
                vVar.F(i11);
                c1979g.f24057f = 0;
                c1979g.b((int) (A11 - c1979g.f24055d), false);
                m10 = tc.b.m(vVar, c1987o, i10, c0257a);
            }
            if (m10) {
                break;
            }
            c1979g.b(1, false);
        }
        if (c1979g.A() < j - 6) {
            return c0257a.f3957a;
        }
        c1979g.b((int) (j - c1979g.A()), false);
        return c1987o.j;
    }

    @Override // s4.InterfaceC1977e
    public final C1976d b(C1979g c1979g, long j) {
        long j10 = c1979g.f24055d;
        long a9 = a(c1979g);
        long A10 = c1979g.A();
        c1979g.b(Math.max(6, this.f25048a.f24070c), false);
        long a10 = a(c1979g);
        return (a9 > j || a10 <= j) ? a10 <= j ? new C1976d(-2, a10, c1979g.A()) : new C1976d(-1, a9, j10) : new C1976d(0, -9223372036854775807L, A10);
    }
}
