package U5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547o extends AbstractC0548p {
    public static final Parcelable.Creator<C0547o> CREATOR = new T(28);

    /* renamed from: a, reason: collision with root package name */
    public final B f9781a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f9782b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9783c;

    public C0547o(B b2, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.G.g(b2);
        this.f9781a = b2;
        com.google.android.gms.common.internal.G.g(uri);
        boolean z8 = true;
        com.google.android.gms.common.internal.G.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.G.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f9782b = uri;
        if (bArr != null && bArr.length != 32) {
            z8 = false;
        }
        com.google.android.gms.common.internal.G.a("clientDataHash must be 32 bytes long", z8);
        this.f9783c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0547o)) {
            return false;
        }
        C0547o c0547o = (C0547o) obj;
        return com.google.android.gms.common.internal.G.k(this.f9781a, c0547o.f9781a) && com.google.android.gms.common.internal.G.k(this.f9782b, c0547o.f9782b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9781a, this.f9782b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 2, this.f9781a, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f9782b, i7, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9783c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
