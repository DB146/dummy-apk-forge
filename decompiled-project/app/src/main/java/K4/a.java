package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.C1560b0;
import n5.D;

/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new B5.c(23);

    /* renamed from: b, reason: collision with root package name */
    public final String f6113b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6115d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6116e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f6113b = str;
        this.f6114c = str2;
        this.f6115d = i7;
        this.f6116e = bArr;
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6113b = readString;
        this.f6114c = parcel.readString();
        this.f6115d = parcel.readInt();
        this.f6116e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6115d == aVar.f6115d && D.a(this.f6113b, aVar.f6113b) && D.a(this.f6114c, aVar.f6114c) && Arrays.equals(this.f6116e, aVar.f6116e);
    }

    public final int hashCode() {
        int i7 = (527 + this.f6115d) * 31;
        String str = this.f6113b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6114c;
        return Arrays.hashCode(this.f6116e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        c1560b0.a(this.f6115d, this.f6116e);
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": mimeType=" + this.f6113b + ", description=" + this.f6114c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6113b);
        parcel.writeString(this.f6114c);
        parcel.writeInt(this.f6115d);
        parcel.writeByteArray(this.f6116e);
    }
}
