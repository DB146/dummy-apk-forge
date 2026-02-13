package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import h3.o;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzry {
    private static final zzaae zza;
    private static final zzpk<zzqw, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzqp, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzqd zzb3;
                zzb3 = zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsu) ((zzaky) zzsu.zzb().zza(zzry.zzb(r1)).zza(r1.zzc()).zze())).a_()).zza(zzry.zza(((zzqw) zzceVar).zze())).zze()));
                return zzb3;
            }
        }, zzqw.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                zzqw zzb3;
                zzb3 = zzry.zzb((zzqd) zzqiVar);
                return zzb3;
            }
        }, zzb2, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzqe zza2;
                zza2 = zzqe.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsr) ((zzaky) zzsr.zzb().zza(zzry.zzb((zzqw) ((zzrm) r1.zza()))).zza(zzajp.zza(r1.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzry.zza(((zzqw) ((zzrm) r1.zza())).zze()), ((zzqp) zzbmVar).zzb());
                return zza2;
            }
        }, zzqp.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                zzqp zzb3;
                zzb3 = zzry.zzb((zzqe) zzqiVar, zzckVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
    }

    private static zzqw.zzb zza(zzxu zzxuVar) {
        int i7 = zzsf.zza[zzxuVar.ordinal()];
        if (i7 == 1) {
            return zzqw.zzb.zza;
        }
        if (i7 == 2) {
            return zzqw.zzb.zzb;
        }
        if (i7 == 3) {
            return zzqw.zzb.zzc;
        }
        if (i7 == 4) {
            return zzqw.zzb.zzd;
        }
        throw new GeneralSecurityException(o.l(zzxuVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzxu zza(zzqw.zzb zzbVar) {
        if (zzqw.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzqw.zzb.zzb.equals(zzbVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzqw.zzb.zzd.equals(zzbVar)) {
            return zzxu.RAW;
        }
        if (zzqw.zzb.zzc.equals(zzbVar)) {
            return zzxu.LEGACY;
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
    public static zzqp zzb(zzqe zzqeVar, zzck zzckVar) {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsr zza2 = zzsr.zza(zzqeVar.zzd(), zzakk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqp.zzc().zza(zzqw.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zza2.zze().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqw zzb(zzqd zzqdVar) {
        if (!zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzqdVar.zza().zzf()));
        }
        try {
            zzsu zza2 = zzsu.zza(zzqdVar.zza().zze(), zzakk.zza());
            return zzqw.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzqdVar.zza().zzd())).zza();
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
        }
    }

    private static zzsx zzb(zzqw zzqwVar) {
        return (zzsx) ((zzaky) zzsx.zzb().zza(zzqwVar.zzb()).zze());
    }
}
