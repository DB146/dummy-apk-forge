package L4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class a implements F4.b {
    public static final Parcelable.Creator<a> CREATOR = new l(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f6288a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6290c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6291d;

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6288a = readString;
        this.f6289b = parcel.createByteArray();
        this.f6290c = parcel.readInt();
        this.f6291d = parcel.readInt();
    }

    public a(String str, byte[] bArr, int i7, int i10) {
        this.f6288a = str;
        this.f6289b = bArr;
        this.f6290c = i7;
        this.f6291d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6288a.equals(aVar.f6288a) && Arrays.equals(this.f6289b, aVar.f6289b) && this.f6290c == aVar.f6290c && this.f6291d == aVar.f6291d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6289b) + A3.c.d(527, 31, this.f6288a)) * 31) + this.f6290c) * 31) + this.f6291d;
    }

    public final String toString() {
        String o10;
        byte[] bArr = this.f6289b;
        int i7 = this.f6291d;
        if (i7 == 1) {
            o10 = D.o(bArr);
        } else if (i7 == 23) {
            int i10 = D.f21141a;
            AbstractC1705a.h(bArr.length == 4);
            o10 = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
        } else if (i7 != 67) {
            o10 = D.Y(bArr);
        } else {
            int i11 = D.f21141a;
            AbstractC1705a.h(bArr.length == 4);
            o10 = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
        }
        return A3.c.m(new StringBuilder("mdta: key="), this.f6288a, ", value=", o10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6288a);
        parcel.writeByteArray(this.f6289b);
        parcel.writeInt(this.f6290c);
        parcel.writeInt(this.f6291d);
    }
}
