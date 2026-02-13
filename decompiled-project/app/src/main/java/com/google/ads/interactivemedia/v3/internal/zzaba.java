package com.google.ads.interactivemedia.v3.internal;

import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
final class zzaba extends zzxi {
    public static final URI zza(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        try {
            String zzi = zzacvVar.zzi();
            if ("null".equals(zzi)) {
                return null;
            }
            return new URI(zzi);
        } catch (URISyntaxException e2) {
            throw new zzws(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        return zza(zzacvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        URI uri = (URI) obj;
        zzacxVar.zzk(uri == null ? null : uri.toASCIIString());
    }
}
