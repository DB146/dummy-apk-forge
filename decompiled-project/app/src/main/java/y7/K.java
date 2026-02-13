package y7;

/* loaded from: classes.dex */
public final class K extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27145b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27146c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27147d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27148e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27149f;

    public K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f27144a = str;
        this.f27145b = str2;
        this.f27146c = str3;
        this.f27147d = str4;
        this.f27148e = str5;
        this.f27149f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f27144a.equals(((K) v0Var).f27144a)) {
            K k = (K) v0Var;
            if (this.f27145b.equals(k.f27145b)) {
                String str = k.f27146c;
                String str2 = this.f27146c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = k.f27147d;
                    String str4 = this.f27147d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = k.f27148e;
                        String str6 = this.f27148e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = k.f27149f;
                            String str8 = this.f27149f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f27144a.hashCode() ^ 1000003) * 1000003) ^ this.f27145b.hashCode()) * 1000003;
        String str = this.f27146c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f27147d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27148e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f27149f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f27144a);
        sb2.append(", version=");
        sb2.append(this.f27145b);
        sb2.append(", displayVersion=");
        sb2.append(this.f27146c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f27147d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f27148e);
        sb2.append(", developmentPlatformVersion=");
        return h3.o.p(sb2, this.f27149f, "}");
    }
}
