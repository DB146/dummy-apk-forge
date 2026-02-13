package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class O extends G5.a {
    public static final Parcelable.Creator<O> CREATOR = new T(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f9721a;

    /* renamed from: b, reason: collision with root package name */
    public final short f9722b;

    /* renamed from: c, reason: collision with root package name */
    public final short f9723c;

    public O(int i7, short s3, short s10) {
        this.f9721a = i7;
        this.f9722b = s3;
        this.f9723c = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f9721a == o10.f9721a && this.f9722b == o10.f9722b && this.f9723c == o10.f9723c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9721a), Short.valueOf(this.f9722b), Short.valueOf(this.f9723c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f9721a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f9722b);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f9723c);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
