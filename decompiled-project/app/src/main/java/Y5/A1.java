package Y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A1 extends G5.a {
    public static final Parcelable.Creator<A1> CREATOR = new U5.a0(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f11205a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11206b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11207c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f11208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11209e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11210f;

    /* renamed from: u, reason: collision with root package name */
    public String f11211u;

    public A1(long j, byte[] bArr, String str, Bundle bundle, int i7, long j10, String str2) {
        this.f11205a = j;
        this.f11206b = bArr;
        this.f11207c = str;
        this.f11208d = bundle;
        this.f11209e = i7;
        this.f11210f = j10;
        this.f11211u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 8);
        parcel.writeLong(this.f11205a);
        com.bumptech.glide.d.A(parcel, 2, this.f11206b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f11207c, false);
        com.bumptech.glide.d.z(parcel, 4, this.f11208d, false);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f11209e);
        com.bumptech.glide.d.O(parcel, 6, 8);
        parcel.writeLong(this.f11210f);
        com.bumptech.glide.d.H(parcel, 7, this.f11211u, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
