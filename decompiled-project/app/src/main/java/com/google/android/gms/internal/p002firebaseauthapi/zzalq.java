package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzalq implements zzamu {
    private static final zzamd zza = new zzalt();
    private final zzamd zzb;

    public zzalq() {
        this(new zzalv(zzakw.zza(), zza));
    }

    private zzalq(zzamd zzamdVar) {
        this.zzb = (zzamd) zzalb.zza(zzamdVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamu
    public final <T> zzamv<T> zza(Class<T> cls) {
        zzamx.zza((Class<?>) cls);
        zzama zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzami.zza(zzamx.zza(), zzako.zza(), zza2.zza());
        }
        return zzamg.zza(cls, zza2, zzamm.zza(), zzalo.zza(), zzamx.zza(), zzals.zza[zza2.zzb().ordinal()] != 1 ? zzako.zza() : null, zzamb.zza());
    }
}
