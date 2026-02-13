package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadl extends zzado {
    private final int zzc;
    private final int zzd;

    public zzadl(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzadr.zzp(i7, i7 + i10, bArr.length);
        this.zzc = i7;
        this.zzd = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zza(int i7) {
        zzadr.zzv(i7, this.zzd);
        return this.zza[this.zzc + i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zzb(int i7) {
        return this.zza[this.zzc + i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzado, com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, this.zzc + i7, bArr, i10, i11);
    }
}
