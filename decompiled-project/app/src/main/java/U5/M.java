package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M extends G5.a {
    public static final Parcelable.Creator<M> CREATOR = new T(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9719a;

    public M(boolean z8) {
        this.f9719a = z8;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M) && this.f9719a == ((M) obj).f9719a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9719a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9719a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
