package C4;

import m4.K;
import m4.L;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public final n5.v f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final W8.a f2865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2866c;

    /* renamed from: d, reason: collision with root package name */
    public s4.v f2867d;

    /* renamed from: e, reason: collision with root package name */
    public String f2868e;

    /* renamed from: f, reason: collision with root package name */
    public int f2869f = 0;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2870h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2871i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f2872l;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, W8.a] */
    public u(String str) {
        n5.v vVar = new n5.v(4);
        this.f2864a = vVar;
        vVar.f21229a[0] = -1;
        this.f2865b = new Object();
        this.f2872l = -9223372036854775807L;
        this.f2866c = str;
    }

    @Override // C4.i
    public final void a() {
        this.f2869f = 0;
        this.g = 0;
        this.f2871i = false;
        this.f2872l = -9223372036854775807L;
    }

    @Override // C4.i
    public final void b(n5.v vVar) {
        AbstractC1705a.n(this.f2867d);
        while (vVar.a() > 0) {
            int i7 = this.f2869f;
            n5.v vVar2 = this.f2864a;
            if (i7 == 0) {
                byte[] bArr = vVar.f21229a;
                int i10 = vVar.f21230b;
                int i11 = vVar.f21231c;
                while (true) {
                    if (i10 >= i11) {
                        vVar.G(i11);
                        break;
                    }
                    byte b2 = bArr[i10];
                    boolean z8 = (b2 & 255) == 255;
                    boolean z10 = this.f2871i && (b2 & 224) == 224;
                    this.f2871i = z8;
                    if (z10) {
                        vVar.G(i10 + 1);
                        this.f2871i = false;
                        vVar2.f21229a[1] = bArr[i10];
                        this.g = 2;
                        this.f2869f = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i7 == 1) {
                int min = Math.min(vVar.a(), 4 - this.g);
                vVar.f(this.g, vVar2.f21229a, min);
                int i12 = this.g + min;
                this.g = i12;
                if (i12 >= 4) {
                    vVar2.G(0);
                    int h10 = vVar2.h();
                    W8.a aVar = this.f2865b;
                    if (aVar.d(h10)) {
                        this.k = aVar.f10848b;
                        if (!this.f2870h) {
                            int i13 = aVar.f10849c;
                            this.j = (aVar.f10852f * 1000000) / i13;
                            K k = new K();
                            k.f19976a = this.f2868e;
                            k.k = (String) aVar.g;
                            k.f19984l = 4096;
                            k.f19996x = aVar.f10850d;
                            k.f19997y = i13;
                            k.f19978c = this.f2866c;
                            this.f2867d.a(new L(k));
                            this.f2870h = true;
                        }
                        vVar2.G(0);
                        this.f2867d.c(4, vVar2);
                        this.f2869f = 2;
                    } else {
                        this.g = 0;
                        this.f2869f = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(vVar.a(), this.k - this.g);
                this.f2867d.c(min2, vVar);
                int i14 = this.g + min2;
                this.g = i14;
                int i15 = this.k;
                if (i14 >= i15) {
                    long j = this.f2872l;
                    if (j != -9223372036854775807L) {
                        this.f2867d.e(j, 1, i15, 0, null);
                        this.f2872l += this.j;
                    }
                    this.g = 0;
                    this.f2869f = 0;
                }
            }
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f2872l = j;
        }
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2868e = f4.f2684e;
        f4.b();
        this.f2867d = interfaceC1984l.u(f4.f2683d, 1);
    }
}
