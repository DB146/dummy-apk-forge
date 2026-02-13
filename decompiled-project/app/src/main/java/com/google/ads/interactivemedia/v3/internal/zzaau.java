package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzaau extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            return new BigInteger(zzi);
        } catch (NumberFormatException e2) {
            throw new zzwz(c.j("Failed parsing '", zzi, "' as BigInteger; at path ", zzacvVar.zzf()), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        zzacxVar.zzj((BigInteger) obj);
    }
}
