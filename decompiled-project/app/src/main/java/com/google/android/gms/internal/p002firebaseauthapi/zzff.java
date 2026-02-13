package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import h3.o;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzff {
    private static final zzaae zza;
    private static final zzpk<zzfe, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzfc, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzqd zzb3;
                zzb3 = zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzff.zzb(r1).a_()).zza(zzff.zza(((zzfe) zzceVar).zzc())).zze()));
                return zzb3;
            }
        }, zzfe.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                zzfe zzb3;
                zzb3 = zzff.zzb((zzqd) zzqiVar);
                return zzb3;
            }
        }, zzb2, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzqe zza2;
                zza2 = zzqe.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzxo) ((zzaky) zzxo.zzb().zza(zzff.zzb((zzfe) ((zzcx) r1.zza()))).zze())).a_(), zzws.zza.REMOTE, zzff.zza(((zzfe) ((zzcx) r1.zza())).zzc()), ((zzfc) zzbmVar).zzb());
                return zza2;
            }
        }, zzfc.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                zzfc zzb3;
                zzb3 = zzff.zzb((zzqe) zzqiVar, zzckVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
    }

    private static zzfe zza(zzxr zzxrVar, zzxu zzxuVar) {
        zzfe.zzc zzcVar;
        zzfe.zzb zzbVar;
        zzce zza2 = zzcm.zza(((zzww) ((zzaky) zzww.zza().zza(zzxrVar.zza().zzf()).zza(zzxrVar.zza().zze()).zza(zzxu.RAW).zze())).zzk());
        if (zza2 instanceof zzdz) {
            zzcVar = zzfe.zzc.zza;
        } else if (zza2 instanceof zzem) {
            zzcVar = zzfe.zzc.zzc;
        } else if (zza2 instanceof zzgg) {
            zzcVar = zzfe.zzc.zzb;
        } else if (zza2 instanceof zzdk) {
            zzcVar = zzfe.zzc.zzd;
        } else if (zza2 instanceof zzdq) {
            zzcVar = zzfe.zzc.zze;
        } else {
            if (!(zza2 instanceof zzeg)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(zza2)));
            }
            zzcVar = zzfe.zzc.zzf;
        }
        zzfe.zza zzaVar = new zzfe.zza();
        int i7 = zzfm.zza[zzxuVar.ordinal()];
        if (i7 == 1) {
            zzbVar = zzfe.zzb.zza;
        } else {
            if (i7 != 2) {
                throw new GeneralSecurityException(o.l(zzxuVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzbVar = zzfe.zzb.zzb;
        }
        return zzaVar.zza(zzbVar).zza(zzxrVar.zze()).zza((zzcx) zza2).zza(zzcVar).zza();
    }

    private static zzxu zza(zzfe.zzb zzbVar) {
        if (zzfe.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzfe.zzb.zzb.equals(zzbVar)) {
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
    public static zzfc zzb(zzqe zzqeVar, zzck zzckVar) {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzxo zza2 = zzxo.zza(zzqeVar.zzd(), zzakk.zza());
            if (zza2.zza() == 0) {
                return zzfc.zza(zza(zza2.zzd(), zzqeVar.zzc()), zzqeVar.zze());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zza2)));
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfe zzb(zzqd zzqdVar) {
        if (!zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException(c.t("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", zzqdVar.zza().zzf()));
        }
        try {
            return zza(zzxr.zza(zzqdVar.zza().zze(), zzakk.zza()), zzqdVar.zza().zzd());
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    private static zzxr zzb(zzfe zzfeVar) {
        try {
            return (zzxr) ((zzaky) zzxr.zzb().zza(zzfeVar.zzd()).zza(zzww.zza(zzcm.zza(zzfeVar.zzb()), zzakk.zza())).zze());
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }
}
