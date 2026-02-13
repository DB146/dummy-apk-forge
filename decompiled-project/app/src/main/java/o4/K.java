package o4;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class K {
    public static void a(u uVar, Object obj) {
        D d10;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        I i7 = (I) uVar;
        if (audioDeviceInfo == null) {
            d10 = null;
        } else {
            i7.getClass();
            d10 = new D(audioDeviceInfo);
        }
        i7.f21721Z = d10;
        AudioTrack audioTrack = i7.f21746v;
        if (audioTrack != null) {
            AbstractC1786B.a(audioTrack, d10);
        }
    }
}
