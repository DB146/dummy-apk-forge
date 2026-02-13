package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzkk {
    private static final zzaae zza;
    private static final zzaae zzb;
    private static final zzpk<zzki, zzqd> zzc;
    private static final zzpg<zzqd> zzd;
    private static final zznw<zzkt, zzqe> zze;
    private static final zzns<zzqe> zzf;
    private static final zznw<zzkl, zzqe> zzg;
    private static final zzns<zzqe> zzh;
    private static final zznk<zzxu, zzki.zzf> zzi;
    private static final zznk<zzwd, zzki.zzd> zzj;
    private static final zznk<zzwe, zzki.zze> zzk;
    private static final zznk<zzwb, zzki.zza> zzl;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzaae zzb3 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzqd zzb4;
                zzb4 = zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzwg) ((zzaky) zzwg.zza().zza(zzkk.zzb(r1)).zze())).a_()).zza(zzkk.zzi.zza((zznk<zzxu, zzki.zzf>) ((zzki) zzceVar).zzf())).zze()));
                return zzb4;
            }
        }, zzki.class, zzqd.class);
        zzd = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                zzki zzb4;
                zzb4 = zzkk.zzb((zzqd) zzqiVar);
                return zzb4;
            }
        }, zzb2, zzqd.class);
        zze = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzqe zza2;
                zza2 = zzqe.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzkk.zza(r1).a_(), zzws.zza.ASYMMETRIC_PUBLIC, zzkk.zzi.zza((zznk<zzxu, zzki.zzf>) ((zzki) ((zzlj) r1.zza())).zzf()), ((zzkt) zzbmVar).zzb());
                return zza2;
            }
        }, zzkt.class, zzqe.class);
        zzf = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzko
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                zzkt zzd2;
                zzd2 = zzkk.zzd((zzqe) zzqiVar, zzckVar);
                return zzd2;
            }
        }, zzb3, zzqe.class);
        zzg = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzqe zza2;
                zza2 = zzqe.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzwm) ((zzaky) zzwm.zzb().zza(0).zza(zzkk.zza((zzkt) ((zzll) r1.zzc()))).zza(zzajp.zza(r1.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.ASYMMETRIC_PRIVATE, zzkk.zzi.zza((zznk<zzxu, zzki.zzf>) ((zzki) ((zzlj) r1.zza())).zzf()), ((zzkl) zzbmVar).zzb());
                return zza2;
            }
        }, zzkl.class, zzqe.class);
        zzh = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                zzkl zzc2;
                zzc2 = zzkk.zzc((zzqe) zzqiVar, zzckVar);
                return zzc2;
            }
        }, zzb2, zzqe.class);
        zznn zza2 = zznk.zza().zza(zzxu.RAW, zzki.zzf.zzc).zza(zzxu.TINK, zzki.zzf.zza);
        zzxu zzxuVar = zzxu.LEGACY;
        zzki.zzf zzfVar = zzki.zzf.zzb;
        zzi = zza2.zza(zzxuVar, zzfVar).zza(zzxu.CRUNCHY, zzfVar).zza();
        zzj = zznk.zza().zza(zzwd.DHKEM_P256_HKDF_SHA256, zzki.zzd.zza).zza(zzwd.DHKEM_P384_HKDF_SHA384, zzki.zzd.zzb).zza(zzwd.DHKEM_P521_HKDF_SHA512, zzki.zzd.zzc).zza(zzwd.DHKEM_X25519_HKDF_SHA256, zzki.zzd.zzd).zza();
        zzk = zznk.zza().zza(zzwe.HKDF_SHA256, zzki.zze.zza).zza(zzwe.HKDF_SHA384, zzki.zze.zzb).zza(zzwe.HKDF_SHA512, zzki.zze.zzc).zza();
        zzl = zznk.zza().zza(zzwb.AES_128_GCM, zzki.zza.zza).zza(zzwb.AES_256_GCM, zzki.zza.zzb).zza(zzwb.CHACHA20_POLY1305, zzki.zza.zzc).zza();
    }

    private static zzaae zza(zzki.zzd zzdVar, byte[] bArr) {
        return zzaae.zza(zznh.zza(zznh.zza(bArr), zzmn.zzb(zzdVar)));
    }

    private static zzki zza(zzxu zzxuVar, zzwj zzwjVar) {
        return zzki.zzc().zza(zzi.zza((zznk<zzxu, zzki.zzf>) zzxuVar)).zza(zzj.zza((zznk<zzwd, zzki.zzd>) zzwjVar.zzc())).zza(zzk.zza((zznk<zzwe, zzki.zze>) zzwjVar.zzb())).zza(zzl.zza((zznk<zzwb, zzki.zza>) zzwjVar.zza())).zza();
    }

    private static zzwp zza(zzkt zzktVar) {
        return (zzwp) ((zzaky) zzwp.zzc().zza(0).zza(zzb((zzki) ((zzlj) zzktVar.zza()))).zza(zzajp.zza(zzktVar.zze().zzb())).zze());
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzki zzb(zzqd zzqdVar) {
        if (!zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", zzqdVar.zza().zzf()));
        }
        try {
            return zza(zzqdVar.zza().zzd(), zzwg.zza(zzqdVar.zza().zze(), zzakk.zza()).zzc());
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
        }
    }

    private static zzwj zzb(zzki zzkiVar) {
        return (zzwj) ((zzaky) zzwj.zzd().zza(zzj.zza((zznk<zzwd, zzki.zzd>) zzkiVar.zze())).zza(zzk.zza((zznk<zzwe, zzki.zze>) zzkiVar.zzd())).zza(zzl.zza((zznk<zzwb, zzki.zza>) zzkiVar.zzb())).zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkl zzc(zzqe zzqeVar, zzck zzckVar) {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", zzqeVar.zzf()));
        }
        try {
            zzwm zza2 = zzwm.zza(zzqeVar.zzd(), zzakk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzwp zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzki zza3 = zza(zzqeVar.zzc(), zzd2.zzb());
            return zzkl.zza(zzkt.zza(zza3, zza(zza3.zze(), zzd2.zzf().zzd()), zzqeVar.zze()), zzaaf.zza(zznh.zza(zznh.zza(zza2.zze().zzd()), zzmn.zza(zza3.zze())), zzck.zza(zzckVar)));
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkt zzd(zzqe zzqeVar, zzck zzckVar) {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", zzqeVar.zzf()));
        }
        try {
            zzwp zza2 = zzwp.zza(zzqeVar.zzd(), zzakk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzki zza3 = zza(zzqeVar.zzc(), zza2.zzb());
            return zzkt.zza(zza3, zza(zza3.zze(), zza2.zzf().zzd()), zzqeVar.zze());
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }
}
