package n4;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
import n5.t;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ NetworkEvent.Builder b() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder h(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder i() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder m(int i7) {
        return new TrackChangeEvent.Builder(i7);
    }

    public static /* bridge */ /* synthetic */ void t(TelephonyManager telephonyManager, Executor executor, t tVar) {
        telephonyManager.registerTelephonyCallback(executor, tVar);
    }
}
