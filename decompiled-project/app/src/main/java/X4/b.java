package X4;

import W4.l;
import Z9.x;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import o4.C1788b;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f10922a;

    /* renamed from: c, reason: collision with root package name */
    public v f10924c;

    /* renamed from: d, reason: collision with root package name */
    public int f10925d;

    /* renamed from: f, reason: collision with root package name */
    public long f10927f;

    /* renamed from: u, reason: collision with root package name */
    public long f10928u;

    /* renamed from: b, reason: collision with root package name */
    public final b5.f f10923b = new b5.f();

    /* renamed from: e, reason: collision with root package name */
    public long f10926e = -9223372036854775807L;

    public b(l lVar) {
        this.f10922a = lVar;
    }

    @Override // X4.h
    public final void a(long j, long j10) {
        this.f10926e = j;
        this.f10928u = j10;
    }

    @Override // X4.h
    public final void b(long j) {
        AbstractC1705a.m(this.f10926e == -9223372036854775807L);
        this.f10926e = j;
    }

    @Override // X4.h
    public final void c(n5.v vVar, long j, int i7, boolean z8) {
        int v10 = vVar.v() & 3;
        int v11 = vVar.v() & 255;
        long U8 = x.U(this.f10928u, j, this.f10926e, this.f10922a.f10721b);
        if (v10 != 0) {
            if (v10 == 1 || v10 == 2) {
                int i10 = this.f10925d;
                if (i10 > 0) {
                    v vVar2 = this.f10924c;
                    int i11 = D.f21141a;
                    vVar2.e(this.f10927f, 1, i10, 0, null);
                    this.f10925d = 0;
                }
            } else if (v10 != 3) {
                throw new IllegalArgumentException(String.valueOf(v10));
            }
            int a9 = vVar.a();
            v vVar3 = this.f10924c;
            vVar3.getClass();
            vVar3.c(a9, vVar);
            int i12 = this.f10925d + a9;
            this.f10925d = i12;
            this.f10927f = U8;
            if (z8 && v10 == 3) {
                v vVar4 = this.f10924c;
                int i13 = D.f21141a;
                vVar4.e(U8, 1, i12, 0, null);
                this.f10925d = 0;
                return;
            }
            return;
        }
        int i14 = this.f10925d;
        if (i14 > 0) {
            v vVar5 = this.f10924c;
            int i15 = D.f21141a;
            vVar5.e(this.f10927f, 1, i14, 0, null);
            this.f10925d = 0;
        }
        if (v11 == 1) {
            int a10 = vVar.a();
            v vVar6 = this.f10924c;
            vVar6.getClass();
            vVar6.c(a10, vVar);
            v vVar7 = this.f10924c;
            int i16 = D.f21141a;
            vVar7.e(U8, 1, a10, 0, null);
            return;
        }
        byte[] bArr = vVar.f21229a;
        b5.f fVar = this.f10923b;
        fVar.getClass();
        fVar.n(bArr.length, bArr);
        fVar.t(2);
        for (int i17 = 0; i17 < v11; i17++) {
            C1788b i18 = AbstractC1787a.i(fVar);
            v vVar8 = this.f10924c;
            vVar8.getClass();
            int i19 = i18.f21835d;
            vVar8.c(i19, vVar);
            v vVar9 = this.f10924c;
            int i20 = D.f21141a;
            vVar9.e(U8, 1, i18.f21835d, 0, null);
            U8 += (i18.f21836e / i18.f21833b) * 1000000;
            fVar.t(i19);
        }
    }

    @Override // X4.h
    public final void d(InterfaceC1984l interfaceC1984l, int i7) {
        v u3 = interfaceC1984l.u(i7, 1);
        this.f10924c = u3;
        u3.a(this.f10922a.f10722c);
    }
}
