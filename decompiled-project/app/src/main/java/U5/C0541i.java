package U5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* renamed from: U5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541i extends AbstractC0544l {
    public static final Parcelable.Creator<C0541i> CREATOR = new T(23);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9762a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9763b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9764c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9765d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9766e;

    public C0541i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9762a = bArr;
        com.google.android.gms.common.internal.G.g(bArr2);
        this.f9763b = bArr2;
        com.google.android.gms.common.internal.G.g(bArr3);
        this.f9764c = bArr3;
        com.google.android.gms.common.internal.G.g(bArr4);
        this.f9765d = bArr4;
        this.f9766e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0541i)) {
            return false;
        }
        C0541i c0541i = (C0541i) obj;
        return Arrays.equals(this.f9762a, c0541i.f9762a) && Arrays.equals(this.f9763b, c0541i.f9763b) && Arrays.equals(this.f9764c, c0541i.f9764c) && Arrays.equals(this.f9765d, c0541i.f9765d) && Arrays.equals(this.f9766e, c0541i.f9766e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9762a)), Integer.valueOf(Arrays.hashCode(this.f9763b)), Integer.valueOf(Arrays.hashCode(this.f9764c)), Integer.valueOf(Arrays.hashCode(this.f9765d)), Integer.valueOf(Arrays.hashCode(this.f9766e))});
    }

    public final String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f9762a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f9763b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f9764c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f9765d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f9766e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.A(parcel, 2, this.f9762a, false);
        com.bumptech.glide.d.A(parcel, 3, this.f9763b, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9764c, false);
        com.bumptech.glide.d.A(parcel, 5, this.f9765d, false);
        com.bumptech.glide.d.A(parcel, 6, this.f9766e, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
