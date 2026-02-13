package p4;

import android.os.Parcel;
import android.os.Parcelable;
import c2.q;
import ma.C1654e;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1848a implements F4.b {
    public static final Parcelable.Creator<C1848a> CREATOR = new C1654e(17);

    /* renamed from: a, reason: collision with root package name */
    public final long f23045a;

    public C1848a(long j) {
        this.f23045a = j;
    }

    public C1848a(Parcel parcel) {
        this.f23045a = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1848a) {
            return this.f23045a == ((C1848a) obj).f23045a;
        }
        return false;
    }

    public final int hashCode() {
        return q.m(this.f23045a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Creation time: ");
        long j = this.f23045a;
        sb2.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f23045a);
    }
}
