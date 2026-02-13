package H1;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f4568a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f4567b = new b();
    public static final Parcelable.Creator<b> CREATOR = new y(1);

    public b() {
        this.f4568a = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4568a = readParcelable == null ? f4567b : readParcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f4568a = parcelable == f4567b ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4568a, i7);
    }
}
