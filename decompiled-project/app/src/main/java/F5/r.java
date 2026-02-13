package F5;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r extends G5.a {
    public static final Parcelable.Creator<r> CREATOR = new B5.c(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f4128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4130c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4131d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4132e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4133f;

    public r(String str, boolean z8, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f4128a = str;
        this.f4129b = z8;
        this.f4130c = z10;
        this.f4131d = (Context) P5.b.F(P5.b.h(iBinder));
        this.f4132e = z11;
        this.f4133f = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f4128a, false);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f4129b ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f4130c ? 1 : 0);
        com.bumptech.glide.d.C(parcel, 4, new P5.b(this.f4131d));
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f4132e ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 6, 4);
        parcel.writeInt(this.f4133f ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
