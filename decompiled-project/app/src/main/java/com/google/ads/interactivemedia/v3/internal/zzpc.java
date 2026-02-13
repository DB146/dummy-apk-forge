package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzpc extends zzoz {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override // com.google.ads.interactivemedia.v3.internal.zzoz
    public final zzoz zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoz
    public final zzoz zzb(boolean z8) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoz
    public final zzoz zzc(boolean z8) {
        this.zzb = z8;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoz
    public final zzpa zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzpe(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
