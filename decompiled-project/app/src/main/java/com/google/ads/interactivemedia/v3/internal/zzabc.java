package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.util.UUID;

/* loaded from: classes.dex */
final class zzabc extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            return UUID.fromString(zzi);
        } catch (IllegalArgumentException e2) {
            throw new zzwz(c.j("Failed parsing '", zzi, "' as UUID; at path ", zzacvVar.zzf()), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        UUID uuid = (UUID) obj;
        zzacxVar.zzk(uuid == null ? null : uuid.toString());
    }
}
