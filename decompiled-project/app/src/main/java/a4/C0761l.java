package a4;

/* renamed from: a4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761l extends AbstractC0750a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12659c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12660d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12661e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12662f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12663h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12664i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12665l;

    public C0761l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f12657a = num;
        this.f12658b = str;
        this.f12659c = str2;
        this.f12660d = str3;
        this.f12661e = str4;
        this.f12662f = str5;
        this.g = str6;
        this.f12663h = str7;
        this.f12664i = str8;
        this.j = str9;
        this.k = str10;
        this.f12665l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0750a)) {
            return false;
        }
        AbstractC0750a abstractC0750a = (AbstractC0750a) obj;
        Integer num = this.f12657a;
        if (num != null ? num.equals(((C0761l) abstractC0750a).f12657a) : ((C0761l) abstractC0750a).f12657a == null) {
            String str = this.f12658b;
            if (str != null ? str.equals(((C0761l) abstractC0750a).f12658b) : ((C0761l) abstractC0750a).f12658b == null) {
                String str2 = this.f12659c;
                if (str2 != null ? str2.equals(((C0761l) abstractC0750a).f12659c) : ((C0761l) abstractC0750a).f12659c == null) {
                    String str3 = this.f12660d;
                    if (str3 != null ? str3.equals(((C0761l) abstractC0750a).f12660d) : ((C0761l) abstractC0750a).f12660d == null) {
                        String str4 = this.f12661e;
                        if (str4 != null ? str4.equals(((C0761l) abstractC0750a).f12661e) : ((C0761l) abstractC0750a).f12661e == null) {
                            String str5 = this.f12662f;
                            if (str5 != null ? str5.equals(((C0761l) abstractC0750a).f12662f) : ((C0761l) abstractC0750a).f12662f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((C0761l) abstractC0750a).g) : ((C0761l) abstractC0750a).g == null) {
                                    String str7 = this.f12663h;
                                    if (str7 != null ? str7.equals(((C0761l) abstractC0750a).f12663h) : ((C0761l) abstractC0750a).f12663h == null) {
                                        String str8 = this.f12664i;
                                        if (str8 != null ? str8.equals(((C0761l) abstractC0750a).f12664i) : ((C0761l) abstractC0750a).f12664i == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(((C0761l) abstractC0750a).j) : ((C0761l) abstractC0750a).j == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(((C0761l) abstractC0750a).k) : ((C0761l) abstractC0750a).k == null) {
                                                    String str11 = this.f12665l;
                                                    if (str11 == null) {
                                                        if (((C0761l) abstractC0750a).f12665l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((C0761l) abstractC0750a).f12665l)) {
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
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f12657a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f12658b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12659c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12660d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12661e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f12662f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f12663h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f12664i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f12665l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f12657a);
        sb2.append(", model=");
        sb2.append(this.f12658b);
        sb2.append(", hardware=");
        sb2.append(this.f12659c);
        sb2.append(", device=");
        sb2.append(this.f12660d);
        sb2.append(", product=");
        sb2.append(this.f12661e);
        sb2.append(", osBuild=");
        sb2.append(this.f12662f);
        sb2.append(", manufacturer=");
        sb2.append(this.g);
        sb2.append(", fingerprint=");
        sb2.append(this.f12663h);
        sb2.append(", locale=");
        sb2.append(this.f12664i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.k);
        sb2.append(", applicationBuild=");
        return h3.o.p(sb2, this.f12665l, "}");
    }
}
