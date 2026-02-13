package qc;

import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ RecordingCanvas c(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    public static /* synthetic */ RenderNode d() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ void m(RenderNode renderNode) {
        renderNode.endRecording();
    }

    public static /* bridge */ /* synthetic */ void n(RenderNode renderNode, int i7, int i10) {
        renderNode.setPosition(0, 0, i7, i10);
    }
}
