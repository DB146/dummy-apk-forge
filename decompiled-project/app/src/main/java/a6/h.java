package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z;

/* loaded from: classes.dex */
public final class h extends G5.a {
    public static final Parcelable.Creator<h> CREATOR = new C0779c(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f12793a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.b f12794b;

    /* renamed from: c, reason: collision with root package name */
    public final z f12795c;

    public h(int i7, F5.b bVar, z zVar) {
        this.f12793a = i7;
        this.f12794b = bVar;
        this.f12795c = zVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f12793a);
        com.bumptech.glide.d.G(parcel, 2, this.f12794b, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f12795c, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
