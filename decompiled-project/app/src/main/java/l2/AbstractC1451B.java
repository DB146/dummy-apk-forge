package l2;

import Eb.C0252c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import y7.u0;

/* renamed from: l2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1451B {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f19151a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19152b = new HashMap();

    public static void a(Constructor constructor, InterfaceC1478w interfaceC1478w) {
        try {
            kotlin.jvm.internal.l.b(constructor.newInstance(interfaceC1478w));
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z8;
        HashMap hashMap = f19151a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                kotlin.jvm.internal.l.b(name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.l.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.l.d(canonicalName, "substring(...)");
                }
                kotlin.jvm.internal.l.b(canonicalName);
                String concat = ac.n.W(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f19152b;
            if (constructor != null) {
                hashMap2.put(cls, u0.x(constructor));
            } else {
                C1460d c1460d = C1460d.f19207c;
                HashMap hashMap3 = c1460d.f19209b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z8 = false;
                                break;
                            }
                            if (((J) declaredMethods[i10].getAnnotation(J.class)) != null) {
                                c1460d.a(cls, declaredMethods);
                                z8 = true;
                                break;
                            }
                            i10++;
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!z8) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1478w.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.l.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.l.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    C0252c h10 = kotlin.jvm.internal.l.h(cls.getInterfaces());
                    while (true) {
                        if (h10.hasNext()) {
                            Class cls2 = (Class) h10.next();
                            if (cls2 != null && InterfaceC1478w.class.isAssignableFrom(cls2)) {
                                kotlin.jvm.internal.l.b(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                kotlin.jvm.internal.l.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
