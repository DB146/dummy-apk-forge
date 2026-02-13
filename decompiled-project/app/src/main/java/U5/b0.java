package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b0 extends G5.a {
    public static final Parcelable.Creator<b0> CREATOR = new a0(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9740a;

    public b0(ArrayList arrayList) {
        com.google.android.gms.common.internal.G.g(arrayList);
        this.f9740a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        ArrayList arrayList = b0Var.f9740a;
        ArrayList arrayList2 = this.f9740a;
        return arrayList2.containsAll(arrayList) && b0Var.f9740a.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f9740a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.L(parcel, 1, this.f9740a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
