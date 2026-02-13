package K4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n5.D;

/* loaded from: classes.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new B5.c(25);

    /* renamed from: b, reason: collision with root package name */
    public final String f6118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6119c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6120d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6121e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6122f;

    /* renamed from: u, reason: collision with root package name */
    public final j[] f6123u;

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f6118b = readString;
        this.f6119c = parcel.readInt();
        this.f6120d = parcel.readInt();
        this.f6121e = parcel.readLong();
        this.f6122f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f6123u = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f6123u[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }

    public c(String str, int i7, int i10, long j, long j10, j[] jVarArr) {
        super("CHAP");
        this.f6118b = str;
        this.f6119c = i7;
        this.f6120d = i10;
        this.f6121e = j;
        this.f6122f = j10;
        this.f6123u = jVarArr;
    }

    @Override // K4.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6119c == cVar.f6119c && this.f6120d == cVar.f6120d && this.f6121e == cVar.f6121e && this.f6122f == cVar.f6122f && D.a(this.f6118b, cVar.f6118b) && Arrays.equals(this.f6123u, cVar.f6123u);
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.f6119c) * 31) + this.f6120d) * 31) + ((int) this.f6121e)) * 31) + ((int) this.f6122f)) * 31;
        String str = this.f6118b;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6118b);
        parcel.writeInt(this.f6119c);
        parcel.writeInt(this.f6120d);
        parcel.writeLong(this.f6121e);
        parcel.writeLong(this.f6122f);
        j[] jVarArr = this.f6123u;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }
}
