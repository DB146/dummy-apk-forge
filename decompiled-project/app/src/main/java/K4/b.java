package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(24);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6117b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6117b = parcel.createByteArray();
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f6117b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6141a.equals(bVar.f6141a) && Arrays.equals(this.f6117b, bVar.f6117b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6117b) + A3.c.d(527, 31, this.f6141a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6141a);
        parcel.writeByteArray(this.f6117b);
    }
}
