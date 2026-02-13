package com.google.android.gms.internal.appindex;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import s5.c;

/* loaded from: classes.dex */
public final class zzac {
    /* JADX WARN: Type inference failed for: r3v2, types: [s5.c, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v3, types: [s5.c, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v4, types: [s5.c, java.lang.Exception] */
    public static c zza(Status status, String str) {
        G.g(status);
        String str2 = status.f14898b;
        if (true != zzap.zza(str2)) {
            str = str2;
        }
        int i7 = status.f14897a;
        if (i7 != 17510 && i7 == 17511) {
            return new Exception(str);
        }
        return new Exception(str);
    }
}
