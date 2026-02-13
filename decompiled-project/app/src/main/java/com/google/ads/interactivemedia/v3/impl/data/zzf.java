package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
final class zzf implements zza {
    private String appState;
    private String eventId;
    private long nativeTime;
    private zzau nativeViewBounds;
    private boolean nativeViewHidden;
    private zzau nativeViewVisibleBounds;
    private double nativeVolume;
    private String queryId;
    private byte set$0;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza appState(String str) {
        this.appState = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zzb build() {
        String str;
        String str2;
        String str3;
        zzau zzauVar;
        zzau zzauVar2;
        if (this.set$0 == 7 && (str = this.queryId) != null && (str2 = this.eventId) != null && (str3 = this.appState) != null && (zzauVar = this.nativeViewBounds) != null && (zzauVar2 = this.nativeViewVisibleBounds) != null) {
            return new zzh(str, str2, str3, this.nativeTime, this.nativeVolume, this.nativeViewHidden, zzauVar, zzauVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.queryId == null) {
            sb2.append(" queryId");
        }
        if (this.eventId == null) {
            sb2.append(" eventId");
        }
        if (this.appState == null) {
            sb2.append(" appState");
        }
        if ((this.set$0 & 1) == 0) {
            sb2.append(" nativeTime");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" nativeVolume");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            sb2.append(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            sb2.append(" nativeViewVisibleBounds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza eventId(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventId");
        }
        this.eventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeTime(long j) {
        this.nativeTime = j;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewBounds(zzau zzauVar) {
        this.nativeViewBounds = zzauVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewHidden(boolean z8) {
        this.nativeViewHidden = z8;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewVisibleBounds(zzau zzauVar) {
        this.nativeViewVisibleBounds = zzauVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeVolume(double d10) {
        this.nativeVolume = d10;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza queryId(String str) {
        if (str == null) {
            throw new NullPointerException("Null queryId");
        }
        this.queryId = str;
        return this;
    }
}
