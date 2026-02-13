package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzabs extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        try {
            int zzc = zzacvVar.zzc();
            if (zzc <= 65535 && zzc >= -32768) {
                return Short.valueOf((short) zzc);
            }
            throw new zzwz("Lossy conversion from " + zzc + " to short; at path " + zzacvVar.zzf());
        } catch (NumberFormatException e2) {
            throw new zzwz(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        if (((Number) obj) == null) {
            zzacxVar.zzf();
        } else {
            zzacxVar.zzh(r4.shortValue());
        }
    }
}
