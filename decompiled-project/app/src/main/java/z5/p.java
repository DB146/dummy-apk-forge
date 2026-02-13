package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class p extends G5.a {
    public static final Parcelable.Creator<p> CREATOR = new C2392e(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f28324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28325b;

    public p(String str, String str2) {
        G.h(str, "Account identifier cannot be null");
        String trim = str.trim();
        G.e(trim, "Account identifier cannot be empty");
        this.f28324a = trim;
        G.d(str2);
        this.f28325b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return G.k(this.f28324a, pVar.f28324a) && G.k(this.f28325b, pVar.f28325b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28324a, this.f28325b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f28324a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f28325b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
