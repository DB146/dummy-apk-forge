package V5;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends G5.a {
    public static final Parcelable.Creator<d> CREATOR = new a0(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f10177a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10178b;

    /* renamed from: c, reason: collision with root package name */
    public final f f10179c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10180d;

    public d(int i7, String str, ArrayList arrayList, byte[] bArr) {
        this.f10177a = i7;
        this.f10178b = bArr;
        try {
            this.f10179c = f.a(str);
            this.f10180d = arrayList;
        } catch (e e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f10178b, dVar.f10178b) || !this.f10179c.equals(dVar.f10179c)) {
            return false;
        }
        ArrayList arrayList = this.f10180d;
        ArrayList arrayList2 = dVar.f10180d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f10178b)), this.f10179c, this.f10180d});
    }

    public final String toString() {
        ArrayList arrayList = this.f10180d;
        String obj = arrayList == null ? "null" : arrayList.toString();
        byte[] bArr = this.f10178b;
        StringBuilder n6 = X.c.n("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        n6.append(this.f10179c);
        n6.append(", transports: ");
        n6.append(obj);
        n6.append("}");
        return n6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f10177a);
        com.bumptech.glide.d.A(parcel, 2, this.f10178b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f10179c.f10183a, false);
        com.bumptech.glide.d.L(parcel, 4, this.f10180d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
