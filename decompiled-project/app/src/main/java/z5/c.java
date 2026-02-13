package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class c extends G5.a {
    public static final Parcelable.Creator<c> CREATOR = new C2392e(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28289b;

    public c(String str, boolean z8) {
        if (z8) {
            G.g(str);
        }
        this.f28288a = z8;
        this.f28289b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f28288a == cVar.f28288a && G.k(this.f28289b, cVar.f28289b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f28288a), this.f28289b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f28288a ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 2, this.f28289b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
