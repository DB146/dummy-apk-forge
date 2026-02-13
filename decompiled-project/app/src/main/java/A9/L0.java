package A9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class L0 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [A9.M0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? obj = new Object();
        obj.f871b = Bundle.EMPTY;
        obj.f870a = parcel.readInt();
        obj.f871b = parcel.readBundle(N0.class.getClassLoader());
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new M0[i7];
    }
}
