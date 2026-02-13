package k1;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18766a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f18767b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f18768c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f18769d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f18770e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f18771f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        int i7;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f18766a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f18767b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f18768c = field2;
        Class cls4 = f18766a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f18769d = declaredMethod;
            cls2 = f18766a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f18770e = declaredMethod2;
                cls3 = f18766a;
                i7 = Build.VERSION.SDK_INT;
                if ((i7 != 26 || i7 == 27) && cls3 != null) {
                    Class cls5 = Integer.TYPE;
                    Class cls6 = Boolean.TYPE;
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                f18771f = method;
            }
            declaredMethod2 = null;
            f18770e = declaredMethod2;
            cls3 = f18766a;
            i7 = Build.VERSION.SDK_INT;
            if (i7 != 26) {
            }
            Class cls52 = Integer.TYPE;
            Class cls62 = Boolean.TYPE;
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls52, cls62, Configuration.class, Configuration.class, cls62, cls62);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            f18771f = method;
        }
        declaredMethod = null;
        f18769d = declaredMethod;
        cls2 = f18766a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f18770e = declaredMethod2;
        cls3 = f18766a;
        i7 = Build.VERSION.SDK_INT;
        if (i7 != 26) {
        }
        Class cls522 = Integer.TYPE;
        Class cls622 = Boolean.TYPE;
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls522, cls622, Configuration.class, Configuration.class, cls622, cls622);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        f18771f = method;
    }
}
