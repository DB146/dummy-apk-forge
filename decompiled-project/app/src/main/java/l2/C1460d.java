package l2;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460d {

    /* renamed from: c, reason: collision with root package name */
    public static final C1460d f19207c = new C1460d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19208a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19209b = new HashMap();

    public static void b(HashMap hashMap, C1459c c1459c, r rVar, Class cls) {
        r rVar2 = (r) hashMap.get(c1459c);
        if (rVar2 == null || rVar == rVar2) {
            if (rVar2 == null) {
                hashMap.put(c1459c, rVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1459c.f19204b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + rVar2 + ", new value " + rVar);
    }

    public final C1458b a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f19208a;
        if (superclass != null) {
            C1458b c1458b = (C1458b) hashMap2.get(superclass);
            if (c1458b == null) {
                c1458b = a(superclass, null);
            }
            hashMap.putAll(c1458b.f19201b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1458b c1458b2 = (C1458b) hashMap2.get(cls2);
            if (c1458b2 == null) {
                c1458b2 = a(cls2, null);
            }
            for (Map.Entry entry : c1458b2.f19201b.entrySet()) {
                b(hashMap, (C1459c) entry.getKey(), (r) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            J j = (J) method.getAnnotation(J.class);
            if (j != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC1479x.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                r value = j.value();
                if (parameterTypes.length > 1) {
                    if (!r.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != r.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C1459c(method, i7), value, cls);
                z8 = true;
            }
        }
        C1458b c1458b3 = new C1458b(hashMap);
        hashMap2.put(cls, c1458b3);
        this.f19209b.put(cls, Boolean.valueOf(z8));
        return c1458b3;
    }
}
