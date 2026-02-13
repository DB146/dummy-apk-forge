package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z8, boolean z10) {
        super("log");
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z8;
        this.zzb = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(zzg zzgVar, List list) {
        int i7;
        int i10;
        zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.emptyList(), this.zza, this.zzb);
            return zzao.zzf;
        }
        int zzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (zzg != 2) {
            i7 = 3;
            if (zzg == 3) {
                i10 = 1;
            } else if (zzg == 5) {
                i10 = 5;
            } else if (zzg == 6) {
                i10 = 2;
            }
            String zzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() != 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i10, zzc, Collections.emptyList(), this.zza, this.zzb);
                return zzao.zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i11)).zzc());
            }
            this.zzc.zzb().zza(i10, zzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i7 = 4;
        i10 = i7;
        String zzc2 = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
