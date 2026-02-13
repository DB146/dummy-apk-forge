package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zznu implements zzxr {
    private final String zza;
    private final int zzb;
    private zzst zzc;
    private zzrv zzd;
    private int zze;
    private zztf zzf;

    public zznu(zzvt zzvtVar) {
        String zzf = zzvtVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzli.zzb)) {
            try {
                zzsw zze = zzsw.zze(zzvtVar.zze(), zzacm.zza());
                this.zzc = (zzst) zzlf.zzd(zzvtVar);
                this.zzb = zze.zza();
                return;
            } catch (zzadi e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (zzf.equals(zzli.zza)) {
            try {
                zzry zzd = zzry.zzd(zzvtVar.zze(), zzacm.zza());
                this.zzd = (zzrv) zzlf.zzd(zzvtVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
                return;
            } catch (zzadi e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
            }
        }
        if (!zzf.equals(zznf.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
        try {
            zzti zze2 = zzti.zze(zzvtVar.zze(), zzacm.zza());
            this.zzf = (zztf) zzlf.zzd(zzvtVar);
            this.zzb = zze2.zza();
        } catch (zzadi e11) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzxr
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzxr
    public final zzoq zzb(byte[] bArr) {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzli.zzb)) {
            zzss zzc = zzst.zzc();
            zzc.zzal(this.zzc);
            zzc.zza(zzaby.zzo(bArr, 0, this.zzb));
            return new zzoq((zzjt) zzlf.zzh(this.zza, (zzst) zzc.zzan(), zzjt.class));
        }
        if (!this.zza.equals(zzli.zza)) {
            if (!this.zza.equals(zznf.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzte zzc2 = zztf.zzc();
            zzc2.zzal(this.zzf);
            zzc2.zza(zzaby.zzo(bArr, 0, this.zzb));
            return new zzoq((zzjw) zzlf.zzh(this.zza, (zztf) zzc2.zzan(), zzjw.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzsa zzc3 = zzsb.zzc();
        zzc3.zzal(this.zzd.zzf());
        zzc3.zza(zzaby.zzn(copyOfRange));
        zzsb zzsbVar = (zzsb) zzc3.zzan();
        zzuo zzc4 = zzup.zzc();
        zzc4.zzal(this.zzd.zzg());
        zzc4.zza(zzaby.zzn(copyOfRange2));
        zzup zzupVar = (zzup) zzc4.zzan();
        zzru zzc5 = zzrv.zzc();
        zzc5.zzc(this.zzd.zza());
        zzc5.zza(zzsbVar);
        zzc5.zzb(zzupVar);
        return new zzoq((zzjt) zzlf.zzh(this.zza, (zzrv) zzc5.zzan(), zzjt.class));
    }
}
