package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzti extends zzacz implements zzaeg {
    private static final zzti zzb;
    private int zze;
    private int zzf;

    static {
        zzti zztiVar = new zzti();
        zzb = zztiVar;
        zzacz.zzaF(zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zzth zzc() {
        return (zzth) zzb.zzau();
    }

    public static zzti zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzti) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzti();
        }
        if (i10 == 4) {
            return new zzth(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
