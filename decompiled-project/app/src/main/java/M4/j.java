package M4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import n5.v;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new l(19);

    /* renamed from: a, reason: collision with root package name */
    public final long f6778a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6779b;

    public j(long j, long j10) {
        this.f6778a = j;
        this.f6779b = j10;
    }

    public static long a(long j, v vVar) {
        long v10 = vVar.v();
        if ((128 & v10) != 0) {
            return 8589934591L & ((((v10 & 1) << 32) | vVar.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // M4.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f6778a);
        sb2.append(", playbackPositionUs= ");
        return X.c.f(this.f6779b, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6778a);
        parcel.writeLong(this.f6779b);
    }
}
