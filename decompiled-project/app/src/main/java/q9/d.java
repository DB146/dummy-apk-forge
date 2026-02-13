package q9;

import android.hardware.Camera;
import android.util.Log;
import ia.C1358d;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1358d f23561c;

    public /* synthetic */ d(f fVar, C1358d c1358d, int i7) {
        this.f23559a = i7;
        this.f23560b = fVar;
        this.f23561c = c1358d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1358d c1358d = this.f23561c;
        f fVar = this.f23560b;
        switch (this.f23559a) {
            case 0:
                if (!fVar.f23570f) {
                    Log.d("f", "Camera is closed, not requesting preview");
                    return;
                } else {
                    fVar.f23565a.d(new d(fVar, c1358d, 1));
                    return;
                }
            default:
                h hVar = fVar.f23567c;
                Camera camera = hVar.f23578a;
                if (camera == null || !hVar.f23582e) {
                    return;
                }
                g gVar = hVar.f23586l;
                gVar.f23574a = c1358d;
                camera.setOneShotPreviewCallback(gVar);
                return;
        }
    }
}
