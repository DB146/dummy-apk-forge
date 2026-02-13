package C4;

import F.C0257a;
import o4.AbstractC1787a;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: C4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239a implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final C0240b f2685a = new C0240b(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2686b = new n5.v(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2687c;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f2687c = false;
        this.f2685a.a();
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g;
        int d10;
        n5.v vVar = new n5.v(10);
        int i7 = 0;
        while (true) {
            c1979g = (C1979g) interfaceC1983k;
            c1979g.x(vVar.f21229a, 0, 10, false);
            vVar.G(0);
            if (vVar.x() != 4801587) {
                break;
            }
            vVar.H(3);
            int u3 = vVar.u();
            i7 += u3 + 10;
            c1979g.b(u3, false);
        }
        c1979g.f24057f = 0;
        c1979g.b(i7, false);
        int i10 = 0;
        int i11 = i7;
        while (true) {
            c1979g.x(vVar.f21229a, 0, 6, false);
            vVar.G(0);
            if (vVar.A() != 2935) {
                c1979g.f24057f = 0;
                i11++;
                if (i11 - i7 >= 8192) {
                    return false;
                }
                c1979g.b(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.f21229a;
                if (bArr.length < 6) {
                    d10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    d10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    d10 = AbstractC1787a.d((b2 & 192) >> 6, b2 & 63);
                }
                if (d10 == -1) {
                    return false;
                }
                c1979g.b(d10 - 6, false);
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        n5.v vVar = this.f2686b;
        int D10 = ((C1979g) interfaceC1983k).D(vVar.f21229a, 0, 2786);
        if (D10 == -1) {
            return -1;
        }
        vVar.G(0);
        vVar.F(D10);
        boolean z8 = this.f2687c;
        C0240b c0240b = this.f2685a;
        if (!z8) {
            c0240b.c(4, 0L);
            this.f2687c = true;
        }
        c0240b.b(vVar);
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f2685a.e(interfaceC1984l, new F(0, 1));
        interfaceC1984l.f();
        interfaceC1984l.i(new C1986n(-9223372036854775807L));
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
