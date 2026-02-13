package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        boolean z8 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzgdVar.zzh().zza((String) zza2);
                }
                zzge zzc = zzgdVar.zzc();
                try {
                    zzgc.zza(zza2);
                } catch (zzce e2) {
                    if (e2.zzb() == 8 || e2.zzb() == 6) {
                        z8 = false;
                    } else if (e2.zzb() != 47) {
                        throw e2;
                    }
                }
                zzc.zze(i7, Boolean.valueOf(z8));
            } catch (zzce e10) {
                throw e10;
            }
        } catch (Exception e11) {
            throw new zzce(6, 8, e11);
        }
    }
}
