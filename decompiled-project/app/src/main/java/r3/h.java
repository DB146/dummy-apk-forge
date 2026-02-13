package r3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import h3.C1240b;
import h3.H;
import h3.z;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23667a;

    static {
        String g = z.g("ProcessUtils");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"ProcessUtils\")");
        f23667a = g;
    }

    public static final boolean a(Context context, C1240b configuration) {
        String str;
        Object obj;
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = AbstractC1917a.a();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, H.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                kotlin.jvm.internal.l.b(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                z.e().b(f23667a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return kotlin.jvm.internal.l.a(str, context.getApplicationInfo().processName);
    }
}
