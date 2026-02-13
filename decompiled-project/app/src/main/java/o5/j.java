package o5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import n5.AbstractC1705a;
import n5.D;
import n5.RunnableC1708d;

/* loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC1708d f22000a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f22001b;

    /* renamed from: c, reason: collision with root package name */
    public Error f22002c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f22003d;

    /* renamed from: e, reason: collision with root package name */
    public k f22004e;

    public final void a(int i7) {
        EGLSurface eglCreatePbufferSurface;
        this.f22000a.getClass();
        RunnableC1708d runnableC1708d = this.f22000a;
        runnableC1708d.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1705a.j("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC1705a.j("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        runnableC1708d.f21171c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC1708d.f21168u, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z8 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i10 = D.f21141a;
        AbstractC1705a.j(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z8);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(runnableC1708d.f21171c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1705a.j("eglCreateContext failed", eglCreateContext != null);
        runnableC1708d.f21172d = eglCreateContext;
        EGLDisplay eGLDisplay = runnableC1708d.f21171c;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1705a.j("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC1705a.j("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC1708d.f21173e = eglCreatePbufferSurface;
        int[] iArr3 = runnableC1708d.f21170b;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC1705a.i();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC1708d.f21174f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC1708d);
        SurfaceTexture surfaceTexture2 = this.f22000a.f21174f;
        surfaceTexture2.getClass();
        this.f22004e = new k(this, surfaceTexture2, i7 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f22000a.getClass();
        RunnableC1708d runnableC1708d = this.f22000a;
        runnableC1708d.f21169a.removeCallbacks(runnableC1708d);
        try {
            SurfaceTexture surfaceTexture = runnableC1708d.f21174f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC1708d.f21170b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC1708d.f21171c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC1708d.f21171c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC1708d.f21173e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC1708d.f21171c, runnableC1708d.f21173e);
            }
            EGLContext eGLContext = runnableC1708d.f21172d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC1708d.f21171c, eGLContext);
            }
            if (D.f21141a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = runnableC1708d.f21171c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC1708d.f21171c);
            }
            runnableC1708d.f21171c = null;
            runnableC1708d.f21172d = null;
            runnableC1708d.f21173e = null;
            runnableC1708d.f21174f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                AbstractC1705a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f22002c = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e10) {
                AbstractC1705a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f22003d = e10;
                synchronized (this) {
                    notify();
                }
            } catch (n5.g e11) {
                AbstractC1705a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f22003d = new IllegalStateException(e11);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
