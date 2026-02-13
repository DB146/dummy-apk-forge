package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import h3.o;
import java.util.Arrays;
import ma.C1654e;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2142a extends G5.a {
    public static final Parcelable.Creator<C2142a> CREATOR = new C1654e(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f25062a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25063b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25066e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25067f;

    public C2142a(int i7, long j, String str, int i10, int i11, String str2) {
        this.f25062a = i7;
        this.f25063b = j;
        G.g(str);
        this.f25064c = str;
        this.f25065d = i10;
        this.f25066e = i11;
        this.f25067f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2142a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2142a c2142a = (C2142a) obj;
        return this.f25062a == c2142a.f25062a && this.f25063b == c2142a.f25063b && G.k(this.f25064c, c2142a.f25064c) && this.f25065d == c2142a.f25065d && this.f25066e == c2142a.f25066e && G.k(this.f25067f, c2142a.f25067f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25062a), Long.valueOf(this.f25063b), this.f25064c, Integer.valueOf(this.f25065d), Integer.valueOf(this.f25066e), this.f25067f});
    }

    public final String toString() {
        int i7 = this.f25065d;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb2 = new StringBuilder("AccountChangeEvent {accountName = ");
        o.v(sb2, this.f25064c, ", changeType = ", str, ", changeData = ");
        sb2.append(this.f25067f);
        sb2.append(", eventIndex = ");
        return A3.c.k(sb2, this.f25066e, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f25062a);
        com.bumptech.glide.d.O(parcel, 2, 8);
        parcel.writeLong(this.f25063b);
        com.bumptech.glide.d.H(parcel, 3, this.f25064c, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f25065d);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f25066e);
        com.bumptech.glide.d.H(parcel, 6, this.f25067f, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
