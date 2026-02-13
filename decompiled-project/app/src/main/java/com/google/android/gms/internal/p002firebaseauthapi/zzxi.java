package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzxi extends zzaky<zzxi, zza> implements zzame {
    private static final zzxi zzc;
    private static volatile zzamp<zzxi> zzd;
    private int zze;
    private int zzf;
    private zzxl zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzxi, zza> implements zzame {
        private zza() {
            super(zzxi.zzc);
        }

        public final zza zza(zzxl zzxlVar) {
            zzh();
            zzxi.zza((zzxi) this.zza, zzxlVar);
            return this;
        }
    }

    static {
        zzxi zzxiVar = new zzxi();
        zzc = zzxiVar;
        zzaky.zza((Class<zzxi>) zzxi.class, zzxiVar);
    }

    private zzxi() {
    }

    public static zzxi zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zzxi) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zzxi zzxiVar, zzxl zzxlVar) {
        zzxlVar.getClass();
        zzxiVar.zzg = zzxlVar;
        zzxiVar.zze |= 1;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzxi> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzxh.zza[i7 - 1]) {
            case 1:
                return new zzxi();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxi> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzxi.class) {
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

    public final zzxl zzd() {
        zzxl zzxlVar = this.zzg;
        return zzxlVar == null ? zzxl.zzc() : zzxlVar;
    }
}
