package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.util.Currency;

/* loaded from: classes.dex */
final class zzabd extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        String zzi = zzacvVar.zzi();
        try {
            return Currency.getInstance(zzi);
        } catch (IllegalArgumentException e2) {
            throw new zzwz(c.j("Failed parsing '", zzi, "' as Currency; at path ", zzacvVar.zzf()), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        zzacxVar.zzk(((Currency) obj).getCurrencyCode());
    }
}
