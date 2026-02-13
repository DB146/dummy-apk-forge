package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzwh extends zzxi {
    public zzwh(zzwm zzwmVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() != 9) {
            return Double.valueOf(zzacvVar.zza());
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
        double doubleValue = number.doubleValue();
        zzwm.zzg(doubleValue);
        zzacxVar.zzg(doubleValue);
    }
}
