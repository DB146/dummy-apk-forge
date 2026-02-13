package Jc;

import h3.o;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @H8.b("_id")
    private final String f5791a;

    /* renamed from: b, reason: collision with root package name */
    @H8.b("productId")
    private final String f5792b;

    /* renamed from: c, reason: collision with root package name */
    @H8.b("title")
    private final String f5793c;

    /* renamed from: d, reason: collision with root package name */
    @H8.b("description")
    private final String f5794d;

    /* renamed from: e, reason: collision with root package name */
    @H8.b("price")
    private final Double f5795e;

    /* renamed from: f, reason: collision with root package name */
    @H8.b("productLink")
    private final String f5796f;

    @H8.b("qrCodeLink")
    private final String g;

    /* renamed from: h, reason: collision with root package name */
    @H8.b("ctaAction")
    private final String f5797h;

    /* renamed from: i, reason: collision with root package name */
    @H8.b("ctaUrl")
    private final String f5798i;

    @H8.b("sale")
    private final Integer j;

    @H8.b("salePrice")
    private final Double k;

    /* renamed from: l, reason: collision with root package name */
    @H8.b("imageUrl")
    private final String f5799l;

    /* renamed from: m, reason: collision with root package name */
    @H8.b("videoUrl")
    private final String f5800m;

    /* renamed from: n, reason: collision with root package name */
    @H8.b("adsType")
    private final String f5801n;

    /* renamed from: o, reason: collision with root package name */
    @H8.b("productImages")
    private final List<String> f5802o;

    /* renamed from: p, reason: collision with root package name */
    @H8.b("createdAt")
    private final String f5803p;

    /* renamed from: q, reason: collision with root package name */
    @H8.b("updatedAt")
    private final String f5804q;

    public final a a() {
        return new a(this.f5791a, this.f5792b, this.f5793c, this.f5794d, this.f5795e, this.f5796f, this.g, this.f5797h, this.f5798i, this.j, this.k, this.f5799l, this.f5800m, this.f5801n, this.f5802o, this.f5803p, this.f5804q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f5791a, bVar.f5791a) && l.a(this.f5792b, bVar.f5792b) && l.a(this.f5793c, bVar.f5793c) && l.a(this.f5794d, bVar.f5794d) && l.a(this.f5795e, bVar.f5795e) && l.a(this.f5796f, bVar.f5796f) && l.a(this.g, bVar.g) && l.a(this.f5797h, bVar.f5797h) && l.a(this.f5798i, bVar.f5798i) && l.a(this.j, bVar.j) && l.a(this.k, bVar.k) && l.a(this.f5799l, bVar.f5799l) && l.a(this.f5800m, bVar.f5800m) && l.a(this.f5801n, bVar.f5801n) && l.a(this.f5802o, bVar.f5802o) && l.a(this.f5803p, bVar.f5803p) && l.a(this.f5804q, bVar.f5804q);
    }

    public final int hashCode() {
        int d10 = A3.c.d(A3.c.d(A3.c.d(this.f5791a.hashCode() * 31, 31, this.f5792b), 31, this.f5793c), 31, this.f5794d);
        Double d11 = this.f5795e;
        int d12 = A3.c.d(A3.c.d(A3.c.d(A3.c.d((d10 + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.f5796f), 31, this.g), 31, this.f5797h), 31, this.f5798i);
        Integer num = this.j;
        int hashCode = (d12 + (num == null ? 0 : num.hashCode())) * 31;
        Double d13 = this.k;
        int hashCode2 = (hashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f5799l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5800m;
        int d14 = A3.c.d((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f5801n);
        List<String> list = this.f5802o;
        int hashCode4 = (d14 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f5803p;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5804q;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f5791a;
        String str2 = this.f5792b;
        String str3 = this.f5793c;
        String str4 = this.f5794d;
        Double d10 = this.f5795e;
        String str5 = this.f5796f;
        String str6 = this.g;
        String str7 = this.f5797h;
        String str8 = this.f5798i;
        Integer num = this.j;
        Double d11 = this.k;
        String str9 = this.f5799l;
        String str10 = this.f5800m;
        String str11 = this.f5801n;
        List<String> list = this.f5802o;
        String str12 = this.f5803p;
        String str13 = this.f5804q;
        StringBuilder o10 = A3.c.o("BannerAdDto(id=", str, ", productId=", str2, ", title=");
        o.v(o10, str3, ", description=", str4, ", price=");
        o10.append(d10);
        o10.append(", productLink=");
        o10.append(str5);
        o10.append(", qrCodeLink=");
        o.v(o10, str6, ", ctaAction=", str7, ", ctaUrl=");
        o10.append(str8);
        o10.append(", sale=");
        o10.append(num);
        o10.append(", salePrice=");
        o10.append(d11);
        o10.append(", imageUrl=");
        o10.append(str9);
        o10.append(", videoUrl=");
        o.v(o10, str10, ", adsType=", str11, ", productImages=");
        o10.append(list);
        o10.append(", createdAt=");
        o10.append(str12);
        o10.append(", updatedAt=");
        return o.p(o10, str13, ")");
    }
}
