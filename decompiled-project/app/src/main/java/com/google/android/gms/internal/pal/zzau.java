package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzau extends zzacz implements zzaeg {
    private static final zzau zzb;
    private int zze;
    private zzadf zzf = zzacz.zzaz();
    private zzaby zzg = zzaby.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzau zzauVar = new zzau();
        zzb = zzauVar;
        zzacz.zzaF(zzau.class, zzauVar);
    }

    private zzau() {
    }

    public static zzat zza() {
        return (zzat) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzau zzauVar, zzaby zzabyVar) {
        zzadf zzadfVar = zzauVar.zzf;
        if (!zzadfVar.zzc()) {
            zzauVar.zzf = zzacz.zzaA(zzadfVar);
        }
        zzauVar.zzf.add(zzabyVar);
    }

    public static /* synthetic */ void zze(zzau zzauVar, zzaby zzabyVar) {
        zzauVar.zze |= 1;
        zzauVar.zzg = zzabyVar;
    }

    public static /* synthetic */ void zzf(zzau zzauVar, int i7) {
        zzauVar.zzi = 2;
        zzauVar.zze |= 4;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzao.zza, "zzi", zzam.zza});
        }
        if (i10 == 3) {
            return new zzau();
        }
        if (i10 == 4) {
            return new zzat(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
