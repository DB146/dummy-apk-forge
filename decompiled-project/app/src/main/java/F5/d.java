package F5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends G5.a {
    public static final Parcelable.Creator<d> CREATOR = new B5.c(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f4094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4096c;

    public d(int i7, long j, String str) {
        this.f4094a = str;
        this.f4095b = i7;
        this.f4096c = j;
    }

    public d(String str, long j) {
        this.f4094a = str;
        this.f4096c = j;
        this.f4095b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f4094a;
            if (((str != null && str.equals(dVar.f4094a)) || (str == null && dVar.f4094a == null)) && t() == dVar.t()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4094a, Long.valueOf(t())});
    }

    public final long t() {
        long j = this.f4096c;
        return j == -1 ? this.f4095b : j;
    }

    public final String toString() {
        q3.s sVar = new q3.s(this);
        sVar.f(this.f4094a, "name");
        sVar.f(Long.valueOf(t()), "version");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f4094a, false);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f4095b);
        long t5 = t();
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(t5);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
