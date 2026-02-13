package y7;

import java.util.List;

/* renamed from: y7.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2412D extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27110c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27111d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27112e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27113f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27114h;

    /* renamed from: i, reason: collision with root package name */
    public final List f27115i;

    public C2412D(int i7, String str, int i10, int i11, long j, long j10, long j11, String str2, List list) {
        this.f27108a = i7;
        this.f27109b = str;
        this.f27110c = i10;
        this.f27111d = i11;
        this.f27112e = j;
        this.f27113f = j10;
        this.g = j11;
        this.f27114h = str2;
        this.f27115i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f27108a == ((C2412D) q0Var).f27108a) {
            C2412D c2412d = (C2412D) q0Var;
            if (this.f27109b.equals(c2412d.f27109b) && this.f27110c == c2412d.f27110c && this.f27111d == c2412d.f27111d && this.f27112e == c2412d.f27112e && this.f27113f == c2412d.f27113f && this.g == c2412d.g) {
                String str = c2412d.f27114h;
                String str2 = this.f27114h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c2412d.f27115i;
                    List list2 = this.f27115i;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f27108a ^ 1000003) * 1000003) ^ this.f27109b.hashCode()) * 1000003) ^ this.f27110c) * 1000003) ^ this.f27111d) * 1000003;
        long j = this.f27112e;
        int i7 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f27113f;
        int i10 = (i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f27114h;
        int hashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f27115i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f27108a + ", processName=" + this.f27109b + ", reasonCode=" + this.f27110c + ", importance=" + this.f27111d + ", pss=" + this.f27112e + ", rss=" + this.f27113f + ", timestamp=" + this.g + ", traceFile=" + this.f27114h + ", buildIdMappingForArch=" + this.f27115i + "}";
    }
}
