package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import h3.o;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgw {
    private static final zzaae zza;
    private static final zzpk<zzdz, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzds, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                return zzgw.zza((zzdz) zzceVar);
            }
        }, zzdz.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                zzdz zzb3;
                zzb3 = zzgw.zzb((zzqd) zzqiVar);
                return zzb3;
            }
        }, zzb2, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                return zzgw.zza((zzds) zzbmVar, zzckVar);
            }
        }, zzds.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                zzds zzb3;
                zzb3 = zzgw.zzb((zzqe) zzqiVar, zzckVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
    }

    private static zzdz.zzb zza(zzxu zzxuVar) {
        int i7 = zzgz.zza[zzxuVar.ordinal()];
        if (i7 == 1) {
            return zzdz.zzb.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdz.zzb.zzb;
        }
        if (i7 == 4) {
            return zzdz.zzb.zzc;
        }
        throw new GeneralSecurityException(o.l(zzxuVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static /* synthetic */ zzqd zza(zzdz zzdzVar) {
        zzb(zzdzVar);
        return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzub) ((zzaky) zzub.zzc().zza(zzdzVar.zzc()).zze())).a_()).zza(zza(zzdzVar.zzf())).zze()));
    }

    public static /* synthetic */ zzqe zza(zzds zzdsVar, zzck zzckVar) {
        zzb((zzdz) ((zzcx) zzdsVar.zza()));
        return zzqe.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzty) ((zzaky) zzty.zzb().zza(zzajp.zza(zzdsVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zza(((zzdz) ((zzcx) zzdsVar.zza())).zzf()), zzdsVar.zzb());
    }

    private static zzxu zza(zzdz.zzb zzbVar) {
        if (zzdz.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzdz.zzb.zzb.equals(zzbVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzdz.zzb.zzc.equals(zzbVar)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzds zzb(zzqe zzqeVar, zzck zzckVar) {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzty zza2 = zzty.zza(zzqeVar.zzd(), zzakk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzds.zze().zza(zzdz.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdz zzb(zzqd zzqdVar) {
        if (!zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzqdVar.zza().zzf()));
        }
        try {
            zzub zza2 = zzub.zza(zzqdVar.zza().zze(), zzakk.zza());
            if (zza2.zzb() == 0) {
                return zzdz.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzqdVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    private static void zzb(zzdz zzdzVar) {
        if (zzdzVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdzVar.zzd())));
        }
        if (zzdzVar.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdzVar.zzb())));
        }
    }
}
