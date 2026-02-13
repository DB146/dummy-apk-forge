package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvt extends zzacz implements zzaeg {
    private static final zzvt zzb;
    private String zze = "";
    private zzaby zzf = zzaby.zzb;
    private int zzg;

    static {
        zzvt zzvtVar = new zzvt();
        zzb = zzvtVar;
        zzacz.zzaF(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zzvs zza() {
        return (zzvs) zzb.zzau();
    }

    public static /* synthetic */ zzvt zzc() {
        return zzb;
    }

    public static zzvt zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzvt zzvtVar, String str) {
        str.getClass();
        zzvtVar.zze = str;
    }

    public static /* synthetic */ void zzh(zzvt zzvtVar, zzaby zzabyVar) {
        zzvtVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zzj(zzvt zzvtVar, int i7) {
        zzvtVar.zzg = zzwu.zza(i7);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzvt();
        }
        zzvr zzvrVar = null;
        if (i10 == 4) {
            return new zzvs(zzvrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzwu.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
