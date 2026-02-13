package o5;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class m extends GLSurfaceView implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22019b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l f22020a;

    public m(Context context) {
        super(context, null);
        l lVar = new l(this);
        this.f22020a = lVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(lVar);
        setRenderMode(0);
    }

    @Deprecated
    public n getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(q4.k kVar) {
        l lVar = this.f22020a;
        if (lVar.f22017f.getAndSet(kVar) != null) {
            throw new ClassCastException();
        }
        lVar.f22012a.requestRender();
    }
}
