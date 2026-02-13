package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzas extends zzacz implements zzaeg {
    private static final zzas zzb;
    private int zze;
    private String zzf = "";

    static {
        zzas zzasVar = new zzas();
        zzb = zzasVar;
        zzacz.zzaF(zzas.class, zzasVar);
    }

    private zzas() {
    }

    public static zzar zza() {
        return (zzar) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzas zzasVar, String str) {
        str.getClass();
        zzasVar.zze |= 1;
        zzasVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzas();
        }
        zzq zzqVar = null;
        if (i10 == 4) {
            return new zzar(zzqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
