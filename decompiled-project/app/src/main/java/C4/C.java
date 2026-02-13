package C4;

import n5.C1704A;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class C implements G {

    /* renamed from: a, reason: collision with root package name */
    public final B f2657a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2658b = new n5.v(32);

    /* renamed from: c, reason: collision with root package name */
    public int f2659c;

    /* renamed from: d, reason: collision with root package name */
    public int f2660d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2661e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2662f;

    public C(B b2) {
        this.f2657a = b2;
    }

    @Override // C4.G
    public final void a() {
        this.f2662f = true;
    }

    @Override // C4.G
    public final void b(int i7, n5.v vVar) {
        boolean z8 = (i7 & 1) != 0;
        int v10 = z8 ? vVar.f21230b + vVar.v() : -1;
        if (this.f2662f) {
            if (!z8) {
                return;
            }
            this.f2662f = false;
            vVar.G(v10);
            this.f2660d = 0;
        }
        while (vVar.a() > 0) {
            int i10 = this.f2660d;
            n5.v vVar2 = this.f2658b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int v11 = vVar.v();
                    vVar.G(vVar.f21230b - 1);
                    if (v11 == 255) {
                        this.f2662f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.f2660d);
                vVar.f(this.f2660d, vVar2.f21229a, min);
                int i11 = this.f2660d + min;
                this.f2660d = i11;
                if (i11 == 3) {
                    vVar2.G(0);
                    vVar2.F(3);
                    vVar2.H(1);
                    int v12 = vVar2.v();
                    int v13 = vVar2.v();
                    this.f2661e = (v12 & 128) != 0;
                    int i12 = (((v12 & 15) << 8) | v13) + 3;
                    this.f2659c = i12;
                    byte[] bArr = vVar2.f21229a;
                    if (bArr.length < i12) {
                        vVar2.b(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.f2659c - this.f2660d);
                vVar.f(this.f2660d, vVar2.f21229a, min2);
                int i13 = this.f2660d + min2;
                this.f2660d = i13;
                int i14 = this.f2659c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f2661e) {
                        vVar2.F(i14);
                    } else {
                        if (n5.D.l(0, vVar2.f21229a, i14, -1) != 0) {
                            this.f2662f = true;
                            return;
                        }
                        vVar2.F(this.f2659c - 4);
                    }
                    vVar2.G(0);
                    this.f2657a.b(vVar2);
                    this.f2660d = 0;
                }
            }
        }
    }

    @Override // C4.G
    public final void c(C1704A c1704a, InterfaceC1984l interfaceC1984l, F f4) {
        this.f2657a.c(c1704a, interfaceC1984l, f4);
        this.f2662f = true;
    }
}
