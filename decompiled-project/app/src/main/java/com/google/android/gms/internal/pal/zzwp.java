package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwp extends zzacz implements zzaeg {
    private static final zzwp zzb;
    private int zze;
    private zzws zzf;

    static {
        zzwp zzwpVar = new zzwp();
        zzb = zzwpVar;
        zzacz.zzaF(zzwp.class, zzwpVar);
    }

    private zzwp() {
    }

    public static zzwo zzc() {
        return (zzwo) zzb.zzau();
    }

    public static zzwp zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzwp) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzwp zzwpVar, zzws zzwsVar) {
        zzwsVar.getClass();
        zzwpVar.zzf = zzwsVar;
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
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzwp();
        }
        zzwn zzwnVar = null;
        if (i10 == 4) {
            return new zzwo(zzwnVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzws zzf() {
        zzws zzwsVar = this.zzf;
        return zzwsVar == null ? zzws.zzd() : zzwsVar;
    }
}
