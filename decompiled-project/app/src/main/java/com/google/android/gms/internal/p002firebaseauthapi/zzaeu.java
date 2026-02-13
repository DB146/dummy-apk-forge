package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1000p;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaeu {
    private final int zza;

    private zzaeu(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzv.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(zza.get(1)) * 1000) + (Integer.parseInt(zza.get(0)) * 1000000) + Integer.parseInt(zza.get(2));
        } catch (IllegalArgumentException e2) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e2));
            return -1;
        }
    }

    public static zzaeu zza() {
        String a9 = C1000p.f15093c.a("firebase-auth");
        if (TextUtils.isEmpty(a9) || a9.equals("UNKNOWN")) {
            a9 = "-1";
        }
        return new zzaeu(a9);
    }

    public final String zzb() {
        return c.t("X", Integer.toString(this.zza));
    }
}
