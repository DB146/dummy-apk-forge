package n5;

import android.content.ClipData;
import android.media.MediaDrm;
import android.telephony.TelephonyManager;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder f(ClipData clipData, int i7) {
        return new ContentInfo.Builder(clipData, i7);
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ void l(TelephonyManager telephonyManager, t tVar) {
        telephonyManager.unregisterTelephonyCallback(tVar);
    }
}
