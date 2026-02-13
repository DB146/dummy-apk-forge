package com.google.android.gms.internal.p002firebaseauthapi;

import F5.f;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzael {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int d10 = f.f4100b.d(context, 12451000);
            zza = Boolean.valueOf(d10 == 0 || d10 == 2);
        }
        return zza.booleanValue();
    }
}
