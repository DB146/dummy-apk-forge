package F5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4102b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4103c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4105e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f4101a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f4104d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f4103c) {
                try {
                    PackageInfo h10 = O5.c.a(context).h(64, "com.google.android.gms");
                    i.b(context);
                    if (h10 == null || i.e(h10, false) || !i.e(h10, true)) {
                        f4102b = false;
                    } else {
                        f4102b = true;
                    }
                    f4103c = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    f4103c = true;
                }
            }
            return f4102b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f4103c = true;
            throw th;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
