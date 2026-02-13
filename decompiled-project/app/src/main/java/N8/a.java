package N8;

import I8.f;
import I8.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7386a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f7387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7388c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a9 = h.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    b(a9);
                }
                this.f7387b = a9;
                this.f7386a = h.h(a9);
                this.f7388c = a9.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a9 = h.a(type);
        this.f7387b = a9;
        this.f7386a = h.h(a9);
        this.f7388c = a9.hashCode();
    }

    public static a a(Class cls, Type... typeArr) {
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return new a(cls);
        }
        if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i7 = 0; i7 < length; i7++) {
            Type type = typeArr[i7];
            Objects.requireNonNull(type, "Type argument must not be null");
            Class<?> h10 = h.h(type);
            TypeVariable<Class<T>> typeVariable = typeParameters[i7];
            for (Type type2 : typeVariable.getBounds()) {
                if (!h.h(type2).isAssignableFrom(h10)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + cls);
                }
            }
        }
        return new a(new f(null, cls, typeArr));
    }

    public static void b(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            b(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i7 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                b(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i7 < length) {
                b(actualTypeArguments[i7]);
                i7++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            b(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i7 < length2) {
            b(upperBounds[i7]);
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (h.e(this.f7387b, ((a) obj).f7387b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7388c;
    }

    public final String toString() {
        return h.k(this.f7387b);
    }
}
