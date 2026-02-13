package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzwi extends zzxi {
    public zzwi(zzwm zzwmVar) {
    }

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
        float floatValue = number.floatValue();
        zzwm.zzg(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        zzacxVar.zzj(number);
    }
}
