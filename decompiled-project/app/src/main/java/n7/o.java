package n7;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* loaded from: classes.dex */
public final class o extends AbstractC1712c {
    public static final Parcelable.Creator<o> CREATOR = new C1654e(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f21294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21295b;

    public o(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f21294a = str;
        this.f21295b = str2;
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21294a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21295b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
