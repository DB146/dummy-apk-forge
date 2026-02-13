package com.google.android.gms.internal.measurement;

import X.c;
import java.util.List;
import y.S;

/* loaded from: classes.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            throw new IllegalArgumentException(c.t("Command not found: ", str));
        }
        zzao zzh = zzgVar.zzh(str);
        if (zzh instanceof zzai) {
            return ((zzai) zzh).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(S.b("Function ", str, " is not defined"));
    }
}
