package P7;

import O7.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import y.S;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f8173a = new ConcurrentHashMap();

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l10 = (Long) obj;
        Double valueOf = Double.valueOf(l10.doubleValue());
        if (valueOf.longValue() == l10.longValue()) {
            return valueOf;
        }
        throw new RuntimeException("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    public static Object b(Type type, Object obj) {
        Object a9;
        if (obj == null) {
            return null;
        }
        boolean z8 = type instanceof ParameterizedType;
        ConcurrentHashMap concurrentHashMap = f8173a;
        if (z8) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (List.class.isAssignableFrom(cls)) {
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                if (!(obj instanceof List)) {
                    throw new RuntimeException("Expected a List while deserializing, but got a " + obj.getClass());
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(type2, it.next()));
                }
                return arrayList;
            }
            if (Map.class.isAssignableFrom(cls)) {
                Type type3 = parameterizedType.getActualTypeArguments()[0];
                Type type4 = parameterizedType.getActualTypeArguments()[1];
                if (!type3.equals(String.class)) {
                    throw new RuntimeException("Only Maps with string keys are supported, but found Map with key type " + type3);
                }
                Map c10 = c(obj);
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : c10.entrySet()) {
                    hashMap.put((String) entry.getKey(), b(type4, entry.getValue()));
                }
                return hashMap;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                throw new RuntimeException("Collections are not supported, please use Lists instead");
            }
            Map c11 = c(obj);
            a aVar = (a) concurrentHashMap.get(cls);
            if (aVar == null) {
                aVar = new a(cls);
                concurrentHashMap.put(cls, aVar);
            }
            HashMap hashMap2 = new HashMap();
            TypeVariable[] typeParameters = aVar.f8166a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length != typeParameters.length) {
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            }
            for (int i7 = 0; i7 < typeParameters.length; i7++) {
                hashMap2.put(typeParameters[i7], actualTypeArguments[i7]);
            }
            return aVar.c(c11, hashMap2);
        }
        if (!(type instanceof Class)) {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length > 0) {
                    throw new RuntimeException("Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                k.b("Wildcard type " + type + " is not upper bounded.", upperBounds.length > 0);
                return b(upperBounds[0], obj);
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    throw new RuntimeException("Generic Arrays are not supported, please use Lists instead");
                }
                throw new IllegalStateException("Unknown type encountered: " + type);
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            k.b("Wildcard type " + type + " is not upper bounded.", bounds.length > 0);
            return b(bounds[0], obj);
        }
        Class<?> cls2 = (Class) type;
        if (!cls2.isPrimitive() && !Number.class.isAssignableFrom(cls2) && !Boolean.class.isAssignableFrom(cls2) && !Character.class.isAssignableFrom(cls2)) {
            if (String.class.isAssignableFrom(cls2)) {
                if (obj instanceof String) {
                    return (String) obj;
                }
                throw new RuntimeException("Failed to convert value of type " + obj.getClass().getName() + " to String");
            }
            if (cls2.isArray()) {
                throw new RuntimeException("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls2.getTypeParameters().length > 0) {
                throw new RuntimeException("Class " + cls2.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            if (cls2.equals(Object.class)) {
                return obj;
            }
            if (!cls2.isEnum()) {
                a aVar2 = (a) concurrentHashMap.get(cls2);
                if (aVar2 == null) {
                    aVar2 = new a(cls2);
                    concurrentHashMap.put(cls2, aVar2);
                }
                if (obj instanceof Map) {
                    return aVar2.c(c(obj), Collections.emptyMap());
                }
                throw new RuntimeException("Can't convert object of type " + obj.getClass().getName() + " to type " + cls2.getName());
            }
            if (!(obj instanceof String)) {
                throw new RuntimeException("Expected a String while deserializing to enum " + cls2 + " but got a " + obj.getClass());
            }
            String str = (String) obj;
            try {
                return Enum.valueOf(cls2, str);
            } catch (IllegalArgumentException unused) {
                throw new RuntimeException("Could not find enum value of " + cls2.getName() + " for value \"" + str + "\"");
            }
        }
        if (Integer.class.isAssignableFrom(cls2) || Integer.TYPE.isAssignableFrom(cls2)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            throw new RuntimeException("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        if (Boolean.class.isAssignableFrom(cls2) || Boolean.TYPE.isAssignableFrom(cls2)) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new RuntimeException("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
        }
        if (Double.class.isAssignableFrom(cls2) || Double.TYPE.isAssignableFrom(cls2)) {
            a9 = a(obj);
        } else if (!Long.class.isAssignableFrom(cls2) && !Long.TYPE.isAssignableFrom(cls2)) {
            if (!Float.class.isAssignableFrom(cls2) && !Float.TYPE.isAssignableFrom(cls2)) {
                throw new RuntimeException(S.b("Deserializing values to ", cls2.getSimpleName(), " is not supported"));
            }
            a9 = Float.valueOf(a(obj).floatValue());
        } else if (obj instanceof Integer) {
            a9 = Long.valueOf(((Integer) obj).longValue());
        } else if (obj instanceof Long) {
            a9 = (Long) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to long");
            }
            Double d10 = (Double) obj;
            if (d10.doubleValue() < -9.223372036854776E18d || d10.doubleValue() > 9.223372036854776E18d) {
                throw new RuntimeException("Numeric value out of 64-bit long range: " + d10 + ". Did you mean to use a double instead of a long?");
            }
            a9 = Long.valueOf(d10.longValue());
        }
        return a9;
    }

    public static Map c(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new RuntimeException("Expected a Map while deserializing, but got a " + obj.getClass());
    }
}
