package U5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546n extends AbstractC0548p {
    public static final Parcelable.Creator<C0546n> CREATOR = new T(27);

    /* renamed from: a, reason: collision with root package name */
    public final C0556y f9778a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f9779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9780c;

    public C0546n(C0556y c0556y, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.G.g(c0556y);
        this.f9778a = c0556y;
        com.google.android.gms.common.internal.G.g(uri);
        boolean z8 = true;
        com.google.android.gms.common.internal.G.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.G.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f9779b = uri;
        if (bArr != null && bArr.length != 32) {
            z8 = false;
        }
        com.google.android.gms.common.internal.G.a("clientDataHash must be 32 bytes long", z8);
        this.f9780c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0546n)) {
            return false;
        }
        C0546n c0546n = (C0546n) obj;
        return com.google.android.gms.common.internal.G.k(this.f9778a, c0546n.f9778a) && com.google.android.gms.common.internal.G.k(this.f9779b, c0546n.f9779b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9778a, this.f9779b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 2, this.f9778a, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f9779b, i7, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9780c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
