package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N extends G5.a {
    public static final Parcelable.Creator<N> CREATOR = new T(15);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9720a;

    public N(ArrayList arrayList) {
        this.f9720a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        ArrayList arrayList2 = this.f9720a;
        return (arrayList2 == null && n6.f9720a == null) || (arrayList2 != null && (arrayList = n6.f9720a) != null && arrayList2.containsAll(arrayList) && n6.f9720a.containsAll(arrayList2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f9720a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.L(parcel, 1, this.f9720a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
