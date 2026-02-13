package androidx.versionedparcelable;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import d3.C1046b;
import d3.InterfaceC1047c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0779c(22);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1047c f13730a;

    public ParcelImpl(Parcel parcel) {
        this.f13730a = new C1046b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new C1046b(parcel).l(this.f13730a);
    }
}
