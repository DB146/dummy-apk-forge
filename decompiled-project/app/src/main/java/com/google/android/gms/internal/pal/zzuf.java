package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzuf extends zzacz implements zzaeg {
    private static final zzuf zzb;
    private int zze;
    private zztz zzf;
    private zzaby zzg;
    private zzaby zzh;

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zzacz.zzaF(zzuf.class, zzufVar);
    }

    private zzuf() {
        zzaby zzabyVar = zzaby.zzb;
        this.zzg = zzabyVar;
        this.zzh = zzabyVar;
    }

    public static zzue zzd() {
        return (zzue) zzb.zzau();
    }

    public static zzuf zzf() {
        return zzb;
    }

    public static zzuf zzg(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzuf) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzk(zzuf zzufVar, zztz zztzVar) {
        zztzVar.getClass();
        zzufVar.zzf = zztzVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzuf();
        }
        zzud zzudVar = null;
        if (i10 == 4) {
            return new zzue(zzudVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zztz zzc() {
        zztz zztzVar = this.zzf;
        return zztzVar == null ? zztz.zze() : zztzVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }

    public final zzaby zzi() {
        return this.zzh;
    }
}
