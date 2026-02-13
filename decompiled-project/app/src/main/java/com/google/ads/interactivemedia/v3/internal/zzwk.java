package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
final class zzwk extends zzxi {
    final /* synthetic */ zzxi zza;

    public zzwk(zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        ArrayList arrayList = new ArrayList();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            arrayList.add(Long.valueOf(((Number) this.zza.read(zzacvVar)).longValue()));
        }
        zzacvVar.zzl();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        zzacxVar.zza();
        int length = atomicLongArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            this.zza.write(zzacxVar, Long.valueOf(atomicLongArray.get(i7)));
        }
        zzacxVar.zzc();
    }
}
