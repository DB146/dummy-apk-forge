package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zztt extends zzacz implements zzaeg {
    private static final zztt zzb;
    private zzvt zze;

    static {
        zztt zzttVar = new zztt();
        zzb = zzttVar;
        zzacz.zzaF(zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zzts zza() {
        return (zzts) zzb.zzau();
    }

    public static zztt zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zztt zzttVar, zzvt zzvtVar) {
        zzvtVar.getClass();
        zzttVar.zze = zzvtVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zztt();
        }
        if (i10 == 4) {
            return new zzts(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvt zze() {
        zzvt zzvtVar = this.zze;
        return zzvtVar == null ? zzvt.zzd() : zzvtVar;
    }
}
