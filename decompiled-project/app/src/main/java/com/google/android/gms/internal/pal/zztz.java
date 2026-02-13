package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zztz extends zzacz implements zzaeg {
    private static final zztz zzb;
    private zzui zze;
    private zztt zzf;
    private int zzg;

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zzacz.zzaF(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zzty zzc() {
        return (zzty) zzb.zzau();
    }

    public static zztz zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zztz zztzVar, zzui zzuiVar) {
        zzuiVar.getClass();
        zztzVar.zze = zzuiVar;
    }

    public static /* synthetic */ void zzh(zztz zztzVar, zztt zzttVar) {
        zzttVar.getClass();
        zztzVar.zzf = zzttVar;
    }

    public final zztt zza() {
        zztt zzttVar = this.zzf;
        return zzttVar == null ? zztt.zzd() : zzttVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zztz();
        }
        zztx zztxVar = null;
        if (i10 == 4) {
            return new zzty(zztxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzui zzf() {
        zzui zzuiVar = this.zze;
        return zzuiVar == null ? zzui.zzd() : zzuiVar;
    }

    public final int zzi() {
        int i7 = this.zzg;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
