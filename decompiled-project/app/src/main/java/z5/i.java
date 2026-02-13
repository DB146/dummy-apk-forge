package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class i extends G5.a {
    public static final Parcelable.Creator<i> CREATOR = new C2392e(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f28303a;

    public i(int i7) {
        this.f28303a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return G.k(Integer.valueOf(this.f28303a), Integer.valueOf(((i) obj).f28303a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28303a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f28303a);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
