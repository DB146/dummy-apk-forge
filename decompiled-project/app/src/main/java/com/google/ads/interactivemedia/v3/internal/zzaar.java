package com.google.ads.interactivemedia.v3.internal;

import A3.c;

/* loaded from: classes.dex */
final class zzaar extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        if (zzi.length() == 1) {
            return Character.valueOf(zzi.charAt(0));
        }
        throw new zzwz(c.j("Expecting character, got: ", zzi, "; at ", zzacvVar.zzf()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        Character ch = (Character) obj;
        zzacxVar.zzk(ch == null ? null : ch.toString());
    }
}
