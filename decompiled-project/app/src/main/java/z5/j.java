package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class j extends G5.a {
    public static final Parcelable.Creator<j> CREATOR = new C2392e(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f28304a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28305b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28306c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28307d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28308e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28309f;

    public j(String str, String str2, boolean z8, String str3, int i7, String str4) {
        G.g(str);
        this.f28304a = str;
        this.f28305b = str2;
        this.f28306c = str3;
        this.f28307d = str4;
        this.f28308e = z8;
        this.f28309f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return G.k(this.f28304a, jVar.f28304a) && G.k(this.f28307d, jVar.f28307d) && G.k(this.f28305b, jVar.f28305b) && G.k(Boolean.valueOf(this.f28308e), Boolean.valueOf(jVar.f28308e)) && this.f28309f == jVar.f28309f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28304a, this.f28305b, this.f28307d, Boolean.valueOf(this.f28308e), Integer.valueOf(this.f28309f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f28304a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f28305b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28306c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f28307d, false);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f28308e ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 6, 4);
        parcel.writeInt(this.f28309f);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
