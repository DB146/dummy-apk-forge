package o7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends G5.a {
    public static final Parcelable.Creator<m> CREATOR = new C1812b(4);

    /* renamed from: a, reason: collision with root package name */
    public final List f22096a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22097b;

    public m(ArrayList arrayList, ArrayList arrayList2) {
        this.f22096a = arrayList == null ? new ArrayList() : arrayList;
        this.f22097b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.L(parcel, 1, this.f22096a, false);
        com.bumptech.glide.d.L(parcel, 2, this.f22097b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
