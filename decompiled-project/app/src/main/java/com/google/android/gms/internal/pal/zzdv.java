package com.google.android.gms.internal.pal;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdv {
    static zzjy zza;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0031, code lost:
    
        if (r0 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzdu zzduVar) {
        Method zzj;
        zzjy zza2;
        if (zza != null) {
            return true;
        }
        String str = (String) zzfv.zzc().zzb(zzgk.zzcv);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzduVar != null && (zzj = zzduVar.zzj("hwvIMOeohSBrCWT4pVkQok22g/l0cZbbqOTmNbjObWwcwhLlaFMNibQmd2cIB1Vb", "24f7+wNdQe8HQwz0gPH2QIzxUp8iQNA20yBU7Dg74Sc=")) != null) {
                str = (String) zzj.invoke(null, null);
            }
        }
        try {
            zzkm zza3 = zzkr.zza(zzbj.zzb(str, true));
            for (zzvw zzvwVar : zznn.zza.zzd()) {
                if (zzvwVar.zzf().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzvwVar.zze().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzvwVar.zzd().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzvwVar.zzd().equals("TinkAead") && !zzvwVar.zzd().equals("TinkMac") && !zzvwVar.zzd().equals("TinkHybridDecrypt") && !zzvwVar.zzd().equals("TinkHybridEncrypt") && !zzvwVar.zzd().equals("TinkPublicKeySign") && !zzvwVar.zzd().equals("TinkPublicKeyVerify") && !zzvwVar.zzd().equals("TinkStreamingAead") && !zzvwVar.zzd().equals("TinkDeterministicAead")) {
                    zzju zza4 = zzlf.zza(zzvwVar.zzd());
                    zzlf.zzo(zza4.zza());
                    zzvwVar.zzf();
                    zzvwVar.zze();
                    zzvwVar.zza();
                    zzlf.zzm(zza4.zzb(), zzvwVar.zzg());
                }
            }
            zza2 = zznq.zza(zza3);
            zza = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
