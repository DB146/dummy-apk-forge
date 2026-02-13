package E4;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(h hVar, n4.l lVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        n4.k kVar = lVar.f21135a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f21134a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = hVar.f3576b;
        stringId = logSessionId2.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
