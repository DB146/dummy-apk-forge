package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwg extends zzacz implements zzaeg {
    private static final zzwg zzb;
    private int zze;
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzacz.zzaF(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zzwd zza() {
        return (zzwd) zzb.zzau();
    }

    public static /* synthetic */ void zze(zzwg zzwgVar, zzwf zzwfVar) {
        zzwfVar.getClass();
        zzadf zzadfVar = zzwgVar.zzf;
        if (!zzadfVar.zzc()) {
            zzwgVar.zzf = zzacz.zzaA(zzadfVar);
        }
        zzwgVar.zzf.add(zzwfVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwf.class});
        }
        if (i10 == 3) {
            return new zzwg();
        }
        zzwc zzwcVar = null;
        if (i10 == 4) {
            return new zzwd(zzwcVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
