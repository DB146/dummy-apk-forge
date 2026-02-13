package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzsn extends zzacz implements zzaeg {
    private static final zzsn zzb;
    private zzsq zze;
    private int zzf;

    static {
        zzsn zzsnVar = new zzsn();
        zzb = zzsnVar;
        zzacz.zzaF(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    public static zzsm zzc() {
        return (zzsm) zzb.zzau();
    }

    public static zzsn zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzsn) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzg(zzsn zzsnVar, zzsq zzsqVar) {
        zzsqVar.getClass();
        zzsnVar.zze = zzsqVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzsn();
        }
        if (i10 == 4) {
            return new zzsm(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzsq zzf() {
        zzsq zzsqVar = this.zze;
        return zzsqVar == null ? zzsq.zze() : zzsqVar;
    }
}
