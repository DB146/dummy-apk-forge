package F;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0263g(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0263g[i7];
    }
}
