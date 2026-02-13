package W1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new U5.a0(16);

    /* renamed from: a, reason: collision with root package name */
    public String f10334a;

    /* renamed from: b, reason: collision with root package name */
    public int f10335b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10334a);
        parcel.writeInt(this.f10335b);
    }
}
