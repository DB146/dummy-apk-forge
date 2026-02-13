package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
final class zzacp extends zzxi {
    static final zzxj zza = new zzacn();
    private final zzxi zzb;

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        Date date = (Date) this.zzb.read(zzacvVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        this.zzb.write(zzacxVar, (Timestamp) obj);
    }
}
