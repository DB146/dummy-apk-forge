package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class z implements G5.c {
    public static final Parcelable.Creator<z> CREATOR = new C1812b(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f22121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22122b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22123c;

    public z(String str, String str2, boolean z8) {
        G.d(str);
        G.d(str2);
        this.f22121a = str;
        this.f22122b = str2;
        AbstractC1821k.d(str2);
        this.f22123c = z8;
    }

    public z(boolean z8) {
        this.f22123c = z8;
        this.f22122b = null;
        this.f22121a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f22121a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f22122b, false);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f22123c ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
