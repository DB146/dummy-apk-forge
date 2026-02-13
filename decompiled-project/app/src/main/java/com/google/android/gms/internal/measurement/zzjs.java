package com.google.android.gms.internal.measurement;

import android.net.Uri;
import u.T;

/* loaded from: classes.dex */
public final class zzjs {
    private final T zza;

    public zzjs(T t5) {
        this.zza = t5;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        T t5 = uri != null ? (T) this.zza.get(uri.toString()) : null;
        if (t5 == null) {
            return null;
        }
        return (String) t5.get("".concat(str3));
    }
}
