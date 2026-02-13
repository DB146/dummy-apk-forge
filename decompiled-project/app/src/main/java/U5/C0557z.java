package U5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: U5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557z extends G5.a {
    public static final Parcelable.Creator<C0557z> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final E f9810a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9811b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9812c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
        CREATOR = new T(4);
    }

    public C0557z(String str, byte[] bArr, ArrayList arrayList) {
        com.google.android.gms.common.internal.G.g(str);
        try {
            this.f9810a = E.a(str);
            com.google.android.gms.common.internal.G.g(bArr);
            this.f9811b = bArr;
            this.f9812c = arrayList;
        } catch (D e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0557z)) {
            return false;
        }
        C0557z c0557z = (C0557z) obj;
        if (!this.f9810a.equals(c0557z.f9810a) || !Arrays.equals(this.f9811b, c0557z.f9811b)) {
            return false;
        }
        ArrayList arrayList = this.f9812c;
        ArrayList arrayList2 = c0557z.f9812c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9810a, Integer.valueOf(Arrays.hashCode(this.f9811b)), this.f9812c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        this.f9810a.getClass();
        com.bumptech.glide.d.H(parcel, 2, "public-key", false);
        com.bumptech.glide.d.A(parcel, 3, this.f9811b, false);
        com.bumptech.glide.d.L(parcel, 4, this.f9812c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
