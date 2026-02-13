package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzuy extends zzaky<zzuy, zza> implements zzame {
    private static final zzuy zzc;
    private static volatile zzamp<zzuy> zzd;
    private int zze;
    private zzvb zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzuy, zza> implements zzame {
        private zza() {
            super(zzuy.zzc);
        }

        public final zza zza(zzvb zzvbVar) {
            zzh();
            zzuy.zza((zzuy) this.zza, zzvbVar);
            return this;
        }
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzaky.zza((Class<zzuy>) zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzuy zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzuy) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzuy zzuyVar, zzvb zzvbVar) {
        zzvbVar.getClass();
        zzuyVar.zzf = zzvbVar;
        zzuyVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzva.zza[i7 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuy> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzuy.class) {
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

    public final zzvb zzc() {
        zzvb zzvbVar = this.zzf;
        return zzvbVar == null ? zzvb.zze() : zzvbVar;
    }
}
