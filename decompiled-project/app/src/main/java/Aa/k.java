package Aa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        return l.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new l[i7];
    }
}
