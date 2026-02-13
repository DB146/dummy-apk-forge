package p9;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: p9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC1862c implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23158a;

    public TextureViewSurfaceTextureListenerC1862c(e eVar) {
        this.f23158a = eVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        r rVar = new r(i7, i10);
        e eVar = this.f23158a;
        eVar.f23165D = rVar;
        eVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
