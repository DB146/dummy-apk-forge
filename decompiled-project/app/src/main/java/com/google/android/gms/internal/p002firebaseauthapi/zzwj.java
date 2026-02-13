package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzwj extends zzaky<zzwj, zza> implements zzame {
    private static final zzwj zzc;
    private static volatile zzamp<zzwj> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzwj, zza> implements zzame {
        private zza() {
            super(zzwj.zzc);
        }

        public final zza zza(zzwb zzwbVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzwbVar);
            return this;
        }

        public final zza zza(zzwd zzwdVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzwdVar);
            return this;
        }

        public final zza zza(zzwe zzweVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzweVar);
            return this;
        }
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzaky.zza((Class<zzwj>) zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    public static /* synthetic */ void zza(zzwj zzwjVar, zzwb zzwbVar) {
        zzwjVar.zzg = zzwbVar.zza();
    }

    public static /* synthetic */ void zza(zzwj zzwjVar, zzwd zzwdVar) {
        zzwjVar.zze = zzwdVar.zza();
    }

    public static /* synthetic */ void zza(zzwj zzwjVar, zzwe zzweVar) {
        zzwjVar.zzf = zzweVar.zza();
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzwj zzf() {
        return zzc;
    }

    public final zzwb zza() {
        zzwb zza2 = zzwb.zza(this.zzg);
        return zza2 == null ? zzwb.UNRECOGNIZED : zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwi.zza[i7 - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwj> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzwj.class) {
                        try {
                            zzampVar = zzd;
                            if (zzampVar == null) {
                                zzampVar = new zzaky.zzc<>(zzc);
                                zzd = zzampVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzampVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final zzwe zzb() {
        zzwe zza2 = zzwe.zza(this.zzf);
        return zza2 == null ? zzwe.UNRECOGNIZED : zza2;
    }

    public final zzwd zzc() {
        zzwd zza2 = zzwd.zza(this.zze);
        return zza2 == null ? zzwd.UNRECOGNIZED : zza2;
    }
}
