package Ic;

import A3.c;
import h3.o;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5359b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5361d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f5362e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5363f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5364h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5365i;
    public final Integer j;
    public final Double k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5366l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5367m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5368n;

    /* renamed from: o, reason: collision with root package name */
    public final List f5369o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5370p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5371q;

    public b(String id, String productId, String title, String description, Double d10, String productLink, String qrCodeLink, String ctaAction, String ctaUrl, Integer num, Double d11, String str, String str2, String adsType, List list, String str3, String str4) {
        l.e(id, "id");
        l.e(productId, "productId");
        l.e(title, "title");
        l.e(description, "description");
        l.e(productLink, "productLink");
        l.e(qrCodeLink, "qrCodeLink");
        l.e(ctaAction, "ctaAction");
        l.e(ctaUrl, "ctaUrl");
        l.e(adsType, "adsType");
        this.f5358a = id;
        this.f5359b = productId;
        this.f5360c = title;
        this.f5361d = description;
        this.f5362e = d10;
        this.f5363f = productLink;
        this.g = qrCodeLink;
        this.f5364h = ctaAction;
        this.f5365i = ctaUrl;
        this.j = num;
        this.k = d11;
        this.f5366l = str;
        this.f5367m = str2;
        this.f5368n = adsType;
        this.f5369o = list;
        this.f5370p = str3;
        this.f5371q = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f5358a, bVar.f5358a) && l.a(this.f5359b, bVar.f5359b) && l.a(this.f5360c, bVar.f5360c) && l.a(this.f5361d, bVar.f5361d) && l.a(this.f5362e, bVar.f5362e) && l.a(this.f5363f, bVar.f5363f) && l.a(this.g, bVar.g) && l.a(this.f5364h, bVar.f5364h) && l.a(this.f5365i, bVar.f5365i) && l.a(this.j, bVar.j) && l.a(this.k, bVar.k) && l.a(this.f5366l, bVar.f5366l) && l.a(this.f5367m, bVar.f5367m) && l.a(this.f5368n, bVar.f5368n) && l.a(this.f5369o, bVar.f5369o) && l.a(this.f5370p, bVar.f5370p) && l.a(this.f5371q, bVar.f5371q);
    }

    public final int hashCode() {
        int d10 = c.d(c.d(c.d(this.f5358a.hashCode() * 31, 31, this.f5359b), 31, this.f5360c), 31, this.f5361d);
        Double d11 = this.f5362e;
        int d12 = c.d(c.d(c.d(c.d((d10 + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.f5363f), 31, this.g), 31, this.f5364h), 31, this.f5365i);
        Integer num = this.j;
        int hashCode = (d12 + (num == null ? 0 : num.hashCode())) * 31;
        Double d13 = this.k;
        int hashCode2 = (hashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f5366l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5367m;
        int d14 = c.d((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f5368n);
        List list = this.f5369o;
        int hashCode4 = (d14 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f5370p;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5371q;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerAdEntity(id=");
        sb2.append(this.f5358a);
        sb2.append(", productId=");
        sb2.append(this.f5359b);
        sb2.append(", title=");
        sb2.append(this.f5360c);
        sb2.append(", description=");
        sb2.append(this.f5361d);
        sb2.append(", price=");
        sb2.append(this.f5362e);
        sb2.append(", productLink=");
        sb2.append(this.f5363f);
        sb2.append(", qrCodeLink=");
        sb2.append(this.g);
        sb2.append(", ctaAction=");
        sb2.append(this.f5364h);
        sb2.append(", ctaUrl=");
        sb2.append(this.f5365i);
        sb2.append(", sale=");
        sb2.append(this.j);
        sb2.append(", salePrice=");
        sb2.append(this.k);
        sb2.append(", imageUrl=");
        sb2.append(this.f5366l);
        sb2.append(", videoUrl=");
        sb2.append(this.f5367m);
        sb2.append(", adsType=");
        sb2.append(this.f5368n);
        sb2.append(", productImages=");
        sb2.append(this.f5369o);
        sb2.append(", createdAt=");
        sb2.append(this.f5370p);
        sb2.append(", updatedAt=");
        return o.p(sb2, this.f5371q, ")");
    }
}
