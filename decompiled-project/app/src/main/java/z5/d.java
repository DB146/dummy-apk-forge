package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import java.util.Objects;
import y5.C2392e;

/* loaded from: classes.dex */
public final class d extends G5.a {
    public static final Parcelable.Creator<d> CREATOR = new C2392e(12);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28290a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28291b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28292c;

    public d(byte[] bArr, String str, boolean z8) {
        if (z8) {
            G.g(bArr);
            G.g(str);
        }
        this.f28290a = z8;
        this.f28291b = bArr;
        this.f28292c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f28290a == dVar.f28290a && Arrays.equals(this.f28291b, dVar.f28291b) && Objects.equals(this.f28292c, dVar.f28292c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28291b) + (Objects.hash(Boolean.valueOf(this.f28290a), this.f28292c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f28290a ? 1 : 0);
        com.bumptech.glide.d.A(parcel, 2, this.f28291b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28292c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
