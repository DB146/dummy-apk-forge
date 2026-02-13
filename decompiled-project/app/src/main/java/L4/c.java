package L4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new l(13);

    /* renamed from: a, reason: collision with root package name */
    public final long f6297a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6299c;

    public c(int i7, long j, long j10) {
        AbstractC1705a.h(j < j10);
        this.f6297a = j;
        this.f6298b = j10;
        this.f6299c = i7;
    }

    @Override // android.os.Parcelable
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
        return this.f6297a == cVar.f6297a && this.f6298b == cVar.f6298b && this.f6299c == cVar.f6299c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6297a), Long.valueOf(this.f6298b), Integer.valueOf(this.f6299c)});
    }

    public final String toString() {
        int i7 = D.f21141a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f6297a + ", endTimeMs=" + this.f6298b + ", speedDivisor=" + this.f6299c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6297a);
        parcel.writeLong(this.f6298b);
        parcel.writeInt(this.f6299c);
    }
}
