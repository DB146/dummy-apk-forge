package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzlo extends zzpa {
    public zzlo() {
        super(zzrv.class, new zzlm(zzjt.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i7, int i10, int i11, int i12, int i13, int i14) {
        zzsd zzc = zzse.zzc();
        zzsg zzc2 = zzsh.zzc();
        zzc2.zza(16);
        zzc.zzb((zzsh) zzc2.zzan());
        zzc.zza(i7);
        zzse zzseVar = (zzse) zzc.zzan();
        zzur zzc3 = zzus.zzc();
        zzuu zzc4 = zzuv.zzc();
        zzc4.zzb(5);
        zzc4.zza(i12);
        zzc3.zzb((zzuv) zzc4.zzan());
        zzc3.zza(32);
        zzus zzusVar = (zzus) zzc3.zzan();
        zzrx zza = zzry.zza();
        zza.zza(zzseVar);
        zza.zzb(zzusVar);
        return new zzoy((zzry) zza.zzan(), i14);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzln(this, zzry.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzrv.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzrv zzrvVar = (zzrv) zzaefVar;
        zzys.zzb(zzrvVar.zza(), 0);
        new zzlr();
        zzlr.zzh(zzrvVar.zzf());
        new zzqr();
        zzqr.zzh(zzrvVar.zzg());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int zzf() {
        return 2;
    }
}
