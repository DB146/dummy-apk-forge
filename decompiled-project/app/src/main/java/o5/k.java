package o5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import n5.AbstractC1705a;
import n5.D;
import n5.RunnableC1708d;

/* loaded from: classes.dex */
public final class k extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f22005d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f22006e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22007a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22008b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22009c;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z8) {
        super(surfaceTexture);
        this.f22008b = jVar;
        this.f22007a = z8;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i7 = D.f21141a;
        if (i7 >= 24 && ((i7 >= 26 || !("samsung".equals(D.f21143c) || "XT1650".equals(D.f21144d))) && ((i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i7 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z8;
        synchronized (k.class) {
            try {
                if (!f22006e) {
                    f22005d = a(context);
                    f22006e = true;
                }
                z8 = f22005d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [o5.j, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    public static k c(Context context, boolean z8) {
        boolean z10 = false;
        AbstractC1705a.m(!z8 || b(context));
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        int i7 = z8 ? f22005d : 0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f22001b = handler;
        handlerThread.f22000a = new RunnableC1708d(handler);
        synchronized (handlerThread) {
            handlerThread.f22001b.obtainMessage(1, i7, 0).sendToTarget();
            while (handlerThread.f22004e == null && handlerThread.f22003d == null && handlerThread.f22002c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f22003d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThread.f22002c;
        if (error != null) {
            throw error;
        }
        k kVar = handlerThread.f22004e;
        kVar.getClass();
        return kVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f22008b) {
            try {
                if (!this.f22009c) {
                    j jVar = this.f22008b;
                    jVar.f22001b.getClass();
                    jVar.f22001b.sendEmptyMessage(2);
                    this.f22009c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
