package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import y.S;

/* loaded from: classes.dex */
public final class zzyl {
    private final Map zza;
    private final List zzb;

    public zzyl(Map map, boolean z8, List list) {
        this.zza = map;
        this.zzb = list;
    }

    public static String zzb(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public final String toString() {
        return this.zza.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzyz zza(zzact zzactVar) {
        zzyz zzykVar;
        String j;
        Type zzd = zzactVar.zzd();
        Class zzc = zzactVar.zzc();
        zzwo zzwoVar = (zzwo) this.zza.get(zzd);
        if (zzwoVar != null) {
            return new zzyc(this, zzwoVar, zzd);
        }
        zzwo zzwoVar2 = (zzwo) this.zza.get(zzc);
        if (zzwoVar2 != null) {
            return new zzyd(this, zzwoVar2, zzd);
        }
        zzyz zzyzVar = null;
        zzyz zzygVar = EnumSet.class.isAssignableFrom(zzc) ? new zzyg(zzd) : zzc == EnumMap.class ? new zzyh(zzd) : null;
        if (zzygVar != null) {
            return zzygVar;
        }
        int zze = zzze.zze(this.zzb, zzc);
        if (!Modifier.isAbstract(zzc.getModifiers())) {
            try {
                Constructor declaredConstructor = zzc.getDeclaredConstructor(null);
                if (zze == 1 || (zzzd.zzb.zza(declaredConstructor, null) && (zze != 4 || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    if (zze == 1) {
                        int i7 = zzacg.zza;
                        try {
                            declaredConstructor.setAccessible(true);
                            j = null;
                        } catch (Exception e2) {
                            j = c.j("Failed making constructor '", zzacg.zzc(declaredConstructor), "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ", e2.getMessage());
                        }
                        if (j != null) {
                            zzykVar = new zzyj(j);
                        }
                    }
                    zzykVar = new zzyk(declaredConstructor);
                } else {
                    zzykVar = new zzyi(S.b("Unable to invoke no-args constructor of ", String.valueOf(zzc), "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
            }
            if (zzykVar == null) {
                return zzykVar;
            }
            if (Collection.class.isAssignableFrom(zzc)) {
                zzyzVar = SortedSet.class.isAssignableFrom(zzc) ? new zzxs() : Set.class.isAssignableFrom(zzc) ? new zzxt() : Queue.class.isAssignableFrom(zzc) ? new zzxu() : new zzxv();
            } else if (Map.class.isAssignableFrom(zzc)) {
                zzyzVar = ConcurrentNavigableMap.class.isAssignableFrom(zzc) ? new zzxw() : ConcurrentMap.class.isAssignableFrom(zzc) ? new zzxx() : SortedMap.class.isAssignableFrom(zzc) ? new zzxy() : (!(zzd instanceof ParameterizedType) || String.class.isAssignableFrom(zzact.zzb(((ParameterizedType) zzd).getActualTypeArguments()[0]).zzc())) ? new zzya() : new zzxz();
            }
            if (zzyzVar != null) {
                return zzyzVar;
            }
            String zzb = zzb(zzc);
            return zzb != null ? new zzye(this, zzb) : zze == 1 ? new zzyb(this, zzc) : new zzyf(this, S.b("Unable to create instance of ", String.valueOf(zzc), "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."));
        }
        zzykVar = null;
        if (zzykVar == null) {
        }
    }
}
