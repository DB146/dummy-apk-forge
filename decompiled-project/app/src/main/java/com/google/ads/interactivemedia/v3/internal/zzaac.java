package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzaac<T, A> extends zzxi<T> {
    final Map zza;

    public zzaac(Map map) {
        this.zza = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        Object zza = zza();
        try {
            zzacvVar.zzk();
            while (zzacvVar.zzq()) {
                zzaad zzaadVar = (zzaad) this.zza.get(zzacvVar.zzh());
                if (zzaadVar != null && zzaadVar.zzm) {
                    zzc(zza, zzacvVar, zzaadVar);
                }
                zzacvVar.zzp();
            }
            zzacvVar.zzm();
            return (T) zzb(zza);
        } catch (IllegalAccessException e2) {
            throw zzacg.zzb(e2);
        } catch (IllegalStateException e10) {
            throw new zzwz(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t5) {
        if (t5 == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zzb();
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                ((zzaad) it.next()).zzc(zzacxVar, t5);
            }
            zzacxVar.zzd();
        } catch (IllegalAccessException e2) {
            throw zzacg.zzb(e2);
        }
    }

    public abstract Object zza();

    public abstract Object zzb(Object obj);

    public abstract void zzc(Object obj, zzacv zzacvVar, zzaad zzaadVar);
}
