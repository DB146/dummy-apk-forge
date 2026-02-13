package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzto extends zzacz implements zzaeg {
    private static final zzto zzb;

    static {
        zzto zztoVar = new zzto();
        zzb = zztoVar;
        zzacz.zzaF(zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static zzto zzc() {
        return zzb;
    }

    public static zzto zzd(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzto) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0000", null);
        }
        if (i10 == 3) {
            return new zzto();
        }
        if (i10 == 4) {
            return new zztn(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
