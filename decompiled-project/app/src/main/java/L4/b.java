package L4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import c2.q;

/* loaded from: classes.dex */
public final class b implements F4.b {
    public static final Parcelable.Creator<b> CREATOR = new l(11);

    /* renamed from: a, reason: collision with root package name */
    public final long f6292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6293b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6294c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6295d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6296e;

    public b(long j, long j10, long j11, long j12, long j13) {
        this.f6292a = j;
        this.f6293b = j10;
        this.f6294c = j11;
        this.f6295d = j12;
        this.f6296e = j13;
    }

    public b(Parcel parcel) {
        this.f6292a = parcel.readLong();
        this.f6293b = parcel.readLong();
        this.f6294c = parcel.readLong();
        this.f6295d = parcel.readLong();
        this.f6296e = parcel.readLong();
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
        return this.f6292a == bVar.f6292a && this.f6293b == bVar.f6293b && this.f6294c == bVar.f6294c && this.f6295d == bVar.f6295d && this.f6296e == bVar.f6296e;
    }

    public final int hashCode() {
        return q.m(this.f6296e) + ((q.m(this.f6295d) + ((q.m(this.f6294c) + ((q.m(this.f6293b) + ((q.m(this.f6292a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f6292a + ", photoSize=" + this.f6293b + ", photoPresentationTimestampUs=" + this.f6294c + ", videoStartPosition=" + this.f6295d + ", videoSize=" + this.f6296e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6292a);
        parcel.writeLong(this.f6293b);
        parcel.writeLong(this.f6294c);
        parcel.writeLong(this.f6295d);
        parcel.writeLong(this.f6296e);
    }
}
