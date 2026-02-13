package Lb;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6443a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        l.b(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.d(parameterTypes, "getParameterTypes(...)");
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f6443a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !l.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
