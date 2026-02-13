package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class P extends G5.a {
    public static final Parcelable.Creator<P> CREATOR = new K4.l(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f9724a;

    public P(long j) {
        this.f9724a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof P) && this.f9724a == ((P) obj).f9724a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9724a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 8);
        parcel.writeLong(this.f9724a);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
