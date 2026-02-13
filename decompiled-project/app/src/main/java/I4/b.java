package I4;

import B5.c;
import android.os.Parcel;
import android.os.Parcelable;
import m4.C1560b0;
import n5.D;

/* loaded from: classes.dex */
public class b implements F4.b {
    public static final Parcelable.Creator<b> CREATOR = new c(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f5228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5229b;

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f5228a = readString;
        this.f5229b = parcel.readString();
    }

    public b(String str, String str2) {
        this.f5228a = str;
        this.f5229b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5228a.equals(bVar.f5228a) && this.f5229b.equals(bVar.f5229b);
    }

    public final int hashCode() {
        return this.f5229b.hashCode() + A3.c.d(527, 31, this.f5228a);
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        String str = this.f5228a;
        str.getClass();
        String str2 = this.f5229b;
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                c1560b0.f20241c = str2;
                return;
            case 1:
                c1560b0.f20239a = str2;
                return;
            case 2:
                c1560b0.g = str2;
                return;
            case 3:
                c1560b0.f20242d = str2;
                return;
            case 4:
                c1560b0.f20240b = str2;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        return "VC: " + this.f5228a + "=" + this.f5229b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f5228a);
        parcel.writeString(this.f5229b);
    }
}
