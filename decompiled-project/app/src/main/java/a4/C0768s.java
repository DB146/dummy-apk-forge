package a4;

import java.util.Arrays;

/* renamed from: a4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768s extends AbstractC0744E {

    /* renamed from: a, reason: collision with root package name */
    public final long f12673a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12674b;

    /* renamed from: c, reason: collision with root package name */
    public final C0764o f12675c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12676d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12677e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12678f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final C0771v f12679h;

    /* renamed from: i, reason: collision with root package name */
    public final C0765p f12680i;

    public C0768s(long j, Integer num, C0764o c0764o, long j10, byte[] bArr, String str, long j11, C0771v c0771v, C0765p c0765p) {
        this.f12673a = j;
        this.f12674b = num;
        this.f12675c = c0764o;
        this.f12676d = j10;
        this.f12677e = bArr;
        this.f12678f = str;
        this.g = j11;
        this.f12679h = c0771v;
        this.f12680i = c0765p;
    }

    public final boolean equals(Object obj) {
        Integer num;
        C0764o c0764o;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0744E)) {
            return false;
        }
        AbstractC0744E abstractC0744E = (AbstractC0744E) obj;
        C0768s c0768s = (C0768s) abstractC0744E;
        if (this.f12673a == c0768s.f12673a && ((num = this.f12674b) != null ? num.equals(c0768s.f12674b) : c0768s.f12674b == null) && ((c0764o = this.f12675c) != null ? c0764o.equals(c0768s.f12675c) : c0768s.f12675c == null)) {
            if (this.f12676d == c0768s.f12676d) {
                if (Arrays.equals(this.f12677e, abstractC0744E instanceof C0768s ? ((C0768s) abstractC0744E).f12677e : c0768s.f12677e)) {
                    String str = c0768s.f12678f;
                    String str2 = this.f12678f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.g == c0768s.g) {
                            C0771v c0771v = c0768s.f12679h;
                            C0771v c0771v2 = this.f12679h;
                            if (c0771v2 != null ? c0771v2.equals(c0771v) : c0771v == null) {
                                C0765p c0765p = c0768s.f12680i;
                                C0765p c0765p2 = this.f12680i;
                                if (c0765p2 == null) {
                                    if (c0765p == null) {
                                        return true;
                                    }
                                } else if (c0765p2.equals(c0765p)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12673a;
        int i7 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f12674b;
        int hashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C0764o c0764o = this.f12675c;
        int hashCode2 = (hashCode ^ (c0764o == null ? 0 : c0764o.hashCode())) * 1000003;
        long j10 = this.f12676d;
        int hashCode3 = (((hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12677e)) * 1000003;
        String str = this.f12678f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.g;
        int i10 = (hashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        C0771v c0771v = this.f12679h;
        int hashCode5 = (i10 ^ (c0771v == null ? 0 : c0771v.hashCode())) * 1000003;
        C0765p c0765p = this.f12680i;
        return hashCode5 ^ (c0765p != null ? c0765p.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f12673a + ", eventCode=" + this.f12674b + ", complianceData=" + this.f12675c + ", eventUptimeMs=" + this.f12676d + ", sourceExtension=" + Arrays.toString(this.f12677e) + ", sourceExtensionJsonProto3=" + this.f12678f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.f12679h + ", experimentIds=" + this.f12680i + "}";
    }
}
