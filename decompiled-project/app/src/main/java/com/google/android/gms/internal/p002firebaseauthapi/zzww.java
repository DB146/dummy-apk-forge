package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* loaded from: classes.dex */
public final class zzww extends zzaky<zzww, zza> implements zzame {
    private static final zzww zzc;
    private static volatile zzamp<zzww> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaky.zza<zzww, zza> implements zzame {
        private zza() {
            super(zzww.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzww.zza((zzww) this.zza, zzajpVar);
            return this;
        }

        public final zza zza(zzxu zzxuVar) {
            zzh();
            zzww.zza((zzww) this.zza, zzxuVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            zzww.zza((zzww) this.zza, str);
            return this;
        }
    }

    static {
        zzww zzwwVar = new zzww();
        zzc = zzwwVar;
        zzaky.zza((Class<zzww>) zzww.class, zzwwVar);
    }

    private zzww() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zza zza(zzww zzwwVar) {
        return (zza) zzc.zzm().zza(zzwwVar);
    }

    public static zzww zza(byte[] bArr, zzakk zzakkVar) {
        return (zzww) zzaky.zza(zzc, bArr, zzakkVar);
    }

    public static /* synthetic */ void zza(zzww zzwwVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwwVar.zzf = zzajpVar;
    }

    public static /* synthetic */ void zza(zzww zzwwVar, zzxu zzxuVar) {
        zzwwVar.zzg = zzxuVar.zza();
    }

    public static /* synthetic */ void zza(zzww zzwwVar, String str) {
        str.getClass();
        zzwwVar.zze = str;
    }

    public static zzww zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzwv.zza[i7 - 1]) {
            case 1:
                return new zzww();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzww> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzww.class) {
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

    public final zzxu zzd() {
        zzxu zza2 = zzxu.zza(this.zzg);
        return zza2 == null ? zzxu.UNRECOGNIZED : zza2;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }
}
