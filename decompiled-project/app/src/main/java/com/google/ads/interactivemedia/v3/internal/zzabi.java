package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.util.BitSet;

/* loaded from: classes.dex */
final class zzabi extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        BitSet bitSet = new BitSet();
        zzacvVar.zzj();
        int zzt = zzacvVar.zzt();
        int i7 = 0;
        while (zzt != 2) {
            int i10 = zzt - 1;
            if (i10 == 5 || i10 == 6) {
                int zzc = zzacvVar.zzc();
                if (zzc != 0) {
                    if (zzc != 1) {
                        throw new zzwz("Invalid bitset value " + zzc + ", expected 0 or 1; at path " + zzacvVar.zzf());
                    }
                    bitSet.set(i7);
                    i7++;
                    zzt = zzacvVar.zzt();
                } else {
                    continue;
                    i7++;
                    zzt = zzacvVar.zzt();
                }
            } else {
                if (i10 != 7) {
                    throw new zzwz(c.j("Invalid bitset value type: ", zzacw.zza(zzt), "; at path ", zzacvVar.zze()));
                }
                if (!zzacvVar.zzs()) {
                    i7++;
                    zzt = zzacvVar.zzt();
                }
                bitSet.set(i7);
                i7++;
                zzt = zzacvVar.zzt();
            }
        }
        zzacvVar.zzl();
        return bitSet;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        zzacxVar.zza();
        int length = bitSet.length();
        for (int i7 = 0; i7 < length; i7++) {
            zzacxVar.zzh(bitSet.get(i7) ? 1L : 0L);
        }
        zzacxVar.zzc();
    }
}
