package j0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1363a {
    public static /* synthetic */ BlendModeColorFilter c(int i7, BlendMode blendMode) {
        return new BlendModeColorFilter(i7, blendMode);
    }

    public static /* synthetic */ RenderNode d() {
        return new RenderNode("graphicsLayer");
    }

    public static /* synthetic */ void f() {
    }

    public static /* bridge */ /* synthetic */ void j(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
