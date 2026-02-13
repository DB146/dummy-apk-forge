package S4;

import java.util.List;
import m4.C1558a0;
import m4.J0;
import m4.K0;
import m4.L0;
import m4.U;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class e extends L0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f9082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9083c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9084d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9085e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9086f;

    /* renamed from: u, reason: collision with root package name */
    public final long f9087u;

    /* renamed from: v, reason: collision with root package name */
    public final long f9088v;

    /* renamed from: w, reason: collision with root package name */
    public final T4.c f9089w;

    /* renamed from: x, reason: collision with root package name */
    public final C1558a0 f9090x;

    /* renamed from: y, reason: collision with root package name */
    public final U f9091y;

    public e(long j, long j10, long j11, int i7, long j12, long j13, long j14, T4.c cVar, C1558a0 c1558a0, U u3) {
        AbstractC1705a.m(cVar.f9250d == (u3 != null));
        this.f9082b = j;
        this.f9083c = j10;
        this.f9084d = j11;
        this.f9085e = i7;
        this.f9086f = j12;
        this.f9087u = j13;
        this.f9088v = j14;
        this.f9089w = cVar;
        this.f9090x = c1558a0;
        this.f9091y = u3;
    }

    @Override // m4.L0
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f9085e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        AbstractC1705a.k(i7, h());
        T4.c cVar = this.f9089w;
        String str = z8 ? cVar.b(i7).f9276a : null;
        Integer valueOf = z8 ? Integer.valueOf(this.f9085e + i7) : null;
        long d10 = cVar.d(i7);
        long M3 = D.M(cVar.b(i7).f9277b - cVar.b(0).f9277b) - this.f9086f;
        j02.getClass();
        j02.i(str, valueOf, 0, d10, M3, Q4.b.f8638f, false);
        return j02;
    }

    @Override // m4.L0
    public final int h() {
        return this.f9089w.f9256m.size();
    }

    @Override // m4.L0
    public final Object l(int i7) {
        AbstractC1705a.k(i7, h());
        return Integer.valueOf(this.f9085e + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    @Override // m4.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K0 m(int i7, K0 k02, long j) {
        i d10;
        long b2;
        AbstractC1705a.k(i7, 1);
        T4.c cVar = this.f9089w;
        boolean z8 = cVar.f9250d && cVar.f9251e != -9223372036854775807L && cVar.f9248b == -9223372036854775807L;
        long j10 = this.f9088v;
        if (z8) {
            if (j > 0) {
                j10 += j;
                if (j10 > this.f9087u) {
                    b2 = -9223372036854775807L;
                    k02.b(K0.f19999F, this.f9090x, cVar, this.f9082b, this.f9083c, this.f9084d, true, (cVar.f9250d || cVar.f9251e == -9223372036854775807L || cVar.f9248b != -9223372036854775807L) ? false : true, this.f9091y, b2, this.f9087u, 0, h() - 1, this.f9086f);
                    return k02;
                }
            }
            long j11 = this.f9086f + j10;
            long d11 = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f9256m.size() - 1 && j11 >= d11) {
                j11 -= d11;
                i10++;
                d11 = cVar.d(i10);
            }
            T4.h b10 = cVar.b(i10);
            List list = b10.f9278c;
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((T4.a) list.get(i11)).f9238b == 2) {
                    break;
                }
                i11++;
            }
            if (i11 != -1 && (d10 = ((T4.m) ((T4.a) b10.f9278c.get(i11)).f9239c.get(0)).d()) != null && d10.y(d11) != 0) {
                b2 = (d10.b(d10.c(j11, d11)) + j10) - j11;
                if (cVar.f9250d) {
                }
                k02.b(K0.f19999F, this.f9090x, cVar, this.f9082b, this.f9083c, this.f9084d, true, (cVar.f9250d || cVar.f9251e == -9223372036854775807L || cVar.f9248b != -9223372036854775807L) ? false : true, this.f9091y, b2, this.f9087u, 0, h() - 1, this.f9086f);
                return k02;
            }
        }
        b2 = j10;
        if (cVar.f9250d) {
        }
        k02.b(K0.f19999F, this.f9090x, cVar, this.f9082b, this.f9083c, this.f9084d, true, (cVar.f9250d || cVar.f9251e == -9223372036854775807L || cVar.f9248b != -9223372036854775807L) ? false : true, this.f9091y, b2, this.f9087u, 0, h() - 1, this.f9086f);
        return k02;
    }

    @Override // m4.L0
    public final int o() {
        return 1;
    }
}
