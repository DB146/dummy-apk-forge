package U5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum J implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<J> CREATOR = new T(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f9716a;

    J(String str) {
        this.f9716a = str;
    }

    public static J a(String str) {
        for (J j : values()) {
            if (str.equals(j.f9716a)) {
                return j;
            }
        }
        throw new Exception(y.S.b("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9716a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9716a);
    }
}
