package U5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0535c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0535c> CREATOR = new K4.l(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f9742a;

    EnumC0535c(String str) {
        this.f9742a = str;
    }

    public static EnumC0535c a(String str) {
        for (EnumC0535c enumC0535c : values()) {
            if (str.equals(enumC0535c.f9742a)) {
                return enumC0535c;
            }
        }
        throw new Exception(y.S.b("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9742a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9742a);
    }
}
