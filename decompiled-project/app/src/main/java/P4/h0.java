package P4;

import N6.t0;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m4.C1558a0;
import m4.C1562c0;
import m4.J0;
import m4.K0;
import m4.L0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class h0 extends L0 {

    /* renamed from: B, reason: collision with root package name */
    public static final Object f8047B = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final m4.U f8048A;

    /* renamed from: b, reason: collision with root package name */
    public final long f8049b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8050c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8051d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8052e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8053f;

    /* renamed from: u, reason: collision with root package name */
    public final long f8054u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8055v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8056w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8057x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f8058y;

    /* renamed from: z, reason: collision with root package name */
    public final C1558a0 f8059z;

    static {
        m4.P p10 = new m4.P();
        S2.b bVar = new S2.b();
        List emptyList = Collections.emptyList();
        t0 t0Var = t0.f7341e;
        m4.W w10 = m4.W.f20184c;
        Uri uri = Uri.EMPTY;
        AbstractC1705a.m(((Uri) bVar.f8987e) == null || ((UUID) bVar.f8986d) != null);
        if (uri != null) {
            new m4.V(uri, null, ((UUID) bVar.f8986d) != null ? new m4.T(bVar) : null, null, emptyList, null, t0Var);
        }
        new m4.Q(p10);
        C1562c0 c1562c0 = C1562c0.f20268W;
    }

    public h0(long j, long j10, long j11, long j12, long j13, long j14, boolean z8, boolean z10, boolean z11, Object obj, C1558a0 c1558a0, m4.U u3) {
        this.f8049b = j;
        this.f8050c = j10;
        this.f8051d = j11;
        this.f8052e = j12;
        this.f8053f = j13;
        this.f8054u = j14;
        this.f8055v = z8;
        this.f8056w = z10;
        this.f8057x = z11;
        this.f8058y = obj;
        c1558a0.getClass();
        this.f8059z = c1558a0;
        this.f8048A = u3;
    }

    public h0(long j, long j10, long j11, long j12, boolean z8, boolean z10, boolean z11, Object obj, C1558a0 c1558a0) {
        this(-9223372036854775807L, -9223372036854775807L, j, j10, j11, j12, z8, z10, false, obj, c1558a0, z11 ? c1558a0.f20225c : null);
    }

    public h0(long j, boolean z8, boolean z10, C1558a0 c1558a0) {
        this(j, j, 0L, 0L, z8, false, z10, null, c1558a0);
    }

    @Override // m4.L0
    public final int b(Object obj) {
        return f8047B.equals(obj) ? 0 : -1;
    }

    @Override // m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        AbstractC1705a.k(i7, 1);
        Object obj = z8 ? f8047B : null;
        long j = -this.f8053f;
        j02.getClass();
        j02.i(null, obj, 0, this.f8051d, j, Q4.b.f8638f, false);
        return j02;
    }

    @Override // m4.L0
    public final int h() {
        return 1;
    }

    @Override // m4.L0
    public final Object l(int i7) {
        AbstractC1705a.k(i7, 1);
        return f8047B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // m4.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K0 m(int i7, K0 k02, long j) {
        long j10;
        AbstractC1705a.k(i7, 1);
        long j11 = this.f8054u;
        boolean z8 = this.f8056w;
        if (z8 && !this.f8057x && j != 0) {
            long j12 = this.f8052e;
            if (j12 != -9223372036854775807L) {
                j11 += j;
            }
            j10 = -9223372036854775807L;
            k02.b(K0.f19999F, this.f8059z, this.f8058y, this.f8049b, this.f8050c, -9223372036854775807L, this.f8055v, z8, this.f8048A, j10, this.f8052e, 0, 0, this.f8053f);
            return k02;
        }
        j10 = j11;
        k02.b(K0.f19999F, this.f8059z, this.f8058y, this.f8049b, this.f8050c, -9223372036854775807L, this.f8055v, z8, this.f8048A, j10, this.f8052e, 0, 0, this.f8053f);
        return k02;
    }

    @Override // m4.L0
    public final int o() {
        return 1;
    }
}
