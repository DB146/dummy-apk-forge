package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import y.S;

/* loaded from: classes.dex */
public final class zzdm implements AdEvent {
    private final AdEvent.AdEventType zza;
    private final Ad zzb;
    private final Map zzc;

    public zzdm(AdEvent.AdEventType adEventType, Ad ad, Map map) {
        this.zza = adEventType;
        this.zzb = ad;
        this.zzc = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        return this.zza == zzdmVar.zza && zzri.zza(this.zzb, zzdmVar.zzb) && zzri.zza(this.zzc, zzdmVar.zzc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Ad getAd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Map<String, String> getAdData() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final AdEvent.AdEventType getType() {
        return this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        String format = String.format("AdEvent[type=%s, ad=%s", this.zza, this.zzb);
        String str = "]";
        if (this.zzc != null) {
            StringBuilder sb2 = new StringBuilder("{");
            Iterator it = this.zzc.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb2.append((String) entry.getKey());
                sb2.append(": ");
                sb2.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
            sb2.append("}");
            str = S.b(", adData=", sb2.toString(), "]");
        }
        return format.concat(str);
    }
}
