package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzvq extends zzaky<zzvq, zza> implements zzame {
    private static final zzvq zzc;
    private static volatile zzamp<zzvq> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;
    private zzxf zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzvq, zza> implements zzame {
        private zza() {
            super(zzvq.zzc);
        }

        public final zza zza() {
            zzh();
            zzvq.zza((zzvq) this.zza);
            return this;
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzajpVar);
            return this;
        }

        public final zza zza(zzxf zzxfVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzxfVar);
            return this;
        }
    }

    static {
        zzvq zzvqVar = new zzvq();
        zzc = zzvqVar;
        zzaky.zza((Class<zzvq>) zzvq.class, zzvqVar);
    }

    private zzvq() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvq zza(InputStream inputStream, zzakk zzakkVar) {
        return (zzvq) zzaky.zza(zzc, inputStream, zzakkVar);
    }

    public static /* synthetic */ void zza(zzvq zzvqVar) {
        zzvqVar.zzg = null;
        zzvqVar.zze &= -2;
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzvqVar.zzf = zzajpVar;
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, zzxf zzxfVar) {
        zzxfVar.getClass();
        zzvqVar.zzg = zzxfVar;
        zzvqVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzvp.zza[i7 - 1]) {
            case 1:
                return new zzvq();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvq> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzvq.class) {
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

    public final zzajp zzc() {
        return this.zzf;
    }
}
