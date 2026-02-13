package K5;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends G5.a {
    public static final Parcelable.Creator<g> CREATOR = new l(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f6178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6179b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6180c;

    public g(a aVar, String str) {
        this.f6178a = 1;
        this.f6179b = str;
        this.f6180c = aVar;
    }

    public g(a aVar, String str, int i7) {
        this.f6178a = i7;
        this.f6179b = str;
        this.f6180c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f6178a);
        com.bumptech.glide.d.H(parcel, 2, this.f6179b, false);
        com.bumptech.glide.d.G(parcel, 3, this.f6180c, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
