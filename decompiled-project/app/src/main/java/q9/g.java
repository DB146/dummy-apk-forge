package q9;

import android.hardware.Camera;
import android.util.Log;
import com.kt.apps.media.xemtv.beta.R;
import ia.C1358d;
import p9.m;
import p9.r;
import p9.s;

/* loaded from: classes2.dex */
public final class g implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public C1358d f23574a;

    /* renamed from: b, reason: collision with root package name */
    public r f23575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f23576c;

    public g(h hVar) {
        this.f23576c = hVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        r rVar = this.f23575b;
        C1358d c1358d = this.f23574a;
        if (rVar == null || c1358d == null) {
            Log.d("h", "Got preview callback, but no handler or resolution available");
            if (c1358d != null) {
                new Exception("No resolution available");
                c1358d.q();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            s sVar = new s(bArr, rVar.f23214a, rVar.f23215b, camera.getParameters().getPreviewFormat(), this.f23576c.k);
            if (this.f23576c.f23579b.facing == 1) {
                sVar.f23220e = true;
            }
            synchronized (((m) c1358d.f18487b).f23210h) {
                try {
                    m mVar = (m) c1358d.f18487b;
                    if (mVar.g) {
                        mVar.f23206c.obtainMessage(R.id.zxing_decode, sVar).sendToTarget();
                    }
                } finally {
                }
            }
        } catch (RuntimeException e2) {
            Log.e("h", "Camera preview failed", e2);
            c1358d.q();
        }
    }
}
