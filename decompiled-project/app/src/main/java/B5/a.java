package B5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class a extends G5.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f2099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2100b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2101c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2103e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f2104f;

    public a(int i7, String str, int i10, long j, byte[] bArr, Bundle bundle) {
        this.f2103e = i7;
        this.f2099a = str;
        this.f2100b = i10;
        this.f2101c = j;
        this.f2102d = bArr;
        this.f2104f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f2099a + ", method: " + this.f2100b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 1, this.f2099a, false);
        d.O(parcel, 2, 4);
        parcel.writeInt(this.f2100b);
        d.O(parcel, 3, 8);
        parcel.writeLong(this.f2101c);
        d.A(parcel, 4, this.f2102d, false);
        d.z(parcel, 5, this.f2104f, false);
        d.O(parcel, 1000, 4);
        parcel.writeInt(this.f2103e);
        d.N(M3, parcel);
    }
}
