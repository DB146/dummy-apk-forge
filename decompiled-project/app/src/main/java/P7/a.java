package P7;

import G7.e;
import G7.i;
import G7.j;
import G7.k;
import X.c;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8166a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f8167b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8169d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8170e = new HashMap();
    public final HashMap g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f8171f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8172h = new HashMap();

    public a(Class cls) {
        this.f8166a = cls;
        this.f8168c = cls.isAnnotationPresent(k.class);
        this.f8169d = !cls.isAnnotationPresent(i.class);
        Constructor constructor = null;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            constructor = declaredConstructor;
        } catch (NoSuchMethodException unused) {
        }
        this.f8167b = constructor;
        for (Method method : cls.getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(e.class)) {
                String e2 = e(method);
                a(e2);
                method.setAccessible(true);
                if (this.f8171f.containsKey(e2)) {
                    throw new RuntimeException("Found conflicting getters for name: " + method.getName());
                }
                this.f8171f.put(e2, method);
            }
        }
        for (Field field : cls.getFields()) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(e.class)) {
                String b2 = b(field);
                a(b2 == null ? field.getName() : b2);
            }
        }
        HashMap hashMap = new HashMap();
        Class cls2 = cls;
        do {
            for (Method method2 : cls2.getDeclaredMethods()) {
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(e.class)) {
                    String e10 = e(method2);
                    String str = (String) this.f8170e.get(e10.toLowerCase(Locale.US));
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(e10)) {
                            throw new RuntimeException("Found setter with invalid case-sensitive name: " + method2.getName());
                        }
                        if (method2.isBridge()) {
                            hashMap.put(e10, method2);
                        } else {
                            Method method3 = (Method) this.g.get(e10);
                            Method method4 = (Method) hashMap.get(e10);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.g.put(e10, method2);
                            } else if (!d(method2, method3) && (method4 == null || !d(method2, method4))) {
                                throw new RuntimeException("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String b10 = b(field2);
                b10 = b10 == null ? field2.getName() : b10;
                if (this.f8170e.containsKey(b10.toLowerCase(Locale.US)) && !this.f8172h.containsKey(b10)) {
                    field2.setAccessible(true);
                    this.f8172h.put(b10, field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                break;
            }
        } while (!cls2.equals(Object.class));
        if (this.f8170e.isEmpty()) {
            throw new RuntimeException("No properties to serialize found on class ".concat(cls.getName()));
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(j.class)) {
            return ((j) accessibleObject.getAnnotation(j.class)).value();
        }
        return null;
    }

    public static boolean d(Method method, Method method2) {
        O7.k.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        O7.k.b("Expected void return type", returnType.equals(cls));
        O7.k.b("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        O7.k.b("Expected exactly one parameter", parameterTypes.length == 1);
        O7.k.b("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String e(Method method) {
        String b2 = b(method);
        if (b2 != null) {
            return b2;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = strArr[i7];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException(c.t("Unknown Bean prefix for method: ", name));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i10 = 0; i10 < charArray.length && Character.isUpperCase(charArray[i10]); i10++) {
            charArray[i10] = Character.toLowerCase(charArray[i10]);
        }
        return new String(charArray);
    }

    public static Type f(Type type, Map map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = (Type) map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalStateException("Could not resolve type " + type);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f8170e.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final Object c(Map map, Map map2) {
        Class cls = this.f8166a;
        Constructor constructor = this.f8167b;
        if (constructor == null) {
            throw new RuntimeException("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
        try {
            Object newInstance = constructor.newInstance(null);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                HashMap hashMap = this.g;
                if (hashMap.containsKey(str)) {
                    Method method = (Method) hashMap.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(newInstance, b.b(f(genericParameterTypes[0], map2), entry.getValue()));
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    HashMap hashMap2 = this.f8172h;
                    if (hashMap2.containsKey(str)) {
                        Field field = (Field) hashMap2.get(str);
                        try {
                            field.set(newInstance, b.b(f(field.getGenericType(), map2), entry.getValue()));
                        } catch (IllegalAccessException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        StringBuilder n6 = c.n("No setter/field for ", str, " found on class ");
                        n6.append(cls.getName());
                        String sb2 = n6.toString();
                        if (this.f8170e.containsKey(str.toLowerCase(Locale.US))) {
                            sb2 = c.h(sb2, " (fields/setters are case sensitive!)");
                        }
                        if (this.f8168c) {
                            throw new RuntimeException(sb2);
                        }
                        if (this.f8169d) {
                            Log.w("ClassMapper", sb2);
                        }
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }
}
