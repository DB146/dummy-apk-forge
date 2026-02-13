package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class e extends G5.a {
    public static final Parcelable.Creator<e> CREATOR = new C2392e(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28293a;

    public e(boolean z8) {
        this.f28293a = z8;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f28293a == ((e) obj).f28293a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f28293a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f28293a ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
