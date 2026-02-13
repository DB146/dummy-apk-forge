package o4;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1792f {
    /* JADX WARN: Type inference failed for: r0v0, types: [N6.K, N6.B] */
    private static final N6.L a() {
        ?? b2 = new N6.B();
        b2.b(8, 7);
        int i7 = n5.D.f21141a;
        if (i7 >= 31) {
            b2.b(26, 27);
        }
        if (i7 >= 33) {
            b2.a(30);
        }
        return b2.h();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        N6.L a9 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a9.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
