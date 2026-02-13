package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class S extends G5.a {
    public static final Parcelable.Creator<S> CREATOR = new T(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f9726a;

    public S(String str) {
        com.google.android.gms.common.internal.G.g(str);
        this.f9726a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return this.f9726a.equals(((S) obj).f9726a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9726a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f9726a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
