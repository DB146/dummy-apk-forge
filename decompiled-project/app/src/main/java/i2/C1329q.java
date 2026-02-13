package i2;

import a6.C0779c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329q implements Parcelable {
    public static final Parcelable.Creator<C1329q> CREATOR = new C0779c(26);

    /* renamed from: a, reason: collision with root package name */
    public int f18290a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f18291b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18290a);
        parcel.writeBundle(this.f18291b);
    }
}
