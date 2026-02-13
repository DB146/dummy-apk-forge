package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzuh extends zzaky<zzuh, zza> implements zzame {
    private static final zzuh zzc;
    private static volatile zzamp<zzuh> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzuh, zza> implements zzame {
        private zza() {
            super(zzuh.zzc);
        }

        public final zza zza(int i7) {
            zzh();
            ((zzuh) this.zza).zze = i7;
            return this;
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzaky.zza((Class<zzuh>) zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    public static zzuh zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzuh) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzug.zza[i7 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuh> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzuh.class) {
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

    public final int zzb() {
        return this.zzf;
    }
}
