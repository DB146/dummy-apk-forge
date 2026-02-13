package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import y5.C2392e;

/* loaded from: classes.dex */
public final class g extends G5.a {
    public static final Parcelable.Creator<g> CREATOR = new C2392e(7);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f28302a;

    public g(PendingIntent pendingIntent) {
        G.g(pendingIntent);
        this.f28302a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f28302a, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
