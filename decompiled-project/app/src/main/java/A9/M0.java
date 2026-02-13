package A9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class M0 implements Parcelable {
    public static final Parcelable.Creator<M0> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int f870a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f871b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f870a);
        parcel.writeBundle(this.f871b);
    }
}
