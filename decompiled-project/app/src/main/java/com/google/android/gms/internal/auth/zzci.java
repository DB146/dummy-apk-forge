package com.google.android.gms.internal.auth;

import android.net.Uri;
import u.T;

/* loaded from: classes.dex */
public final class zzci {
    private final T zza;

    public zzci(T t5) {
        this.zza = t5;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        T t5;
        if (uri != null) {
            t5 = (T) this.zza.get(uri.toString());
        } else {
            t5 = null;
        }
        if (t5 == null) {
            return null;
        }
        return (String) t5.get("".concat(str3));
    }
}
