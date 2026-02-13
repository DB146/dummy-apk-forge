package p;

import C1.i;
import O7.d;
import Z9.x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1844b extends x {

    /* renamed from: c, reason: collision with root package name */
    public final Object f22965c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f22966d = Executors.newFixedThreadPool(4, new d());

    /* renamed from: e, reason: collision with root package name */
    public volatile Handler f22967e;

    public static Handler a0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
