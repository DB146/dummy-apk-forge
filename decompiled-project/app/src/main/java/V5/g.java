package V5;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends G5.a {
    public static final Parcelable.Creator<g> CREATOR = new a0(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f10184a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10185b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10186c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10187d;

    public g(int i7, String str, String str2, byte[] bArr) {
        this.f10184a = i7;
        try {
            this.f10185b = f.a(str);
            this.f10186c = bArr;
            this.f10187d = str2;
        } catch (e e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Arrays.equals(this.f10186c, gVar.f10186c) || this.f10185b != gVar.f10185b) {
            return false;
        }
        String str = gVar.f10187d;
        String str2 = this.f10187d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f10186c) + 31) * 31) + this.f10185b.hashCode();
        String str = this.f10187d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f10184a);
        com.bumptech.glide.d.H(parcel, 2, this.f10185b.f10183a, false);
        com.bumptech.glide.d.A(parcel, 3, this.f10186c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f10187d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
