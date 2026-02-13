package com.google.android.gms.internal.pal;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
final class zzom implements zzoc {
    private final zznx zza;
    private final int zzb;

    private zzom(zznx zznxVar, int i7) {
        this.zza = zznxVar;
        this.zzb = i7;
    }

    public static zzom zzc(int i7) {
        int i10 = i7 - 1;
        return i10 != 0 ? i10 != 1 ? new zzom(new zznx("HmacSha512"), 3) : new zzom(new zznx("HmacSha384"), 2) : new zzom(new zznx("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final zzod zza(byte[] bArr) {
        KeyPair zzc = zzxx.zzc(zzxx.zzk(this.zzb));
        byte[] zzg = zzxx.zzg((ECPrivateKey) zzc.getPrivate(), zzxx.zzj(zzxx.zzk(this.zzb), 1, bArr));
        int i7 = this.zzb;
        byte[] zzl = zzxx.zzl(zzxx.zzk(i7).getCurve(), 1, ((ECPublicKey) zzc.getPublic()).getW());
        byte[] zzc2 = zzxo.zzc(zzl, bArr);
        byte[] zzd = zzol.zzd(zzb());
        zznx zznxVar = this.zza;
        return new zzod(zznxVar.zzb(null, zzg, "eae_prk", zzc2, "shared_secret", zzd, zznxVar.zza()), zzl);
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final byte[] zzb() {
        int i7 = this.zzb - 1;
        return i7 != 0 ? i7 != 1 ? zzol.zze : zzol.zzd : zzol.zzc;
    }
}
