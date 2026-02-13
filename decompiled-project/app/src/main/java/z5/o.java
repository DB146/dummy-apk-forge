package z5;

import U5.C0555x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class o extends G5.a {
    public static final Parcelable.Creator<o> CREATOR = new C2392e(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f28315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28318d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f28319e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28320f;

    /* renamed from: u, reason: collision with root package name */
    public final String f28321u;

    /* renamed from: v, reason: collision with root package name */
    public final String f28322v;

    /* renamed from: w, reason: collision with root package name */
    public final C0555x f28323w;

    public o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0555x c0555x) {
        G.g(str);
        this.f28315a = str;
        this.f28316b = str2;
        this.f28317c = str3;
        this.f28318d = str4;
        this.f28319e = uri;
        this.f28320f = str5;
        this.f28321u = str6;
        this.f28322v = str7;
        this.f28323w = c0555x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return G.k(this.f28315a, oVar.f28315a) && G.k(this.f28316b, oVar.f28316b) && G.k(this.f28317c, oVar.f28317c) && G.k(this.f28318d, oVar.f28318d) && G.k(this.f28319e, oVar.f28319e) && G.k(this.f28320f, oVar.f28320f) && G.k(this.f28321u, oVar.f28321u) && G.k(this.f28322v, oVar.f28322v) && G.k(this.f28323w, oVar.f28323w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28315a, this.f28316b, this.f28317c, this.f28318d, this.f28319e, this.f28320f, this.f28321u, this.f28322v, this.f28323w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f28315a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f28316b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28317c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f28318d, false);
        com.bumptech.glide.d.G(parcel, 5, this.f28319e, i7, false);
        com.bumptech.glide.d.H(parcel, 6, this.f28320f, false);
        com.bumptech.glide.d.H(parcel, 7, this.f28321u, false);
        com.bumptech.glide.d.H(parcel, 8, this.f28322v, false);
        com.bumptech.glide.d.G(parcel, 9, this.f28323w, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
