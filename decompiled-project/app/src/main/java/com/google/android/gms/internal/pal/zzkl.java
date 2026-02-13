package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzkl {
    public static zzkk zza(String str) {
        zzkk zzkkVar = (zzkk) zzlf.zzk().get(str);
        if (zzkkVar != null) {
            return zzkkVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
