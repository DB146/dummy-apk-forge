package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class zzaad {
    final String zzi;
    final Field zzj;
    final String zzk;
    final boolean zzl;
    final boolean zzm;

    public zzaad(String str, Field field, boolean z8, boolean z10) {
        this.zzi = str;
        this.zzj = field;
        this.zzk = field.getName();
        this.zzl = z8;
        this.zzm = z10;
    }

    public abstract void zza(zzacv zzacvVar, int i7, Object[] objArr);

    public abstract void zzb(zzacv zzacvVar, Object obj);

    public abstract void zzc(zzacx zzacxVar, Object obj);
}
