package X4;

import N6.y0;
import W4.C0591i;
import W4.l;
import Z9.x;
import h3.o;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.D;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f10961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10962b;

    /* renamed from: c, reason: collision with root package name */
    public v f10963c;

    /* renamed from: d, reason: collision with root package name */
    public long f10964d;

    /* renamed from: e, reason: collision with root package name */
    public int f10965e;

    /* renamed from: f, reason: collision with root package name */
    public int f10966f;

    /* renamed from: u, reason: collision with root package name */
    public long f10967u;

    /* renamed from: v, reason: collision with root package name */
    public long f10968v;

    public f(l lVar) {
        this.f10961a = lVar;
        try {
            this.f10962b = e(lVar.f10723d);
            this.f10964d = -9223372036854775807L;
            this.f10965e = -1;
            this.f10966f = 0;
            this.f10967u = 0L;
            this.f10968v = -9223372036854775807L;
        } catch (C1586o0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int e(y0 y0Var) {
        String str = (String) y0Var.get("config");
        int i7 = 0;
        i7 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] q10 = D.q(str);
            b5.f fVar = new b5.f(q10, q10.length);
            int i10 = fVar.i(1);
            if (i10 != 0) {
                throw new C1586o0(o.l(i10, "unsupported audio mux version: "), null, true, 0);
            }
            AbstractC1705a.g("Only supports allStreamsSameTimeFraming.", fVar.i(1) == 1);
            int i11 = fVar.i(6);
            AbstractC1705a.g("Only suppors one program.", fVar.i(4) == 0);
            AbstractC1705a.g("Only suppors one layer.", fVar.i(3) == 0);
            i7 = i11;
        }
        return i7 + 1;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10964d = j;
        this.f10966f = 0;
        this.f10967u = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        AbstractC1705a.m(this.f10964d == -9223372036854775807L);
        this.f10964d = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        AbstractC1705a.n(this.f10963c);
        int a9 = C0591i.a(this.f10965e);
        if (this.f10966f > 0 && a9 < i7) {
            v vVar2 = this.f10963c;
            vVar2.getClass();
            vVar2.e(this.f10968v, 1, this.f10966f, 0, null);
            this.f10966f = 0;
            this.f10968v = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f10962b; i10++) {
            int i11 = 0;
            while (vVar.f21230b < vVar.f21231c) {
                int v10 = vVar.v();
                i11 += v10;
                if (v10 != 255) {
                    break;
                }
            }
            this.f10963c.c(i11, vVar);
            this.f10966f += i11;
        }
        this.f10968v = x.U(this.f10967u, j, this.f10964d, this.f10961a.f10721b);
        if (z8) {
            v vVar3 = this.f10963c;
            vVar3.getClass();
            vVar3.e(this.f10968v, 1, this.f10966f, 0, null);
            this.f10966f = 0;
            this.f10968v = -9223372036854775807L;
        }
        this.f10965e = i7;
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 2);
        this.f10963c = u3;
        int i10 = D.f21141a;
        u3.a(this.f10961a.f10722c);
    }
}
