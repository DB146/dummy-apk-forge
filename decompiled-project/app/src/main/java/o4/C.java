package o4;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class C {
    public static void a(AudioTrack audioTrack, n4.l lVar) {
        LogSessionId logSessionId;
        boolean equals;
        n4.k kVar = lVar.f21135a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f21134a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
