package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new B5.c(26);

    /* renamed from: b, reason: collision with root package name */
    public final String f6124b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6125c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6126d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6127e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f6128f;

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6124b = readString;
        this.f6125c = parcel.readByte() != 0;
        this.f6126d = parcel.readByte() != 0;
        this.f6127e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f6128f = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f6128f[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }

    public d(String str, boolean z8, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f6124b = str;
        this.f6125c = z8;
        this.f6126d = z10;
        this.f6127e = strArr;
        this.f6128f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6125c == dVar.f6125c && this.f6126d == dVar.f6126d && D.a(this.f6124b, dVar.f6124b) && Arrays.equals(this.f6127e, dVar.f6127e) && Arrays.equals(this.f6128f, dVar.f6128f);
    }

    public final int hashCode() {
        int i7 = (((527 + (this.f6125c ? 1 : 0)) * 31) + (this.f6126d ? 1 : 0)) * 31;
        String str = this.f6124b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6124b);
        parcel.writeByte(this.f6125c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6126d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6127e);
        j[] jVarArr = this.f6128f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }
}
