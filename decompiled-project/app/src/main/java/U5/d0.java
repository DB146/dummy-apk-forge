package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 extends G5.a {
    public static final Parcelable.Creator<d0> CREATOR = new K4.l(26);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9744a;

    public d0(boolean z8) {
        this.f9744a = Boolean.valueOf(z8).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && this.f9744a == ((d0) obj).f9744a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9744a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9744a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
