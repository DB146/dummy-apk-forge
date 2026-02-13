package C4;

import F.C0257a;
import n5.AbstractC1705a;
import s4.C1973a;
import s4.C1974b;
import s4.C1976d;
import s4.C1979g;
import s4.InterfaceC1975c;
import s4.InterfaceC1977e;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C1973a f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1977e f2889b;

    /* renamed from: c, reason: collision with root package name */
    public C1974b f2890c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2891d;

    public x(InterfaceC1975c interfaceC1975c, InterfaceC1977e interfaceC1977e, long j, long j10, long j11, long j12, long j13, int i7) {
        this.f2889b = interfaceC1977e;
        this.f2891d = i7;
        this.f2888a = new C1973a(interfaceC1975c, j, j10, j11, j12, j13);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(C1979g c1979g, long j, C0257a c0257a) {
        if (j == c1979g.f24055d) {
            return 0;
        }
        c0257a.f3957a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(C1979g c1979g, C0257a c0257a) {
        while (true) {
            C1974b c1974b = this.f2890c;
            AbstractC1705a.n(c1974b);
            long j = c1974b.f24040f;
            long j10 = c1974b.g;
            long j11 = c1974b.f24041h;
            long j12 = j10 - j;
            long j13 = this.f2891d;
            InterfaceC1977e interfaceC1977e = this.f2889b;
            if (j12 <= j13) {
                this.f2890c = null;
                interfaceC1977e.c();
                return c(c1979g, j, c0257a);
            }
            long j14 = j11 - c1979g.f24055d;
            if (j14 < 0 || j14 > 262144) {
                break;
            }
            c1979g.r((int) j14);
            c1979g.f24057f = 0;
            C1976d b2 = interfaceC1977e.b(c1979g, c1974b.f24036b);
            int i7 = b2.f24043a;
            if (i7 == -3) {
                this.f2890c = null;
                interfaceC1977e.c();
                return c(c1979g, j11, c0257a);
            }
            long j15 = b2.f24044b;
            long j16 = b2.f24045c;
            if (i7 == -2) {
                c1974b.f24038d = j15;
                c1974b.f24040f = j16;
                c1974b.f24041h = C1974b.a(c1974b.f24036b, j15, c1974b.f24039e, j16, c1974b.g, c1974b.f24037c);
            } else {
                if (i7 != -1) {
                    if (i7 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j17 = j16 - c1979g.f24055d;
                    if (j17 >= 0 && j17 <= 262144) {
                        c1979g.r((int) j17);
                    }
                    this.f2890c = null;
                    interfaceC1977e.c();
                    return c(c1979g, j16, c0257a);
                }
                c1974b.f24039e = j15;
                c1974b.g = j16;
                c1974b.f24041h = C1974b.a(c1974b.f24036b, c1974b.f24038d, j15, c1974b.f24040f, j16, c1974b.f24037c);
            }
        }
    }

    public final void d(long j) {
        C1974b c1974b = this.f2890c;
        if (c1974b == null || c1974b.f24035a != j) {
            C1973a c1973a = this.f2888a;
            this.f2890c = new C1974b(j, c1973a.f24029a.e(j), c1973a.f24031c, c1973a.f24032d, c1973a.f24033e, c1973a.f24034f);
        }
    }
}
