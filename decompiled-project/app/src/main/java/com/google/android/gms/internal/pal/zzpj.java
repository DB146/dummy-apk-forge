package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzpj {
    private static final zzpj zza = new zzpj();
    private final AtomicReference zzb = new AtomicReference(new zzqb(new zzpv(), null));

    public static zzpj zzb() {
        return zza;
    }

    public final zzka zza(zzps zzpsVar, zzlg zzlgVar) {
        try {
            try {
                return ((zzqb) this.zzb.get()).zza(zzpsVar, zzlgVar);
            } catch (GeneralSecurityException e2) {
                throw new zzqc("Creating a LegacyProtoKey failed", e2);
            }
        } catch (GeneralSecurityException unused) {
            return new zzpc(zzpsVar, zzlgVar);
        }
    }

    public final synchronized void zzc(zzou zzouVar) {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zza(zzouVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zzd(zzox zzoxVar) {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzb(zzoxVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zze(zzpm zzpmVar) {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzc(zzpmVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zzf(zzpp zzppVar) {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzd(zzppVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }
}
