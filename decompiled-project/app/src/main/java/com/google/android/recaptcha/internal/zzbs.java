package com.google.android.recaptcha.internal;

import F5.f;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzbs {
    private final f zza;

    public zzbs() {
        this.zza = f.f4100b;
    }

    public zzbs(f fVar) {
        this.zza = fVar;
    }

    public final int zza(Context context) {
        int c10 = this.zza.c(context);
        return (c10 == 1 || c10 == 3 || c10 == 9) ? 4 : 3;
    }
}
