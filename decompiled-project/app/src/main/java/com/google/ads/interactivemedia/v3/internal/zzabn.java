package com.google.ads.interactivemedia.v3.internal;

import A3.c;

/* loaded from: classes.dex */
final class zzabn extends zzxi {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzabo zzb;

    public zzabn(zzabo zzaboVar, Class cls) {
        this.zzb = zzaboVar;
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) {
        Object read = this.zzb.zzb.read(zzacvVar);
        if (read == null || this.zza.isInstance(read)) {
            return read;
        }
        String name = this.zza.getName();
        String name2 = read.getClass().getName();
        String zzf = zzacvVar.zzf();
        StringBuilder o10 = c.o("Expected a ", name, " but was ", name2, "; at path ");
        o10.append(zzf);
        throw new zzwz(o10.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) {
        this.zzb.zzb.write(zzacxVar, obj);
    }
}
