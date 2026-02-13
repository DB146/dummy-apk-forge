package U4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f9674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9676c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9677d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9678e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9679f;

    public t(int i7, int i10, String str, String str2, String str3, String str4) {
        this.f9674a = i7;
        this.f9675b = i10;
        this.f9676c = str;
        this.f9677d = str2;
        this.f9678e = str3;
        this.f9679f = str4;
    }

    public t(Parcel parcel) {
        this.f9674a = parcel.readInt();
        this.f9675b = parcel.readInt();
        this.f9676c = parcel.readString();
        this.f9677d = parcel.readString();
        this.f9678e = parcel.readString();
        this.f9679f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f9674a == tVar.f9674a && this.f9675b == tVar.f9675b && TextUtils.equals(this.f9676c, tVar.f9676c) && TextUtils.equals(this.f9677d, tVar.f9677d) && TextUtils.equals(this.f9678e, tVar.f9678e) && TextUtils.equals(this.f9679f, tVar.f9679f);
    }

    public final int hashCode() {
        int i7 = ((this.f9674a * 31) + this.f9675b) * 31;
        String str = this.f9676c;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9677d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9678e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9679f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9674a);
        parcel.writeInt(this.f9675b);
        parcel.writeString(this.f9676c);
        parcel.writeString(this.f9677d);
        parcel.writeString(this.f9678e);
        parcel.writeString(this.f9679f);
    }
}
