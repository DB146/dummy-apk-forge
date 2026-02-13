package u5;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* renamed from: u5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2111c extends G5.a {
    public static final Parcelable.Creator<C2111c> CREATOR = new C1654e(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f24871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24872b;

    public C2111c(String str, String str2) {
        this.f24871a = str;
        this.f24872b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f24871a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f24872b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
