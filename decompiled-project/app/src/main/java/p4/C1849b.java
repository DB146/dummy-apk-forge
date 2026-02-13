package p4;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;
import n5.AbstractC1705a;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849b implements F4.b {
    public static final Parcelable.Creator<C1849b> CREATOR = new C1654e(18);

    /* renamed from: a, reason: collision with root package name */
    public final float f23046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23047b;

    public C1849b(float f4, float f10) {
        AbstractC1705a.g("Invalid latitude or longitude", f4 >= -90.0f && f4 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f);
        this.f23046a = f4;
        this.f23047b = f10;
    }

    public C1849b(Parcel parcel) {
        this.f23046a = parcel.readFloat();
        this.f23047b = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1849b.class != obj.getClass()) {
            return false;
        }
        C1849b c1849b = (C1849b) obj;
        return this.f23046a == c1849b.f23046a && this.f23047b == c1849b.f23047b;
    }

    public final int hashCode() {
        return Float.valueOf(this.f23047b).hashCode() + ((Float.valueOf(this.f23046a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f23046a + ", longitude=" + this.f23047b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f23046a);
        parcel.writeFloat(this.f23047b);
    }
}
