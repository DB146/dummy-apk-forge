package X4;

import W4.l;
import Z9.x;
import n5.D;
import s4.InterfaceC1984l;
import s4.v;
import y7.u0;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f10913a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.f f10914b = new b5.f();

    /* renamed from: c, reason: collision with root package name */
    public final int f10915c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10917e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10918f;

    /* renamed from: u, reason: collision with root package name */
    public long f10919u;

    /* renamed from: v, reason: collision with root package name */
    public v f10920v;

    /* renamed from: w, reason: collision with root package name */
    public long f10921w;

    public a(l lVar) {
        this.f10913a = lVar;
        this.f10915c = lVar.f10721b;
        String str = (String) lVar.f10723d.get("mode");
        str.getClass();
        if (u0.o(str, "AAC-hbr")) {
            this.f10916d = 13;
            this.f10917e = 3;
        } else {
            if (!u0.o(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f10916d = 6;
            this.f10917e = 2;
        }
        this.f10918f = this.f10917e + this.f10916d;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10919u = j;
        this.f10921w = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        this.f10919u = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        this.f10920v.getClass();
        short s3 = vVar.s();
        int i10 = s3 / this.f10918f;
        long U8 = x.U(this.f10921w, j, this.f10919u, this.f10915c);
        b5.f fVar = this.f10914b;
        fVar.o(vVar);
        int i11 = this.f10917e;
        int i12 = this.f10916d;
        if (i10 == 1) {
            int i13 = fVar.i(i12);
            fVar.s(i11);
            this.f10920v.c(vVar.a(), vVar);
            if (z8) {
                this.f10920v.e(U8, 1, i13, 0, null);
                return;
            }
            return;
        }
        vVar.H((s3 + 7) / 8);
        long j10 = U8;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = fVar.i(i12);
            fVar.s(i11);
            this.f10920v.c(i15, vVar);
            this.f10920v.e(j10, 1, i15, 0, null);
            j10 += D.T(i10, 1000000L, this.f10915c);
        }
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 1);
        this.f10920v = u3;
        u3.a(this.f10913a.f10722c);
    }
}
