package com.google.android.gms.internal.measurement;

import X.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzak {
    static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(c.h(zzaoVar.zzc(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
            throw new IllegalArgumentException(c.t("Object has no function ", zzaoVar.zzc()));
        }
        zzh.zza("hasOwnProperty", 1, list);
        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
    }

    static Iterator zzv(Map map) {
        return new zzaj(map.keySet().iterator());
    }

    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);
}
