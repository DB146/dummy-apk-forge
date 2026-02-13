package n5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1708d implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f21168u = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21169a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f21170b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f21171c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f21172d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f21173e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f21174f;

    public RunnableC1708d(Handler handler) {
        this.f21169a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21169a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f21174f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
