package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
final class zzaan extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        ArrayList arrayList = new ArrayList();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            try {
                arrayList.add(Integer.valueOf(zzacvVar.zzc()));
            } catch (NumberFormatException e2) {
                throw new zzwz(e2);
            }
        }
        zzacvVar.zzl();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        zzacxVar.zza();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i7 = 0; i7 < length; i7++) {
            zzacxVar.zzh(r6.get(i7));
        }
        zzacxVar.zzc();
    }
}
