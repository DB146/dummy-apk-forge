package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzqz {
    private HashMap zza = new HashMap();

    public final zzrb zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzrb zzrbVar = new zzrb(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzrbVar;
    }
}
