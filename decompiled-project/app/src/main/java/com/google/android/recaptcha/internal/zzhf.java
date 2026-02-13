package com.google.android.recaptcha.internal;

import Eb.n;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhf implements zzgx {
    public static final zzhf zza = new zzhf();

    private zzhf() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length < 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        Object[] zzg = zzgdVar.zzc().zzg(n.e0(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i7, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e2) {
            throw new zzce(6, 15, e2);
        }
    }
}
