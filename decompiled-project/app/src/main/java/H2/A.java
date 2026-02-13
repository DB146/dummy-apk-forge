package H2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new B5.c(11);

    /* renamed from: a, reason: collision with root package name */
    public int f4569a;

    /* renamed from: b, reason: collision with root package name */
    public int f4570b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4571c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4569a);
        parcel.writeInt(this.f4570b);
        parcel.writeInt(this.f4571c ? 1 : 0);
    }
}
