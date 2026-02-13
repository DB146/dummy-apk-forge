package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X extends G5.a {
    public static final Parcelable.Creator<X> CREATOR = new T(21);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9731a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9732b;

    public X(byte[] bArr, byte[] bArr2) {
        this.f9731a = bArr;
        this.f9732b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x2 = (X) obj;
        return Arrays.equals(this.f9731a, x2.f9731a) && Arrays.equals(this.f9732b, x2.f9732b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9731a, this.f9732b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.A(parcel, 1, this.f9731a, false);
        com.bumptech.glide.d.A(parcel, 2, this.f9732b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
