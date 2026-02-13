package C4;

import F.C0257a;
import n5.AbstractC1705a;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: C4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242d implements InterfaceC1982j {

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2703c;

    /* renamed from: d, reason: collision with root package name */
    public final b5.f f2704d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1984l f2705e;

    /* renamed from: f, reason: collision with root package name */
    public long f2706f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2707h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2708i;

    /* renamed from: a, reason: collision with root package name */
    public final C0243e f2701a = new C0243e(null, true);

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2702b = new n5.v(2048);
    public long g = -1;

    public C0242d() {
        n5.v vVar = new n5.v(10);
        this.f2703c = vVar;
        byte[] bArr = vVar.f21229a;
        this.f2704d = new b5.f(bArr, bArr.length);
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f2707h = false;
        this.f2701a.a();
        this.f2706f = j10;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g = (C1979g) interfaceC1983k;
        int i7 = 0;
        while (true) {
            n5.v vVar = this.f2703c;
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
        if (this.g == -1) {
            this.g = i7;
        }
        int i10 = i7;
        int i11 = 0;
        int i12 = 0;
        do {
            n5.v vVar2 = this.f2703c;
            c1979g.x(vVar2.f21229a, 0, 2, false);
            vVar2.G(0);
            if ((vVar2.A() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c1979g.x(vVar2.f21229a, 0, 4, false);
                b5.f fVar = this.f2704d;
                fVar.p(14);
                int i13 = fVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    c1979g.f24057f = 0;
                    c1979g.b(i10, false);
                } else {
                    c1979g.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                c1979g.f24057f = 0;
                c1979g.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i7 < 8192);
        return false;
    }

    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        AbstractC1705a.n(this.f2705e);
        long j = ((C1979g) interfaceC1983k).f24054c;
        n5.v vVar = this.f2702b;
        int D10 = ((C1979g) interfaceC1983k).D(vVar.f21229a, 0, 2048);
        boolean z8 = D10 == -1;
        if (!this.f2708i) {
            this.f2705e.i(new C1986n(-9223372036854775807L));
            this.f2708i = true;
        }
        if (z8) {
            return -1;
        }
        vVar.G(0);
        vVar.F(D10);
        boolean z10 = this.f2707h;
        C0243e c0243e = this.f2701a;
        if (!z10) {
            c0243e.c(4, this.f2706f);
            this.f2707h = true;
        }
        c0243e.b(vVar);
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f2705e = interfaceC1984l;
        this.f2701a.e(interfaceC1984l, new F(0, 1));
        interfaceC1984l.f();
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
