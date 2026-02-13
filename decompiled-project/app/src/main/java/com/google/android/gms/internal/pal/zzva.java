package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzva extends zzacz implements zzaeg {
    private static final zzva zzb;
    private zzvd zze;

    static {
        zzva zzvaVar = new zzva();
        zzb = zzvaVar;
        zzacz.zzaF(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    public static zzuz zza() {
        return (zzuz) zzb.zzau();
    }

    public static zzva zzd(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzva) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzf(zzva zzvaVar, zzvd zzvdVar) {
        zzvdVar.getClass();
        zzvaVar.zze = zzvdVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzva();
        }
        if (i10 == 4) {
            return new zzuz(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvd zze() {
        zzvd zzvdVar = this.zze;
        return zzvdVar == null ? zzvd.zzd() : zzvdVar;
    }
}
