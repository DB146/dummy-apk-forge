package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzuq extends zzaky<zzuq, zza> implements zzame {
    private static final zzuq zzc;
    private static volatile zzamp<zzuq> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzuq, zza> implements zzame {
        private zza() {
            super(zzuq.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzuq.zza((zzuq) this.zza, zzajpVar);
            return this;
        }
    }

    static {
        zzuq zzuqVar = new zzuq();
        zzc = zzuqVar;
        zzaky.zza((Class<zzuq>) zzuq.class, zzuqVar);
    }

    private zzuq() {
    }

    public static zzuq zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzuq) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzuq zzuqVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzuqVar.zzf = zzajpVar;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzuq> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzup.zza[i7 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuq> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzuq.class) {
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

    public final zzajp zzd() {
        return this.zzf;
    }
}
