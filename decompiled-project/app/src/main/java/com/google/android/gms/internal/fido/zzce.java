package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        this.zza = new char[512];
        zzap.zzc(zzcd.zzd(zzcdVar).length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = zzcdVar.zza(i7 >>> 4);
            this.zza[i7 | 256] = zzcdVar.zza(i7 & 15);
        }
    }

    public zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        zzap.zze(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            appendable.append(this.zza[i12]);
            appendable.append(this.zza[i12 | 256]);
        }
    }
}
