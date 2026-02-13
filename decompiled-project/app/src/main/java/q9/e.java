package q9;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1111f;
import n5.u;
import p9.r;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23563b;

    public /* synthetic */ e(f fVar, int i7) {
        this.f23562a = i7;
        this.f23563b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = true;
        r rVar = null;
        switch (this.f23562a) {
            case 0:
                f fVar = this.f23563b;
                try {
                    Log.d("f", "Opening camera");
                    fVar.f23567c.c();
                    return;
                } catch (Exception e2) {
                    Handler handler = fVar.f23568d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                    }
                    Log.e("f", "Failed to open camera", e2);
                    return;
                }
            case 1:
                f fVar2 = this.f23563b;
                try {
                    Log.d("f", "Configuring camera");
                    fVar2.f23567c.b();
                    Handler handler2 = fVar2.f23568d;
                    if (handler2 != null) {
                        h hVar = fVar2.f23567c;
                        r rVar2 = hVar.j;
                        if (rVar2 != null) {
                            int i7 = hVar.k;
                            if (i7 == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            if (i7 % 180 == 0) {
                                z8 = false;
                            }
                            rVar = z8 ? new r(rVar2.f23215b, rVar2.f23214a) : rVar2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, rVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    Handler handler3 = fVar2.f23568d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e10).sendToTarget();
                    }
                    Log.e("f", "Failed to configure camera", e10);
                    return;
                }
            case 2:
                f fVar3 = this.f23563b;
                try {
                    Log.d("f", "Starting preview");
                    h hVar2 = fVar3.f23567c;
                    C1111f c1111f = fVar3.f23566b;
                    Camera camera = hVar2.f23578a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) c1111f.f16837b;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) c1111f.f16838c);
                    }
                    fVar3.f23567c.f();
                    return;
                } catch (Exception e11) {
                    Handler handler4 = fVar3.f23568d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e11).sendToTarget();
                    }
                    Log.e("f", "Failed to start preview", e11);
                    return;
                }
            default:
                try {
                    Log.d("f", "Closing camera");
                    h hVar3 = this.f23563b.f23567c;
                    C1908b c1908b = hVar3.f23580c;
                    if (c1908b != null) {
                        c1908b.c();
                        hVar3.f23580c = null;
                    }
                    if (hVar3.f23581d != null) {
                        hVar3.f23581d = null;
                    }
                    Camera camera2 = hVar3.f23578a;
                    if (camera2 != null && hVar3.f23582e) {
                        camera2.stopPreview();
                        hVar3.f23586l.f23574a = null;
                        hVar3.f23582e = false;
                    }
                    h hVar4 = this.f23563b.f23567c;
                    Camera camera3 = hVar4.f23578a;
                    if (camera3 != null) {
                        camera3.release();
                        hVar4.f23578a = null;
                    }
                } catch (Exception e12) {
                    Log.e("f", "Failed to close camera", e12);
                }
                f fVar4 = this.f23563b;
                fVar4.g = true;
                fVar4.f23568d.sendEmptyMessage(R.id.zxing_camera_closed);
                u uVar = this.f23563b.f23565a;
                synchronized (uVar.f21225e) {
                    int i10 = uVar.f21222b - 1;
                    uVar.f21222b = i10;
                    if (i10 == 0) {
                        synchronized (uVar.f21225e) {
                            ((HandlerThread) uVar.f21224d).quit();
                            uVar.f21224d = null;
                            uVar.f21223c = null;
                        }
                    }
                }
                return;
        }
    }
}
