package com.google.ads.interactivemedia.v3.internal;

import X.c;
import h3.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import y.S;

/* loaded from: classes.dex */
public final class zzacg {
    public static final /* synthetic */ int zza = 0;
    private static final zzacb zzb;

    static {
        zzacb zzacdVar;
        try {
            zzacdVar = new zzacf(null);
        } catch (NoSuchMethodException unused) {
            zzacdVar = new zzacd(null);
        }
        zzb = zzacdVar;
    }

    public static /* bridge */ /* synthetic */ RuntimeException zza(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson ${project.version}). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException zzb(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson ${project.version}). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String zzc(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        zzk(constructor, sb2);
        return sb2.toString();
    }

    public static String zzd(Field field) {
        return c.i(field.getDeclaringClass().getName(), "#", field.getName());
    }

    public static String zze(AccessibleObject accessibleObject, boolean z8) {
        String b2;
        if (accessibleObject instanceof Field) {
            b2 = S.b("field '", zzd((Field) accessibleObject), "'");
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            zzk(method, sb2);
            b2 = o.n("method '", method.getDeclaringClass().getName(), "#", sb2.toString(), "'");
        } else {
            b2 = accessibleObject instanceof Constructor ? S.b("constructor '", zzc((Constructor) accessibleObject), "'") : "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z8 || !Character.isLowerCase(b2.charAt(0))) {
            return b2;
        }
        return Character.toUpperCase(b2.charAt(0)) + b2.substring(1);
    }

    public static Constructor zzf(Class cls) {
        return zzb.zza(cls);
    }

    public static Method zzg(Class cls, Field field) {
        return zzb.zzb(cls, field);
    }

    public static void zzh(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new zzws(S.b("Failed making ", zze(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e2);
        }
    }

    public static boolean zzi(Class cls) {
        return zzb.zzc(cls);
    }

    public static String[] zzj(Class cls) {
        return zzb.zzd(cls);
    }

    private static void zzk(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i7 = 0; i7 < parameterTypes.length; i7++) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i7].getSimpleName());
        }
        sb2.append(')');
    }
}
