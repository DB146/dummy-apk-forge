package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzxh extends zzxi {
    final /* synthetic */ zzxi zza;

    public zzxh(zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() != 9) {
            return this.zza.read(zzacvVar);
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) {
        if (obj == null) {
            zzacxVar.zzf();
        } else {
            this.zza.write(zzacxVar, obj);
        }
    }
}
