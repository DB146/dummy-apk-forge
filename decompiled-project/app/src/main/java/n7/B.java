package n7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* loaded from: classes.dex */
public final class B extends G5.a {
    public static final Parcelable.Creator<B> CREATOR = new C1654e(10);

    /* renamed from: a, reason: collision with root package name */
    public String f21239a;

    /* renamed from: b, reason: collision with root package name */
    public String f21240b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21241c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21242d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f21243e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f21239a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f21240b, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f21241c ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f21242d ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
