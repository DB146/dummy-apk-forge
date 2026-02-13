package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z extends G5.a {
    public static final Parcelable.Creator<Z> CREATOR = new a0(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f9735a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9736b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9737c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9738d;

    public Z(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9735a = j;
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9736b = bArr;
        com.google.android.gms.common.internal.G.g(bArr2);
        this.f9737c = bArr2;
        com.google.android.gms.common.internal.G.g(bArr3);
        this.f9738d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        return this.f9735a == z8.f9735a && Arrays.equals(this.f9736b, z8.f9736b) && Arrays.equals(this.f9737c, z8.f9737c) && Arrays.equals(this.f9738d, z8.f9738d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9735a), this.f9736b, this.f9737c, this.f9738d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 8);
        parcel.writeLong(this.f9735a);
        com.bumptech.glide.d.A(parcel, 2, this.f9736b, false);
        com.bumptech.glide.d.A(parcel, 3, this.f9737c, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9738d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
