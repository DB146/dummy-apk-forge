package com.google.android.recaptcha.internal;

import Rb.a;
import android.app.Application;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class zziw extends m implements a {
    public static final zziw zza = new zziw();

    public zziw() {
        super(0);
    }

    @Override // Rb.a
    public final Object invoke() {
        int i7 = zzav.zza;
        Object zzb = zzau.zza().zzb(735120228);
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
