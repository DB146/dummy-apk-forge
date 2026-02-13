package r3;

import android.content.Context;
import android.os.PowerManager;
import h3.z;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23672a;

    static {
        String g = z.g("WakeLocks");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"WakeLocks\")");
        f23672a = g;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (k.f23673a) {
        }
        kotlin.jvm.internal.l.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
