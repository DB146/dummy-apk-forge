package com.google.android.recaptcha.internal;

import Eb.n;
import Eb.v;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!l.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? n.J(objArr) : v.f3891a);
        return true;
    }
}
