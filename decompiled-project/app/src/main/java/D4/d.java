package D4;

import F.C0257a;
import Z9.x;
import android.util.Pair;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.D;
import s4.C1979g;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class d implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1984l f3218a;

    /* renamed from: b, reason: collision with root package name */
    public v f3219b;

    /* renamed from: e, reason: collision with root package name */
    public b f3222e;

    /* renamed from: c, reason: collision with root package name */
    public int f3220c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f3221d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f3223f = -1;
    public long g = -1;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f3220c = j == 0 ? 0 : 4;
        b bVar = this.f3222e;
        if (bVar != null) {
            bVar.c(j10);
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        return x.f((C1979g) interfaceC1983k);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Type inference failed for: r4v5, types: [A4.i, java.lang.Object] */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        byte[] bArr;
        int y10;
        int i7;
        AbstractC1705a.n(this.f3219b);
        int i10 = D.f21141a;
        int i11 = this.f3220c;
        if (i11 == 0) {
            AbstractC1705a.m(((C1979g) interfaceC1983k).f24055d == 0);
            int i12 = this.f3223f;
            if (i12 != -1) {
                ((C1979g) interfaceC1983k).r(i12);
                this.f3220c = 4;
            } else {
                C1979g c1979g = (C1979g) interfaceC1983k;
                if (!x.f(c1979g)) {
                    throw C1586o0.a("Unsupported or unrecognized wav file type.", null);
                }
                c1979g.r((int) (c1979g.A() - c1979g.f24055d));
                this.f3220c = 1;
            }
            return 0;
        }
        long j = -1;
        if (i11 == 1) {
            n5.v vVar = new n5.v(8);
            C1979g c1979g2 = (C1979g) interfaceC1983k;
            e b2 = e.b(c1979g2, vVar);
            if (b2.f3224a != 1685272116) {
                c1979g2.f24057f = 0;
            } else {
                c1979g2.b(8, false);
                vVar.G(0);
                C1979g c1979g3 = (C1979g) interfaceC1983k;
                c1979g3.x(vVar.f21229a, 0, 8, false);
                j = vVar.k();
                c1979g3.r(((int) b2.f3225b) + 8);
            }
            this.f3221d = j;
            this.f3220c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC1705a.m(this.g != -1);
                long j10 = this.g - ((C1979g) interfaceC1983k).f24055d;
                b bVar = this.f3222e;
                bVar.getClass();
                return bVar.a((C1979g) interfaceC1983k, j10) ? -1 : 0;
            }
            ((C1979g) interfaceC1983k).f24057f = 0;
            C1979g c1979g4 = (C1979g) interfaceC1983k;
            e T10 = x.T(1684108385, c1979g4, new n5.v(8));
            c1979g4.r(8);
            Pair create = Pair.create(Long.valueOf(c1979g4.f24055d), Long.valueOf(T10.f3225b));
            this.f3223f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j11 = this.f3221d;
            if (j11 != -1 && longValue == 4294967295L) {
                longValue = j11;
            }
            long j12 = this.f3223f + longValue;
            this.g = j12;
            long j13 = c1979g4.f24054c;
            if (j13 != -1 && j12 > j13) {
                AbstractC1705a.S("WavExtractor", "Data exceeds input length: " + this.g + ", " + j13);
                this.g = j13;
            }
            b bVar2 = this.f3222e;
            bVar2.getClass();
            bVar2.b(this.f3223f, this.g);
            this.f3220c = 4;
            return 0;
        }
        n5.v vVar2 = new n5.v(16);
        C1979g c1979g5 = (C1979g) interfaceC1983k;
        long j14 = x.T(1718449184, c1979g5, vVar2).f3225b;
        AbstractC1705a.m(j14 >= 16);
        c1979g5.x(vVar2.f21229a, 0, 16, false);
        vVar2.G(0);
        int o10 = vVar2.o();
        int o11 = vVar2.o();
        int n6 = vVar2.n();
        vVar2.n();
        int o12 = vVar2.o();
        int o13 = vVar2.o();
        int i13 = ((int) j14) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            ((C1979g) interfaceC1983k).x(bArr, 0, i13, false);
        } else {
            bArr = D.f21146f;
        }
        C1979g c1979g6 = (C1979g) interfaceC1983k;
        c1979g6.r((int) (c1979g6.A() - c1979g6.f24055d));
        ?? obj = new Object();
        obj.f388a = o11;
        obj.f389b = n6;
        obj.f390c = o12;
        obj.f391d = o13;
        obj.f392e = bArr;
        if (o10 == 17) {
            this.f3222e = new a(this.f3218a, this.f3219b, obj);
        } else if (o10 == 6) {
            this.f3222e = new c(this.f3218a, this.f3219b, obj, "audio/g711-alaw", -1);
        } else if (o10 == 7) {
            this.f3222e = new c(this.f3218a, this.f3219b, obj, "audio/g711-mlaw", -1);
        } else {
            if (o10 != 1) {
                if (o10 == 3) {
                    y10 = o13 == 32 ? 4 : 0;
                    i7 = y10;
                    if (i7 == 0) {
                    }
                } else if (o10 != 65534) {
                    i7 = 0;
                    if (i7 == 0) {
                        throw C1586o0.c("Unsupported WAV format type: " + o10);
                    }
                    this.f3222e = new c(this.f3218a, this.f3219b, obj, "audio/raw", i7);
                }
            }
            y10 = D.y(o13);
            i7 = y10;
            if (i7 == 0) {
            }
        }
        this.f3220c = 3;
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f3218a = interfaceC1984l;
        this.f3219b = interfaceC1984l.u(0, 1);
        interfaceC1984l.f();
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
