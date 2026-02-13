package W1;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: b, reason: collision with root package name */
    public static final u.T f10330b = new u.T(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f10331a;

    public M(U u3) {
        this.f10331a = u3;
    }

    public static Class b(ClassLoader classLoader, String str) {
        u.T t5 = f10330b;
        u.T t10 = (u.T) t5.get(classLoader);
        if (t10 == null) {
            t10 = new u.T(0);
            t5.put(classLoader, t10);
        }
        Class cls = (Class) t10.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        t10.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e10) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final C a(String str) {
        try {
            return (C) c(this.f10331a.f10374w.f10311b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e10) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new Db.d(7, y.S.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
