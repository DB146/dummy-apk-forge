package Y5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x1 extends G5.a {
    public static final Parcelable.Creator<x1> CREATOR = new U5.a0(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f11993a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11995c;

    public x1(String str, long j, int i7) {
        this.f11993a = str;
        this.f11994b = j;
        this.f11995c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f11993a, false);
        com.bumptech.glide.d.O(parcel, 2, 8);
        parcel.writeLong(this.f11994b);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f11995c);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
