package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class Q extends E0 {

    /* renamed from: a, reason: collision with root package name */
    public final S f27179a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27180b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27181c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f27182d;

    /* renamed from: e, reason: collision with root package name */
    public final D0 f27183e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27184f;
    public final int g;

    public Q(S s3, List list, List list2, Boolean bool, D0 d02, List list3, int i7) {
        this.f27179a = s3;
        this.f27180b = list;
        this.f27181c = list2;
        this.f27182d = bool;
        this.f27183e = d02;
        this.f27184f = list3;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        D0 d02;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        Q q10 = (Q) ((E0) obj);
        return this.f27179a.equals(q10.f27179a) && ((list = this.f27180b) != null ? list.equals(q10.f27180b) : q10.f27180b == null) && ((list2 = this.f27181c) != null ? list2.equals(q10.f27181c) : q10.f27181c == null) && ((bool = this.f27182d) != null ? bool.equals(q10.f27182d) : q10.f27182d == null) && ((d02 = this.f27183e) != null ? d02.equals(q10.f27183e) : q10.f27183e == null) && ((list3 = this.f27184f) != null ? list3.equals(q10.f27184f) : q10.f27184f == null) && this.g == q10.g;
    }

    public final int hashCode() {
        int hashCode = (this.f27179a.hashCode() ^ 1000003) * 1000003;
        List list = this.f27180b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f27181c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f27182d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        D0 d02 = this.f27183e;
        int hashCode5 = (hashCode4 ^ (d02 == null ? 0 : d02.hashCode())) * 1000003;
        List list3 = this.f27184f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f27179a);
        sb2.append(", customAttributes=");
        sb2.append(this.f27180b);
        sb2.append(", internalKeys=");
        sb2.append(this.f27181c);
        sb2.append(", background=");
        sb2.append(this.f27182d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f27183e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f27184f);
        sb2.append(", uiOrientation=");
        return A3.c.k(sb2, this.g, "}");
    }
}
