package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch) {
        super(zzcdVar, ch);
        zzap.zzc(zzcdVar.zzf.length == 64);
    }

    public zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcf(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        int i11 = 0;
        zzap.zze(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.zzb.zza(i14 >>> 18));
            appendable.append(this.zzb.zza((i14 >>> 12) & 63));
            appendable.append(this.zzb.zza((i14 >>> 6) & 63));
            appendable.append(this.zzb.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zze(appendable, bArr, i11, i10 - i11);
        }
    }
}
