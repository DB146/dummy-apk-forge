package com.google.ads.interactivemedia.v3.internal;

import java.net.URL;

/* loaded from: classes.dex */
final class zzaaz extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        if ("null".equals(zzi)) {
            return null;
        }
        return new URL(zzi);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        URL url = (URL) obj;
        zzacxVar.zzk(url == null ? null : url.toExternalForm());
    }
}
