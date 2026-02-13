package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Y extends G5.a {
    public static final Parcelable.Creator<Y> CREATOR = new T(22);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9734b;

    public Y(byte[] bArr, boolean z8) {
        this.f9733a = z8;
        this.f9734b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f9733a == y10.f9733a && Arrays.equals(this.f9734b, y10.f9734b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9733a), this.f9734b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9733a ? 1 : 0);
        com.bumptech.glide.d.A(parcel, 2, this.f9734b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
