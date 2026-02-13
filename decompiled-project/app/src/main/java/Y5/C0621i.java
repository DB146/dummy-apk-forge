package Y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Y5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621i extends G5.a {
    public static final Parcelable.Creator<C0621i> CREATOR = new U5.a0(21);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11776a;

    public C0621i(Bundle bundle) {
        this.f11776a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.z(parcel, 1, this.f11776a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
