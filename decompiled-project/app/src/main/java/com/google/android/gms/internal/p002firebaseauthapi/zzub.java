package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzub extends zzaky<zzub, zza> implements zzame {
    private static final zzub zzc;
    private static volatile zzamp<zzub> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzub, zza> implements zzame {
        private zza() {
            super(zzub.zzc);
        }

        public final zza zza(int i7) {
            zzh();
            ((zzub) this.zza).zze = i7;
            return this;
        }
    }

    static {
        zzub zzubVar = new zzub();
        zzc = zzubVar;
        zzaky.zza((Class<zzub>) zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzub zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzub) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzua.zza[i7 - 1]) {
            case 1:
                return new zzub();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzub> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzub.class) {
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
