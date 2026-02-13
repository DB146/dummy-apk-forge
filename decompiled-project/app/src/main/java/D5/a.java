package D5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends G5.a {
    public static final Parcelable.Creator<a> CREATOR = new B5.c(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f3231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3232b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3233c;

    public a(int i7, int i10, Bundle bundle) {
        this.f3231a = i7;
        this.f3232b = i10;
        this.f3233c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f3231a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f3232b);
        com.bumptech.glide.d.z(parcel, 3, this.f3233c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
