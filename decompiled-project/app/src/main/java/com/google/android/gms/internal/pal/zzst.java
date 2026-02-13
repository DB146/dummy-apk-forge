package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzst extends zzacz implements zzaeg {
    private static final zzst zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zzacz.zzaF(zzst.class, zzstVar);
    }

    private zzst() {
    }

    public static zzss zzc() {
        return (zzss) zzb.zzau();
    }

    public static zzst zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzst) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzst();
        }
        zzsr zzsrVar = null;
        if (i10 == 4) {
            return new zzss(zzsrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby zzf() {
        return this.zzf;
    }
}
