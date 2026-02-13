package n7;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* loaded from: classes.dex */
public final class z extends AbstractC1712c {
    public static final Parcelable.Creator<z> CREATOR = new C1654e(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f21310a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21311b;

    public z(String str, String str2) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21310a = str;
        com.google.android.gms.common.internal.G.d(str2);
        this.f21311b = str2;
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21310a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21311b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
