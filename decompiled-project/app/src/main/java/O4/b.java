package O4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import m4.InterfaceC1569g;
import n5.D;

/* loaded from: classes.dex */
public final class b implements Comparable, Parcelable, InterfaceC1569g {
    public static final Parcelable.Creator<b> CREATOR = new l(23);

    /* renamed from: d, reason: collision with root package name */
    public static final String f7469d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f7470e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f7471f;

    /* renamed from: a, reason: collision with root package name */
    public final int f7472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7474c;

    static {
        int i7 = D.f21141a;
        f7469d = Integer.toString(0, 36);
        f7470e = Integer.toString(1, 36);
        f7471f = Integer.toString(2, 36);
    }

    public b(int i7, int i10, int i11) {
        this.f7472a = i7;
        this.f7473b = i10;
        this.f7474c = i11;
    }

    public b(Parcel parcel) {
        this.f7472a = parcel.readInt();
        this.f7473b = parcel.readInt();
        this.f7474c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i7 = this.f7472a - bVar.f7472a;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f7473b - bVar.f7473b;
        return i10 == 0 ? this.f7474c - bVar.f7474c : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7472a == bVar.f7472a && this.f7473b == bVar.f7473b && this.f7474c == bVar.f7474c;
    }

    public final int hashCode() {
        return (((this.f7472a * 31) + this.f7473b) * 31) + this.f7474c;
    }

    public final String toString() {
        return this.f7472a + "." + this.f7473b + "." + this.f7474c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7472a);
        parcel.writeInt(this.f7473b);
        parcel.writeInt(this.f7474c);
    }
}
