package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class F extends G5.a {
    public static final Parcelable.Creator<F> CREATOR = new T(9);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9706b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9707c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9708d;

    public F(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9705a = bArr;
        com.google.android.gms.common.internal.G.g(str);
        this.f9706b = str;
        this.f9707c = str2;
        com.google.android.gms.common.internal.G.g(str3);
        this.f9708d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return Arrays.equals(this.f9705a, f4.f9705a) && com.google.android.gms.common.internal.G.k(this.f9706b, f4.f9706b) && com.google.android.gms.common.internal.G.k(this.f9707c, f4.f9707c) && com.google.android.gms.common.internal.G.k(this.f9708d, f4.f9708d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9705a, this.f9706b, this.f9707c, this.f9708d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.A(parcel, 2, this.f9705a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f9706b, false);
        com.bumptech.glide.d.H(parcel, 4, this.f9707c, false);
        com.bumptech.glide.d.H(parcel, 5, this.f9708d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
