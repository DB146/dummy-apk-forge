package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new l(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f6151b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6152c;

    public n(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6151b = readString;
        this.f6152c = parcel.createByteArray();
    }

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f6151b = str;
        this.f6152c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return D.a(this.f6151b, nVar.f6151b) && Arrays.equals(this.f6152c, nVar.f6152c);
    }

    public final int hashCode() {
        String str = this.f6151b;
        return Arrays.hashCode(this.f6152c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": owner=" + this.f6151b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6151b);
        parcel.writeByteArray(this.f6152c);
    }
}
