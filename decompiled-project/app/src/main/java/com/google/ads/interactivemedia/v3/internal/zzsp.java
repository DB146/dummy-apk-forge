package com.google.ads.interactivemedia.v3.internal;

import A3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzsp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzsp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(c.m(c.o("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
