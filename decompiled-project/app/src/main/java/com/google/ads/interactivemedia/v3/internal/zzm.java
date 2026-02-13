package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzm extends zzaet implements zzaga {
    private static final zzm zzb;
    private int zzd;
    private int zze;
    private boolean zzh;
    private boolean zzf = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzaet.zzaM(zzm.class, zzmVar);
    }

    private zzm() {
    }

    public static zzl zza() {
        return (zzl) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzm zzmVar, boolean z8) {
        zzmVar.zzd |= 16;
        zzmVar.zzi = false;
    }

    public static /* synthetic */ void zze(zzm zzmVar, String str) {
        zzmVar.zzd |= 4;
        zzmVar.zzg = "a.3.30.3";
    }

    public static /* synthetic */ void zzf(zzm zzmVar, boolean z8) {
        zzmVar.zzd |= 8;
        zzmVar.zzh = false;
    }

    public static /* synthetic */ void zzl(zzm zzmVar, int i7) {
        zzmVar.zze = i7 - 1;
        zzmVar.zzd |= 1;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", zzo.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i10 == 4) {
            return new zzl(zzkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int zza = zzp.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
