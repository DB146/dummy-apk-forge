package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import android.util.Base64;
import com.google.android.gms.common.internal.G;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzaho zzb(String str) {
        G.d(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            throw new RuntimeException(c.t("Invalid idToken ", str));
        }
        String str2 = zza.get(1);
        try {
            return zzaho.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }
}
