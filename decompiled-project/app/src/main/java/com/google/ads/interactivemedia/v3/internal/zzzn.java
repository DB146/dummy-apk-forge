package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzzn extends zzxi {
    private final zzxi zza;
    private final zzyz zzb;

    public zzzn(zzwm zzwmVar, Type type, zzxi zzxiVar, zzyz zzyzVar) {
        this.zza = new zzaam(zzwmVar, zzxiVar, type);
        this.zzb = zzyzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        Collection collection = (Collection) this.zzb.zza();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            collection.add(this.zza.read(zzacvVar));
        }
        zzacvVar.zzl();
        return collection;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zza();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.zza.write(zzacxVar, it.next());
        }
        zzacxVar.zzc();
    }
}
