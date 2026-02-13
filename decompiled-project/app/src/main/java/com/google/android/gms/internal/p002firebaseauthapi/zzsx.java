package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzsx extends zzaky<zzsx, zza> implements zzame {
    private static final zzsx zzc;
    private static volatile zzamp<zzsx> zzd;
    private int zze;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzsx, zza> implements zzame {
        private zza() {
            super(zzsx.zzc);
        }

        public final zza zza(int i7) {
            zzh();
            ((zzsx) this.zza).zze = i7;
            return this;
        }
    }

    static {
        zzsx zzsxVar = new zzsx();
        zzc = zzsxVar;
        zzaky.zza((Class<zzsx>) zzsx.class, zzsxVar);
    }

    private zzsx() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsx zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzsw.zza[i7 - 1]) {
            case 1:
                return new zzsx();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsx> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzsx.class) {
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
}
