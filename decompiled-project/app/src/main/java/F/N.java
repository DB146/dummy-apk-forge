package F;

import A0.C0005a;
import B0.C0170c0;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.S0;
import java.util.Map;
import u.C2047J;

/* loaded from: classes.dex */
public final class N implements Z.j, Z.c {

    /* renamed from: a, reason: collision with root package name */
    public final Z.k f3926a;

    /* renamed from: b, reason: collision with root package name */
    public final Z.g f3927b;

    /* renamed from: c, reason: collision with root package name */
    public final C2047J f3928c;

    public N(Z.j jVar, Map map, Z.g gVar) {
        C0005a c0005a = new C0005a(jVar, 11);
        S0 s02 = Z.l.f12101a;
        this.f3926a = new Z.k(map, c0005a);
        this.f3927b = gVar;
        int i7 = u.S.f24634a;
        this.f3928c = new C2047J();
    }

    @Override // Z.j
    public final Z.i a(String str, Rb.a aVar) {
        return this.f3926a.a(str, aVar);
    }

    @Override // Z.j
    public final boolean b(Object obj) {
        return this.f3926a.b(obj);
    }

    @Override // Z.j
    public final Map c() {
        C2047J c2047j = this.f3928c;
        Object[] objArr = c2047j.f24610b;
        long[] jArr = c2047j.f24609a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            this.f3927b.f(objArr[(i7 << 3) + i11]);
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return this.f3926a.c();
    }

    @Override // Z.c
    public final void d(Object obj, Y.e eVar, C0506o c0506o, int i7) {
        c0506o.S(-697180401);
        this.f3927b.d(obj, eVar, c0506o, i7 & 126);
        boolean i10 = c0506o.i(this) | c0506o.i(obj);
        Object H10 = c0506o.H();
        if (i10 || H10 == C0498k.f8409a) {
            H10 = new C0170c0(9, this, obj);
            c0506o.d0(H10);
        }
        C0480b.c(obj, (Rb.c) H10, c0506o);
        c0506o.p(false);
    }

    @Override // Z.j
    public final Object e(String str) {
        return this.f3926a.e(str);
    }

    @Override // Z.c
    public final void f(Object obj) {
        this.f3927b.f(obj);
    }
}
