package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.y;

/* loaded from: classes.dex */
public final class g extends G5.a {
    public static final Parcelable.Creator<g> CREATOR = new C0779c(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f12791a;

    /* renamed from: b, reason: collision with root package name */
    public final y f12792b;

    public g(int i7, y yVar) {
        this.f12791a = i7;
        this.f12792b = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f12791a);
        com.bumptech.glide.d.G(parcel, 2, this.f12792b, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
