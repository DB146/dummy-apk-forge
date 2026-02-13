package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public final class m extends G5.a {
    public static final Parcelable.Creator<m> CREATOR = new C2392e(17);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f28314a;

    public m(PendingIntent pendingIntent) {
        G.g(pendingIntent);
        this.f28314a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return G.k(this.f28314a, ((m) obj).f28314a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28314a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f28314a, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
