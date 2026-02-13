package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbs {
    private final List<zzbr> zza = new ArrayList();
    private zzoj zzb = zzoj.zza;
    private boolean zzc = false;

    public final void zzb() {
        Iterator<zzbr> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().zza = false;
        }
    }

    public final zzbq zza() {
        zzbo zzboVar;
        zzbu zzbuVar;
        zzbu zzbuVar2;
        zzbu zzbuVar3;
        zzbu zzbuVar4;
        int zza;
        zzce zzceVar;
        zzce zzceVar2;
        zzbo zzboVar2;
        boolean z8;
        zzbo zzboVar3;
        zzxc.zza zzb;
        boolean z10;
        zzbo zzboVar4;
        zzbu zzbuVar5;
        zzbu zzbuVar6;
        zzbu zzbuVar7;
        zzbu zzbuVar8;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzxc.zzb zzc = zzxc.zzc();
        ArrayList arrayList = new ArrayList(this.zza.size());
        List<zzbr> list = this.zza;
        for (int i7 = 0; i7 < list.size() - 1; i7++) {
            zzbuVar5 = list.get(i7).zzd;
            zzbuVar6 = zzbu.zza;
            if (zzbuVar5 == zzbuVar6) {
                zzbuVar7 = list.get(i7 + 1).zzd;
                zzbuVar8 = zzbu.zza;
                if (zzbuVar7 != zzbuVar8) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzbr zzbrVar : this.zza) {
            zzboVar = zzbrVar.zzb;
            if (zzboVar == null) {
                throw new GeneralSecurityException("Key Status not set.");
            }
            zzbuVar = zzbrVar.zzd;
            if (zzbuVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzbuVar2 = zzbrVar.zzd;
            zzbuVar3 = zzbu.zza;
            if (zzbuVar2 == zzbuVar3) {
                zza = 0;
                while (true) {
                    if (zza != 0 && !hashSet.contains(Integer.valueOf(zza))) {
                        break;
                    }
                    zza = zzqq.zza();
                }
            } else {
                zzbuVar4 = zzbrVar.zzd;
                zza = zzbu.zza(zzbuVar4);
            }
            if (hashSet.contains(Integer.valueOf(zza))) {
                throw new GeneralSecurityException(c.f(zza, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(zza));
            zzceVar = zzbrVar.zzc;
            Integer valueOf = zzceVar.zza() ? Integer.valueOf(zza) : null;
            zzos zza2 = zzos.zza();
            zzceVar2 = zzbrVar.zzc;
            zzbm zza3 = zza2.zza(zzceVar2, valueOf);
            zzboVar2 = zzbrVar.zzb;
            z8 = zzbrVar.zza;
            zzbt zzbtVar = new zzbt(zza3, zzboVar2, zza, z8);
            zzboVar3 = zzbrVar.zzb;
            zzb = zzbq.zzb(zza3, zzboVar3, zza);
            zzc.zza(zzb);
            z10 = zzbrVar.zza;
            if (z10) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = Integer.valueOf(zza);
                zzboVar4 = zzbrVar.zzb;
                if (zzboVar4 != zzbo.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
            }
            arrayList.add(zzbtVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzc.zza(num.intValue());
        zzxc zzxcVar = (zzxc) ((zzaky) zzc.zze());
        zzbq.zzd(zzxcVar);
        return new zzbq(zzxcVar, arrayList, this.zzb);
    }

    public final zzbs zza(zzbr zzbrVar) {
        zzbs zzbsVar;
        boolean z8;
        zzbsVar = zzbrVar.zze;
        if (zzbsVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z8 = zzbrVar.zza;
        if (z8) {
            zzb();
        }
        zzbrVar.zze = this;
        this.zza.add(zzbrVar);
        return this;
    }
}
