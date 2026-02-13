package Y5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C1 extends G5.a {
    public static final Parcelable.Creator<C1> CREATOR = new U5.a0(27);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11232a;

    public C1(ArrayList arrayList) {
        this.f11232a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.L(parcel, 1, this.f11232a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
