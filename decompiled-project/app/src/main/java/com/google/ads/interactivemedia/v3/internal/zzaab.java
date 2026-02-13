package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaab extends zzaad {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Method zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzxi zzd;
    final /* synthetic */ zzwm zze;
    final /* synthetic */ zzact zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaab(zzaag zzaagVar, String str, Field field, boolean z8, boolean z10, boolean z11, Method method, boolean z12, zzxi zzxiVar, zzwm zzwmVar, zzact zzactVar, boolean z13, boolean z14) {
        super(str, field, z8, z10);
        this.zza = z11;
        this.zzb = method;
        this.zzc = z12;
        this.zzd = zzxiVar;
        this.zze = zzwmVar;
        this.zzf = zzactVar;
        this.zzg = z13;
        this.zzh = z14;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    public final void zza(zzacv zzacvVar, int i7, Object[] objArr) {
        Object read = this.zzd.read(zzacvVar);
        if (read == null && this.zzg) {
            throw new zzwv(c.j("null is not allowed as value for record component '", this.zzk, "' of primitive type; at path ", zzacvVar.zze()));
        }
        objArr[i7] = read;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    public final void zzb(zzacv zzacvVar, Object obj) {
        Object read = this.zzd.read(zzacvVar);
        if (read == null && this.zzg) {
            return;
        }
        if (this.zza) {
            zzaag.zzb(obj, this.zzj);
        } else if (this.zzh) {
            throw new zzws("Cannot set value of 'static final' ".concat(zzacg.zze(this.zzj, false)));
        }
        this.zzj.set(obj, read);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    public final void zzc(zzacx zzacxVar, Object obj) {
        Object obj2;
        if (this.zzl) {
            if (this.zza) {
                Method method = this.zzb;
                if (method == null) {
                    zzaag.zzb(obj, this.zzj);
                } else {
                    zzaag.zzb(obj, method);
                }
            }
            Method method2 = this.zzb;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e2) {
                    throw new zzws(S.b("Accessor ", zzacg.zze(this.zzb, false), " threw exception"), e2.getCause());
                }
            } else {
                obj2 = this.zzj.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            zzacxVar.zze(this.zzi);
            (this.zzc ? this.zzd : new zzaam(this.zze, this.zzd, this.zzf.zzd())).write(zzacxVar, obj2);
        }
    }
}
