package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class l extends G5.a {
    public static final Parcelable.Creator<l> CREATOR = new C2392e(16);

    /* renamed from: a, reason: collision with root package name */
    public final p f28311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28313c;

    public l(p pVar, String str, int i7) {
        G.g(pVar);
        this.f28311a = pVar;
        this.f28312b = str;
        this.f28313c = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return G.k(this.f28311a, lVar.f28311a) && G.k(this.f28312b, lVar.f28312b) && this.f28313c == lVar.f28313c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28311a, this.f28312b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f28311a, i7, false);
        com.bumptech.glide.d.H(parcel, 2, this.f28312b, false);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f28313c);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
