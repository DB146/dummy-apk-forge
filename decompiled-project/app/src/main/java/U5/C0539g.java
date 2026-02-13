package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539g extends G5.a {
    public static final Parcelable.Creator<C0539g> CREATOR = new T(18);

    /* renamed from: a, reason: collision with root package name */
    public final N f9757a;

    /* renamed from: b, reason: collision with root package name */
    public final X f9758b;

    /* renamed from: c, reason: collision with root package name */
    public final C0540h f9759c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f9760d;

    public C0539g(N n6, X x2, C0540h c0540h, Y y10) {
        this.f9757a = n6;
        this.f9758b = x2;
        this.f9759c = c0540h;
        this.f9760d = y10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0539g)) {
            return false;
        }
        C0539g c0539g = (C0539g) obj;
        return com.google.android.gms.common.internal.G.k(this.f9757a, c0539g.f9757a) && com.google.android.gms.common.internal.G.k(this.f9758b, c0539g.f9758b) && com.google.android.gms.common.internal.G.k(this.f9759c, c0539g.f9759c) && com.google.android.gms.common.internal.G.k(this.f9760d, c0539g.f9760d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9757a, this.f9758b, this.f9759c, this.f9760d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f9757a, i7, false);
        com.bumptech.glide.d.G(parcel, 2, this.f9758b, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f9759c, i7, false);
        com.bumptech.glide.d.G(parcel, 4, this.f9760d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
