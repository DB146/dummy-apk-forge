package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzuv extends zzaky<zzuv, zza> implements zzame {
    private static final zzuv zzc;
    private static volatile zzamp<zzuv> zzd;
    private int zze;
    private zzww zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzuv, zza> implements zzame {
        private zza() {
            super(zzuv.zzc);
        }

        public final zza zza(zzww zzwwVar) {
            zzh();
            zzuv.zza((zzuv) this.zza, zzwwVar);
            return this;
        }
    }

    static {
        zzuv zzuvVar = new zzuv();
        zzc = zzuvVar;
        zzaky.zza((Class<zzuv>) zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* synthetic */ void zza(zzuv zzuvVar, zzww zzwwVar) {
        zzwwVar.getClass();
        zzuvVar.zzf = zzwwVar;
        zzuvVar.zze |= 1;
    }

    public static zzuv zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzux.zza[i7 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuv> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzuv.class) {
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

    public final zzww zzd() {
        zzww zzwwVar = this.zzf;
        return zzwwVar == null ? zzww.zzc() : zzwwVar;
    }
}
