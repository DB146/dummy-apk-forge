package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzsu extends zzaky<zzsu, zza> implements zzame {
    private static final zzsu zzc;
    private static volatile zzamp<zzsu> zzd;
    private int zze;
    private int zzf;
    private zzsx zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzsu, zza> implements zzame {
        private zza() {
            super(zzsu.zzc);
        }

        public final zza zza(int i7) {
            zzh();
            ((zzsu) this.zza).zzf = i7;
            return this;
        }

        public final zza zza(zzsx zzsxVar) {
            zzh();
            zzsu.zza((zzsu) this.zza, zzsxVar);
            return this;
        }
    }

    static {
        zzsu zzsuVar = new zzsu();
        zzc = zzsuVar;
        zzaky.zza((Class<zzsu>) zzsu.class, zzsuVar);
    }

    private zzsu() {
    }

    public static zzsu zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzsu) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzsu zzsuVar, zzsx zzsxVar) {
        zzsxVar.getClass();
        zzsuVar.zzg = zzsxVar;
        zzsuVar.zze |= 1;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzst.zza[i7 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsu> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzsu.class) {
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

    public final zzsx zzd() {
        zzsx zzsxVar = this.zzg;
        return zzsxVar == null ? zzsx.zzd() : zzsxVar;
    }
}
