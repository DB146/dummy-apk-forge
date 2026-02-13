package U5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum W implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<W> CREATOR = new T(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f9730a;

    W(String str) {
        this.f9730a = str;
    }

    public static W a(String str) {
        for (W w10 : values()) {
            if (str.equals(w10.f9730a)) {
                return w10;
            }
        }
        throw new Exception(y.S.b("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9730a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9730a);
    }
}
