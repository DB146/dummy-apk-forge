package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzwg extends zzaky<zzwg, zza> implements zzame {
    private static final zzwg zzc;
    private static volatile zzamp<zzwg> zzd;
    private int zze;
    private zzwj zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzwg, zza> implements zzame {
        private zza() {
            super(zzwg.zzc);
        }

        public final zza zza(zzwj zzwjVar) {
            zzh();
            zzwg.zza((zzwg) this.zza, zzwjVar);
            return this;
        }
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzaky.zza((Class<zzwg>) zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzwg zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzwg) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzwg zzwgVar, zzwj zzwjVar) {
        zzwjVar.getClass();
        zzwgVar.zzf = zzwjVar;
        zzwgVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwf.zza[i7 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwg> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzwg.class) {
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

    public final zzwj zzc() {
        zzwj zzwjVar = this.zzf;
        return zzwjVar == null ? zzwj.zzf() : zzwjVar;
    }
}
