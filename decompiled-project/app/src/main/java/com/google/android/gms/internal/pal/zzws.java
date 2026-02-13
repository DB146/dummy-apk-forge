package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzws extends zzacz implements zzaeg {
    private static final zzws zzb;
    private String zze = "";
    private zzvt zzf;

    static {
        zzws zzwsVar = new zzws();
        zzb = zzwsVar;
        zzacz.zzaF(zzws.class, zzwsVar);
    }

    private zzws() {
    }

    public static zzws zzd() {
        return zzb;
    }

    public static zzws zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzws) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public final zzvt zza() {
        zzvt zzvtVar = this.zzf;
        return zzvtVar == null ? zzvt.zzd() : zzvtVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzws();
        }
        if (i10 == 4) {
            return new zzwr(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
