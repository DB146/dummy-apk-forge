package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555x extends G5.a {
    public static final Parcelable.Creator<C0555x> CREATOR = new T(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9792b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9793c;

    /* renamed from: d, reason: collision with root package name */
    public final C0542j f9794d;

    /* renamed from: e, reason: collision with root package name */
    public final C0541i f9795e;

    /* renamed from: f, reason: collision with root package name */
    public final C0543k f9796f;

    /* renamed from: u, reason: collision with root package name */
    public final C0539g f9797u;

    /* renamed from: v, reason: collision with root package name */
    public final String f9798v;

    public C0555x(String str, String str2, byte[] bArr, C0542j c0542j, C0541i c0541i, C0543k c0543k, C0539g c0539g, String str3) {
        boolean z8 = true;
        if ((c0542j == null || c0541i != null || c0543k != null) && ((c0542j != null || c0541i == null || c0543k != null) && (c0542j != null || c0541i != null || c0543k == null))) {
            z8 = false;
        }
        com.google.android.gms.common.internal.G.b(z8);
        this.f9791a = str;
        this.f9792b = str2;
        this.f9793c = bArr;
        this.f9794d = c0542j;
        this.f9795e = c0541i;
        this.f9796f = c0543k;
        this.f9797u = c0539g;
        this.f9798v = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0555x)) {
            return false;
        }
        C0555x c0555x = (C0555x) obj;
        return com.google.android.gms.common.internal.G.k(this.f9791a, c0555x.f9791a) && com.google.android.gms.common.internal.G.k(this.f9792b, c0555x.f9792b) && Arrays.equals(this.f9793c, c0555x.f9793c) && com.google.android.gms.common.internal.G.k(this.f9794d, c0555x.f9794d) && com.google.android.gms.common.internal.G.k(this.f9795e, c0555x.f9795e) && com.google.android.gms.common.internal.G.k(this.f9796f, c0555x.f9796f) && com.google.android.gms.common.internal.G.k(this.f9797u, c0555x.f9797u) && com.google.android.gms.common.internal.G.k(this.f9798v, c0555x.f9798v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9791a, this.f9792b, this.f9793c, this.f9795e, this.f9794d, this.f9796f, this.f9797u, this.f9798v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f9791a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f9792b, false);
        com.bumptech.glide.d.A(parcel, 3, this.f9793c, false);
        com.bumptech.glide.d.G(parcel, 4, this.f9794d, i7, false);
        com.bumptech.glide.d.G(parcel, 5, this.f9795e, i7, false);
        com.bumptech.glide.d.G(parcel, 6, this.f9796f, i7, false);
        com.bumptech.glide.d.G(parcel, 7, this.f9797u, i7, false);
        com.bumptech.glide.d.H(parcel, 8, this.f9798v, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
