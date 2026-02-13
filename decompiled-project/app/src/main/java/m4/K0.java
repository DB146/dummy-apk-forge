package m4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class K0 implements InterfaceC1569g {

    /* renamed from: F, reason: collision with root package name */
    public static final Object f19999F = new Object();

    /* renamed from: G, reason: collision with root package name */
    public static final Object f20000G = new Object();

    /* renamed from: H, reason: collision with root package name */
    public static final C1558a0 f20001H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f20002I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f20003J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f20004K;
    public static final String L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f20005M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f20006N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f20007O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f20008P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f20009Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f20010R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f20011S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f20012T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f20013U;

    /* renamed from: A, reason: collision with root package name */
    public long f20014A;

    /* renamed from: B, reason: collision with root package name */
    public long f20015B;

    /* renamed from: C, reason: collision with root package name */
    public int f20016C;

    /* renamed from: D, reason: collision with root package name */
    public int f20017D;

    /* renamed from: E, reason: collision with root package name */
    public long f20018E;

    /* renamed from: b, reason: collision with root package name */
    public Object f20020b;

    /* renamed from: d, reason: collision with root package name */
    public Object f20022d;

    /* renamed from: e, reason: collision with root package name */
    public long f20023e;

    /* renamed from: f, reason: collision with root package name */
    public long f20024f;

    /* renamed from: u, reason: collision with root package name */
    public long f20025u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20026v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20027w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20028x;

    /* renamed from: y, reason: collision with root package name */
    public U f20029y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20030z;

    /* renamed from: a, reason: collision with root package name */
    public Object f20019a = f19999F;

    /* renamed from: c, reason: collision with root package name */
    public C1558a0 f20021c = f20001H;

    /* JADX WARN: Type inference failed for: r12v0, types: [m4.Q, m4.S] */
    static {
        V v10;
        P p10 = new P();
        S2.b bVar = new S2.b();
        List emptyList = Collections.emptyList();
        N6.t0 t0Var = N6.t0.f7341e;
        W w10 = W.f20184c;
        Uri uri = Uri.EMPTY;
        AbstractC1705a.m(((Uri) bVar.f8987e) == null || ((UUID) bVar.f8986d) != null);
        if (uri != null) {
            v10 = new V(uri, null, ((UUID) bVar.f8986d) != null ? new T(bVar) : null, null, emptyList, null, t0Var);
        } else {
            v10 = null;
        }
        f20001H = new C1558a0("com.google.android.exoplayer2.Timeline", new Q(p10), v10, new U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1562c0.f20268W, w10);
        int i7 = n5.D.f21141a;
        f20002I = Integer.toString(1, 36);
        f20003J = Integer.toString(2, 36);
        f20004K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        f20005M = Integer.toString(5, 36);
        f20006N = Integer.toString(6, 36);
        f20007O = Integer.toString(7, 36);
        f20008P = Integer.toString(8, 36);
        f20009Q = Integer.toString(9, 36);
        f20010R = Integer.toString(10, 36);
        f20011S = Integer.toString(11, 36);
        f20012T = Integer.toString(12, 36);
        f20013U = Integer.toString(13, 36);
    }

    public final boolean a() {
        AbstractC1705a.m(this.f20028x == (this.f20029y != null));
        return this.f20029y != null;
    }

    public final void b(Object obj, C1558a0 c1558a0, Object obj2, long j, long j10, long j11, boolean z8, boolean z10, U u3, long j12, long j13, int i7, int i10, long j14) {
        this.f20019a = obj;
        this.f20021c = c1558a0 != null ? c1558a0 : f20001H;
        if (c1558a0 != null) {
            V v10 = c1558a0.f20224b;
        }
        this.f20022d = obj2;
        this.f20023e = j;
        this.f20024f = j10;
        this.f20025u = j11;
        this.f20026v = z8;
        this.f20027w = z10;
        this.f20028x = u3 != null;
        this.f20029y = u3;
        this.f20014A = j12;
        this.f20015B = j13;
        this.f20016C = i7;
        this.f20017D = i10;
        this.f20018E = j14;
        this.f20030z = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !K0.class.equals(obj.getClass())) {
            return false;
        }
        K0 k02 = (K0) obj;
        return n5.D.a(this.f20019a, k02.f20019a) && n5.D.a(this.f20021c, k02.f20021c) && n5.D.a(this.f20022d, k02.f20022d) && n5.D.a(this.f20029y, k02.f20029y) && this.f20023e == k02.f20023e && this.f20024f == k02.f20024f && this.f20025u == k02.f20025u && this.f20026v == k02.f20026v && this.f20027w == k02.f20027w && this.f20030z == k02.f20030z && this.f20014A == k02.f20014A && this.f20015B == k02.f20015B && this.f20016C == k02.f20016C && this.f20017D == k02.f20017D && this.f20018E == k02.f20018E;
    }

    public final int hashCode() {
        int hashCode = (this.f20021c.hashCode() + ((this.f20019a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f20022d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        U u3 = this.f20029y;
        int hashCode3 = (hashCode2 + (u3 != null ? u3.hashCode() : 0)) * 31;
        long j = this.f20023e;
        int i7 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f20024f;
        int i10 = (i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f20025u;
        int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f20026v ? 1 : 0)) * 31) + (this.f20027w ? 1 : 0)) * 31) + (this.f20030z ? 1 : 0)) * 31;
        long j12 = this.f20014A;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f20015B;
        int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f20016C) * 31) + this.f20017D) * 31;
        long j14 = this.f20018E;
        return i13 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
