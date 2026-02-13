package W4;

import java.util.Locale;

/* renamed from: W4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591i {
    public static final byte[] g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10708a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f10709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10710c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10711d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10712e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f10713f;

    public C0591i(C0590h c0590h) {
        this.f10708a = c0590h.f10702a;
        this.f10709b = c0590h.f10703b;
        this.f10710c = c0590h.f10704c;
        this.f10711d = c0590h.f10705d;
        this.f10712e = c0590h.f10706e;
        this.f10713f = c0590h.f10707f;
    }

    public static int a(int i7) {
        return O5.b.y(i7 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0591i.class != obj.getClass()) {
            return false;
        }
        C0591i c0591i = (C0591i) obj;
        return this.f10709b == c0591i.f10709b && this.f10710c == c0591i.f10710c && this.f10708a == c0591i.f10708a && this.f10711d == c0591i.f10711d && this.f10712e == c0591i.f10712e;
    }

    public final int hashCode() {
        int i7 = (((((527 + this.f10709b) * 31) + this.f10710c) * 31) + (this.f10708a ? 1 : 0)) * 31;
        long j = this.f10711d;
        return ((i7 + ((int) (j ^ (j >>> 32)))) * 31) + this.f10712e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f10709b), Integer.valueOf(this.f10710c), Long.valueOf(this.f10711d), Integer.valueOf(this.f10712e), Boolean.valueOf(this.f10708a)};
        int i7 = n5.D.f21141a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
