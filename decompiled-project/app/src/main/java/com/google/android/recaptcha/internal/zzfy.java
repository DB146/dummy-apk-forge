package com.google.android.recaptcha.internal;

import Eb.v;
import Rb.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzfy extends zzfx {
    private final e zza;
    private final String zzb;

    public zzfy(e eVar, String str, Object obj) {
        super(obj);
        this.zza = eVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!l.a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zzf = zzti.zzf();
        if (objArr != null) {
            list = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zzf2 = zzth.zzf();
                zzf2.zzw(obj2.toString());
                list.add((zzth) zzf2.zzk());
            }
        } else {
            list = v.f3891a;
        }
        zzf.zze(list);
        zzti zztiVar = (zzti) zzf.zzk();
        e eVar = this.zza;
        byte[] zzd = zztiVar.zzd();
        eVar.invoke(objArr, zzkh.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
