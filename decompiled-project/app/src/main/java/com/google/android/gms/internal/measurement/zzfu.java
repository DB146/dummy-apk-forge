package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzfu extends zzme implements zznm {
    private static final zzfu zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzfu zzfuVar = new zzfu();
        zzg = zzfuVar;
        zzme.zzcp(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public final int zzb() {
        int zza = zzga.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = zzfy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzd() {
        int zza = zzge.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zzfz.zza, "zze", zzfx.zza, "zzf", zzgd.zza});
        }
        if (i10 == 3) {
            return new zzfu();
        }
        if (i10 == 4) {
            return new zzft(null);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
