package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27137c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27138d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f27139e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27140f;
    public final K g;

    /* renamed from: h, reason: collision with root package name */
    public final C2436k0 f27141h;

    /* renamed from: i, reason: collision with root package name */
    public final C2434j0 f27142i;
    public final N j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27143l;

    public J(String str, String str2, String str3, long j, Long l10, boolean z8, K k, C2436k0 c2436k0, C2434j0 c2434j0, N n6, List list, int i7) {
        this.f27135a = str;
        this.f27136b = str2;
        this.f27137c = str3;
        this.f27138d = j;
        this.f27139e = l10;
        this.f27140f = z8;
        this.g = k;
        this.f27141h = c2436k0;
        this.f27142i = c2434j0;
        this.j = n6;
        this.k = list;
        this.f27143l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y7.I] */
    public final I a() {
        ?? obj = new Object();
        obj.f27125a = this.f27135a;
        obj.f27126b = this.f27136b;
        obj.f27127c = this.f27137c;
        obj.f27128d = this.f27138d;
        obj.f27129e = this.f27139e;
        obj.f27130f = this.f27140f;
        obj.g = this.g;
        obj.f27131h = this.f27141h;
        obj.f27132i = this.f27142i;
        obj.j = this.j;
        obj.k = this.k;
        obj.f27133l = this.f27143l;
        obj.f27134m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        J j = (J) ((N0) obj);
        if (this.f27135a.equals(j.f27135a)) {
            if (this.f27136b.equals(j.f27136b)) {
                String str = j.f27137c;
                String str2 = this.f27137c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f27138d == j.f27138d) {
                        Long l10 = j.f27139e;
                        Long l11 = this.f27139e;
                        if (l11 != null ? l11.equals(l10) : l10 == null) {
                            if (this.f27140f == j.f27140f && this.g.equals(j.g)) {
                                C2436k0 c2436k0 = j.f27141h;
                                C2436k0 c2436k02 = this.f27141h;
                                if (c2436k02 != null ? c2436k02.equals(c2436k0) : c2436k0 == null) {
                                    C2434j0 c2434j0 = j.f27142i;
                                    C2434j0 c2434j02 = this.f27142i;
                                    if (c2434j02 != null ? c2434j02.equals(c2434j0) : c2434j0 == null) {
                                        N n6 = j.j;
                                        N n8 = this.j;
                                        if (n8 != null ? n8.equals(n6) : n6 == null) {
                                            List list = j.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f27143l == j.f27143l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
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
        int hashCode = (((this.f27135a.hashCode() ^ 1000003) * 1000003) ^ this.f27136b.hashCode()) * 1000003;
        String str = this.f27137c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f27138d;
        int i7 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l10 = this.f27139e;
        int hashCode3 = (((((i7 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f27140f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        C2436k0 c2436k0 = this.f27141h;
        int hashCode4 = (hashCode3 ^ (c2436k0 == null ? 0 : c2436k0.hashCode())) * 1000003;
        C2434j0 c2434j0 = this.f27142i;
        int hashCode5 = (hashCode4 ^ (c2434j0 == null ? 0 : c2434j0.hashCode())) * 1000003;
        N n6 = this.j;
        int hashCode6 = (hashCode5 ^ (n6 == null ? 0 : n6.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f27143l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f27135a);
        sb2.append(", identifier=");
        sb2.append(this.f27136b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f27137c);
        sb2.append(", startedAt=");
        sb2.append(this.f27138d);
        sb2.append(", endedAt=");
        sb2.append(this.f27139e);
        sb2.append(", crashed=");
        sb2.append(this.f27140f);
        sb2.append(", app=");
        sb2.append(this.g);
        sb2.append(", user=");
        sb2.append(this.f27141h);
        sb2.append(", os=");
        sb2.append(this.f27142i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", generatorType=");
        return A3.c.k(sb2, this.f27143l, "}");
    }
}
