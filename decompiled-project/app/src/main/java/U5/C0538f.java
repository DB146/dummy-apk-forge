package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538f extends G5.a {
    public static final Parcelable.Creator<C0538f> CREATOR = new T(19);

    /* renamed from: a, reason: collision with root package name */
    public final C0553v f9747a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9748b;

    /* renamed from: c, reason: collision with root package name */
    public final M f9749c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f9750d;

    /* renamed from: e, reason: collision with root package name */
    public final P f9751e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f9752f;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f9753u;

    /* renamed from: v, reason: collision with root package name */
    public final S f9754v;

    /* renamed from: w, reason: collision with root package name */
    public final C0554w f9755w;

    /* renamed from: x, reason: collision with root package name */
    public final U f9756x;

    public C0538f(C0553v c0553v, b0 b0Var, M m10, d0 d0Var, P p10, Q q10, c0 c0Var, S s3, C0554w c0554w, U u3) {
        this.f9747a = c0553v;
        this.f9749c = m10;
        this.f9748b = b0Var;
        this.f9750d = d0Var;
        this.f9751e = p10;
        this.f9752f = q10;
        this.f9753u = c0Var;
        this.f9754v = s3;
        this.f9755w = c0554w;
        this.f9756x = u3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0538f)) {
            return false;
        }
        C0538f c0538f = (C0538f) obj;
        return com.google.android.gms.common.internal.G.k(this.f9747a, c0538f.f9747a) && com.google.android.gms.common.internal.G.k(this.f9748b, c0538f.f9748b) && com.google.android.gms.common.internal.G.k(this.f9749c, c0538f.f9749c) && com.google.android.gms.common.internal.G.k(this.f9750d, c0538f.f9750d) && com.google.android.gms.common.internal.G.k(this.f9751e, c0538f.f9751e) && com.google.android.gms.common.internal.G.k(this.f9752f, c0538f.f9752f) && com.google.android.gms.common.internal.G.k(this.f9753u, c0538f.f9753u) && com.google.android.gms.common.internal.G.k(this.f9754v, c0538f.f9754v) && com.google.android.gms.common.internal.G.k(this.f9755w, c0538f.f9755w) && com.google.android.gms.common.internal.G.k(this.f9756x, c0538f.f9756x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9747a, this.f9748b, this.f9749c, this.f9750d, this.f9751e, this.f9752f, this.f9753u, this.f9754v, this.f9755w, this.f9756x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 2, this.f9747a, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f9748b, i7, false);
        com.bumptech.glide.d.G(parcel, 4, this.f9749c, i7, false);
        com.bumptech.glide.d.G(parcel, 5, this.f9750d, i7, false);
        com.bumptech.glide.d.G(parcel, 6, this.f9751e, i7, false);
        com.bumptech.glide.d.G(parcel, 7, this.f9752f, i7, false);
        com.bumptech.glide.d.G(parcel, 8, this.f9753u, i7, false);
        com.bumptech.glide.d.G(parcel, 9, this.f9754v, i7, false);
        com.bumptech.glide.d.G(parcel, 10, this.f9755w, i7, false);
        com.bumptech.glide.d.G(parcel, 11, this.f9756x, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
