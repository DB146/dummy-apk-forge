package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzabu extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        try {
            return new AtomicInteger(zzacvVar.zzc());
        } catch (NumberFormatException e2) {
            throw new zzwz(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        zzacxVar.zzh(((AtomicInteger) obj).get());
    }
}
