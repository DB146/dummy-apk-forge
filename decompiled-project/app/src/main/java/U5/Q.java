package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q extends G5.a {
    public static final Parcelable.Creator<Q> CREATOR = new K4.l(28);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9725a;

    public Q(boolean z8) {
        this.f9725a = Boolean.valueOf(z8).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && this.f9725a == ((Q) obj).f9725a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9725a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9725a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
