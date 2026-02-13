package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzaap extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() != 9) {
            return Float.valueOf((float) zzacvVar.zza());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            zzacxVar.zzf();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        zzacxVar.zzj(number);
    }
}
