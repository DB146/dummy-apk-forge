package K4;

import android.os.Parcel;
import android.os.Parcelable;
import n5.D;

/* loaded from: classes.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new B5.c(29);

    /* renamed from: b, reason: collision with root package name */
    public final String f6142b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6143c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6144d;

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6142b = readString;
        this.f6143c = parcel.readString();
        this.f6144d = parcel.readString();
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f6142b = str;
        this.f6143c = str2;
        this.f6144d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return D.a(this.f6143c, kVar.f6143c) && D.a(this.f6142b, kVar.f6142b) && D.a(this.f6144d, kVar.f6144d);
    }

    public final int hashCode() {
        String str = this.f6142b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6143c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6144d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": domain=" + this.f6142b + ", description=" + this.f6143c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6141a);
        parcel.writeString(this.f6142b);
        parcel.writeString(this.f6144d);
    }
}
