package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzxa extends zzacz implements zzaeg {
    private static final zzxa zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zzxa zzxaVar = new zzxa();
        zzb = zzxaVar;
        zzacz.zzaF(zzxa.class, zzxaVar);
    }

    private zzxa() {
    }

    public static zzwz zzc() {
        return (zzwz) zzb.zzau();
    }

    public static zzxa zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzxa) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
            return new zzxa();
        }
        zzwy zzwyVar = null;
        if (i10 == 4) {
            return new zzwz(zzwyVar);
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
