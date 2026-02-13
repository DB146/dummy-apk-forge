package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zztp extends zzaky<zztp, zza> implements zzame {
    private static final zztp zzc;
    private static volatile zzamp<zztp> zzd;
    private int zze;
    private int zzf;
    private zztv zzg;
    private zzajp zzh = zzajp.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zztp, zza> implements zzame {
        private zza() {
            super(zztp.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zztp.zza((zztp) this.zza, zzajpVar);
            return this;
        }

        public final zza zza(zztv zztvVar) {
            zzh();
            zztp.zza((zztp) this.zza, zztvVar);
            return this;
        }
    }

    static {
        zztp zztpVar = new zztp();
        zzc = zztpVar;
        zzaky.zza((Class<zztp>) zztp.class, zztpVar);
    }

    private zztp() {
    }

    public static zztp zza(zzajp zzajpVar, zzakk zzakkVar) {
        return (zztp) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static /* synthetic */ void zza(zztp zztpVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zztpVar.zzh = zzajpVar;
    }

    public static /* synthetic */ void zza(zztp zztpVar, zztv zztvVar) {
        zztvVar.getClass();
        zztpVar.zzg = zztvVar;
        zztpVar.zze |= 1;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zztp> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzto.zza[i7 - 1]) {
            case 1:
                return new zztp();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztp> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zztp.class) {
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
        zztv zztvVar = this.zzg;
        return zztvVar == null ? zztv.zzd() : zztvVar;
    }

    public final zzajp zze() {
        return this.zzh;
    }
}
