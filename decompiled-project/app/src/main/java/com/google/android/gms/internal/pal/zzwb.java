package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes.dex */
public final class zzwb extends zzacz implements zzaeg {
    private static final zzwb zzb;
    private int zze;
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwb zzwbVar = new zzwb();
        zzb = zzwbVar;
        zzacz.zzaF(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zzvy zzd() {
        return (zzvy) zzb.zzau();
    }

    public static zzwb zzf(byte[] bArr, zzacm zzacmVar) {
        return (zzwb) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzwb zzwbVar, zzwa zzwaVar) {
        zzwaVar.getClass();
        zzadf zzadfVar = zzwbVar.zzf;
        if (!zzadfVar.zzc()) {
            zzwbVar.zzf = zzacz.zzaA(zzadfVar);
        }
        zzwbVar.zzf.add(zzwaVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwa.class});
        }
        if (i10 == 3) {
            return new zzwb();
        }
        zzvx zzvxVar = null;
        if (i10 == 4) {
            return new zzvy(zzvxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzg() {
        return this.zzf;
    }
}
