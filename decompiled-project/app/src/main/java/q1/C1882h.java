package q1;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: q1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882h extends C1881g {
    @Override // q1.C1881g
    public final Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f23360q.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // q1.C1881g
    public final Method S(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
