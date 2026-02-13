package m4;

import ha.C1265a;

/* loaded from: classes.dex */
public final class U implements InterfaceC1569g {

    /* renamed from: f, reason: collision with root package name */
    public static final U f20157f = new U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: u, reason: collision with root package name */
    public static final String f20158u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20159v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20160w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20161x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20162y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1265a f20163z;

    /* renamed from: a, reason: collision with root package name */
    public final long f20164a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20165b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20166c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20167d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20168e;

    static {
        int i7 = n5.D.f21141a;
        f20158u = Integer.toString(0, 36);
        f20159v = Integer.toString(1, 36);
        f20160w = Integer.toString(2, 36);
        f20161x = Integer.toString(3, 36);
        f20162y = Integer.toString(4, 36);
        f20163z = new C1265a(21);
    }

    public U(long j, long j10, long j11, float f4, float f10) {
        this.f20164a = j;
        this.f20165b = j10;
        this.f20166c = j11;
        this.f20167d = f4;
        this.f20168e = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T4.t, java.lang.Object] */
    public final T4.t a() {
        ?? obj = new Object();
        obj.f9310a = this.f20164a;
        obj.f9311b = this.f20165b;
        obj.f9312c = this.f20166c;
        obj.f9313d = this.f20167d;
        obj.f9314e = this.f20168e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        return this.f20164a == u3.f20164a && this.f20165b == u3.f20165b && this.f20166c == u3.f20166c && this.f20167d == u3.f20167d && this.f20168e == u3.f20168e;
    }

    public final int hashCode() {
        long j = this.f20164a;
        long j10 = this.f20165b;
        int i7 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f20166c;
        int i10 = (i7 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f4 = this.f20167d;
        int floatToIntBits = (i10 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f10 = this.f20168e;
        return floatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
