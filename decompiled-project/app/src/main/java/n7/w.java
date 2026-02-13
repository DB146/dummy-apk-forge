package n7;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* loaded from: classes.dex */
public final class w extends AbstractC1712c {
    public static final Parcelable.Creator<w> CREATOR = new C1654e(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f21305a;

    public w(String str) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21305a = str;
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21305a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
