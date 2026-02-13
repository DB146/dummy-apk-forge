package kotlin.jvm.internal;

import Eb.C0252c;
import java.util.Arrays;
import y.S;

/* loaded from: classes2.dex */
public abstract class l {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        i(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        i(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g(str));
        i(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static int f(int i7, int i10) {
        if (i7 < i10) {
            return -1;
        }
        return i7 == i10 ? 0 : 1;
    }

    public static String g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        StringBuilder o10 = A3.c.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        o10.append(str);
        return o10.toString();
    }

    public static final C0252c h(Object[] array) {
        e(array, "array");
        return new C0252c(array);
    }

    public static void i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i7 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    public static void j(String str) {
        Db.d dVar = new Db.d(S.b("lateinit property ", str, " has not been initialized"), 2);
        i(dVar, l.class.getName());
        throw dVar;
    }
}
