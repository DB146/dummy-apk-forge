package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzacf extends zzacb {
    private final Method zza;
    private final Method zzb;
    private final Method zzc;
    private final Method zzd;

    private zzacf() {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        this.zzb = Class.class.getMethod("getRecordComponents", null);
        throw null;
    }

    public /* synthetic */ zzacf(zzace zzaceVar) {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.zzb = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.zzc = componentType.getMethod("getName", null);
        this.zzd = componentType.getMethod("getType", null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final Constructor zza(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                clsArr[i7] = (Class) this.zzd.invoke(objArr[i7], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw zzacg.zza(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final Method zzb(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw zzacg.zza(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final boolean zzc(Class cls) {
        try {
            return ((Boolean) this.zza.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw zzacg.zza(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final String[] zzd(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                strArr[i7] = (String) this.zzc.invoke(objArr[i7], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw zzacg.zza(e2);
        }
    }
}
