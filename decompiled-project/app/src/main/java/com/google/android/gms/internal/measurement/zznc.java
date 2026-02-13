package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zznc implements zznx {
    private static final zznj zzb = new zzna();
    private final zznj zza;

    public zznc() {
        zzlz zza = zzlz.zza();
        int i7 = zznt.zza;
        zznb zznbVar = new zznb(zza, zzb);
        byte[] bArr = zzmo.zzb;
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final zznw zza(Class cls) {
        int i7 = zzny.zza;
        if (!zzme.class.isAssignableFrom(cls)) {
            int i10 = zznt.zza;
        }
        zzni zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i11 = zznt.zza;
            return zznp.zzg(zzny.zzA(), zzlt.zza(), zzc.zzb());
        }
        int i12 = zznt.zza;
        return zzno.zzl(cls, zzc, zznr.zza(), zzmy.zza(), zzny.zzA(), zzc.zzc() + (-1) != 1 ? zzlt.zza() : null, zznh.zza());
    }
}
