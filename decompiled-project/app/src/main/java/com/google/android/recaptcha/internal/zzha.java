package com.google.android.recaptcha.internal;

import Eb.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] zzf = zzgdVar.zzc().zzf(n.e0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i7, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e2) {
            throw new zzce(6, 9, e2);
        }
    }
}
