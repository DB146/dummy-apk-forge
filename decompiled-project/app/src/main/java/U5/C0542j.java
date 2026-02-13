package U5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: U5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542j extends AbstractC0544l {
    public static final Parcelable.Creator<C0542j> CREATOR = new T(24);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9767a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9768b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9769c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f9770d;

    public C0542j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9767a = bArr;
        com.google.android.gms.common.internal.G.g(bArr2);
        this.f9768b = bArr2;
        com.google.android.gms.common.internal.G.g(bArr3);
        this.f9769c = bArr3;
        com.google.android.gms.common.internal.G.g(strArr);
        this.f9770d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0542j)) {
            return false;
        }
        C0542j c0542j = (C0542j) obj;
        return Arrays.equals(this.f9767a, c0542j.f9767a) && Arrays.equals(this.f9768b, c0542j.f9768b) && Arrays.equals(this.f9769c, c0542j.f9769c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9767a)), Integer.valueOf(Arrays.hashCode(this.f9768b)), Integer.valueOf(Arrays.hashCode(this.f9769c))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f9767a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f9768b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f9769c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f9770d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.A(parcel, 2, this.f9767a, false);
        com.bumptech.glide.d.A(parcel, 3, this.f9768b, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9769c, false);
        com.bumptech.glide.d.I(parcel, 5, this.f9770d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
