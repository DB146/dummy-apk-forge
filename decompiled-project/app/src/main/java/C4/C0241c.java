package C4;

import F.C0257a;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: C4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241c implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final C0240b f2698a = new C0240b(null, 1);

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2699b = new n5.v(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2700c;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f2700c = false;
        this.f2698a.a();
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g;
        int i7;
        n5.v vVar = new n5.v(10);
        int i10 = 0;
        while (true) {
            c1979g = (C1979g) interfaceC1983k;
            c1979g.x(vVar.f21229a, 0, 10, false);
            vVar.G(0);
            if (vVar.x() != 4801587) {
                break;
            }
            vVar.H(3);
            int u3 = vVar.u();
            i10 += u3 + 10;
            c1979g.b(u3, false);
        }
        c1979g.f24057f = 0;
        c1979g.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            c1979g.x(vVar.f21229a, 0, 7, false);
            vVar.G(0);
            int A10 = vVar.A();
            if (A10 == 44096 || A10 == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.f21229a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (A10 == 44097) {
                        i13 += 2;
                    }
                    i7 = i14 + i13;
                }
                if (i7 == -1) {
                    return false;
                }
                c1979g.b(i7 - 7, false);
            } else {
                c1979g.f24057f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c1979g.b(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        n5.v vVar = this.f2699b;
        int D10 = ((C1979g) interfaceC1983k).D(vVar.f21229a, 0, 16384);
        if (D10 == -1) {
            return -1;
        }
        vVar.G(0);
        vVar.F(D10);
        boolean z8 = this.f2700c;
        C0240b c0240b = this.f2698a;
        if (!z8) {
            c0240b.c(4, 0L);
            this.f2700c = true;
        }
        c0240b.b(vVar);
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f2698a.e(interfaceC1984l, new F(0, 1));
        interfaceC1984l.f();
        interfaceC1984l.i(new C1986n(-9223372036854775807L));
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
