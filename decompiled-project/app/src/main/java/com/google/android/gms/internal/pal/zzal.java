package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzal extends zzacz implements zzaeg {
    private static final zzal zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;
    private zzaby zzh;
    private zzaby zzi;

    static {
        zzal zzalVar = new zzal();
        zzb = zzalVar;
        zzacz.zzaF(zzal.class, zzalVar);
    }

    private zzal() {
        zzaby zzabyVar = zzaby.zzb;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
        this.zzh = zzabyVar;
        this.zzi = zzabyVar;
    }

    public static zzak zza() {
        return (zzak) zzb.zzau();
    }

    public static zzal zzd(byte[] bArr, zzacm zzacmVar) {
        return (zzal) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 1;
        zzalVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zzj(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 2;
        zzalVar.zzg = zzabyVar;
    }

    public static /* synthetic */ void zzk(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 4;
        zzalVar.zzh = zzabyVar;
    }

    public static /* synthetic */ void zzl(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 8;
        zzalVar.zzi = zzabyVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzal();
        }
        if (i10 == 4) {
            return new zzak(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby zze() {
        return this.zzf;
    }

    public final zzaby zzf() {
        return this.zzg;
    }

    public final zzaby zzg() {
        return this.zzi;
    }

    public final zzaby zzh() {
        return this.zzh;
    }
}
