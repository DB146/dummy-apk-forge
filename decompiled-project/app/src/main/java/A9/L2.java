package A9;

import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class L2 {
    public static /* synthetic */ RenderNode d() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(int i7, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession h(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void j() {
    }
}
