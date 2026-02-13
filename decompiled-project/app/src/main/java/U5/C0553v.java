package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553v extends G5.a {
    public static final Parcelable.Creator<C0553v> CREATOR = new a0(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f9789a;

    public C0553v(String str) {
        com.google.android.gms.common.internal.G.g(str);
        this.f9789a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0553v) {
            return this.f9789a.equals(((C0553v) obj).f9789a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9789a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f9789a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
