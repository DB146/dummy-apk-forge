package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzts extends zzaky<zzts, zza> implements zzame {
    private static final zzts zzc;
    private static volatile zzamp<zzts> zzd;
    private int zze;
    private zztv zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzts, zza> implements zzame {
        private zza() {
            super(zzts.zzc);
        }

        public final zza zza(int i7) {
            zzh();
            ((zzts) this.zza).zzg = i7;
            return this;
        }

        public final zza zza(zztv zztvVar) {
            zzh();
            zzts.zza((zzts) this.zza, zztvVar);
            return this;
        }
    }

    static {
        zzts zztsVar = new zzts();
        zzc = zztsVar;
        zzaky.zza((Class<zzts>) zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzts) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzts zztsVar, zztv zztvVar) {
        zztvVar.getClass();
        zztsVar.zzf = zztvVar;
        zztsVar.zze |= 1;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zztr.zza[i7 - 1]) {
            case 1:
                return new zzts();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzts> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzts.class) {
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

    public final zztv zzd() {
        zztv zztvVar = this.zzf;
        return zztvVar == null ? zztv.zzd() : zztvVar;
    }
}
