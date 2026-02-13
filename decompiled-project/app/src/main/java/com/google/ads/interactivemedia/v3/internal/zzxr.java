package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* loaded from: classes.dex */
public final class zzxr {
    static final Type[] zza = new Type[0];

    public static Class zza(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            zzxm.zza(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) zza(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return zza(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException(c.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", String.valueOf(type), "> is of type ", type == null ? "null" : type.getClass().getName()));
    }

    public static String zzb(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type zzc(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new zzxo(zzc(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new zzxp(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new zzxo(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new zzxq(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Type zzd(Type type, Class cls) {
        Type zzj = zzj(type, cls, Collection.class);
        return zzj instanceof ParameterizedType ? ((ParameterizedType) zzj).getActualTypeArguments()[0] : Object.class;
    }

    public static Type zze(Type type, Class cls, Type type2) {
        return zzk(type, cls, type2, new HashMap());
    }

    public static void zzf(Type type) {
        boolean z8 = true;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z8 = false;
        }
        zzxm.zza(z8);
    }

    public static boolean zzg(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return zzxn.zza(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return zzg(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type[] zzh(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type zzj = zzj(type, cls, Map.class);
        return zzj instanceof ParameterizedType ? ((ParameterizedType) zzj).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    private static Type zzi(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return zzi(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return zzi(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static Type zzj(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        zzxm.zza(cls2.isAssignableFrom(cls));
        return zze(type, cls, zzi(type, cls, cls2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013d, code lost:
    
        r12.put(r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0140, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b A[EDGE_INSN: B:24:0x013b->B:25:0x013b BREAK  A[LOOP:0: B:2:0x0004->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0004->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.ads.interactivemedia.v3.internal.zzxo] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.ads.interactivemedia.v3.internal.zzxq] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.ads.interactivemedia.v3.internal.zzxq] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.ads.interactivemedia.v3.internal.zzxp] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.ads.interactivemedia.v3.internal.zzxo] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type zzk(Type type, Class cls, Type type2, Map map) {
        Type zzk;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 != null) {
                    return type3 == Void.TYPE ? type2 : type3;
                }
                map.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type zzi = zzi(type, cls, cls2);
                    if (zzi instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (typeVariable2.equals(typeParameters[i7])) {
                                type2 = ((ParameterizedType) zzi).getActualTypeArguments()[i7];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type zzk2 = zzk(type, cls, componentType, map);
                        type2 = zzxn.zza(componentType, zzk2) ? cls3 : new zzxo(zzk2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type zzk3 = zzk(type, cls, genericComponentType, map);
                    if (!zzxn.zza(genericComponentType, zzk3)) {
                        type2 = new zzxo(zzk3);
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type zzk4 = zzk(type, cls, ownerType, map);
                    boolean z8 = !zzxn.zza(zzk4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Type zzk5 = zzk(type, cls, actualTypeArguments[i10], map);
                        if (!zzxn.zza(zzk5, actualTypeArguments[i10])) {
                            if (!z8) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                            }
                            actualTypeArguments[i10] = zzk5;
                            z8 = true;
                        }
                    }
                    if (z8) {
                        type2 = new zzxp(zzk4, type2.getRawType(), actualTypeArguments);
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type zzk6 = zzk(type, cls, lowerBounds[0], map);
                        if (zzk6 != lowerBounds[0]) {
                            type2 = new zzxq(new Type[]{Object.class}, zzk6 instanceof WildcardType ? ((WildcardType) zzk6).getLowerBounds() : new Type[]{zzk6});
                        }
                    } else if (upperBounds.length == 1 && (zzk = zzk(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new zzxq(zzk instanceof WildcardType ? ((WildcardType) zzk).getUpperBounds() : new Type[]{zzk}, zza);
                    }
                }
            }
        }
    }
}
