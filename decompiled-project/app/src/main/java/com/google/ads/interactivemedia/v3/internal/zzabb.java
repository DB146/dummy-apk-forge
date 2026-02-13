package com.google.ads.interactivemedia.v3.internal;

import java.net.InetAddress;

/* loaded from: classes.dex */
final class zzabb extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() != 9) {
            return InetAddress.getByName(zzacvVar.zzi());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        zzacxVar.zzk(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
