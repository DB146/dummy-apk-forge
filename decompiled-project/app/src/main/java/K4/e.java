package K4;

import android.os.Parcel;
import android.os.Parcelable;
import n5.D;

/* loaded from: classes.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new B5.c(27);

    /* renamed from: b, reason: collision with root package name */
    public final String f6129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6131d;

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6129b = readString;
        this.f6130c = parcel.readString();
        this.f6131d = parcel.readString();
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6129b = str;
        this.f6130c = str2;
        this.f6131d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return D.a(this.f6130c, eVar.f6130c) && D.a(this.f6129b, eVar.f6129b) && D.a(this.f6131d, eVar.f6131d);
    }

    public final int hashCode() {
        String str = this.f6129b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6130c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6131d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": language=" + this.f6129b + ", description=" + this.f6130c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6141a);
        parcel.writeString(this.f6129b);
        parcel.writeString(this.f6131d);
    }
}
