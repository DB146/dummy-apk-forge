package n7;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* renamed from: n7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1714e extends AbstractC1712c {
    public static final Parcelable.Creator<C1714e> CREATOR = new C1654e(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f21286a;

    public C1714e(String str) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21286a = str;
    }

    @Override // n7.AbstractC1712c
    public final String t() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21286a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
