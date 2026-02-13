package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new l(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f6146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6147c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6148d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f6149e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f6150f;

    public m(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6146b = i7;
        this.f6147c = i10;
        this.f6148d = i11;
        this.f6149e = iArr;
        this.f6150f = iArr2;
    }

    public m(Parcel parcel) {
        super("MLLT");
        this.f6146b = parcel.readInt();
        this.f6147c = parcel.readInt();
        this.f6148d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i7 = D.f21141a;
        this.f6149e = createIntArray;
        this.f6150f = parcel.createIntArray();
    }

    @Override // K4.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f6146b == mVar.f6146b && this.f6147c == mVar.f6147c && this.f6148d == mVar.f6148d && Arrays.equals(this.f6149e, mVar.f6149e) && Arrays.equals(this.f6150f, mVar.f6150f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6150f) + ((Arrays.hashCode(this.f6149e) + ((((((527 + this.f6146b) * 31) + this.f6147c) * 31) + this.f6148d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6146b);
        parcel.writeInt(this.f6147c);
        parcel.writeInt(this.f6148d);
        parcel.writeIntArray(this.f6149e);
        parcel.writeIntArray(this.f6150f);
    }
}
