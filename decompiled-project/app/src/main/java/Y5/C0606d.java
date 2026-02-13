package Y5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Y5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606d extends G5.a {
    public static final Parcelable.Creator<C0606d> CREATOR = new U5.a0(19);

    /* renamed from: a, reason: collision with root package name */
    public final long f11696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11697b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11698c;

    public C0606d(int i7, long j, long j10) {
        this.f11696a = j;
        this.f11697b = i7;
        this.f11698c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 8);
        parcel.writeLong(this.f11696a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f11697b);
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(this.f11698c);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
