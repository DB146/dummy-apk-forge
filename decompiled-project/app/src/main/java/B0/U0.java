package B0;

import android.view.RenderNode;

/* loaded from: classes.dex */
public abstract class U0 {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i7) {
        renderNode.setAmbientShadowColor(i7);
    }

    public static void d(RenderNode renderNode, int i7) {
        renderNode.setSpotShadowColor(i7);
    }
}
