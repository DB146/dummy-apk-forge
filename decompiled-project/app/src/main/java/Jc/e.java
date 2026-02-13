package Jc;

import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e implements Parcelable {
    public static final d CREATOR = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final String f5807A;

    /* renamed from: B, reason: collision with root package name */
    public final String f5808B;

    /* renamed from: C, reason: collision with root package name */
    public final List f5809C;

    /* renamed from: D, reason: collision with root package name */
    public final String f5810D;

    /* renamed from: E, reason: collision with root package name */
    public final String f5811E;

    /* renamed from: a, reason: collision with root package name */
    public final String f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5813b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5814c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5815d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f5816e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5817f;

    /* renamed from: u, reason: collision with root package name */
    public final String f5818u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5819v;

    /* renamed from: w, reason: collision with root package name */
    public final String f5820w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f5821x;

    /* renamed from: y, reason: collision with root package name */
    public final Double f5822y;

    /* renamed from: z, reason: collision with root package name */
    public final String f5823z;

    public e(String id, String productId, String title, String description, Double d10, String productLink, String qrCodeLink, String ctaAction, String ctaUrl, Integer num, Double d11, String str, String str2, String adsType, List list, String str3, String str4) {
        l.e(id, "id");
        l.e(productId, "productId");
        l.e(title, "title");
        l.e(description, "description");
        l.e(productLink, "productLink");
        l.e(qrCodeLink, "qrCodeLink");
        l.e(ctaAction, "ctaAction");
        l.e(ctaUrl, "ctaUrl");
        l.e(adsType, "adsType");
        this.f5812a = id;
        this.f5813b = productId;
        this.f5814c = title;
        this.f5815d = description;
        this.f5816e = d10;
        this.f5817f = productLink;
        this.f5818u = qrCodeLink;
        this.f5819v = ctaAction;
        this.f5820w = ctaUrl;
        this.f5821x = num;
        this.f5822y = d11;
        this.f5823z = str;
        this.f5807A = str2;
        this.f5808B = adsType;
        this.f5809C = list;
        this.f5810D = str3;
        this.f5811E = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f5812a, eVar.f5812a) && l.a(this.f5813b, eVar.f5813b) && l.a(this.f5814c, eVar.f5814c) && l.a(this.f5815d, eVar.f5815d) && l.a(this.f5816e, eVar.f5816e) && l.a(this.f5817f, eVar.f5817f) && l.a(this.f5818u, eVar.f5818u) && l.a(this.f5819v, eVar.f5819v) && l.a(this.f5820w, eVar.f5820w) && l.a(this.f5821x, eVar.f5821x) && l.a(this.f5822y, eVar.f5822y) && l.a(this.f5823z, eVar.f5823z) && l.a(this.f5807A, eVar.f5807A) && l.a(this.f5808B, eVar.f5808B) && l.a(this.f5809C, eVar.f5809C) && l.a(this.f5810D, eVar.f5810D) && l.a(this.f5811E, eVar.f5811E);
    }

    public final int hashCode() {
        int d10 = A3.c.d(A3.c.d(A3.c.d(this.f5812a.hashCode() * 31, 31, this.f5813b), 31, this.f5814c), 31, this.f5815d);
        Double d11 = this.f5816e;
        int d12 = A3.c.d(A3.c.d(A3.c.d(A3.c.d((d10 + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.f5817f), 31, this.f5818u), 31, this.f5819v), 31, this.f5820w);
        Integer num = this.f5821x;
        int hashCode = (d12 + (num == null ? 0 : num.hashCode())) * 31;
        Double d13 = this.f5822y;
        int hashCode2 = (hashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f5823z;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5807A;
        int d14 = A3.c.d((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f5808B);
        List list = this.f5809C;
        int hashCode4 = (d14 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f5810D;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5811E;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableBannerAd(id=");
        sb2.append(this.f5812a);
        sb2.append(", productId=");
        sb2.append(this.f5813b);
        sb2.append(", title=");
        sb2.append(this.f5814c);
        sb2.append(", description=");
        sb2.append(this.f5815d);
        sb2.append(", price=");
        sb2.append(this.f5816e);
        sb2.append(", productLink=");
        sb2.append(this.f5817f);
        sb2.append(", qrCodeLink=");
        sb2.append(this.f5818u);
        sb2.append(", ctaAction=");
        sb2.append(this.f5819v);
        sb2.append(", ctaUrl=");
        sb2.append(this.f5820w);
        sb2.append(", sale=");
        sb2.append(this.f5821x);
        sb2.append(", salePrice=");
        sb2.append(this.f5822y);
        sb2.append(", imageUrl=");
        sb2.append(this.f5823z);
        sb2.append(", videoUrl=");
        sb2.append(this.f5807A);
        sb2.append(", adsType=");
        sb2.append(this.f5808B);
        sb2.append(", productImages=");
        sb2.append(this.f5809C);
        sb2.append(", createdAt=");
        sb2.append(this.f5810D);
        sb2.append(", updatedAt=");
        return o.p(sb2, this.f5811E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        l.e(parcel, "parcel");
        parcel.writeString(this.f5812a);
        parcel.writeString(this.f5813b);
        parcel.writeString(this.f5814c);
        parcel.writeString(this.f5815d);
        parcel.writeValue(this.f5816e);
        parcel.writeString(this.f5817f);
        parcel.writeString(this.f5818u);
        parcel.writeString(this.f5819v);
        parcel.writeString(this.f5820w);
        parcel.writeValue(this.f5821x);
        parcel.writeValue(this.f5822y);
        parcel.writeString(this.f5823z);
        parcel.writeString(this.f5807A);
        parcel.writeString(this.f5808B);
        parcel.writeStringList(this.f5809C);
        parcel.writeString(this.f5810D);
        parcel.writeString(this.f5811E);
    }
}
