package M4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import n5.D;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new l(15);

    /* renamed from: a, reason: collision with root package name */
    public final long f6745a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6746b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6747c;

    public a(long j, byte[] bArr, long j10) {
        this.f6745a = j10;
        this.f6746b = j;
        this.f6747c = bArr;
    }

    public a(Parcel parcel) {
        this.f6745a = parcel.readLong();
        this.f6746b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i7 = D.f21141a;
        this.f6747c = createByteArray;
    }

    @Override // M4.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f6745a);
        sb2.append(", identifier= ");
        return X.c.f(this.f6746b, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6745a);
        parcel.writeLong(this.f6746b);
        parcel.writeByteArray(this.f6747c);
    }
}
