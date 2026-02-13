package K4;

import android.os.Parcel;
import android.os.Parcelable;
import n5.D;

/* loaded from: classes.dex */
public final class p extends j {
    public static final Parcelable.Creator<p> CREATOR = new l(3);

    /* renamed from: b, reason: collision with root package name */
    public final String f6155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6156c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6155b = parcel.readString();
        this.f6156c = parcel.readString();
    }

    public p(String str, String str2, String str3) {
        super(str);
        this.f6155b = str2;
        this.f6156c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6141a.equals(pVar.f6141a) && D.a(this.f6155b, pVar.f6155b) && D.a(this.f6156c, pVar.f6156c);
    }

    public final int hashCode() {
        int d10 = A3.c.d(527, 31, this.f6141a);
        String str = this.f6155b;
        int hashCode = (d10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6156c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": url=" + this.f6156c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6141a);
        parcel.writeString(this.f6155b);
        parcel.writeString(this.f6156c);
    }
}
