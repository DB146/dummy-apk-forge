package U5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0537e implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0537e> CREATOR = new T(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f9746a;

    EnumC0537e(String str) {
        this.f9746a = str;
    }

    public static EnumC0537e a(String str) {
        for (EnumC0537e enumC0537e : values()) {
            if (str.equals(enumC0537e.f9746a)) {
                return enumC0537e;
            }
        }
        throw new Exception(y.S.b("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9746a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9746a);
    }
}
