package m4;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: m4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC1596z implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1549C f20525a;

    public SurfaceHolderCallbackC1596z(C1549C c1549c) {
        this.f20525a = c1549c;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        C1549C c1549c = this.f20525a;
        c1549c.getClass();
        Surface surface = new Surface(surfaceTexture);
        c1549c.v0(surface);
        c1549c.f19852f0 = surface;
        c1549c.j0(i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1549C c1549c = this.f20525a;
        c1549c.v0(null);
        c1549c.j0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f20525a.j0(i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.f20525a.j0(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1549C c1549c = this.f20525a;
        if (c1549c.f19855i0) {
            c1549c.v0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1549C c1549c = this.f20525a;
        if (c1549c.f19855i0) {
            c1549c.v0(null);
        }
        c1549c.j0(0, 0);
    }
}
