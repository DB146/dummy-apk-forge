package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 extends G5.a {
    public static final Parcelable.Creator<c0> CREATOR = new a0(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9743a;

    public c0(boolean z8) {
        this.f9743a = Boolean.valueOf(z8).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && this.f9743a == ((c0) obj).f9743a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9743a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9743a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
