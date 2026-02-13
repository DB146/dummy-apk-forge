package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: U5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0552u implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED_ERR(9),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STATE_ERR(11),
    /* JADX INFO: Fake field, exist only in values array */
    SECURITY_ERR(18),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERR(19),
    /* JADX INFO: Fake field, exist only in values array */
    ABORT_ERR(20),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT_ERR(23),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODING_ERR(27),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERR(28),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTRAINT_ERR(29),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_ERR(30),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ALLOWED_ERR(35),
    /* JADX INFO: Fake field, exist only in values array */
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC0552u> CREATOR = new a0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f9788a;

    EnumC0552u(int i7) {
        this.f9788a = i7;
    }

    public static EnumC0552u a(int i7) {
        for (EnumC0552u enumC0552u : values()) {
            if (i7 == enumC0552u.f9788a) {
                return enumC0552u;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(A3.c.f(i7, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9788a);
    }
}
