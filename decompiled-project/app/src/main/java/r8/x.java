package r8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b6.C0844a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f23899a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23900b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0844a f23901c;

    public static void a(Context context) {
        if (f23901c == null) {
            C0844a c0844a = new C0844a(context);
            f23901c = c0844a;
            synchronized (c0844a.f13978a) {
                c0844a.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f23900b) {
            try {
                if (f23901c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f23901c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f23900b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f23901c.a(f23899a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
