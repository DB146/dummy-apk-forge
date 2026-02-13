package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaju {
    private final zzakg zza;
    private final byte[] zzb;

    private zzaju(int i7) {
        byte[] bArr = new byte[i7];
        this.zzb = bArr;
        this.zza = zzakg.zzb(bArr);
    }

    public final zzajp zza() {
        this.zza.zzb();
        return new zzajw(this.zzb);
    }

    public final zzakg zzb() {
        return this.zza;
    }
}
