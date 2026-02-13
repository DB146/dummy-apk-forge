package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzps implements zzpu {
    private final String zza;
    private final zzyv zzb;
    private final zzaby zzc;
    private final zzvn zzd;
    private final Integer zze;
    private final int zzf;

    private zzps(String str, zzaby zzabyVar, zzvn zzvnVar, int i7, Integer num) {
        this.zza = str;
        this.zzb = zzqd.zza(str);
        this.zzc = zzabyVar;
        this.zzd = zzvnVar;
        this.zzf = i7;
        this.zze = num;
    }

    public static zzps zzf(String str, zzaby zzabyVar, zzvn zzvnVar, int i7, Integer num) {
        if (i7 == 5) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzps(str, zzabyVar, zzvnVar, i7, num);
    }

    public final zzvn zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzpu
    public final zzyv zzb() {
        return this.zzb;
    }

    public final zzaby zzc() {
        return this.zzc;
    }

    public final Integer zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zza;
    }

    public final int zzg() {
        return this.zzf;
    }
}
