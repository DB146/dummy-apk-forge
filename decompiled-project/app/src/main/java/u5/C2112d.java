package u5;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* renamed from: u5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2112d extends G5.a {
    public static final Parcelable.Creator<C2112d> CREATOR = new C1654e(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f24873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24874b;

    public C2112d(String str, int i7) {
        this.f24873a = str;
        this.f24874b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f24873a, false);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f24874b);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
