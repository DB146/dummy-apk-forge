package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C extends G5.a {
    public static final Parcelable.Creator<C> CREATOR = new T(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f9701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9703c;

    public C(String str, String str2, String str3) {
        com.google.android.gms.common.internal.G.g(str);
        this.f9701a = str;
        com.google.android.gms.common.internal.G.g(str2);
        this.f9702b = str2;
        this.f9703c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return com.google.android.gms.common.internal.G.k(this.f9701a, c10.f9701a) && com.google.android.gms.common.internal.G.k(this.f9702b, c10.f9702b) && com.google.android.gms.common.internal.G.k(this.f9703c, c10.f9703c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9701a, this.f9702b, this.f9703c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f9701a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f9702b, false);
        com.bumptech.glide.d.H(parcel, 4, this.f9703c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
