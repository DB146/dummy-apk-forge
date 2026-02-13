package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import y.S;

/* loaded from: classes.dex */
public final class zzkg extends zzll {
    private final zzke zza;
    private final ECPoint zzb;
    private final zzaae zzc;
    private final zzaae zzd;
    private final Integer zze;

    private zzkg(zzke zzkeVar, ECPoint eCPoint, zzaae zzaaeVar, zzaae zzaaeVar2, Integer num) {
        this.zza = zzkeVar;
        this.zzb = eCPoint;
        this.zzc = zzaaeVar;
        this.zzd = zzaaeVar2;
        this.zze = num;
    }

    private static zzaae zza(zzke.zze zzeVar, Integer num) {
        if (zzeVar == zzke.zze.zzc) {
            return zzpd.zza;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzeVar)));
        }
        if (zzeVar == zzke.zze.zzb) {
            return zzpd.zza(num.intValue());
        }
        if (zzeVar == zzke.zze.zza) {
            return zzpd.zzb(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzeVar)));
    }

    public static zzkg zza(zzke zzkeVar, zzaae zzaaeVar, Integer num) {
        if (!zzkeVar.zzd().equals(zzke.zza.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzkeVar.zzg(), num);
        if (zzaaeVar.zza() == 32) {
            return new zzkg(zzkeVar, null, zzaaeVar, zza(zzkeVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzkg zza(zzke zzkeVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (zzkeVar.zzd().equals(zzke.zza.zzd)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        zzb(zzkeVar.zzg(), num);
        zzke.zza zzd = zzkeVar.zzd();
        if (zzd == zzke.zza.zza) {
            curve = zzni.zza.getCurve();
        } else if (zzd == zzke.zza.zzb) {
            curve = zzni.zzb.getCurve();
        } else {
            if (zzd != zzke.zza.zzc) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzd)));
            }
            curve = zzni.zzc.getCurve();
        }
        zzni.zza(eCPoint, curve);
        return new zzkg(zzkeVar, eCPoint, null, zza(zzkeVar.zzg(), num), num);
    }

    private static void zzb(zzke.zze zzeVar, Integer num) {
        zzke.zze zzeVar2 = zzke.zze.zzc;
        if (!zzeVar.equals(zzeVar2) && num == null) {
            throw new GeneralSecurityException(S.b("'idRequirement' must be non-null for ", String.valueOf(zzeVar), " variant."));
        }
        if (zzeVar.equals(zzeVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzke) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    /* renamed from: zzc */
    public final /* synthetic */ zzlj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final zzaae zzd() {
        return this.zzd;
    }

    public final zzaae zze() {
        return this.zzc;
    }

    public final ECPoint zzf() {
        return this.zzb;
    }
}
