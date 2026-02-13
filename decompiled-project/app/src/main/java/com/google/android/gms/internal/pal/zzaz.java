package com.google.android.gms.internal.pal;

import A3.c;

/* loaded from: classes.dex */
final class zzaz extends zzaw {
    private final String zza;
    private final String zzb;
    private final boolean zzc;

    public zzaz(String str, String str2, boolean z8) {
        if (str == null) {
            throw new NullPointerException("Null advertisingId");
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.zza.equals(zzawVar.zza()) && this.zzb.equals(zzawVar.zzb()) && this.zzc == zzawVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        boolean z8 = this.zzc;
        StringBuilder o10 = c.o("AdvertisingIdInfo{advertisingId=", str, ", advertisingIdType=", str2, ", isLimitAdTracking=");
        o10.append(z8);
        o10.append("}");
        return o10.toString();
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzaw
    public final boolean zzc() {
        return this.zzc;
    }
}
