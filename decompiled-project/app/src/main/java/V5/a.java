package V5;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum a implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    ABSENT(0),
    STRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2);

    public static final Parcelable.Creator<a> CREATOR = new a0(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f10173a;

    a(int i7) {
        this.f10173a = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10173a);
    }
}
