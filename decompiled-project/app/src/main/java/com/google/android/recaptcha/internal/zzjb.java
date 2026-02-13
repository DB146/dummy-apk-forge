package com.google.android.recaptcha.internal;

import Db.j;
import Eb.B;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap I6 = B.I(new j(-4, zzba.zzo), new j(-12, zzba.zzp), new j(-6, zzba.zzk), new j(-11, zzba.zzm), new j(-13, zzba.zzq), new j(-14, zzba.zzr), new j(-2, zzba.zzl), new j(-7, zzba.zzs), new j(-5, zzba.zzt), new j(-9, zzba.zzu), new j(-8, zzba.zzE), new j(-15, zzba.zzn), new j(-1, zzba.zzv), new j(-3, zzba.zzx), new j(-10, zzba.zzy));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            I6.put(-16, zzba.zzw);
        }
        if (i7 >= 27) {
            I6.put(1, zzba.zzA);
            I6.put(2, zzba.zzB);
            I6.put(0, zzba.zzC);
            I6.put(3, zzba.zzD);
        }
        if (i7 >= 29) {
            I6.put(4, zzba.zzz);
        }
        return I6;
    }
}
