package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f12856a;

    /* renamed from: b, reason: collision with root package name */
    public int f12857b;

    /* renamed from: c, reason: collision with root package name */
    public int f12858c;

    /* renamed from: d, reason: collision with root package name */
    public int f12859d;

    /* renamed from: e, reason: collision with root package name */
    public int f12860e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f12856a);
        parcel.writeInt(this.f12858c);
        parcel.writeInt(this.f12859d);
        parcel.writeInt(this.f12860e);
        parcel.writeInt(this.f12857b);
    }
}
