package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class k extends G5.a {
    public static final Parcelable.Creator<k> CREATOR = new C2392e(15);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f28310a;

    public k(PendingIntent pendingIntent) {
        this.f28310a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return G.k(this.f28310a, ((k) obj).f28310a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28310a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f28310a, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
