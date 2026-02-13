package r4;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: r4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1923B {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, n4.l lVar) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        n4.k kVar = lVar.f21135a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f21134a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        n5.s.e(playbackComponent).setLogSessionId(logSessionId2);
    }
}
