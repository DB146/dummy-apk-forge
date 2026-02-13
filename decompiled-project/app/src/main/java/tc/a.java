package tc;

import g3.C1191j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1191j f24540a;

    public a(C1191j c1191j) {
        this.f24540a = c1191j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C1191j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f24540a, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getTargetException();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Reflection failed for method " + method, e10);
        }
    }
}
