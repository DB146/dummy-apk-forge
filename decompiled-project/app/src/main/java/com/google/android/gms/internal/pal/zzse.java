package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzse extends zzacz implements zzaeg {
    private static final zzse zzb;
    private zzsh zze;
    private int zzf;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zzacz.zzaF(zzse.class, zzseVar);
    }

    private zzse() {
    }

    public static zzsd zzc() {
        return (zzsd) zzb.zzau();
    }

    public static zzse zze() {
        return zzb;
    }

    public static zzse zzf(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzse) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzse zzseVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzseVar.zze = zzshVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzse();
        }
        if (i10 == 4) {
            return new zzsd(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzsh zzg() {
        zzsh zzshVar = this.zze;
        return zzshVar == null ? zzsh.zze() : zzshVar;
    }
}
