package com.google.android.gms.internal.pal;

@Deprecated
/* loaded from: classes.dex */
public final class zzvw extends zzacz implements zzaeg {
    private static final zzvw zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzvw zzvwVar = new zzvw();
        zzb = zzvwVar;
        zzacz.zzaF(zzvw.class, zzvwVar);
    }

    private zzvw() {
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzvw();
        }
        zzvu zzvuVar = null;
        if (i10 == 4) {
            return new zzvv(zzvuVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }
}
