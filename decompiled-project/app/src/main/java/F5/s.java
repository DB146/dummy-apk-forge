package F5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s extends G5.a {
    public static final Parcelable.Creator<s> CREATOR = new B5.c(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4135b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4136c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4137d;

    public s(int i7, int i10, String str, boolean z8) {
        this.f4134a = z8;
        this.f4135b = str;
        this.f4136c = Y6.b.z(i7) - 1;
        this.f4137d = Tb.a.O(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f4134a ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 2, this.f4135b, false);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f4136c);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f4137d);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
