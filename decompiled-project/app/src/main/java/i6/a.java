package i6;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ MediaMetricsManager c(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder h() {
        return new PlaybackMetrics.Builder();
    }
}
