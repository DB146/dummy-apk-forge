package m4;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import n5.AbstractC1705a;

/* renamed from: m4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1594x {
    public static n4.l a(Context context, C1549C c1549c, boolean z8) {
        PlaybackSession createPlaybackSession;
        n4.j jVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager c10 = i6.a.c(context.getSystemService("media_metrics"));
        if (c10 == null) {
            jVar = null;
        } else {
            createPlaybackSession = c10.createPlaybackSession();
            jVar = new n4.j(context, createPlaybackSession);
        }
        if (jVar == null) {
            AbstractC1705a.S("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new n4.l(logSessionId);
        }
        if (z8) {
            c1549c.getClass();
            n4.f fVar = c1549c.f19821E;
            fVar.getClass();
            fVar.f21091f.a(jVar);
        }
        sessionId = jVar.f21112c.getSessionId();
        return new n4.l(sessionId);
    }
}
