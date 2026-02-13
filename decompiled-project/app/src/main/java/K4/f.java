package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new B5.c(28);

    /* renamed from: b, reason: collision with root package name */
    public final String f6132b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6133c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6134d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6135e;

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6132b = readString;
        this.f6133c = parcel.readString();
        this.f6134d = parcel.readString();
        this.f6135e = parcel.createByteArray();
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6132b = str;
        this.f6133c = str2;
        this.f6134d = str3;
        this.f6135e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return D.a(this.f6132b, fVar.f6132b) && D.a(this.f6133c, fVar.f6133c) && D.a(this.f6134d, fVar.f6134d) && Arrays.equals(this.f6135e, fVar.f6135e);
    }

    public final int hashCode() {
        String str = this.f6132b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6133c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6134d;
        return Arrays.hashCode(this.f6135e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": mimeType=" + this.f6132b + ", filename=" + this.f6133c + ", description=" + this.f6134d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6132b);
        parcel.writeString(this.f6133c);
        parcel.writeString(this.f6134d);
        parcel.writeByteArray(this.f6135e);
    }
}
