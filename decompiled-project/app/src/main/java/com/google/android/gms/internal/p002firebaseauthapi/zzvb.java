package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzvb extends zzaky<zzvb, zza> implements zzame {
    private static final zzvb zzc;
    private static volatile zzamp<zzvb> zzd;
    private int zze;
    private zzvk zzf;
    private zzuv zzg;
    private int zzh;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzvb, zza> implements zzame {
        private zza() {
            super(zzvb.zzc);
        }

        public final zza zza(zzuv zzuvVar) {
            zzh();
            zzvb.zza((zzvb) this.zza, zzuvVar);
            return this;
        }

        public final zza zza(zzuw zzuwVar) {
            zzh();
            zzvb.zza((zzvb) this.zza, zzuwVar);
            return this;
        }

        public final zza zza(zzvk zzvkVar) {
            zzh();
            zzvb.zza((zzvb) this.zza, zzvkVar);
            return this;
        }
    }

    static {
        zzvb zzvbVar = new zzvb();
        zzc = zzvbVar;
        zzaky.zza((Class<zzvb>) zzvb.class, zzvbVar);
    }

    private zzvb() {
    }

    public static /* synthetic */ void zza(zzvb zzvbVar, zzuv zzuvVar) {
        zzuvVar.getClass();
        zzvbVar.zzg = zzuvVar;
        zzvbVar.zze |= 2;
    }

    public static /* synthetic */ void zza(zzvb zzvbVar, zzuw zzuwVar) {
        zzvbVar.zzh = zzuwVar.zza();
    }

    public static /* synthetic */ void zza(zzvb zzvbVar, zzvk zzvkVar) {
        zzvkVar.getClass();
        zzvbVar.zzf = zzvkVar;
        zzvbVar.zze |= 1;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvb zze() {
        return zzc;
    }

    public final zzuw zza() {
        zzuw zza2 = zzuw.zza(this.zzh);
        return zza2 == null ? zzuw.UNRECOGNIZED : zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvd.zza[i7 - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvb> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzvb.class) {
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

    public final zzuv zzb() {
        zzuv zzuvVar = this.zzg;
        return zzuvVar == null ? zzuv.zzc() : zzuvVar;
    }

    public final zzvk zzf() {
        zzvk zzvkVar = this.zzf;
        return zzvkVar == null ? zzvk.zzc() : zzvkVar;
    }
}
