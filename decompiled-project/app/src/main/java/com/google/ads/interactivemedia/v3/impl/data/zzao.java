package com.google.ads.interactivemedia.v3.impl.data;

import X.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends zzbr {
    private final long currentTime;
    private final long duration;
    private final String timeUnit = "ms";

    public zzao(long j, long j10, String str) {
        this.currentTime = j;
        this.duration = j10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbr) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.currentTime == zzbrVar.currentTime() && this.duration == zzbrVar.duration() && this.timeUnit.equals(zzbrVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.currentTime;
        long j10 = this.duration;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.timeUnit.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        long j10 = this.duration;
        String str = this.timeUnit;
        StringBuilder l10 = c.l(j, "TimeUpdateData{currentTime=", ", duration=");
        l10.append(j10);
        l10.append(", timeUnit=");
        l10.append(str);
        l10.append("}");
        return l10.toString();
    }
}
