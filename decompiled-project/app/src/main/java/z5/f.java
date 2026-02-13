package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class f extends G5.a {
    public static final Parcelable.Creator<f> CREATOR = new C2392e(6);

    /* renamed from: a, reason: collision with root package name */
    public final e f28294a;

    /* renamed from: b, reason: collision with root package name */
    public final C2597b f28295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28296c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28298e;

    /* renamed from: f, reason: collision with root package name */
    public final d f28299f;

    /* renamed from: u, reason: collision with root package name */
    public final c f28300u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f28301v;

    public f(e eVar, C2597b c2597b, String str, boolean z8, int i7, d dVar, c cVar, boolean z10) {
        G.g(eVar);
        this.f28294a = eVar;
        G.g(c2597b);
        this.f28295b = c2597b;
        this.f28296c = str;
        this.f28297d = z8;
        this.f28298e = i7;
        this.f28299f = dVar == null ? new d(null, null, false) : dVar;
        this.f28300u = cVar == null ? new c(null, false) : cVar;
        this.f28301v = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return G.k(this.f28294a, fVar.f28294a) && G.k(this.f28295b, fVar.f28295b) && G.k(this.f28299f, fVar.f28299f) && G.k(this.f28300u, fVar.f28300u) && G.k(this.f28296c, fVar.f28296c) && this.f28297d == fVar.f28297d && this.f28298e == fVar.f28298e && this.f28301v == fVar.f28301v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28294a, this.f28295b, this.f28299f, this.f28300u, this.f28296c, Boolean.valueOf(this.f28297d), Integer.valueOf(this.f28298e), Boolean.valueOf(this.f28301v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f28294a, i7, false);
        com.bumptech.glide.d.G(parcel, 2, this.f28295b, i7, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28296c, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f28297d ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f28298e);
        com.bumptech.glide.d.G(parcel, 6, this.f28299f, i7, false);
        com.bumptech.glide.d.G(parcel, 7, this.f28300u, i7, false);
        com.bumptech.glide.d.O(parcel, 8, 4);
        parcel.writeInt(this.f28301v ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
