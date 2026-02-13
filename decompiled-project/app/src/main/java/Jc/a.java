package Jc;

import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new B5.c(22);

    /* renamed from: A, reason: collision with root package name */
    public final String f5771A;

    /* renamed from: B, reason: collision with root package name */
    public final String f5772B;

    /* renamed from: C, reason: collision with root package name */
    public final List f5773C;

    /* renamed from: D, reason: collision with root package name */
    public final String f5774D;

    /* renamed from: E, reason: collision with root package name */
    public final String f5775E;

    /* renamed from: F, reason: collision with root package name */
    public final String f5776F;

    /* renamed from: G, reason: collision with root package name */
    public final String f5777G;

    /* renamed from: H, reason: collision with root package name */
    public final String f5778H;

    /* renamed from: a, reason: collision with root package name */
    public final String f5779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5780b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5781c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5782d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f5783e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5784f;

    /* renamed from: u, reason: collision with root package name */
    public final String f5785u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5786v;

    /* renamed from: w, reason: collision with root package name */
    public final String f5787w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f5788x;

    /* renamed from: y, reason: collision with root package name */
    public final Double f5789y;

    /* renamed from: z, reason: collision with root package name */
    public final String f5790z;

    public /* synthetic */ a(String str, String str2, String str3, String str4, Double d10, String str5, String str6, String str7, String str8, Integer num, Double d11, String str9, String str10, String str11, List list, String str12, String str13) {
        this(str, str2, str3, str4, d10, str5, str6, str7, str8, num, d11, str9, str10, str11, list, str12, str13, null, null, null);
    }

    public a(String id, String productId, String title, String description, Double d10, String productLink, String qrCodeLink, String ctaAction, String ctaUrl, Integer num, Double d11, String str, String str2, String adsType, List list, String str3, String str4, String str5, String str6, String str7) {
        l.e(id, "id");
        l.e(productId, "productId");
        l.e(title, "title");
        l.e(description, "description");
        l.e(productLink, "productLink");
        l.e(qrCodeLink, "qrCodeLink");
        l.e(ctaAction, "ctaAction");
        l.e(ctaUrl, "ctaUrl");
        l.e(adsType, "adsType");
        this.f5779a = id;
        this.f5780b = productId;
        this.f5781c = title;
        this.f5782d = description;
        this.f5783e = d10;
        this.f5784f = productLink;
        this.f5785u = qrCodeLink;
        this.f5786v = ctaAction;
        this.f5787w = ctaUrl;
        this.f5788x = num;
        this.f5789y = d11;
        this.f5790z = str;
        this.f5771A = str2;
        this.f5772B = adsType;
        this.f5773C = list;
        this.f5774D = str3;
        this.f5775E = str4;
        this.f5776F = str5;
        this.f5777G = str6;
        this.f5778H = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f5779a, aVar.f5779a) && l.a(this.f5780b, aVar.f5780b) && l.a(this.f5781c, aVar.f5781c) && l.a(this.f5782d, aVar.f5782d) && l.a(this.f5783e, aVar.f5783e) && l.a(this.f5784f, aVar.f5784f) && l.a(this.f5785u, aVar.f5785u) && l.a(this.f5786v, aVar.f5786v) && l.a(this.f5787w, aVar.f5787w) && l.a(this.f5788x, aVar.f5788x) && l.a(this.f5789y, aVar.f5789y) && l.a(this.f5790z, aVar.f5790z) && l.a(this.f5771A, aVar.f5771A) && l.a(this.f5772B, aVar.f5772B) && l.a(this.f5773C, aVar.f5773C) && l.a(this.f5774D, aVar.f5774D) && l.a(this.f5775E, aVar.f5775E) && l.a(this.f5776F, aVar.f5776F) && l.a(this.f5777G, aVar.f5777G) && l.a(this.f5778H, aVar.f5778H);
    }

    public final int hashCode() {
        int d10 = A3.c.d(A3.c.d(A3.c.d(this.f5779a.hashCode() * 31, 31, this.f5780b), 31, this.f5781c), 31, this.f5782d);
        Double d11 = this.f5783e;
        int d12 = A3.c.d(A3.c.d(A3.c.d(A3.c.d((d10 + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.f5784f), 31, this.f5785u), 31, this.f5786v), 31, this.f5787w);
        Integer num = this.f5788x;
        int hashCode = (d12 + (num == null ? 0 : num.hashCode())) * 31;
        Double d13 = this.f5789y;
        int hashCode2 = (hashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f5790z;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5771A;
        int d14 = A3.c.d((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f5772B);
        List list = this.f5773C;
        int hashCode4 = (d14 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f5774D;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5775E;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5776F;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5777G;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5778H;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerAd(id=");
        sb2.append(this.f5779a);
        sb2.append(", productId=");
        sb2.append(this.f5780b);
        sb2.append(", title=");
        sb2.append(this.f5781c);
        sb2.append(", description=");
        sb2.append(this.f5782d);
        sb2.append(", price=");
        sb2.append(this.f5783e);
        sb2.append(", productLink=");
        sb2.append(this.f5784f);
        sb2.append(", qrCodeLink=");
        sb2.append(this.f5785u);
        sb2.append(", ctaAction=");
        sb2.append(this.f5786v);
        sb2.append(", ctaUrl=");
        sb2.append(this.f5787w);
        sb2.append(", sale=");
        sb2.append(this.f5788x);
        sb2.append(", salePrice=");
        sb2.append(this.f5789y);
        sb2.append(", imageUrl=");
        sb2.append(this.f5790z);
        sb2.append(", videoUrl=");
        sb2.append(this.f5771A);
        sb2.append(", adsType=");
        sb2.append(this.f5772B);
        sb2.append(", productImages=");
        sb2.append(this.f5773C);
        sb2.append(", createdAt=");
        sb2.append(this.f5774D);
        sb2.append(", updatedAt=");
        sb2.append(this.f5775E);
        sb2.append(", categoryName=");
        sb2.append(this.f5776F);
        sb2.append(", categoryId=");
        sb2.append(this.f5777G);
        sb2.append(", bannerImage=");
        return o.p(sb2, this.f5778H, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.f5779a);
        dest.writeString(this.f5780b);
        dest.writeString(this.f5781c);
        dest.writeString(this.f5782d);
        Double d10 = this.f5783e;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeString(this.f5784f);
        dest.writeString(this.f5785u);
        dest.writeString(this.f5786v);
        dest.writeString(this.f5787w);
        Integer num = this.f5788x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Double d11 = this.f5789y;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        dest.writeString(this.f5790z);
        dest.writeString(this.f5771A);
        dest.writeString(this.f5772B);
        dest.writeStringList(this.f5773C);
        dest.writeString(this.f5774D);
        dest.writeString(this.f5775E);
        dest.writeString(this.f5776F);
        dest.writeString(this.f5777G);
        dest.writeString(this.f5778H);
    }
}
