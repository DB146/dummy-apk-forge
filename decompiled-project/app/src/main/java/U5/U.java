package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U extends G5.a {
    public static final Parcelable.Creator<U> CREATOR = new T(1);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f9728a;

    public U(byte[][] bArr) {
        com.google.android.gms.common.internal.G.b(bArr != null);
        com.google.android.gms.common.internal.G.b(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            com.google.android.gms.common.internal.G.b(i7 == 0 || bArr[i7] != null);
            int i10 = i7 + 1;
            com.google.android.gms.common.internal.G.b(bArr[i10] != null);
            int length = bArr[i10].length;
            com.google.android.gms.common.internal.G.b(length == 32 || length == 64);
            i7 += 2;
        }
        this.f9728a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            return Arrays.deepEquals(this.f9728a, ((U) obj).f9728a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 0;
        for (byte[] bArr : this.f9728a) {
            i7 ^= Arrays.hashCode(new Object[]{bArr});
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        byte[][] bArr = this.f9728a;
        if (bArr != null) {
            int M10 = com.bumptech.glide.d.M(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            com.bumptech.glide.d.N(M10, parcel);
        }
        com.bumptech.glide.d.N(M3, parcel);
    }
}
