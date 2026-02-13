package o5;

import android.view.Surface;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(Surface surface, float f4) {
        try {
            surface.setFrameRate(f4, f4 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            AbstractC1705a.u("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
