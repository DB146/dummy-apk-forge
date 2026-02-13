package y5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2388a extends G5.a {
    public static final Parcelable.Creator<C2388a> CREATOR = new C2392e(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f26961a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26962b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26963c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26964d;

    public C2388a(int i7, boolean z8, long j, boolean z10) {
        this.f26961a = i7;
        this.f26962b = z8;
        this.f26963c = j;
        this.f26964d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f26961a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f26962b ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(this.f26963c);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f26964d ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
