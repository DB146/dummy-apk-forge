package m4;

import ha.C1265a;

/* loaded from: classes.dex */
public abstract class Q implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final S f20127f = new Q(new P());

    /* renamed from: u, reason: collision with root package name */
    public static final String f20128u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20129v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20130w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20131x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20132y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1265a f20133z;

    /* renamed from: a, reason: collision with root package name */
    public final long f20134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20135b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20136c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20138e;

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.Q, m4.S] */
    static {
        int i7 = n5.D.f21141a;
        f20128u = Integer.toString(0, 36);
        f20129v = Integer.toString(1, 36);
        f20130w = Integer.toString(2, 36);
        f20131x = Integer.toString(3, 36);
        f20132y = Integer.toString(4, 36);
        f20133z = new C1265a(19);
    }

    public Q(P p10) {
        this.f20134a = p10.f20122a;
        this.f20135b = p10.f20123b;
        this.f20136c = p10.f20124c;
        this.f20137d = p10.f20125d;
        this.f20138e = p10.f20126e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f20134a == q10.f20134a && this.f20135b == q10.f20135b && this.f20136c == q10.f20136c && this.f20137d == q10.f20137d && this.f20138e == q10.f20138e;
    }

    public final int hashCode() {
        long j = this.f20134a;
        int i7 = ((int) (j ^ (j >>> 32))) * 31;
        long j10 = this.f20135b;
        return ((((((i7 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f20136c ? 1 : 0)) * 31) + (this.f20137d ? 1 : 0)) * 31) + (this.f20138e ? 1 : 0);
    }
}
