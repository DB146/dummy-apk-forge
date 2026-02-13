package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import h3.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaaf extends zzaac {
    static final Map zzb;
    private final Constructor zzc;
    private final Object[] zzd;
    private final Map zze;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        zzb = hashMap;
    }

    public zzaaf(Class cls, Map map, boolean z8) {
        super(map);
        this.zze = new HashMap();
        Constructor zzf = zzacg.zzf(cls);
        this.zzc = zzf;
        if (z8) {
            zzaag.zzb(null, zzf);
        } else {
            zzacg.zzh(zzf);
        }
        String[] zzj = zzacg.zzj(cls);
        for (int i7 = 0; i7 < zzj.length; i7++) {
            this.zze.put(zzj[i7], Integer.valueOf(i7));
        }
        Class<?>[] parameterTypes = this.zzc.getParameterTypes();
        this.zzd = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.zzd[i10] = zzb.get(parameterTypes[i10]);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    public final /* bridge */ /* synthetic */ Object zza() {
        return (Object[]) this.zzd.clone();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    public final /* bridge */ /* synthetic */ void zzc(Object obj, zzacv zzacvVar, zzaad zzaadVar) {
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.zze.get(zzaadVar.zzk);
        if (num == null) {
            throw new IllegalStateException(o.n("Could not find the index in the constructor '", zzacg.zzc(this.zzc), "' for field with name '", zzaadVar.zzk, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
        zzaadVar.zza(zzacvVar, num.intValue(), objArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Object zzb(Object[] objArr) {
        try {
            return this.zzc.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            throw zzacg.zzb(e2);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException(c.j("Failed to invoke constructor '", zzacg.zzc(this.zzc), "' with args ", Arrays.toString(objArr)), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException(c.j("Failed to invoke constructor '", zzacg.zzc(this.zzc), "' with args ", Arrays.toString(objArr)), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(c.j("Failed to invoke constructor '", zzacg.zzc(this.zzc), "' with args ", Arrays.toString(objArr)), e12.getCause());
        }
    }
}
