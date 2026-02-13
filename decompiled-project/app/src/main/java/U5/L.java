package U5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class L extends G5.a {
    public static final Parcelable.Creator<L> CREATOR = new T(12);

    /* renamed from: a, reason: collision with root package name */
    public final J f9717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9718b;

    static {
        new L("supported", null);
        new L("not-supported", null);
    }

    public L(String str, String str2) {
        com.google.android.gms.common.internal.G.g(str);
        try {
            this.f9717a = J.a(str);
            this.f9718b = str2;
        } catch (K e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return zzao.zza(this.f9717a, l10.f9717a) && zzao.zza(this.f9718b, l10.f9718b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9717a, this.f9718b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f9717a.f9716a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f9718b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
