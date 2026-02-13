package B0;

import java.lang.reflect.Method;
import u0.InterfaceC2078h;
import u0.InterfaceC2079i;

/* loaded from: classes.dex */
public final class F0 implements Hb.h, InterfaceC2079i, N0.c, Z0, Y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F0 f1677a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f1678b = new Object();

    public F0(D d10, int i7) {
        switch (i7) {
            case 5:
                a1[] a1VarArr = a1.f1848a;
                return;
            default:
                InterfaceC2078h.f24762a.getClass();
                return;
        }
    }

    public static final boolean a() {
        Class cls = D.f1575Q0;
        try {
            if (D.f1575Q0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                D.f1575Q0 = cls2;
                D.f1576R0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = D.f1576R0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
