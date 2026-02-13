package a4;

import java.util.ArrayList;

/* renamed from: a4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769t extends AbstractC0745F {

    /* renamed from: a, reason: collision with root package name */
    public final long f12681a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12682b;

    /* renamed from: c, reason: collision with root package name */
    public final C0763n f12683c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12684d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12685e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12686f;

    public C0769t(long j, long j10, C0763n c0763n, Integer num, String str, ArrayList arrayList) {
        EnumC0749J enumC0749J = EnumC0749J.f12612a;
        this.f12681a = j;
        this.f12682b = j10;
        this.f12683c = c0763n;
        this.f12684d = num;
        this.f12685e = str;
        this.f12686f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0745F)) {
            return false;
        }
        C0769t c0769t = (C0769t) ((AbstractC0745F) obj);
        if (this.f12681a == c0769t.f12681a) {
            if (this.f12682b == c0769t.f12682b) {
                if (this.f12683c.equals(c0769t.f12683c)) {
                    Integer num = c0769t.f12684d;
                    Integer num2 = this.f12684d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c0769t.f12685e;
                        String str2 = this.f12685e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f12686f.equals(c0769t.f12686f)) {
                                Object obj2 = EnumC0749J.f12612a;
                                if (obj2.equals(obj2)) {
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
        long j = this.f12681a;
        long j10 = this.f12682b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f12683c.hashCode()) * 1000003;
        Integer num = this.f12684d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12685e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f12686f.hashCode()) * 1000003) ^ EnumC0749J.f12612a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f12681a + ", requestUptimeMs=" + this.f12682b + ", clientInfo=" + this.f12683c + ", logSource=" + this.f12684d + ", logSourceName=" + this.f12685e + ", logEvents=" + this.f12686f + ", qosTier=" + EnumC0749J.f12612a + "}";
    }
}
