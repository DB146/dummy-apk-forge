package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import m4.AbstractC1571h;
import ma.C1654e;

/* renamed from: r4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935g implements Parcelable {
    public static final Parcelable.Creator<C1935g> CREATOR = new C1654e(22);

    /* renamed from: a, reason: collision with root package name */
    public int f23756a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f23757b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23758c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23759d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f23760e;

    public C1935g(Parcel parcel) {
        this.f23757b = new UUID(parcel.readLong(), parcel.readLong());
        this.f23758c = parcel.readString();
        String readString = parcel.readString();
        int i7 = n5.D.f21141a;
        this.f23759d = readString;
        this.f23760e = parcel.createByteArray();
    }

    public C1935g(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f23757b = uuid;
        this.f23758c = str;
        str2.getClass();
        this.f23759d = str2;
        this.f23760e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC1571h.f20382a;
        UUID uuid3 = this.f23757b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1935g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1935g c1935g = (C1935g) obj;
        return n5.D.a(this.f23758c, c1935g.f23758c) && n5.D.a(this.f23759d, c1935g.f23759d) && n5.D.a(this.f23757b, c1935g.f23757b) && Arrays.equals(this.f23760e, c1935g.f23760e);
    }

    public final int hashCode() {
        if (this.f23756a == 0) {
            int hashCode = this.f23757b.hashCode() * 31;
            String str = this.f23758c;
            this.f23756a = Arrays.hashCode(this.f23760e) + A3.c.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f23759d);
        }
        return this.f23756a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f23757b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f23758c);
        parcel.writeString(this.f23759d);
        parcel.writeByteArray(this.f23760e);
    }
}
