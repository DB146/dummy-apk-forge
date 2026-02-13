package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzaaf {
    private final zzaae zza;

    private zzaaf(zzaae zzaaeVar) {
        this.zza = zzaaeVar;
    }

    public static zzaaf zza(int i7) {
        return new zzaaf(zzaae.zza(zzqg.zza(i7)));
    }

    public static zzaaf zza(byte[] bArr, zzck zzckVar) {
        if (zzckVar != null) {
            return new zzaaf(zzaae.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zza(zzck zzckVar) {
        if (zzckVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
