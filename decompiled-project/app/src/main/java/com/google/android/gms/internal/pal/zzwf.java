package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwf extends zzacz implements zzaeg {
    private static final zzwf zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwf zzwfVar = new zzwf();
        zzb = zzwfVar;
        zzacz.zzaF(zzwf.class, zzwfVar);
    }

    private zzwf() {
    }

    public static zzwe zza() {
        return (zzwe) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzwf zzwfVar, String str) {
        str.getClass();
        zzwfVar.zze = str;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzwf();
        }
        if (i10 == 4) {
            return new zzwe(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
