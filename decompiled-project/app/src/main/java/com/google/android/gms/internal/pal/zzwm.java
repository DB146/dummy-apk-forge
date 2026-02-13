package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwm extends zzacz implements zzaeg {
    private static final zzwm zzb;
    private String zze = "";

    static {
        zzwm zzwmVar = new zzwm();
        zzb = zzwmVar;
        zzacz.zzaF(zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    public static zzwm zzc() {
        return zzb;
    }

    public static zzwm zzd(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzwm) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzwm();
        }
        zzwk zzwkVar = null;
        if (i10 == 4) {
            return new zzwl(zzwkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zze;
    }
}
