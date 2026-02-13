package J4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.C1560b0;

/* loaded from: classes.dex */
public final class c implements F4.b {
    public static final Parcelable.Creator<c> CREATOR = new B5.c(18);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5525c;

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f5523a = createByteArray;
        this.f5524b = parcel.readString();
        this.f5525c = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f5523a = bArr;
        this.f5524b = str;
        this.f5525c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5523a, ((c) obj).f5523a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5523a);
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        String str = this.f5524b;
        if (str != null) {
            c1560b0.f20239a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.f5524b + "\", url=\"" + this.f5525c + "\", rawMetadata.length=\"" + this.f5523a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f5523a);
        parcel.writeString(this.f5524b);
        parcel.writeString(this.f5525c);
    }
}
