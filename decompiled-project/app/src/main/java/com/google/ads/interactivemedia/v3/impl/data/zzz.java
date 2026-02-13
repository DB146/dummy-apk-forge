package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzz extends zzbg {
    private final AdErrorEvent adErrorEvent;
    private final zzbe component;
    private final zzbi loggableException;
    private final zzbf method;
    private final long timestamp;

    public zzz(long j, zzbe zzbeVar, zzbf zzbfVar, AdErrorEvent adErrorEvent, zzbi zzbiVar) {
        this.timestamp = j;
        this.component = zzbeVar;
        this.method = zzbfVar;
        this.adErrorEvent = adErrorEvent;
        this.loggableException = zzbiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public AdErrorEvent adErrorEvent() {
        return this.adErrorEvent;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbe component() {
        return this.component;
    }

    public boolean equals(Object obj) {
        zzbe zzbeVar;
        zzbf zzbfVar;
        AdErrorEvent adErrorEvent;
        zzbi zzbiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbg) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.timestamp == zzbgVar.timestamp() && ((zzbeVar = this.component) != null ? zzbeVar.equals(zzbgVar.component()) : zzbgVar.component() == null) && ((zzbfVar = this.method) != null ? zzbfVar.equals(zzbgVar.method()) : zzbgVar.method() == null) && ((adErrorEvent = this.adErrorEvent) != null ? adErrorEvent.equals(zzbgVar.adErrorEvent()) : zzbgVar.adErrorEvent() == null) && ((zzbiVar = this.loggableException) != null ? zzbiVar.equals(zzbgVar.loggableException()) : zzbgVar.loggableException() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        long j10 = j ^ (j >>> 32);
        zzbe zzbeVar = this.component;
        int hashCode = zzbeVar == null ? 0 : zzbeVar.hashCode();
        int i7 = (int) j10;
        zzbf zzbfVar = this.method;
        int hashCode2 = zzbfVar == null ? 0 : zzbfVar.hashCode();
        int i10 = ((i7 ^ 1000003) * 1000003) ^ hashCode;
        AdErrorEvent adErrorEvent = this.adErrorEvent;
        int hashCode3 = ((((i10 * 1000003) ^ hashCode2) * 1000003) ^ (adErrorEvent == null ? 0 : adErrorEvent.hashCode())) * 1000003;
        zzbi zzbiVar = this.loggableException;
        return hashCode3 ^ (zzbiVar != null ? zzbiVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbi loggableException() {
        return this.loggableException;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbf method() {
        return this.method;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        long j = this.timestamp;
        String valueOf = String.valueOf(this.component);
        String valueOf2 = String.valueOf(this.method);
        String valueOf3 = String.valueOf(this.adErrorEvent);
        String valueOf4 = String.valueOf(this.loggableException);
        StringBuilder sb2 = new StringBuilder("InstrumentationData{timestamp=");
        sb2.append(j);
        sb2.append(", component=");
        sb2.append(valueOf);
        o.v(sb2, ", method=", valueOf2, ", adErrorEvent=", valueOf3);
        return c.m(sb2, ", loggableException=", valueOf4, "}");
    }
}
