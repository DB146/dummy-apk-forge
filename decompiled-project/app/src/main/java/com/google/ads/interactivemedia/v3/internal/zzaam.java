package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaam<T> extends zzxi<T> {
    private final zzwm zza;
    private final zzxi zzb;
    private final Type zzc;

    public zzaam(zzwm zzwmVar, zzxi zzxiVar, Type type) {
        this.zza = zzwmVar;
        this.zzb = zzxiVar;
        this.zzc = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) {
        return (T) this.zzb.read(zzacvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t5) {
        zzxi zza;
        zzxi zzxiVar = this.zzb;
        ?? r12 = this.zzc;
        Class<?> cls = (t5 == null || !((r12 instanceof Class) || (r12 instanceof TypeVariable))) ? r12 : t5.getClass();
        if (cls != r12) {
            zzxiVar = this.zza.zza(zzact.zzb(cls));
            if (zzxiVar instanceof zzaac) {
                zzxi zzxiVar2 = this.zzb;
                while ((zzxiVar2 instanceof zzaah) && (zza = ((zzaah) zzxiVar2).zza()) != zzxiVar2) {
                    zzxiVar2 = zza;
                }
                if (!(zzxiVar2 instanceof zzaac)) {
                    zzxiVar = this.zzb;
                }
            }
        }
        zzxiVar.write(zzacxVar, t5);
    }
}
