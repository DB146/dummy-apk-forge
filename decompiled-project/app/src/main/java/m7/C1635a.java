package m7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635a extends G5.a {
    public static final Parcelable.Creator<C1635a> CREATOR = new C1636b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f20754a;

    public C1635a(int i7) {
        this.f20754a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f20754a);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
