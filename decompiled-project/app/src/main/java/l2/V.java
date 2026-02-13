package l2;

import Eb.C0252c;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import y7.u0;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19188a = u0.y(Application.class, N.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f19189b = u0.x(N.class);

    public static final Constructor a(List signature, Class cls) {
        kotlin.jvm.internal.l.e(signature, "signature");
        C0252c h10 = kotlin.jvm.internal.l.h(cls.getConstructors());
        while (h10.hasNext()) {
            Constructor constructor = (Constructor) h10.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.d(parameterTypes, "getParameterTypes(...)");
            List e02 = Eb.n.e0(parameterTypes);
            if (signature.equals(e02)) {
                return constructor;
            }
            if (signature.size() == e02.size() && e02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final Y b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Y) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
